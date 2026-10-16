package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class lc extends com.google.v.du<lc, lb> implements com.google.v.fj {
    public static final int ADVERTISING_ID_FIELD_NUMBER = 1;
    private static final lc DEFAULT_INSTANCE;
    public static final int OPTED_OUT_OF_TRACKING_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<lc> PARSER;
    private String advertisingId_ = "";
    private int bitField0_;
    private boolean optedOutOfTracking_;

    static {
        lc lcVar = new lc();
        DEFAULT_INSTANCE = lcVar;
        com.google.v.du.registerDefaultInstance(lc.class, lcVar);
    }

    private lc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertisingId() {
        this.bitField0_ &= -2;
        this.advertisingId_ = getDefaultInstance().getAdvertisingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptedOutOfTracking() {
        this.bitField0_ &= -3;
        this.optedOutOfTracking_ = false;
    }

    public static lc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lb newBuilder() {
        return (lb) DEFAULT_INSTANCE.createBuilder();
    }

    public static lc parseDelimitedFrom(InputStream inputStream) {
        return (lc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lc parseFrom(com.google.v.v vVar) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisingId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.advertisingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisingIdBytes(com.google.v.v vVar) {
        this.advertisingId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptedOutOfTracking(boolean z) {
        this.bitField0_ |= 2;
        this.optedOutOfTracking_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "advertisingId_", "optedOutOfTracking_"});
        }
        if (iOrdinal == 3) {
            return new lc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAdvertisingId() {
        return this.advertisingId_;
    }

    public com.google.v.v getAdvertisingIdBytes() {
        return com.google.v.v.s(this.advertisingId_);
    }

    public boolean getOptedOutOfTracking() {
        return this.optedOutOfTracking_;
    }

    public boolean hasAdvertisingId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOptedOutOfTracking() {
        return (this.bitField0_ & 2) != 0;
    }

    public static lb newBuilder(lc lcVar) {
        return (lb) DEFAULT_INSTANCE.createBuilder(lcVar);
    }

    public static lc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lc parseFrom(com.google.v.z zVar) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lc parseFrom(InputStream inputStream) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lc parseFrom(ByteBuffer byteBuffer) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lc parseFrom(byte[] bArr) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
