package proj.sample.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import proj.sample.dbflute.allcommon.DBMetaInstanceHandler;
import proj.sample.dbflute.exentity.*;

/**
 * The entity of reports as TABLE. <br>
 * <pre>
 * [primary-key]
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
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String subject = entity.getSubject();
 * String body = entity.getBody();
 * String writer = entity.getWriter();
 * java.time.LocalDateTime publishedAt = entity.getPublishedAt();
 * java.time.LocalDateTime createdAt = entity.getCreatedAt();
 * java.time.LocalDateTime modifiedAt = entity.getModifiedAt();
 * Long versionNo = entity.getVersionNo();
 * entity.setId(id);
 * entity.setSubject(subject);
 * entity.setBody(body);
 * entity.setWriter(writer);
 * entity.setPublishedAt(publishedAt);
 * entity.setCreatedAt(createdAt);
 * entity.setModifiedAt(modifiedAt);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsReports extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _id;

    /** subject: {VARCHAR(200)} */
    protected String _subject;

    /** body: {VARCHAR(10000)} */
    protected String _body;

    /** writer: {VARCHAR(100)} */
    protected String _writer;

    /** published_at: {DATETIME(19)} */
    protected java.time.LocalDateTime _publishedAt;

    /** created_at: {DATETIME(19)} */
    protected java.time.LocalDateTime _createdAt;

    /** modified_at: {DATETIME(19)} */
    protected java.time.LocalDateTime _modifiedAt;

    /** version_no: {BIGINT UNSIGNED(20), default=[0]} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "reports";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsReports) {
            BsReports other = (BsReports)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_subject));
        sb.append(dm).append(xfND(_body));
        sb.append(dm).append(xfND(_writer));
        sb.append(dm).append(xfND(_publishedAt));
        sb.append(dm).append(xfND(_createdAt));
        sb.append(dm).append(xfND(_modifiedAt));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Reports clone() {
        return (Reports)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] subject: {VARCHAR(200)} <br>
     * @return The value of the column 'subject'. (NullAllowed even if selected: for no constraint)
     */
    public String getSubject() {
        checkSpecifiedProperty("subject");
        return _subject;
    }

    /**
     * [set] subject: {VARCHAR(200)} <br>
     * @param subject The value of the column 'subject'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubject(String subject) {
        registerModifiedProperty("subject");
        _subject = subject;
    }

    /**
     * [get] body: {VARCHAR(10000)} <br>
     * @return The value of the column 'body'. (NullAllowed even if selected: for no constraint)
     */
    public String getBody() {
        checkSpecifiedProperty("body");
        return _body;
    }

    /**
     * [set] body: {VARCHAR(10000)} <br>
     * @param body The value of the column 'body'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBody(String body) {
        registerModifiedProperty("body");
        _body = body;
    }

    /**
     * [get] writer: {VARCHAR(100)} <br>
     * @return The value of the column 'writer'. (NullAllowed even if selected: for no constraint)
     */
    public String getWriter() {
        checkSpecifiedProperty("writer");
        return _writer;
    }

    /**
     * [set] writer: {VARCHAR(100)} <br>
     * @param writer The value of the column 'writer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWriter(String writer) {
        registerModifiedProperty("writer");
        _writer = writer;
    }

    /**
     * [get] published_at: {DATETIME(19)} <br>
     * @return The value of the column 'published_at'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getPublishedAt() {
        checkSpecifiedProperty("publishedAt");
        return _publishedAt;
    }

    /**
     * [set] published_at: {DATETIME(19)} <br>
     * @param publishedAt The value of the column 'published_at'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPublishedAt(java.time.LocalDateTime publishedAt) {
        registerModifiedProperty("publishedAt");
        _publishedAt = publishedAt;
    }

    /**
     * [get] created_at: {DATETIME(19)} <br>
     * @return The value of the column 'created_at'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getCreatedAt() {
        checkSpecifiedProperty("createdAt");
        return _createdAt;
    }

    /**
     * [set] created_at: {DATETIME(19)} <br>
     * @param createdAt The value of the column 'created_at'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreatedAt(java.time.LocalDateTime createdAt) {
        registerModifiedProperty("createdAt");
        _createdAt = createdAt;
    }

    /**
     * [get] modified_at: {DATETIME(19)} <br>
     * @return The value of the column 'modified_at'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getModifiedAt() {
        checkSpecifiedProperty("modifiedAt");
        return _modifiedAt;
    }

    /**
     * [set] modified_at: {DATETIME(19)} <br>
     * @param modifiedAt The value of the column 'modified_at'. (NullAllowed: null update allowed for no constraint)
     */
    public void setModifiedAt(java.time.LocalDateTime modifiedAt) {
        registerModifiedProperty("modifiedAt");
        _modifiedAt = modifiedAt;
    }

    /**
     * [get] version_no: {BIGINT UNSIGNED(20), default=[0]} <br>
     * @return The value of the column 'version_no'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] version_no: {BIGINT UNSIGNED(20), default=[0]} <br>
     * @param versionNo The value of the column 'version_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
