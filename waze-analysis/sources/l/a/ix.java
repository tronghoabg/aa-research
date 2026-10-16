package l.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ix extends com.google.v.du<ix, iw> implements com.google.v.fj {
    public static final int CURRENT_HEADING_DEGREES_FIELD_NUMBER = 1;
    private static final ix DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ix> PARSER;
    private int bitField0_;
    private double currentHeadingDegrees_;

    static {
        ix ixVar = new ix();
        DEFAULT_INSTANCE = ixVar;
        com.google.v.du.registerDefaultInstance(ix.class, ixVar);
    }

    private ix() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentHeadingDegrees() {
        this.bitField0_ &= -2;
        this.currentHeadingDegrees_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static ix getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static iw newBuilder() {
        return (iw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ix parseDelimitedFrom(InputStream inputStream) {
        return (ix) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ix parseFrom(com.google.v.v vVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ix> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentHeadingDegrees(double d2) {
        this.bitField0_ |= 1;
        this.currentHeadingDegrees_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"bitField0_", "currentHeadingDegrees_"});
        }
        if (iOrdinal == 3) {
            return new ix();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new iw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ix> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ix.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getCurrentHeadingDegrees() {
        return this.currentHeadingDegrees_;
    }

    public boolean hasCurrentHeadingDegrees() {
        return (this.bitField0_ & 1) != 0;
    }

    public static iw newBuilder(ix ixVar) {
        return (iw) DEFAULT_INSTANCE.createBuilder(ixVar);
    }

    public static ix parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ix) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ix parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ix parseFrom(com.google.v.z zVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ix parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ix parseFrom(InputStream inputStream) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ix parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ix parseFrom(ByteBuffer byteBuffer) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ix parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ix parseFrom(byte[] bArr) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ix parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
