package l.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afx extends com.google.v.du<afx, afw> implements com.google.v.fj {
    private static final afx DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<afx> PARSER;
    private int bitField0_;
    private double latitude_;
    private double longitude_;

    static {
        afx afxVar = new afx();
        DEFAULT_INSTANCE = afxVar;
        com.google.v.du.registerDefaultInstance(afx.class, afxVar);
    }

    private afx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.bitField0_ &= -2;
        this.latitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.bitField0_ &= -3;
        this.longitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static afx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afw newBuilder() {
        return (afw) DEFAULT_INSTANCE.createBuilder();
    }

    public static afx parseDelimitedFrom(InputStream inputStream) {
        return (afx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afx parseFrom(com.google.v.v vVar) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<afx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d2) {
        this.bitField0_ |= 1;
        this.latitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d2) {
        this.bitField0_ |= 2;
        this.longitude_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"bitField0_", "latitude_", "longitude_"});
        }
        if (iOrdinal == 3) {
            return new afx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<afx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (afx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getLatitude() {
        return this.latitude_;
    }

    public double getLongitude() {
        return this.longitude_;
    }

    public boolean hasLatitude() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLongitude() {
        return (this.bitField0_ & 2) != 0;
    }

    public static afw newBuilder(afx afxVar) {
        return (afw) DEFAULT_INSTANCE.createBuilder(afxVar);
    }

    public static afx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static afx parseFrom(com.google.v.z zVar) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static afx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static afx parseFrom(InputStream inputStream) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afx parseFrom(ByteBuffer byteBuffer) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static afx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static afx parseFrom(byte[] bArr) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (afx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
