package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aum extends com.google.v.du<aum, auk> implements com.google.v.fj {
    private static final aum DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aum> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        aum aumVar = new aum();
        DEFAULT_INSTANCE = aumVar;
        com.google.v.du.registerDefaultInstance(aum.class, aumVar);
    }

    private aum() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static aum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static auk newBuilder() {
        return (auk) DEFAULT_INSTANCE.createBuilder();
    }

    public static aum parseDelimitedFrom(InputStream inputStream) {
        return (aum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aum parseFrom(com.google.v.v vVar) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(aul aulVar) {
        this.type_ = aulVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new aum();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new auk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aum> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aum.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aul getType() {
        int i2 = this.type_;
        aul aulVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : aul.QUICK_POLICE : aul.QUICK_JAM : aul.QUICK_HAZARD : aul.NORMAL : aul.TYPE_UNSPECIFIED;
        return aulVar == null ? aul.UNRECOGNIZED : aulVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static auk newBuilder(aum aumVar) {
        return (auk) DEFAULT_INSTANCE.createBuilder(aumVar);
    }

    public static aum parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aum parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aum parseFrom(com.google.v.z zVar) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aum parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aum parseFrom(InputStream inputStream) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aum parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aum parseFrom(ByteBuffer byteBuffer) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aum parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aum parseFrom(byte[] bArr) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aum parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aum) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
