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
public final class ag extends du<ag, af> implements fj {
    public static final int COMPOSITEID_FIELD_NUMBER = 3;
    private static final ag DEFAULT_INSTANCE;
    public static final int DRIVE_ID_FIELD_NUMBER = 5;
    public static final int EXTENDEDROUTINEID_FIELD_NUMBER = 4;
    private static volatile fo<ag> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 2;
    public static final int TIMEPREFERENCES_FIELD_NUMBER = 1;
    private int bitField0_;
    private String compositeId_ = "";
    private int driveId_;
    private com.waze.bg.c.f extendedRoutineId_;
    private double score_;
    private i.b.r.a.i timePreferences_;

    static {
        ag agVar = new ag();
        DEFAULT_INSTANCE = agVar;
        du.registerDefaultInstance(ag.class, agVar);
    }

    private ag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCompositeId() {
        this.bitField0_ &= -5;
        this.compositeId_ = getDefaultInstance().getCompositeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriveId() {
        this.bitField0_ &= -17;
        this.driveId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendedRoutineId() {
        this.extendedRoutineId_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.bitField0_ &= -3;
        this.score_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimePreferences() {
        this.timePreferences_ = null;
        this.bitField0_ &= -2;
    }

    public static ag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtendedRoutineId(com.waze.bg.c.f fVar) {
        Objects.requireNonNull(fVar);
        com.waze.bg.c.f fVar2 = this.extendedRoutineId_;
        if (fVar2 != null && fVar2 != com.waze.bg.c.f.getDefaultInstance()) {
            com.waze.bg.c.c cVarNewBuilder = com.waze.bg.c.f.newBuilder(fVar2);
            cVarNewBuilder.mergeFrom((com.waze.bg.c.c) fVar);
            fVar = cVarNewBuilder.buildPartial();
        }
        this.extendedRoutineId_ = fVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimePreferences(i.b.r.a.i iVar) {
        Objects.requireNonNull(iVar);
        i.b.r.a.i iVar2 = this.timePreferences_;
        if (iVar2 != null && iVar2 != i.b.r.a.i.getDefaultInstance()) {
            i.b.r.a.h hVarNewBuilder = i.b.r.a.i.newBuilder(iVar2);
            hVarNewBuilder.mergeFrom((i.b.r.a.h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.timePreferences_ = iVar;
        this.bitField0_ |= 1;
    }

    public static af newBuilder() {
        return (af) DEFAULT_INSTANCE.createBuilder();
    }

    public static ag parseDelimitedFrom(InputStream inputStream) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(com.google.v.v vVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompositeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.compositeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompositeIdBytes(com.google.v.v vVar) {
        this.compositeId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriveId(int i2) {
        this.bitField0_ |= 16;
        this.driveId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendedRoutineId(com.waze.bg.c.f fVar) {
        Objects.requireNonNull(fVar);
        this.extendedRoutineId_ = fVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(double d2) {
        this.bitField0_ |= 2;
        this.score_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimePreferences(i.b.r.a.i iVar) {
        Objects.requireNonNull(iVar);
        this.timePreferences_ = iVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005င\u0004", new Object[]{"bitField0_", "timePreferences_", "score_", "compositeId_", "extendedRoutineId_", "driveId_"});
        }
        if (iOrdinal == 3) {
            return new ag();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new af(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ag> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ag.class) {
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

    @Deprecated
    public com.waze.bg.c.f getExtendedRoutineId() {
        com.waze.bg.c.f fVar = this.extendedRoutineId_;
        return fVar == null ? com.waze.bg.c.f.getDefaultInstance() : fVar;
    }

    public double getScore() {
        return this.score_;
    }

    public i.b.r.a.i getTimePreferences() {
        i.b.r.a.i iVar = this.timePreferences_;
        return iVar == null ? i.b.r.a.i.getDefaultInstance() : iVar;
    }

    public boolean hasCompositeId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDriveId() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasExtendedRoutineId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasScore() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimePreferences() {
        return (this.bitField0_ & 1) != 0;
    }

    public static af newBuilder(ag agVar) {
        return (af) DEFAULT_INSTANCE.createBuilder(agVar);
    }

    public static ag parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(com.google.v.v vVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ag parseFrom(com.google.v.z zVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ag parseFrom(com.google.v.z zVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ag parseFrom(InputStream inputStream) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(InputStream inputStream, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(ByteBuffer byteBuffer) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ag parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ag parseFrom(byte[] bArr) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ag parseFrom(byte[] bArr, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
