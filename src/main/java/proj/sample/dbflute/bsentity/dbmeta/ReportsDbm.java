package proj.sample.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import proj.sample.dbflute.allcommon.*;
import proj.sample.dbflute.exentity.*;

/**
 * The DB meta of reports. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ReportsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ReportsDbm _instance = new ReportsDbm();
    private ReportsDbm() {}
    public static ReportsDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Reports)et).getId(), (et, vl) -> ((Reports)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Reports)et).getSubject(), (et, vl) -> ((Reports)et).setSubject((String)vl), "subject");
        setupEpg(_epgMap, et -> ((Reports)et).getBody(), (et, vl) -> ((Reports)et).setBody((String)vl), "body");
        setupEpg(_epgMap, et -> ((Reports)et).getWriter(), (et, vl) -> ((Reports)et).setWriter((String)vl), "writer");
        setupEpg(_epgMap, et -> ((Reports)et).getPublishedAt(), (et, vl) -> ((Reports)et).setPublishedAt(ctldt(vl)), "publishedAt");
        setupEpg(_epgMap, et -> ((Reports)et).getCreatedAt(), (et, vl) -> ((Reports)et).setCreatedAt(ctldt(vl)), "createdAt");
        setupEpg(_epgMap, et -> ((Reports)et).getModifiedAt(), (et, vl) -> ((Reports)et).setModifiedAt(ctldt(vl)), "modifiedAt");
        setupEpg(_epgMap, et -> ((Reports)et).getVersionNo(), (et, vl) -> ((Reports)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "reports";
    protected final String _tableDispName = "reports";
    protected final String _tablePropertyName = "reports";
    protected final TableSqlName _tableSqlName = new TableSqlName("reports", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubject = cci("subject", "subject", null, null, String.class, "subject", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBody = cci("body", "body", null, null, String.class, "body", null, false, false, false, "VARCHAR", 10000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWriter = cci("writer", "writer", null, null, String.class, "writer", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPublishedAt = cci("published_at", "published_at", null, null, java.time.LocalDateTime.class, "publishedAt", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedAt = cci("created_at", "created_at", null, null, java.time.LocalDateTime.class, "createdAt", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnModifiedAt = cci("modified_at", "modified_at", null, null, java.time.LocalDateTime.class, "modifiedAt", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, Long.class, "versionNo", null, false, false, false, "BIGINT UNSIGNED", 20, 0, "0", false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * subject: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubject() { return _columnSubject; }
    /**
     * body: {VARCHAR(10000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBody() { return _columnBody; }
    /**
     * writer: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWriter() { return _columnWriter; }
    /**
     * published_at: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublishedAt() { return _columnPublishedAt; }
    /**
     * created_at: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedAt() { return _columnCreatedAt; }
    /**
     * modified_at: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnModifiedAt() { return _columnModifiedAt; }
    /**
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnSubject());
        ls.add(columnBody());
        ls.add(columnWriter());
        ls.add(columnPublishedAt());
        ls.add(columnCreatedAt());
        ls.add(columnModifiedAt());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "proj.sample.dbflute.exentity.Reports"; }
    public String getConditionBeanTypeName() { return "proj.sample.dbflute.cbean.ReportsCB"; }
    public String getBehaviorTypeName() { return "proj.sample.dbflute.exbhv.ReportsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Reports> getEntityType() { return Reports.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Reports newEntity() { return new Reports(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Reports)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Reports)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
