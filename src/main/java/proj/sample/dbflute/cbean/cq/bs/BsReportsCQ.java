package proj.sample.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import proj.sample.dbflute.cbean.cq.ciq.*;
import proj.sample.dbflute.cbean.*;
import proj.sample.dbflute.cbean.cq.*;

/**
 * The base condition-query of reports.
 * @author DBFlute(AutoGenerator)
 */
public class BsReportsCQ extends AbstractBsReportsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ReportsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsReportsCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from reports) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ReportsCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ReportsCIQ xcreateCIQ() {
        ReportsCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ReportsCIQ xnewCIQ() {
        return new ReportsCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join reports on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ReportsCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ReportsCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /** 
     * Add order-by as ascend. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _subject;
    public ConditionValue xdfgetSubject()
    { if (_subject == null) { _subject = nCV(); }
      return _subject; }
    protected ConditionValue xgetCValueSubject() { return xdfgetSubject(); }

    /** 
     * Add order-by as ascend. <br>
     * subject: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_Subject_Asc() { regOBA("subject"); return this; }

    /**
     * Add order-by as descend. <br>
     * subject: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_Subject_Desc() { regOBD("subject"); return this; }

    protected ConditionValue _body;
    public ConditionValue xdfgetBody()
    { if (_body == null) { _body = nCV(); }
      return _body; }
    protected ConditionValue xgetCValueBody() { return xdfgetBody(); }

    /** 
     * Add order-by as ascend. <br>
     * body: {VARCHAR(10000)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_Body_Asc() { regOBA("body"); return this; }

    /**
     * Add order-by as descend. <br>
     * body: {VARCHAR(10000)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_Body_Desc() { regOBD("body"); return this; }

    protected ConditionValue _writer;
    public ConditionValue xdfgetWriter()
    { if (_writer == null) { _writer = nCV(); }
      return _writer; }
    protected ConditionValue xgetCValueWriter() { return xdfgetWriter(); }

    /** 
     * Add order-by as ascend. <br>
     * writer: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_Writer_Asc() { regOBA("writer"); return this; }

    /**
     * Add order-by as descend. <br>
     * writer: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_Writer_Desc() { regOBD("writer"); return this; }

    protected ConditionValue _publishedAt;
    public ConditionValue xdfgetPublishedAt()
    { if (_publishedAt == null) { _publishedAt = nCV(); }
      return _publishedAt; }
    protected ConditionValue xgetCValuePublishedAt() { return xdfgetPublishedAt(); }

    /** 
     * Add order-by as ascend. <br>
     * published_at: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_PublishedAt_Asc() { regOBA("published_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * published_at: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_PublishedAt_Desc() { regOBD("published_at"); return this; }

    protected ConditionValue _createdAt;
    public ConditionValue xdfgetCreatedAt()
    { if (_createdAt == null) { _createdAt = nCV(); }
      return _createdAt; }
    protected ConditionValue xgetCValueCreatedAt() { return xdfgetCreatedAt(); }

    /** 
     * Add order-by as ascend. <br>
     * created_at: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_CreatedAt_Asc() { regOBA("created_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_at: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_CreatedAt_Desc() { regOBD("created_at"); return this; }

    protected ConditionValue _modifiedAt;
    public ConditionValue xdfgetModifiedAt()
    { if (_modifiedAt == null) { _modifiedAt = nCV(); }
      return _modifiedAt; }
    protected ConditionValue xgetCValueModifiedAt() { return xdfgetModifiedAt(); }

    /** 
     * Add order-by as ascend. <br>
     * modified_at: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_ModifiedAt_Asc() { regOBA("modified_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * modified_at: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_ModifiedAt_Desc() { regOBD("modified_at"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsReportsCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsReportsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsReportsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ReportsCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ReportsCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ReportsCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ReportsCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ReportsCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ReportsCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ReportsCQ> _myselfExistsMap;
    public Map<String, ReportsCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ReportsCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ReportsCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ReportsCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ReportsCB.class.getName(); }
    protected String xCQ() { return ReportsCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
