package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class lq extends com.google.v.du<lq, lo> implements com.google.v.fj {
    private static final lq DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<lq> PARSER = null;
    public static final int STREET_FIELD_NUMBER = 2;
    private int bitField0_;
    private int name_;
    private String street_ = "";

    static {
        lq lqVar = new lq();
        DEFAULT_INSTANCE = lqVar;
        com.google.v.du.registerDefaultInstance(lq.class, lqVar);
    }

    private lq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.bitField0_ &= -3;
        this.street_ = getDefaultInstance().getStreet();
    }

    public static lq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lo newBuilder() {
        return (lo) DEFAULT_INSTANCE.createBuilder();
    }

    public static lq parseDelimitedFrom(InputStream inputStream) {
        return (lq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lq parseFrom(com.google.v.v vVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(lp lpVar) {
        this.name_ = lpVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.street_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetBytes(com.google.v.v vVar) {
        this.street_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "name_", hf.f48748l, "street_"});
        }
        if (iOrdinal == 3) {
            return new lq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public lp getName() {
        lp lpVarA = lp.a(this.name_);
        return lpVarA == null ? lp.UNSPECIFIED : lpVarA;
    }

    public String getStreet() {
        return this.street_;
    }

    public com.google.v.v getStreetBytes() {
        return com.google.v.v.s(this.street_);
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 2) != 0;
    }

    public static lo newBuilder(lq lqVar) {
        return (lo) DEFAULT_INSTANCE.createBuilder(lqVar);
    }

    public static lq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lq parseFrom(com.google.v.z zVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lq parseFrom(InputStream inputStream) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lq parseFrom(ByteBuffer byteBuffer) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lq parseFrom(byte[] bArr) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
