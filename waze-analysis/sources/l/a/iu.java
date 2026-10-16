package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class iu extends com.google.v.du<iu, it> implements iv {
    public static final int BOTTOM_COORDINATE_PIXELS_FIELD_NUMBER = 4;
    private static final iu DEFAULT_INSTANCE;
    public static final int LEFT_COORDINATE_PIXELS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<iu> PARSER = null;
    public static final int RIGHT_COORDINATE_PIXELS_FIELD_NUMBER = 1;
    public static final int TOP_COORDINATE_PIXELS_FIELD_NUMBER = 3;
    private int bitField0_;
    private long bottomCoordinatePixels_;
    private long leftCoordinatePixels_;
    private long rightCoordinatePixels_;
    private long topCoordinatePixels_;

    static {
        iu iuVar = new iu();
        DEFAULT_INSTANCE = iuVar;
        com.google.v.du.registerDefaultInstance(iu.class, iuVar);
    }

    private iu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomCoordinatePixels() {
        this.bitField0_ &= -9;
        this.bottomCoordinatePixels_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeftCoordinatePixels() {
        this.bitField0_ &= -3;
        this.leftCoordinatePixels_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightCoordinatePixels() {
        this.bitField0_ &= -2;
        this.rightCoordinatePixels_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopCoordinatePixels() {
        this.bitField0_ &= -5;
        this.topCoordinatePixels_ = 0L;
    }

    public static iu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static it newBuilder() {
        return (it) DEFAULT_INSTANCE.createBuilder();
    }

    public static iu parseDelimitedFrom(InputStream inputStream) {
        return (iu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iu parseFrom(com.google.v.v vVar) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<iu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomCoordinatePixels(long j2) {
        this.bitField0_ |= 8;
        this.bottomCoordinatePixels_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftCoordinatePixels(long j2) {
        this.bitField0_ |= 2;
        this.leftCoordinatePixels_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightCoordinatePixels(long j2) {
        this.bitField0_ |= 1;
        this.rightCoordinatePixels_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopCoordinatePixels(long j2) {
        this.bitField0_ |= 4;
        this.topCoordinatePixels_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "rightCoordinatePixels_", "leftCoordinatePixels_", "topCoordinatePixels_", "bottomCoordinatePixels_"});
        }
        if (iOrdinal == 3) {
            return new iu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new it(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<iu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (iu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getBottomCoordinatePixels() {
        return this.bottomCoordinatePixels_;
    }

    public long getLeftCoordinatePixels() {
        return this.leftCoordinatePixels_;
    }

    public long getRightCoordinatePixels() {
        return this.rightCoordinatePixels_;
    }

    public long getTopCoordinatePixels() {
        return this.topCoordinatePixels_;
    }

    public boolean hasBottomCoordinatePixels() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLeftCoordinatePixels() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRightCoordinatePixels() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTopCoordinatePixels() {
        return (this.bitField0_ & 4) != 0;
    }

    public static it newBuilder(iu iuVar) {
        return (it) DEFAULT_INSTANCE.createBuilder(iuVar);
    }

    public static iu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static iu parseFrom(com.google.v.z zVar) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static iu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static iu parseFrom(InputStream inputStream) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iu parseFrom(ByteBuffer byteBuffer) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static iu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static iu parseFrom(byte[] bArr) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static iu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (iu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
