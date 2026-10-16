package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class al extends com.google.v.du<al, ak> implements am {
    private static final al DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<al> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String packageName_ = "";
    private int type_;

    static {
        al alVar = new al();
        DEFAULT_INSTANCE = alVar;
        com.google.v.du.registerDefaultInstance(al.class, alVar);
    }

    private al() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.bitField0_ &= -3;
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static al getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ak newBuilder() {
        return (ak) DEFAULT_INSTANCE.createBuilder();
    }

    public static al parseDelimitedFrom(InputStream inputStream) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(com.google.v.v vVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<al> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(com.google.v.v vVar) {
        this.packageName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(i.b.o oVar) {
        this.type_ = oVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "type_", i.b.o.a(), "packageName_"});
        }
        if (iOrdinal == 3) {
            return new al();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ak(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<al> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (al.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPackageName() {
        return this.packageName_;
    }

    public com.google.v.v getPackageNameBytes() {
        return com.google.v.v.s(this.packageName_);
    }

    public i.b.o getType() {
        i.b.o oVarB = i.b.o.b(this.type_);
        return oVarB == null ? i.b.o.UNKNOWN_CLIENT_API : oVarB;
    }

    public boolean hasPackageName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ak newBuilder(al alVar) {
        return (ak) DEFAULT_INSTANCE.createBuilder(alVar);
    }

    public static al parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static al parseFrom(com.google.v.z zVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static al parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static al parseFrom(InputStream inputStream) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(ByteBuffer byteBuffer) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static al parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static al parseFrom(byte[] bArr) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static al parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
