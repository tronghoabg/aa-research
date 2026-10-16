package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class avm extends com.google.v.du<avm, avk> implements com.google.v.fj {
    public static final int CLIENT_ACTIVE_ROUTE_ID_FIELD_NUMBER = 2;
    private static final avm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<avm> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int SERVER_ACTIVE_ROUTE_ID_FIELD_NUMBER = 3;
    public static final int SUGGESTED_ALTERNATE_ROUTE_UUID_FIELD_NUMBER = 4;
    private int bitField0_;
    private long clientActiveRouteId_;
    private int reason_;
    private long serverActiveRouteId_;
    private String suggestedAlternateRouteUuid_ = "";

    static {
        avm avmVar = new avm();
        DEFAULT_INSTANCE = avmVar;
        com.google.v.du.registerDefaultInstance(avm.class, avmVar);
    }

    private avm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientActiveRouteId() {
        this.bitField0_ &= -2;
        this.clientActiveRouteId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerActiveRouteId() {
        this.bitField0_ &= -3;
        this.serverActiveRouteId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedAlternateRouteUuid() {
        this.suggestedAlternateRouteUuid_ = getDefaultInstance().getSuggestedAlternateRouteUuid();
    }

    public static avm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static avk newBuilder() {
        return (avk) DEFAULT_INSTANCE.createBuilder();
    }

    public static avm parseDelimitedFrom(InputStream inputStream) {
        return (avm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avm parseFrom(com.google.v.v vVar) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<avm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientActiveRouteId(long j2) {
        this.bitField0_ |= 1;
        this.clientActiveRouteId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(avl avlVar) {
        this.reason_ = avlVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerActiveRouteId(long j2) {
        this.bitField0_ |= 2;
        this.serverActiveRouteId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedAlternateRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.suggestedAlternateRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedAlternateRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.suggestedAlternateRouteUuid_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000\u0003ဂ\u0001\u0004Ȉ", new Object[]{"bitField0_", "reason_", "clientActiveRouteId_", "serverActiveRouteId_", "suggestedAlternateRouteUuid_"});
        }
        if (iOrdinal == 3) {
            return new avm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new avk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<avm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (avm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getClientActiveRouteId() {
        return this.clientActiveRouteId_;
    }

    public avl getReason() {
        int i2 = this.reason_;
        avl avlVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : avl.ROUTE_ID_MISMATCH : avl.PASSED_RELEVANT_SEGMENT : avl.NOT_NAVIGATING : avl.REASON_UNSPECIFIED;
        return avlVar == null ? avl.UNRECOGNIZED : avlVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public long getServerActiveRouteId() {
        return this.serverActiveRouteId_;
    }

    public String getSuggestedAlternateRouteUuid() {
        return this.suggestedAlternateRouteUuid_;
    }

    public com.google.v.v getSuggestedAlternateRouteUuidBytes() {
        return com.google.v.v.s(this.suggestedAlternateRouteUuid_);
    }

    public boolean hasClientActiveRouteId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasServerActiveRouteId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static avk newBuilder(avm avmVar) {
        return (avk) DEFAULT_INSTANCE.createBuilder(avmVar);
    }

    public static avm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static avm parseFrom(com.google.v.z zVar) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static avm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static avm parseFrom(InputStream inputStream) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avm parseFrom(ByteBuffer byteBuffer) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static avm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static avm parseFrom(byte[] bArr) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static avm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (avm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
