package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class di extends com.google.v.du<di, dg> implements com.google.v.fj {
    private static final di DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<di> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String id_ = "";
    private int type_;

    static {
        di diVar = new di();
        DEFAULT_INSTANCE = diVar;
        com.google.v.du.registerDefaultInstance(di.class, diVar);
    }

    private di() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -3;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static di getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dg newBuilder() {
        return (dg) DEFAULT_INSTANCE.createBuilder();
    }

    public static di parseDelimitedFrom(InputStream inputStream) {
        return (di) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static di parseFrom(com.google.v.v vVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<di> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(dh dhVar) {
        this.type_ = dhVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "type_", z.r, "id_"});
        }
        if (iOrdinal == 3) {
            return new di();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<di> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (di.class) {
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

    public dh getType() {
        dh dhVarA = dh.a(this.type_);
        return dhVarA == null ? dh.UNKNOWN : dhVarA;
    }

    public boolean hasId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dg newBuilder(di diVar) {
        return (dg) DEFAULT_INSTANCE.createBuilder(diVar);
    }

    public static di parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (di) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static di parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static di parseFrom(com.google.v.z zVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static di parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static di parseFrom(InputStream inputStream) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static di parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static di parseFrom(ByteBuffer byteBuffer) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static di parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static di parseFrom(byte[] bArr) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static di parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
