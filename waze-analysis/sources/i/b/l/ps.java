package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ps extends com.google.v.du<ps, pr> implements com.google.v.fj {
    public static final int ALTERNATIVERESPONSE_FIELD_NUMBER = 2;
    public static final int CLOSURES_IMPACT_INFO_FIELD_NUMBER = 4;
    private static final ps DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ps> PARSER = null;
    public static final int ROUTINGRESPONSECODE_FIELD_NUMBER = 1;
    private int bitField0_;
    private og closuresImpactInfo_;
    private pu routingResponseCode_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<sl> alternativeResponse_ = emptyProtobufList();

    static {
        ps psVar = new ps();
        DEFAULT_INSTANCE = psVar;
        com.google.v.du.registerDefaultInstance(ps.class, psVar);
    }

    private ps() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlternativeResponse(Iterable<? extends sl> iterable) {
        ensureAlternativeResponseIsMutable();
        com.google.v.c.addAll(iterable, this.alternativeResponse_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlternativeResponse(int i2, sl slVar) {
        Objects.requireNonNull(slVar);
        ensureAlternativeResponseIsMutable();
        this.alternativeResponse_.add(i2, slVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeResponse() {
        this.alternativeResponse_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosuresImpactInfo() {
        this.closuresImpactInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingResponseCode() {
        this.routingResponseCode_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureAlternativeResponseIsMutable() {
        com.google.v.eo<sl> eoVar = this.alternativeResponse_;
        if (eoVar.c()) {
            return;
        }
        this.alternativeResponse_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ps getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClosuresImpactInfo(og ogVar) {
        Objects.requireNonNull(ogVar);
        og ogVar2 = this.closuresImpactInfo_;
        if (ogVar2 != null && ogVar2 != og.getDefaultInstance()) {
            od odVarNewBuilder = og.newBuilder(ogVar2);
            odVarNewBuilder.mergeFrom((od) ogVar);
            ogVar = odVarNewBuilder.buildPartial();
        }
        this.closuresImpactInfo_ = ogVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingResponseCode(pu puVar) {
        Objects.requireNonNull(puVar);
        pu puVar2 = this.routingResponseCode_;
        if (puVar2 != null && puVar2 != pu.getDefaultInstance()) {
            pt ptVarNewBuilder = pu.newBuilder(puVar2);
            ptVarNewBuilder.mergeFrom((pt) puVar);
            puVar = ptVarNewBuilder.buildPartial();
        }
        this.routingResponseCode_ = puVar;
        this.bitField0_ |= 1;
    }

    public static pr newBuilder() {
        return (pr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ps parseDelimitedFrom(InputStream inputStream) {
        return (ps) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ps parseFrom(com.google.v.v vVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ps> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlternativeResponse(int i2) {
        ensureAlternativeResponseIsMutable();
        this.alternativeResponse_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeResponse(int i2, sl slVar) {
        Objects.requireNonNull(slVar);
        ensureAlternativeResponseIsMutable();
        this.alternativeResponse_.set(i2, slVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosuresImpactInfo(og ogVar) {
        Objects.requireNonNull(ogVar);
        this.closuresImpactInfo_ = ogVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingResponseCode(pu puVar) {
        Objects.requireNonNull(puVar);
        this.routingResponseCode_ = puVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0004ဉ\u0001", new Object[]{"bitField0_", "routingResponseCode_", "alternativeResponse_", sl.class, "closuresImpactInfo_"});
            case 3:
                return new ps();
            case 4:
                return new pr(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ps> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ps.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public sl getAlternativeResponse(int i2) {
        return this.alternativeResponse_.get(i2);
    }

    public int getAlternativeResponseCount() {
        return this.alternativeResponse_.size();
    }

    public List<sl> getAlternativeResponseList() {
        return this.alternativeResponse_;
    }

    public sq getAlternativeResponseOrBuilder(int i2) {
        return this.alternativeResponse_.get(i2);
    }

    public List<? extends sq> getAlternativeResponseOrBuilderList() {
        return this.alternativeResponse_;
    }

    public og getClosuresImpactInfo() {
        og ogVar = this.closuresImpactInfo_;
        return ogVar == null ? og.getDefaultInstance() : ogVar;
    }

    public pu getRoutingResponseCode() {
        pu puVar = this.routingResponseCode_;
        return puVar == null ? pu.getDefaultInstance() : puVar;
    }

    public boolean hasClosuresImpactInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoutingResponseCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static pr newBuilder(ps psVar) {
        return (pr) DEFAULT_INSTANCE.createBuilder(psVar);
    }

    public static ps parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ps) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ps parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ps parseFrom(com.google.v.z zVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ps parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlternativeResponse(sl slVar) {
        Objects.requireNonNull(slVar);
        ensureAlternativeResponseIsMutable();
        this.alternativeResponse_.add(slVar);
    }

    public static ps parseFrom(InputStream inputStream) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ps parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ps parseFrom(ByteBuffer byteBuffer) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ps parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ps parseFrom(byte[] bArr) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ps parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
