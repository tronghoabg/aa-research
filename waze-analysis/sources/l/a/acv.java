package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class acv extends com.google.v.du<acv, acu> implements com.google.v.fj {
    private static final acv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<acv> PARSER = null;
    public static final int SCREEN_HEIGHT_PIXELS_FIELD_NUMBER = 1;
    public static final int SCREEN_WIDTH_PIXELS_FIELD_NUMBER = 2;
    private int bitField0_;
    private long screenHeightPixels_;
    private long screenWidthPixels_;

    static {
        acv acvVar = new acv();
        DEFAULT_INSTANCE = acvVar;
        com.google.v.du.registerDefaultInstance(acv.class, acvVar);
    }

    private acv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenHeightPixels() {
        this.bitField0_ &= -2;
        this.screenHeightPixels_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenWidthPixels() {
        this.bitField0_ &= -3;
        this.screenWidthPixels_ = 0L;
    }

    public static acv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static acu newBuilder() {
        return (acu) DEFAULT_INSTANCE.createBuilder();
    }

    public static acv parseDelimitedFrom(InputStream inputStream) {
        return (acv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acv parseFrom(com.google.v.v vVar) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<acv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenHeightPixels(long j2) {
        this.bitField0_ |= 1;
        this.screenHeightPixels_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenWidthPixels(long j2) {
        this.bitField0_ |= 2;
        this.screenWidthPixels_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "screenHeightPixels_", "screenWidthPixels_"});
        }
        if (iOrdinal == 3) {
            return new acv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new acu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<acv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (acv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getScreenHeightPixels() {
        return this.screenHeightPixels_;
    }

    public long getScreenWidthPixels() {
        return this.screenWidthPixels_;
    }

    public boolean hasScreenHeightPixels() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasScreenWidthPixels() {
        return (this.bitField0_ & 2) != 0;
    }

    public static acu newBuilder(acv acvVar) {
        return (acu) DEFAULT_INSTANCE.createBuilder(acvVar);
    }

    public static acv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static acv parseFrom(com.google.v.z zVar) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static acv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static acv parseFrom(InputStream inputStream) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acv parseFrom(ByteBuffer byteBuffer) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static acv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static acv parseFrom(byte[] bArr) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static acv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (acv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
