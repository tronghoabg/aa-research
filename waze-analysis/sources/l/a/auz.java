package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class auz extends com.google.v.du<auz, auu> implements com.google.v.fj {
    public static final int CONFIGS_FIELD_NUMBER = 2;
    private static final auz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<auz> PARSER = null;
    public static final int REPORTING_REASON_FIELD_NUMBER = 1;
    private com.google.v.eo<auw> configs_ = emptyProtobufList();
    private int reportingReason_;

    static {
        auz auzVar = new auz();
        DEFAULT_INSTANCE = auzVar;
        com.google.v.du.registerDefaultInstance(auz.class, auzVar);
    }

    private auz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConfigs(Iterable<? extends auw> iterable) {
        ensureConfigsIsMutable();
        com.google.v.c.addAll(iterable, this.configs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigs(int i2, auw auwVar) {
        Objects.requireNonNull(auwVar);
        ensureConfigsIsMutable();
        this.configs_.add(i2, auwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigs() {
        this.configs_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingReason() {
        this.reportingReason_ = 0;
    }

    private void ensureConfigsIsMutable() {
        com.google.v.eo<auw> eoVar = this.configs_;
        if (eoVar.c()) {
            return;
        }
        this.configs_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static auz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static auu newBuilder() {
        return (auu) DEFAULT_INSTANCE.createBuilder();
    }

    public static auz parseDelimitedFrom(InputStream inputStream) {
        return (auz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auz parseFrom(com.google.v.v vVar) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<auz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConfigs(int i2) {
        ensureConfigsIsMutable();
        this.configs_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigs(int i2, auw auwVar) {
        Objects.requireNonNull(auwVar);
        ensureConfigsIsMutable();
        this.configs_.set(i2, auwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingReason(auy auyVar) {
        this.reportingReason_ = auyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingReasonValue(int i2) {
        this.reportingReason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"reportingReason_", "configs_", auw.class});
        }
        if (iOrdinal == 3) {
            return new auz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new auu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<auz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (auz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public auw getConfigs(int i2) {
        return this.configs_.get(i2);
    }

    public int getConfigsCount() {
        return this.configs_.size();
    }

    public List<auw> getConfigsList() {
        return this.configs_;
    }

    public aux getConfigsOrBuilder(int i2) {
        return this.configs_.get(i2);
    }

    public List<? extends aux> getConfigsOrBuilderList() {
        return this.configs_;
    }

    @Deprecated
    public auy getReportingReason() {
        int i2 = this.reportingReason_;
        auy auyVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : auy.COUNTRY_CHANGED : auy.SESSION_STARTUP : auy.REPORTING_REASON_UNSPECIFIED;
        return auyVar == null ? auy.UNRECOGNIZED : auyVar;
    }

    @Deprecated
    public int getReportingReasonValue() {
        return this.reportingReason_;
    }

    public static auu newBuilder(auz auzVar) {
        return (auu) DEFAULT_INSTANCE.createBuilder(auzVar);
    }

    public static auz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static auz parseFrom(com.google.v.z zVar) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static auz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigs(auw auwVar) {
        Objects.requireNonNull(auwVar);
        ensureConfigsIsMutable();
        this.configs_.add(auwVar);
    }

    public static auz parseFrom(InputStream inputStream) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auz parseFrom(ByteBuffer byteBuffer) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static auz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static auz parseFrom(byte[] bArr) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static auz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (auz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
