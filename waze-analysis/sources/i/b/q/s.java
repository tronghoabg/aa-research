package i.b.q;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class s extends du<s, r> implements fj {
    public static final int COMPOSITEID_FIELD_NUMBER = 2;
    private static final s DEFAULT_INSTANCE;
    public static final int DRIVE_ID_FIELD_NUMBER = 5;
    private static volatile fo<s> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String compositeId_ = "";
    private int driveId_;
    private double score_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCompositeId() {
        this.bitField0_ &= -3;
        this.compositeId_ = getDefaultInstance().getCompositeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriveId() {
        this.bitField0_ &= -5;
        this.driveId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.bitField0_ &= -2;
        this.score_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(com.google.v.v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompositeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.compositeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompositeIdBytes(com.google.v.v vVar) {
        this.compositeId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriveId(int i2) {
        this.bitField0_ |= 4;
        this.driveId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(double d2) {
        this.bitField0_ |= 1;
        this.score_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001က\u0000\u0002ဈ\u0001\u0005င\u0002", new Object[]{"bitField0_", "score_", "compositeId_", "driveId_"});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new r(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCompositeId() {
        return this.compositeId_;
    }

    public com.google.v.v getCompositeIdBytes() {
        return com.google.v.v.s(this.compositeId_);
    }

    public int getDriveId() {
        return this.driveId_;
    }

    public double getScore() {
        return this.score_;
    }

    public boolean hasCompositeId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDriveId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasScore() {
        return (this.bitField0_ & 1) != 0;
    }

    public static r newBuilder(s sVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(com.google.v.v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(com.google.v.z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(com.google.v.z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
