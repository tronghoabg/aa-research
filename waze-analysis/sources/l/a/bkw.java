package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bkw extends com.google.v.du<bkw, bku> implements com.google.v.fj {
    private static final bkw DEFAULT_INSTANCE;
    public static final int INFORMATION_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bkw> PARSER;
    private int informationType_;

    static {
        bkw bkwVar = new bkw();
        DEFAULT_INSTANCE = bkwVar;
        com.google.v.du.registerDefaultInstance(bkw.class, bkwVar);
    }

    private bkw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInformationType() {
        this.informationType_ = 0;
    }

    public static bkw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bku newBuilder() {
        return (bku) DEFAULT_INSTANCE.createBuilder();
    }

    public static bkw parseDelimitedFrom(InputStream inputStream) {
        return (bkw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkw parseFrom(com.google.v.v vVar) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bkw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInformationType(bkv bkvVar) {
        this.informationType_ = bkvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInformationTypeValue(int i2) {
        this.informationType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"informationType_"});
        }
        if (iOrdinal == 3) {
            return new bkw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bku(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bkw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bkw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bkv getInformationType() {
        int i2 = this.informationType_;
        bkv bkvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bkv.CLOSURE : bkv.EVENT : bkv.INFORMATION_TYPE_UNSPECIFIED;
        return bkvVar == null ? bkv.UNRECOGNIZED : bkvVar;
    }

    public int getInformationTypeValue() {
        return this.informationType_;
    }

    public static bku newBuilder(bkw bkwVar) {
        return (bku) DEFAULT_INSTANCE.createBuilder(bkwVar);
    }

    public static bkw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bkw parseFrom(com.google.v.z zVar) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bkw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bkw parseFrom(InputStream inputStream) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkw parseFrom(ByteBuffer byteBuffer) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bkw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bkw parseFrom(byte[] bArr) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bkw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bkw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
