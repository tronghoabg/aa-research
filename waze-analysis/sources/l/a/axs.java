package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axs extends com.google.v.du<axs, axq> implements com.google.v.fj {
    private static final axs DEFAULT_INSTANCE;
    public static final int ORIENTATION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<axs> PARSER;
    private int orientation_;

    static {
        axs axsVar = new axs();
        DEFAULT_INSTANCE = axsVar;
        com.google.v.du.registerDefaultInstance(axs.class, axsVar);
    }

    private axs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrientation() {
        this.orientation_ = 0;
    }

    public static axs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static axq newBuilder() {
        return (axq) DEFAULT_INSTANCE.createBuilder();
    }

    public static axs parseDelimitedFrom(InputStream inputStream) {
        return (axs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axs parseFrom(com.google.v.v vVar) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<axs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrientation(axr axrVar) {
        this.orientation_ = axrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrientationValue(int i2) {
        this.orientation_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"orientation_"});
        }
        if (iOrdinal == 3) {
            return new axs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new axq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<axs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (axs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public axr getOrientation() {
        int i2 = this.orientation_;
        axr axrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : axr.PORTRAIT : axr.LANDSCAPE : axr.ORIENTATION_UNSPECIFIED;
        return axrVar == null ? axr.UNRECOGNIZED : axrVar;
    }

    public int getOrientationValue() {
        return this.orientation_;
    }

    public static axq newBuilder(axs axsVar) {
        return (axq) DEFAULT_INSTANCE.createBuilder(axsVar);
    }

    public static axs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static axs parseFrom(com.google.v.z zVar) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static axs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static axs parseFrom(InputStream inputStream) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axs parseFrom(ByteBuffer byteBuffer) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static axs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static axs parseFrom(byte[] bArr) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static axs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (axs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
