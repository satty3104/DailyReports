package proj.sample.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import proj.sample.dbflute.allcommon.*;
import proj.sample.dbflute.cbean.*;
import proj.sample.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of reports.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsReportsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsReportsCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "reports";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of id. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of id. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param idList The collection of id as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param idList The collection of id as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subject The value of subject as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubject_Equal(String subject) {
        doSetSubject_Equal(fRES(subject));
    }

    protected void doSetSubject_Equal(String subject) {
        regSubject(CK_EQ, subject);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subject The value of subject as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubject_NotEqual(String subject) {
        doSetSubject_NotEqual(fRES(subject));
    }

    protected void doSetSubject_NotEqual(String subject) {
        regSubject(CK_NES, subject);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subject The value of subject as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubject_GreaterThan(String subject) {
        regSubject(CK_GT, fRES(subject));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subject The value of subject as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubject_LessThan(String subject) {
        regSubject(CK_LT, fRES(subject));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subject The value of subject as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubject_GreaterEqual(String subject) {
        regSubject(CK_GE, fRES(subject));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subject The value of subject as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubject_LessEqual(String subject) {
        regSubject(CK_LE, fRES(subject));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subjectList The collection of subject as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubject_InScope(Collection<String> subjectList) {
        doSetSubject_InScope(subjectList);
    }

    protected void doSetSubject_InScope(Collection<String> subjectList) {
        regINS(CK_INS, cTL(subjectList), xgetCValueSubject(), "subject");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subjectList The collection of subject as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubject_NotInScope(Collection<String> subjectList) {
        doSetSubject_NotInScope(subjectList);
    }

    protected void doSetSubject_NotInScope(Collection<String> subjectList) {
        regINS(CK_NINS, cTL(subjectList), xgetCValueSubject(), "subject");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * subject: {VARCHAR(200)} <br>
     * <pre>e.g. setSubject_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param subject The value of subject as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSubject_LikeSearch(String subject, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSubject_LikeSearch(subject, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * subject: {VARCHAR(200)} <br>
     * <pre>e.g. setSubject_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param subject The value of subject as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSubject_LikeSearch(String subject, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(subject), xgetCValueSubject(), "subject", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subject The value of subject as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSubject_NotLikeSearch(String subject, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSubject_NotLikeSearch(subject, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * subject: {VARCHAR(200)}
     * @param subject The value of subject as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSubject_NotLikeSearch(String subject, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subject), xgetCValueSubject(), "subject", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * subject: {VARCHAR(200)}
     */
    public void setSubject_IsNull() { regSubject(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * subject: {VARCHAR(200)}
     */
    public void setSubject_IsNullOrEmpty() { regSubject(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * subject: {VARCHAR(200)}
     */
    public void setSubject_IsNotNull() { regSubject(CK_ISNN, DOBJ); }

    protected void regSubject(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubject(), "subject"); }
    protected abstract ConditionValue xgetCValueSubject();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param body The value of body as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBody_Equal(String body) {
        doSetBody_Equal(fRES(body));
    }

    protected void doSetBody_Equal(String body) {
        regBody(CK_EQ, body);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param body The value of body as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBody_NotEqual(String body) {
        doSetBody_NotEqual(fRES(body));
    }

    protected void doSetBody_NotEqual(String body) {
        regBody(CK_NES, body);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param body The value of body as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setBody_GreaterThan(String body) {
        regBody(CK_GT, fRES(body));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param body The value of body as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setBody_LessThan(String body) {
        regBody(CK_LT, fRES(body));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param body The value of body as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBody_GreaterEqual(String body) {
        regBody(CK_GE, fRES(body));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param body The value of body as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBody_LessEqual(String body) {
        regBody(CK_LE, fRES(body));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param bodyList The collection of body as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBody_InScope(Collection<String> bodyList) {
        doSetBody_InScope(bodyList);
    }

    protected void doSetBody_InScope(Collection<String> bodyList) {
        regINS(CK_INS, cTL(bodyList), xgetCValueBody(), "body");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param bodyList The collection of body as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBody_NotInScope(Collection<String> bodyList) {
        doSetBody_NotInScope(bodyList);
    }

    protected void doSetBody_NotInScope(Collection<String> bodyList) {
        regINS(CK_NINS, cTL(bodyList), xgetCValueBody(), "body");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * body: {VARCHAR(10000)} <br>
     * <pre>e.g. setBody_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param body The value of body as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBody_LikeSearch(String body, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBody_LikeSearch(body, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * body: {VARCHAR(10000)} <br>
     * <pre>e.g. setBody_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param body The value of body as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBody_LikeSearch(String body, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(body), xgetCValueBody(), "body", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param body The value of body as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBody_NotLikeSearch(String body, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBody_NotLikeSearch(body, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * body: {VARCHAR(10000)}
     * @param body The value of body as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBody_NotLikeSearch(String body, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(body), xgetCValueBody(), "body", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * body: {VARCHAR(10000)}
     */
    public void setBody_IsNull() { regBody(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * body: {VARCHAR(10000)}
     */
    public void setBody_IsNullOrEmpty() { regBody(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * body: {VARCHAR(10000)}
     */
    public void setBody_IsNotNull() { regBody(CK_ISNN, DOBJ); }

    protected void regBody(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBody(), "body"); }
    protected abstract ConditionValue xgetCValueBody();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writer The value of writer as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWriter_Equal(String writer) {
        doSetWriter_Equal(fRES(writer));
    }

    protected void doSetWriter_Equal(String writer) {
        regWriter(CK_EQ, writer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writer The value of writer as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWriter_NotEqual(String writer) {
        doSetWriter_NotEqual(fRES(writer));
    }

    protected void doSetWriter_NotEqual(String writer) {
        regWriter(CK_NES, writer);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writer The value of writer as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWriter_GreaterThan(String writer) {
        regWriter(CK_GT, fRES(writer));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writer The value of writer as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWriter_LessThan(String writer) {
        regWriter(CK_LT, fRES(writer));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writer The value of writer as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWriter_GreaterEqual(String writer) {
        regWriter(CK_GE, fRES(writer));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writer The value of writer as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWriter_LessEqual(String writer) {
        regWriter(CK_LE, fRES(writer));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writerList The collection of writer as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWriter_InScope(Collection<String> writerList) {
        doSetWriter_InScope(writerList);
    }

    protected void doSetWriter_InScope(Collection<String> writerList) {
        regINS(CK_INS, cTL(writerList), xgetCValueWriter(), "writer");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writerList The collection of writer as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWriter_NotInScope(Collection<String> writerList) {
        doSetWriter_NotInScope(writerList);
    }

    protected void doSetWriter_NotInScope(Collection<String> writerList) {
        regINS(CK_NINS, cTL(writerList), xgetCValueWriter(), "writer");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * writer: {VARCHAR(100)} <br>
     * <pre>e.g. setWriter_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param writer The value of writer as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWriter_LikeSearch(String writer, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWriter_LikeSearch(writer, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * writer: {VARCHAR(100)} <br>
     * <pre>e.g. setWriter_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param writer The value of writer as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setWriter_LikeSearch(String writer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(writer), xgetCValueWriter(), "writer", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writer The value of writer as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWriter_NotLikeSearch(String writer, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWriter_NotLikeSearch(writer, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * writer: {VARCHAR(100)}
     * @param writer The value of writer as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setWriter_NotLikeSearch(String writer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(writer), xgetCValueWriter(), "writer", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * writer: {VARCHAR(100)}
     */
    public void setWriter_IsNull() { regWriter(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * writer: {VARCHAR(100)}
     */
    public void setWriter_IsNullOrEmpty() { regWriter(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * writer: {VARCHAR(100)}
     */
    public void setWriter_IsNotNull() { regWriter(CK_ISNN, DOBJ); }

    protected void regWriter(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWriter(), "writer"); }
    protected abstract ConditionValue xgetCValueWriter();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * published_at: {DATETIME(19)}
     * @param publishedAt The value of publishedAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublishedAt_Equal(java.time.LocalDateTime publishedAt) {
        regPublishedAt(CK_EQ,  publishedAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * published_at: {DATETIME(19)}
     * @param publishedAt The value of publishedAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublishedAt_GreaterThan(java.time.LocalDateTime publishedAt) {
        regPublishedAt(CK_GT,  publishedAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * published_at: {DATETIME(19)}
     * @param publishedAt The value of publishedAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublishedAt_LessThan(java.time.LocalDateTime publishedAt) {
        regPublishedAt(CK_LT,  publishedAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * published_at: {DATETIME(19)}
     * @param publishedAt The value of publishedAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublishedAt_GreaterEqual(java.time.LocalDateTime publishedAt) {
        regPublishedAt(CK_GE,  publishedAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * published_at: {DATETIME(19)}
     * @param publishedAt The value of publishedAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublishedAt_LessEqual(java.time.LocalDateTime publishedAt) {
        regPublishedAt(CK_LE, publishedAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * published_at: {DATETIME(19)}
     * <pre>e.g. setPublishedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of publishedAt. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of publishedAt. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPublishedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPublishedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * published_at: {DATETIME(19)}
     * <pre>e.g. setPublishedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of publishedAt. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of publishedAt. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setPublishedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "published_at"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePublishedAt(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * published_at: {DATETIME(19)}
     */
    public void setPublishedAt_IsNull() { regPublishedAt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * published_at: {DATETIME(19)}
     */
    public void setPublishedAt_IsNotNull() { regPublishedAt(CK_ISNN, DOBJ); }

    protected void regPublishedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePublishedAt(), "published_at"); }
    protected abstract ConditionValue xgetCValuePublishedAt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {DATETIME(19)}
     * @param createdAt The value of createdAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_Equal(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_EQ,  createdAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {DATETIME(19)}
     * @param createdAt The value of createdAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GT,  createdAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {DATETIME(19)}
     * @param createdAt The value of createdAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LT,  createdAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {DATETIME(19)}
     * @param createdAt The value of createdAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GE,  createdAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {DATETIME(19)}
     * @param createdAt The value of createdAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LE, createdAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {DATETIME(19)}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreatedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {DATETIME(19)}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "created_at"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreatedAt(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * created_at: {DATETIME(19)}
     */
    public void setCreatedAt_IsNull() { regCreatedAt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * created_at: {DATETIME(19)}
     */
    public void setCreatedAt_IsNotNull() { regCreatedAt(CK_ISNN, DOBJ); }

    protected void regCreatedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedAt(), "created_at"); }
    protected abstract ConditionValue xgetCValueCreatedAt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * modified_at: {DATETIME(19)}
     * @param modifiedAt The value of modifiedAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setModifiedAt_Equal(java.time.LocalDateTime modifiedAt) {
        regModifiedAt(CK_EQ,  modifiedAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * modified_at: {DATETIME(19)}
     * @param modifiedAt The value of modifiedAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setModifiedAt_GreaterThan(java.time.LocalDateTime modifiedAt) {
        regModifiedAt(CK_GT,  modifiedAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * modified_at: {DATETIME(19)}
     * @param modifiedAt The value of modifiedAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setModifiedAt_LessThan(java.time.LocalDateTime modifiedAt) {
        regModifiedAt(CK_LT,  modifiedAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * modified_at: {DATETIME(19)}
     * @param modifiedAt The value of modifiedAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setModifiedAt_GreaterEqual(java.time.LocalDateTime modifiedAt) {
        regModifiedAt(CK_GE,  modifiedAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * modified_at: {DATETIME(19)}
     * @param modifiedAt The value of modifiedAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setModifiedAt_LessEqual(java.time.LocalDateTime modifiedAt) {
        regModifiedAt(CK_LE, modifiedAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * modified_at: {DATETIME(19)}
     * <pre>e.g. setModifiedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of modifiedAt. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of modifiedAt. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setModifiedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setModifiedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * modified_at: {DATETIME(19)}
     * <pre>e.g. setModifiedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of modifiedAt. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of modifiedAt. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setModifiedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "modified_at"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueModifiedAt(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * modified_at: {DATETIME(19)}
     */
    public void setModifiedAt_IsNull() { regModifiedAt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * modified_at: {DATETIME(19)}
     */
    public void setModifiedAt_IsNotNull() { regModifiedAt(CK_ISNN, DOBJ); }

    protected void regModifiedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueModifiedAt(), "modified_at"); }
    protected abstract ConditionValue xgetCValueModifiedAt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param versionNo The value of versionNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_NotEqual(Long versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Long versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param versionNo The value of versionNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterThan(Long versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param versionNo The value of versionNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessThan(Long versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param versionNo The value of versionNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterEqual(Long versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param versionNo The value of versionNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessEqual(Long versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "version_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Long> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Long> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "version_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Long> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Long> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "version_no");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     */
    public void setVersionNo_IsNull() { regVersionNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * version_no: {BIGINT UNSIGNED(20), default=[0]}
     */
    public void setVersionNo_IsNotNull() { regVersionNo(CK_ISNN, DOBJ); }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "version_no"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ReportsCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ReportsCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ReportsCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ReportsCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ReportsCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ReportsCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ReportsCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ReportsCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ReportsCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ReportsCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ReportsCB&gt;() {
     *     public void query(ReportsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ReportsCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ReportsCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ReportsCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ReportsCQ sq);

    protected ReportsCB xcreateScalarConditionCB() {
        ReportsCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ReportsCB xcreateScalarConditionPartitionByCB() {
        ReportsCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ReportsCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReportsCB cb = new ReportsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ReportsCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ReportsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ReportsCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReportsCB cb = new ReportsCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ReportsCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ReportsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReportsCB cb = new ReportsCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ReportsCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ReportsCB newMyCB() {
        return new ReportsCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ReportsCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
