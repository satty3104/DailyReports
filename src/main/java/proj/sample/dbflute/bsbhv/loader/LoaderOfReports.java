package proj.sample.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import proj.sample.dbflute.exbhv.*;
import proj.sample.dbflute.exentity.*;

/**
 * The referrer loader of reports as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, subject, body, writer, published_at, created_at, modified_at, version_no
 *
 * [sequence]
 *     
 *
 * [identity]
 *     id
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfReports {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Reports> _selectedList;
    protected BehaviorSelector _selector;
    protected ReportsBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfReports ready(List<Reports> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ReportsBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ReportsBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Reports> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
