package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class sy extends com.google.v.du<sy, sw> implements com.google.v.fj {
    public static final int APP_WAKE_UP_FIELD_NUMBER = 2;
    public static final int AUDIO_CONNECTION_DETECTION_FIELD_NUMBER = 3;
    private static final sy DEFAULT_INSTANCE;
    public static final int MOTION_DETECTION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<sy> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        sy syVar = new sy();
        DEFAULT_INSTANCE = syVar;
        com.google.v.du.registerDefaultInstance(sy.class, syVar);
    }

    private sy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppWakeUp() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioConnectionDetection() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMotionDetection() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static sy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppWakeUp(fu fuVar) {
        Objects.requireNonNull(fuVar);
        if (this.statCase_ == 2 && this.stat_ != fu.getDefaultInstance()) {
            fs fsVarNewBuilder = fu.newBuilder((fu) this.stat_);
            fsVarNewBuilder.mergeFrom((fs) fuVar);
            fuVar = fsVarNewBuilder.buildPartial();
        }
        this.stat_ = fuVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudioConnectionDetection(fz fzVar) {
        Objects.requireNonNull(fzVar);
        if (this.statCase_ == 3 && this.stat_ != fz.getDefaultInstance()) {
            fy fyVarNewBuilder = fz.newBuilder((fz) this.stat_);
            fyVarNewBuilder.mergeFrom((fy) fzVar);
            fzVar = fyVarNewBuilder.buildPartial();
        }
        this.stat_ = fzVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMotionDetection(akn aknVar) {
        Objects.requireNonNull(aknVar);
        if (this.statCase_ == 1 && this.stat_ != akn.getDefaultInstance()) {
            akj akjVarNewBuilder = akn.newBuilder((akn) this.stat_);
            akjVarNewBuilder.mergeFrom((akj) aknVar);
            aknVar = akjVarNewBuilder.buildPartial();
        }
        this.stat_ = aknVar;
        this.statCase_ = 1;
    }

    public static sw newBuilder() {
        return (sw) DEFAULT_INSTANCE.createBuilder();
    }

    public static sy parseDelimitedFrom(InputStream inputStream) {
        return (sy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sy parseFrom(com.google.v.v vVar) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppWakeUp(fu fuVar) {
        Objects.requireNonNull(fuVar);
        this.stat_ = fuVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioConnectionDetection(fz fzVar) {
        Objects.requireNonNull(fzVar);
        this.stat_ = fzVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMotionDetection(akn aknVar) {
        Objects.requireNonNull(aknVar);
        this.stat_ = aknVar;
        this.statCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"stat_", "statCase_", akn.class, fu.class, fz.class});
        }
        if (iOrdinal == 3) {
            return new sy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fu getAppWakeUp() {
        return this.statCase_ == 2 ? (fu) this.stat_ : fu.getDefaultInstance();
    }

    public fz getAudioConnectionDetection() {
        return this.statCase_ == 3 ? (fz) this.stat_ : fz.getDefaultInstance();
    }

    public akn getMotionDetection() {
        return this.statCase_ == 1 ? (akn) this.stat_ : akn.getDefaultInstance();
    }

    public sx getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return sx.f55424d;
        }
        if (i2 == 1) {
            return sx.f55421a;
        }
        if (i2 == 2) {
            return sx.f55422b;
        }
        if (i2 != 3) {
            return null;
        }
        return sx.f55423c;
    }

    public boolean hasAppWakeUp() {
        return this.statCase_ == 2;
    }

    public boolean hasAudioConnectionDetection() {
        return this.statCase_ == 3;
    }

    public boolean hasMotionDetection() {
        return this.statCase_ == 1;
    }

    public static sw newBuilder(sy syVar) {
        return (sw) DEFAULT_INSTANCE.createBuilder(syVar);
    }

    public static sy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sy parseFrom(com.google.v.z zVar) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sy parseFrom(InputStream inputStream) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sy parseFrom(ByteBuffer byteBuffer) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sy parseFrom(byte[] bArr) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
