package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qe extends com.google.v.du<qe, qd> implements com.google.v.fj {
    private static final qe DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<qe> PARSER = null;
    public static final int ROUTINGRESULT_FIELD_NUMBER = 1;
    public static final int SELECTROUTERESPONSECODE_FIELD_NUMBER = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private sl routingResult_;
    private pu selectRouteResponseCode_;

    static {
        qe qeVar = new qe();
        DEFAULT_INSTANCE = qeVar;
        com.google.v.du.registerDefaultInstance(qe.class, qeVar);
    }

    private qe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingResult() {
        this.routingResult_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectRouteResponseCode() {
        this.selectRouteResponseCode_ = null;
        this.bitField0_ &= -3;
    }

    public static qe getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelectRouteResponseCode(pu puVar) {
        Objects.requireNonNull(puVar);
        pu puVar2 = this.selectRouteResponseCode_;
        if (puVar2 != null && puVar2 != pu.getDefaultInstance()) {
            pt ptVarNewBuilder = pu.newBuilder(puVar2);
            ptVarNewBuilder.mergeFrom((pt) puVar);
            puVar = ptVarNewBuilder.buildPartial();
        }
        this.selectRouteResponseCode_ = puVar;
        this.bitField0_ |= 2;
    }

    public static qd newBuilder() {
        return (qd) DEFAULT_INSTANCE.createBuilder();
    }

    public static qe parseDelimitedFrom(InputStream inputStream) {
        return (qe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qe parseFrom(com.google.v.v vVar) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingResult(sl slVar) {
        Objects.requireNonNull(slVar);
        this.routingResult_ = slVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectRouteResponseCode(pu puVar) {
        Objects.requireNonNull(puVar);
        this.selectRouteResponseCode_ = puVar;
        this.bitField0_ |= 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "routingResult_", "selectRouteResponseCode_"});
            case 3:
                return new qe();
            case 4:
                return new qd(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<qe> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (qe.class) {
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

    public sl getRoutingResult() {
        sl slVar = this.routingResult_;
        return slVar == null ? sl.getDefaultInstance() : slVar;
    }

    public pu getSelectRouteResponseCode() {
        pu puVar = this.selectRouteResponseCode_;
        return puVar == null ? pu.getDefaultInstance() : puVar;
    }

    public boolean hasRoutingResult() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSelectRouteResponseCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public static qd newBuilder(qe qeVar) {
        return (qd) DEFAULT_INSTANCE.createBuilder(qeVar);
    }

    public static qe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qe parseFrom(com.google.v.z zVar) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qe parseFrom(InputStream inputStream) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qe parseFrom(ByteBuffer byteBuffer) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qe parseFrom(byte[] bArr) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
