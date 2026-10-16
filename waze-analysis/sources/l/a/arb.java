package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class arb extends com.google.v.du<arb, aqz> implements com.google.v.fj {
    private static final arb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<arb> PARSER = null;
    public static final int PLANNED_DRIVE_SCREEN_CLICKED_FIELD_NUMBER = 3;
    public static final int PLANNED_DRIVE_SHOWN_FIELD_NUMBER = 4;
    public static final int SCHEDULE_PLANNED_DRIVE_SCREEN_CLICKED_FIELD_NUMBER = 1;
    public static final int SCHEDULE_PLANNED_DRIVE_SCREEN_SHOWN_FIELD_NUMBER = 2;
    private int statCase_ = 0;
    private Object stat_;

    static {
        arb arbVar = new arb();
        DEFAULT_INSTANCE = arbVar;
        com.google.v.du.registerDefaultInstance(arb.class, arbVar);
    }

    private arb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedDriveScreenClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedDriveShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchedulePlannedDriveScreenClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchedulePlannedDriveScreenShown() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static arb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlannedDriveScreenClicked(aqu aquVar) {
        Objects.requireNonNull(aquVar);
        if (this.statCase_ == 3 && this.stat_ != aqu.getDefaultInstance()) {
            aqt aqtVarNewBuilder = aqu.newBuilder((aqu) this.stat_);
            aqtVarNewBuilder.mergeFrom((aqt) aquVar);
            aquVar = aqtVarNewBuilder.buildPartial();
        }
        this.stat_ = aquVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlannedDriveShown(aqy aqyVar) {
        Objects.requireNonNull(aqyVar);
        if (this.statCase_ == 4 && this.stat_ != aqy.getDefaultInstance()) {
            aqv aqvVarNewBuilder = aqy.newBuilder((aqy) this.stat_);
            aqvVarNewBuilder.mergeFrom((aqv) aqyVar);
            aqyVar = aqvVarNewBuilder.buildPartial();
        }
        this.stat_ = aqyVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchedulePlannedDriveScreenClicked(axm axmVar) {
        Objects.requireNonNull(axmVar);
        if (this.statCase_ == 1 && this.stat_ != axm.getDefaultInstance()) {
            axk axkVarNewBuilder = axm.newBuilder((axm) this.stat_);
            axkVarNewBuilder.mergeFrom((axk) axmVar);
            axmVar = axkVarNewBuilder.buildPartial();
        }
        this.stat_ = axmVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchedulePlannedDriveScreenShown(axp axpVar) {
        Objects.requireNonNull(axpVar);
        if (this.statCase_ == 2 && this.stat_ != axp.getDefaultInstance()) {
            axn axnVarNewBuilder = axp.newBuilder((axp) this.stat_);
            axnVarNewBuilder.mergeFrom((axn) axpVar);
            axpVar = axnVarNewBuilder.buildPartial();
        }
        this.stat_ = axpVar;
        this.statCase_ = 2;
    }

    public static aqz newBuilder() {
        return (aqz) DEFAULT_INSTANCE.createBuilder();
    }

    public static arb parseDelimitedFrom(InputStream inputStream) {
        return (arb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arb parseFrom(com.google.v.v vVar) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<arb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveScreenClicked(aqu aquVar) {
        Objects.requireNonNull(aquVar);
        this.stat_ = aquVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveShown(aqy aqyVar) {
        Objects.requireNonNull(aqyVar);
        this.stat_ = aqyVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchedulePlannedDriveScreenClicked(axm axmVar) {
        Objects.requireNonNull(axmVar);
        this.stat_ = axmVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchedulePlannedDriveScreenShown(axp axpVar) {
        Objects.requireNonNull(axpVar);
        this.stat_ = axpVar;
        this.statCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"stat_", "statCase_", axm.class, axp.class, aqu.class, aqy.class});
        }
        if (iOrdinal == 3) {
            return new arb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aqz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<arb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (arb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aqu getPlannedDriveScreenClicked() {
        return this.statCase_ == 3 ? (aqu) this.stat_ : aqu.getDefaultInstance();
    }

    public aqy getPlannedDriveShown() {
        return this.statCase_ == 4 ? (aqy) this.stat_ : aqy.getDefaultInstance();
    }

    public axm getSchedulePlannedDriveScreenClicked() {
        return this.statCase_ == 1 ? (axm) this.stat_ : axm.getDefaultInstance();
    }

    public axp getSchedulePlannedDriveScreenShown() {
        return this.statCase_ == 2 ? (axp) this.stat_ : axp.getDefaultInstance();
    }

    public ara getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return ara.f53053e;
        }
        if (i2 == 1) {
            return ara.f53049a;
        }
        if (i2 == 2) {
            return ara.f53050b;
        }
        if (i2 == 3) {
            return ara.f53051c;
        }
        if (i2 != 4) {
            return null;
        }
        return ara.f53052d;
    }

    public boolean hasPlannedDriveScreenClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasPlannedDriveShown() {
        return this.statCase_ == 4;
    }

    public boolean hasSchedulePlannedDriveScreenClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasSchedulePlannedDriveScreenShown() {
        return this.statCase_ == 2;
    }

    public static aqz newBuilder(arb arbVar) {
        return (aqz) DEFAULT_INSTANCE.createBuilder(arbVar);
    }

    public static arb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static arb parseFrom(com.google.v.z zVar) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static arb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static arb parseFrom(InputStream inputStream) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arb parseFrom(ByteBuffer byteBuffer) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static arb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static arb parseFrom(byte[] bArr) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static arb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (arb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
