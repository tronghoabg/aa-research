package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ane extends com.google.v.du<ane, anc> implements com.google.v.fj {
    private static final ane DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ane> PARSER;
    private int mode_;

    static {
        ane aneVar = new ane();
        DEFAULT_INSTANCE = aneVar;
        com.google.v.du.registerDefaultInstance(ane.class, aneVar);
    }

    private ane() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    public static ane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static anc newBuilder() {
        return (anc) DEFAULT_INSTANCE.createBuilder();
    }

    public static ane parseDelimitedFrom(InputStream inputStream) {
        return (ane) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ane parseFrom(com.google.v.v vVar) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(and andVar) {
        this.mode_ = andVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i2) {
        this.mode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"mode_"});
        }
        if (iOrdinal == 3) {
            return new ane();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new anc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ane> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ane.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public and getMode() {
        int i2 = this.mode_;
        and andVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : and.WIMAX : and.CELL : and.WIFI : and.NOT_AVAILABLE;
        return andVar == null ? and.UNRECOGNIZED : andVar;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public static anc newBuilder(ane aneVar) {
        return (anc) DEFAULT_INSTANCE.createBuilder(aneVar);
    }

    public static ane parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ane) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ane parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ane parseFrom(com.google.v.z zVar) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ane parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ane parseFrom(InputStream inputStream) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ane parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ane parseFrom(ByteBuffer byteBuffer) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ane parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ane parseFrom(byte[] bArr) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ane parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ane) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
