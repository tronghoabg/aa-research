package i.b.v;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cb extends com.google.v.du<cb, ca> implements com.google.v.fj {
    private static final cb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cb> PARSER = null;
    public static final int RATING_FIELD_NUMBER = 1;
    public static final int USER_RATINGS_COUNT_FIELD_NUMBER = 2;
    private int bitField0_;
    private double rating_;
    private int userRatingsCount_;

    static {
        cb cbVar = new cb();
        DEFAULT_INSTANCE = cbVar;
        com.google.v.du.registerDefaultInstance(cb.class, cbVar);
    }

    private cb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRating() {
        this.bitField0_ &= -2;
        this.rating_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserRatingsCount() {
        this.bitField0_ &= -3;
        this.userRatingsCount_ = 0;
    }

    public static cb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ca newBuilder() {
        return (ca) DEFAULT_INSTANCE.createBuilder();
    }

    public static cb parseDelimitedFrom(InputStream inputStream) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(com.google.v.v vVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRating(double d2) {
        this.bitField0_ |= 1;
        this.rating_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserRatingsCount(int i2) {
        this.bitField0_ |= 2;
        this.userRatingsCount_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001", new Object[]{"bitField0_", "rating_", "userRatingsCount_"});
        }
        if (iOrdinal == 3) {
            return new cb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ca(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getRating() {
        return this.rating_;
    }

    public int getUserRatingsCount() {
        return this.userRatingsCount_;
    }

    public boolean hasRating() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserRatingsCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ca newBuilder(cb cbVar) {
        return (ca) DEFAULT_INSTANCE.createBuilder(cbVar);
    }

    public static cb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cb parseFrom(com.google.v.z zVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cb parseFrom(InputStream inputStream) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(ByteBuffer byteBuffer) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cb parseFrom(byte[] bArr) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
