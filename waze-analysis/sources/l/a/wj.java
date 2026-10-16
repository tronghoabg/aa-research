package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wj extends com.google.v.du<wj, wi> implements com.google.v.fj {
    private static final wj DEFAULT_INSTANCE;
    public static final int FAVORITES_COUNT_FIELD_NUMBER = 1;
    public static final int HOME_AVAILABLE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<wj> PARSER = null;
    public static final int WORK_AVAILABLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private long favoritesCount_;
    private boolean homeAvailable_;
    private boolean workAvailable_;

    static {
        wj wjVar = new wj();
        DEFAULT_INSTANCE = wjVar;
        com.google.v.du.registerDefaultInstance(wj.class, wjVar);
    }

    private wj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoritesCount() {
        this.bitField0_ &= -2;
        this.favoritesCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHomeAvailable() {
        this.bitField0_ &= -3;
        this.homeAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkAvailable() {
        this.bitField0_ &= -5;
        this.workAvailable_ = false;
    }

    public static wj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wi newBuilder() {
        return (wi) DEFAULT_INSTANCE.createBuilder();
    }

    public static wj parseDelimitedFrom(InputStream inputStream) {
        return (wj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wj parseFrom(com.google.v.v vVar) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoritesCount(long j2) {
        this.bitField0_ |= 1;
        this.favoritesCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHomeAvailable(boolean z) {
        this.bitField0_ |= 2;
        this.homeAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkAvailable(boolean z) {
        this.bitField0_ |= 4;
        this.workAvailable_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "favoritesCount_", "homeAvailable_", "workAvailable_"});
        }
        if (iOrdinal == 3) {
            return new wj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new wi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getFavoritesCount() {
        return this.favoritesCount_;
    }

    public boolean getHomeAvailable() {
        return this.homeAvailable_;
    }

    public boolean getWorkAvailable() {
        return this.workAvailable_;
    }

    public boolean hasFavoritesCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHomeAvailable() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWorkAvailable() {
        return (this.bitField0_ & 4) != 0;
    }

    public static wi newBuilder(wj wjVar) {
        return (wi) DEFAULT_INSTANCE.createBuilder(wjVar);
    }

    public static wj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wj parseFrom(com.google.v.z zVar) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wj parseFrom(InputStream inputStream) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wj parseFrom(ByteBuffer byteBuffer) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wj parseFrom(byte[] bArr) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
