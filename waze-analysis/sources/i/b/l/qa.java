package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qa extends com.google.v.du<qa, pz> implements com.google.v.fj {
    private static final qa DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<qa> PARSER = null;
    public static final int ROUTINGRESPONSECODE_FIELD_NUMBER = 2;
    public static final int ROUTINGRESULT_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private pu routingResponseCode_;
    private sl routingResult_;

    static {
        qa qaVar = new qa();
        DEFAULT_INSTANCE = qaVar;
        com.google.v.du.registerDefaultInstance(qa.class, qaVar);
    }

    private qa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingResponseCode() {
        this.routingResponseCode_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingResult() {
        this.routingResult_ = null;
        this.bitField0_ &= -2;
    }

    public static qa getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingResult(sl slVar) {
        Objects.requireNonNull(slVar);
        sl slVar2 = this.routingResult_;
        if (slVar2 != null && slVar2 != sl.getDefaultInstance()) {
            sk skVarNewBuilder = sl.newBuilder(slVar2);
            skVarNewBuilder.mergeFrom((sk) slVar);
            slVar = skVarNewBuilder.buildPartial();
        }
        this.routingResult_ = slVar;
        this.bitField0_ |= 1;
    }

    public static pz newBuilder() {
        return (pz) DEFAULT_INSTANCE.createBuilder();
    }

    public static qa parseDelimitedFrom(InputStream inputStream) {
        return (qa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qa parseFrom(com.google.v.v vVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingResponseCode(pu puVar) {
        Objects.requireNonNull(puVar);
        this.routingResponseCode_ = puVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingResult(sl slVar) {
        Objects.requireNonNull(slVar);
        this.routingResult_ = slVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "routingResult_", "routingResponseCode_"});
            case 3:
                return new qa();
            case 4:
                return new pz(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<qa> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (qa.class) {
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

    public pu getRoutingResponseCode() {
        pu puVar = this.routingResponseCode_;
        return puVar == null ? pu.getDefaultInstance() : puVar;
    }

    public sl getRoutingResult() {
        sl slVar = this.routingResult_;
        return slVar == null ? sl.getDefaultInstance() : slVar;
    }

    public boolean hasRoutingResponseCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoutingResult() {
        return (this.bitField0_ & 1) != 0;
    }

    public static pz newBuilder(qa qaVar) {
        return (pz) DEFAULT_INSTANCE.createBuilder(qaVar);
    }

    public static qa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qa parseFrom(com.google.v.z zVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qa parseFrom(InputStream inputStream) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qa parseFrom(ByteBuffer byteBuffer) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qa parseFrom(byte[] bArr) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
