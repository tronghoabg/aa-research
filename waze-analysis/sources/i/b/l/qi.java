package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qi extends com.google.v.du<qi, qh> implements com.google.v.fj {
    private static final qi DEFAULT_INSTANCE;
    public static final int OTHERUSERID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<qi> PARSER = null;
    public static final int ROUTINGRESULT_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private long otherUserId_;
    private sl routingResult_;

    static {
        qi qiVar = new qi();
        DEFAULT_INSTANCE = qiVar;
        com.google.v.du.registerDefaultInstance(qi.class, qiVar);
    }

    private qi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherUserId() {
        this.bitField0_ &= -3;
        this.otherUserId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingResult() {
        this.routingResult_ = null;
        this.bitField0_ &= -2;
    }

    public static qi getDefaultInstance() {
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

    public static qh newBuilder() {
        return (qh) DEFAULT_INSTANCE.createBuilder();
    }

    public static qi parseDelimitedFrom(InputStream inputStream) {
        return (qi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qi parseFrom(com.google.v.v vVar) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherUserId(long j2) {
        this.bitField0_ |= 2;
        this.otherUserId_ = j2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "routingResult_", "otherUserId_"});
            case 3:
                return new qi();
            case 4:
                return new qh(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<qi> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (qi.class) {
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

    public long getOtherUserId() {
        return this.otherUserId_;
    }

    public sl getRoutingResult() {
        sl slVar = this.routingResult_;
        return slVar == null ? sl.getDefaultInstance() : slVar;
    }

    public boolean hasOtherUserId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoutingResult() {
        return (this.bitField0_ & 1) != 0;
    }

    public static qh newBuilder(qi qiVar) {
        return (qh) DEFAULT_INSTANCE.createBuilder(qiVar);
    }

    public static qi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qi parseFrom(com.google.v.z zVar) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qi parseFrom(InputStream inputStream) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qi parseFrom(ByteBuffer byteBuffer) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qi parseFrom(byte[] bArr) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
