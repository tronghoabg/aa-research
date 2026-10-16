package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bed extends com.google.v.du<bed, bec> implements com.google.v.fj {
    private static final bed DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bed> PARSER = null;
    public static final int PREPOSITION_FIELD_NUMBER = 1;
    private String preposition_ = "";

    static {
        bed bedVar = new bed();
        DEFAULT_INSTANCE = bedVar;
        com.google.v.du.registerDefaultInstance(bed.class, bedVar);
    }

    private bed() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreposition() {
        this.preposition_ = getDefaultInstance().getPreposition();
    }

    public static bed getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bec newBuilder() {
        return (bec) DEFAULT_INSTANCE.createBuilder();
    }

    public static bed parseDelimitedFrom(InputStream inputStream) {
        return (bed) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bed parseFrom(com.google.v.v vVar) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bed> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreposition(String str) {
        Objects.requireNonNull(str);
        this.preposition_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrepositionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.preposition_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"preposition_"});
        }
        if (iOrdinal == 3) {
            return new bed();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bec(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bed> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bed.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPreposition() {
        return this.preposition_;
    }

    public com.google.v.v getPrepositionBytes() {
        return com.google.v.v.s(this.preposition_);
    }

    public static bec newBuilder(bed bedVar) {
        return (bec) DEFAULT_INSTANCE.createBuilder(bedVar);
    }

    public static bed parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bed) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bed parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bed parseFrom(com.google.v.z zVar) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bed parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bed parseFrom(InputStream inputStream) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bed parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bed parseFrom(ByteBuffer byteBuffer) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bed parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bed parseFrom(byte[] bArr) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bed parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
