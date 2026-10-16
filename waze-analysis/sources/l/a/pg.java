package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pg extends com.google.v.du<pg, pf> implements com.google.v.fj {
    private static final pg DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<pg> PARSER;
    private String name_ = "";

    static {
        pg pgVar = new pg();
        DEFAULT_INSTANCE = pgVar;
        com.google.v.du.registerDefaultInstance(pg.class, pgVar);
    }

    private pg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static pg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static pf newBuilder() {
        return (pf) DEFAULT_INSTANCE.createBuilder();
    }

    public static pg parseDelimitedFrom(InputStream inputStream) {
        return (pg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pg parseFrom(com.google.v.v vVar) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
        }
        if (iOrdinal == 3) {
            return new pg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public static pf newBuilder(pg pgVar) {
        return (pf) DEFAULT_INSTANCE.createBuilder(pgVar);
    }

    public static pg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pg parseFrom(com.google.v.z zVar) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pg parseFrom(InputStream inputStream) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pg parseFrom(ByteBuffer byteBuffer) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pg parseFrom(byte[] bArr) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
