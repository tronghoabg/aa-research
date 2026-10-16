package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fz extends com.google.v.du<fz, fy> implements ga {
    private static final fz DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 202;
    private static volatile com.google.v.fo<fz> PARSER = null;
    public static final int T10_FIELD_NUMBER = 200;
    public static final int T1_FIELD_NUMBER = 201;
    private int bitField0_;
    private String id_ = "";
    private int t10_;
    private int t1_;

    static {
        fz fzVar = new fz();
        DEFAULT_INSTANCE = fzVar;
        com.google.v.du.registerDefaultInstance(fz.class, fzVar);
    }

    private fz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -5;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearT1() {
        this.bitField0_ &= -3;
        this.t1_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearT10() {
        this.bitField0_ &= -2;
        this.t10_ = 0;
    }

    public static fz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fy newBuilder() {
        return (fy) DEFAULT_INSTANCE.createBuilder();
    }

    public static fz parseDelimitedFrom(InputStream inputStream) {
        return (fz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fz parseFrom(com.google.v.v vVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setT1(int i2) {
        this.bitField0_ |= 2;
        this.t1_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setT10(int i2) {
        this.bitField0_ |= 1;
        this.t10_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001ÈÊ\u0003\u0000\u0000\u0000Èင\u0000Éင\u0001Êဈ\u0002", new Object[]{"bitField0_", "t10_", "t1_", "id_"});
        }
        if (iOrdinal == 3) {
            return new fz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public int getT1() {
        return this.t1_;
    }

    public int getT10() {
        return this.t10_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasT1() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasT10() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fy newBuilder(fz fzVar) {
        return (fy) DEFAULT_INSTANCE.createBuilder(fzVar);
    }

    public static fz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fz parseFrom(com.google.v.z zVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fz parseFrom(InputStream inputStream) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fz parseFrom(ByteBuffer byteBuffer) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fz parseFrom(byte[] bArr) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
