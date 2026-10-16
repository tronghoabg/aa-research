package i.b.n.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class am extends du<am, ai> implements fj {
    private static final am DEFAULT_INSTANCE;
    public static final int HIDE_FILTERS_FIELD_NUMBER = 3;
    private static volatile fo<am> PARSER = null;
    public static final int QUERY_DETECTION_FIELD_NUMBER = 2;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int SINGLE_DEFINITIVE_RESULT_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean hideFilters_;
    private al queryDetection_;
    private boolean singleDefinitiveResult_;
    private byte memoizedIsInitialized = 2;
    private eo<aw> result_ = emptyProtobufList();

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllResult(Iterable<? extends aw> iterable) {
        ensureResultIsMutable();
        com.google.v.c.addAll(iterable, this.result_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResult(int i2, aw awVar) {
        Objects.requireNonNull(awVar);
        ensureResultIsMutable();
        this.result_.add(i2, awVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideFilters() {
        this.bitField0_ &= -3;
        this.hideFilters_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryDetection() {
        this.queryDetection_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSingleDefinitiveResult() {
        this.bitField0_ &= -5;
        this.singleDefinitiveResult_ = false;
    }

    private void ensureResultIsMutable() {
        eo<aw> eoVar = this.result_;
        if (eoVar.c()) {
            return;
        }
        this.result_ = du.mutableCopy(eoVar);
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQueryDetection(al alVar) {
        Objects.requireNonNull(alVar);
        al alVar2 = this.queryDetection_;
        if (alVar2 != null && alVar2 != al.getDefaultInstance()) {
            aj ajVarNewBuilder = al.newBuilder(alVar2);
            ajVarNewBuilder.mergeFrom((aj) alVar);
            alVar = ajVarNewBuilder.buildPartial();
        }
        this.queryDetection_ = alVar;
        this.bitField0_ |= 1;
    }

    public static ai newBuilder() {
        return (ai) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeResult(int i2) {
        ensureResultIsMutable();
        this.result_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideFilters(boolean z) {
        this.bitField0_ |= 2;
        this.hideFilters_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryDetection(al alVar) {
        Objects.requireNonNull(alVar);
        this.queryDetection_ = alVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(int i2, aw awVar) {
        Objects.requireNonNull(awVar);
        ensureResultIsMutable();
        this.result_.set(i2, awVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSingleDefinitiveResult(boolean z) {
        this.bitField0_ |= 4;
        this.singleDefinitiveResult_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "result_", aw.class, "queryDetection_", "hideFilters_", "singleDefinitiveResult_"});
            case 3:
                return new am();
            case 4:
                return new ai(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<am> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (am.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public boolean getHideFilters() {
        return this.hideFilters_;
    }

    public al getQueryDetection() {
        al alVar = this.queryDetection_;
        return alVar == null ? al.getDefaultInstance() : alVar;
    }

    public aw getResult(int i2) {
        return this.result_.get(i2);
    }

    public int getResultCount() {
        return this.result_.size();
    }

    public List<aw> getResultList() {
        return this.result_;
    }

    public ax getResultOrBuilder(int i2) {
        return this.result_.get(i2);
    }

    public List<? extends ax> getResultOrBuilderList() {
        return this.result_;
    }

    public boolean getSingleDefinitiveResult() {
        return this.singleDefinitiveResult_;
    }

    public boolean hasHideFilters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasQueryDetection() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSingleDefinitiveResult() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ai newBuilder(am amVar) {
        return (ai) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResult(aw awVar) {
        Objects.requireNonNull(awVar);
        ensureResultIsMutable();
        this.result_.add(awVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
