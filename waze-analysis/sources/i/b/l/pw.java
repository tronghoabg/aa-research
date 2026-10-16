package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class pw extends com.google.v.du<pw, pv> implements com.google.v.fj {
    private static final pw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<pw> PARSER = null;
    public static final int ROUTEID_FIELD_NUMBER = 1;
    public static final int ROUTINGRESULT_FIELD_NUMBER = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private long routeId_;
    private sl routingResult_;

    static {
        pw pwVar = new pw();
        DEFAULT_INSTANCE = pwVar;
        com.google.v.du.registerDefaultInstance(pw.class, pwVar);
    }

    private pw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteId() {
        this.bitField0_ &= -2;
        this.routeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingResult() {
        this.routingResult_ = null;
        this.bitField0_ &= -3;
    }

    public static pw getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static pv newBuilder() {
        return (pv) DEFAULT_INSTANCE.createBuilder();
    }

    public static pw parseDelimitedFrom(InputStream inputStream) {
        return (pw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pw parseFrom(com.google.v.v vVar) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteId(long j2) {
        this.bitField0_ |= 1;
        this.routeId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingResult(sl slVar) {
        Objects.requireNonNull(slVar);
        this.routingResult_ = slVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "routeId_", "routingResult_"});
            case 3:
                return new pw();
            case 4:
                return new pv(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<pw> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (pw.class) {
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

    public long getRouteId() {
        return this.routeId_;
    }

    public sl getRoutingResult() {
        sl slVar = this.routingResult_;
        return slVar == null ? sl.getDefaultInstance() : slVar;
    }

    public boolean hasRouteId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRoutingResult() {
        return (this.bitField0_ & 2) != 0;
    }

    public static pv newBuilder(pw pwVar) {
        return (pv) DEFAULT_INSTANCE.createBuilder(pwVar);
    }

    public static pw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pw parseFrom(com.google.v.z zVar) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pw parseFrom(InputStream inputStream) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pw parseFrom(ByteBuffer byteBuffer) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pw parseFrom(byte[] bArr) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
