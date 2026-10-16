package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ns extends com.google.v.du<ns, nr> implements com.google.v.fj {
    public static final int ADDWAYPOINTRESPONSECODE_FIELD_NUMBER = 1;
    public static final int ALTERNATIVERESPONSE_FIELD_NUMBER = 2;
    private static final ns DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ns> PARSER;
    private pu addWaypointResponseCode_;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<sl> alternativeResponse_ = emptyProtobufList();

    static {
        ns nsVar = new ns();
        DEFAULT_INSTANCE = nsVar;
        com.google.v.du.registerDefaultInstance(ns.class, nsVar);
    }

    private ns() {
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
    public void clearAddWaypointResponseCode() {
        this.addWaypointResponseCode_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeResponse() {
        this.alternativeResponse_ = emptyProtobufList();
    }

    private void ensureAlternativeResponseIsMutable() {
        com.google.v.eo<sl> eoVar = this.alternativeResponse_;
        if (eoVar.c()) {
            return;
        }
        this.alternativeResponse_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ns getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddWaypointResponseCode(pu puVar) {
        Objects.requireNonNull(puVar);
        pu puVar2 = this.addWaypointResponseCode_;
        if (puVar2 != null && puVar2 != pu.getDefaultInstance()) {
            pt ptVarNewBuilder = pu.newBuilder(puVar2);
            ptVarNewBuilder.mergeFrom((pt) puVar);
            puVar = ptVarNewBuilder.buildPartial();
        }
        this.addWaypointResponseCode_ = puVar;
        this.bitField0_ |= 1;
    }

    public static nr newBuilder() {
        return (nr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ns parseDelimitedFrom(InputStream inputStream) {
        return (ns) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ns parseFrom(com.google.v.v vVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ns> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlternativeResponse(int i2) {
        ensureAlternativeResponseIsMutable();
        this.alternativeResponse_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddWaypointResponseCode(pu puVar) {
        Objects.requireNonNull(puVar);
        this.addWaypointResponseCode_ = puVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeResponse(int i2, sl slVar) {
        Objects.requireNonNull(slVar);
        ensureAlternativeResponseIsMutable();
        this.alternativeResponse_.set(i2, slVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"bitField0_", "addWaypointResponseCode_", "alternativeResponse_", sl.class});
            case 3:
                return new ns();
            case 4:
                return new nr(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ns> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ns.class) {
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

    public pu getAddWaypointResponseCode() {
        pu puVar = this.addWaypointResponseCode_;
        return puVar == null ? pu.getDefaultInstance() : puVar;
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

    public boolean hasAddWaypointResponseCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static nr newBuilder(ns nsVar) {
        return (nr) DEFAULT_INSTANCE.createBuilder(nsVar);
    }

    public static ns parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ns) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ns parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ns parseFrom(com.google.v.z zVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ns parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlternativeResponse(sl slVar) {
        Objects.requireNonNull(slVar);
        ensureAlternativeResponseIsMutable();
        this.alternativeResponse_.add(slVar);
    }

    public static ns parseFrom(InputStream inputStream) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ns parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ns parseFrom(ByteBuffer byteBuffer) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ns parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ns parseFrom(byte[] bArr) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ns parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
