package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ala extends com.google.v.du<ala, aky> implements com.google.v.fj {
    private static final ala DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ala> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        ala alaVar = new ala();
        DEFAULT_INSTANCE = alaVar;
        com.google.v.du.registerDefaultInstance(ala.class, alaVar);
    }

    private ala() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static ala getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aky newBuilder() {
        return (aky) DEFAULT_INSTANCE.createBuilder();
    }

    public static ala parseDelimitedFrom(InputStream inputStream) {
        return (ala) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ala parseFrom(com.google.v.v vVar) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ala> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(akz akzVar) {
        this.type_ = akzVar.getNumber();
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
            return new ala();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aky(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ala> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ala.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public akz getType() {
        int i2 = this.type_;
        akz akzVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : akz.UNREGISTERED : akz.REGISTERED : akz.TYPE_UNSPECIFIED;
        return akzVar == null ? akz.UNRECOGNIZED : akzVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static aky newBuilder(ala alaVar) {
        return (aky) DEFAULT_INSTANCE.createBuilder(alaVar);
    }

    public static ala parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ala) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ala parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ala parseFrom(com.google.v.z zVar) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ala parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ala parseFrom(InputStream inputStream) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ala parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ala parseFrom(ByteBuffer byteBuffer) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ala parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ala parseFrom(byte[] bArr) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ala parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ala) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
