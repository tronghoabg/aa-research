package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bjn extends com.google.v.du<bjn, bjl> implements com.google.v.fj {
    public static final int AVERAGE_SPEED_CAMERA_AREA_ENTERED_FIELD_NUMBER = 5;
    public static final int AVERAGE_SPEED_CAMERA_AREA_EXITED_FIELD_NUMBER = 4;
    public static final int AVERAGE_SPEED_CAMERA_BAR_CLICKED_FIELD_NUMBER = 6;
    private static final bjn DEFAULT_INSTANCE;
    public static final int JAM_CROSS_TIME_CLICKED_FIELD_NUMBER = 1;
    public static final int JAM_CROSS_TIME_REMOVED_FIELD_NUMBER = 2;
    public static final int JAM_CROSS_TIME_SHOWN_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bjn> PARSER = null;
    public static final int TRAFFIC_PILL_SHOWN_FIELD_NUMBER = 7;
    public static final int TRAFFIC_PILL_TOGGLE_FIELD_NUMBER = 8;
    public static final int ZONE_PILL_SHOWN_FIELD_NUMBER = 9;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bjn bjnVar = new bjn();
        DEFAULT_INSTANCE = bjnVar;
        com.google.v.du.registerDefaultInstance(bjn.class, bjnVar);
    }

    private bjn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageSpeedCameraAreaEntered() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageSpeedCameraAreaExited() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageSpeedCameraBarClicked() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJamCrossTimeClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJamCrossTimeRemoved() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJamCrossTimeShown() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficPillShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficPillToggle() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZonePillShown() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bjn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAverageSpeedCameraAreaEntered(gw gwVar) {
        Objects.requireNonNull(gwVar);
        if (this.statCase_ == 5 && this.stat_ != gw.getDefaultInstance()) {
            gv gvVarNewBuilder = gw.newBuilder((gw) this.stat_);
            gvVarNewBuilder.mergeFrom((gv) gwVar);
            gwVar = gvVarNewBuilder.buildPartial();
        }
        this.stat_ = gwVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAverageSpeedCameraAreaExited(gy gyVar) {
        Objects.requireNonNull(gyVar);
        if (this.statCase_ == 4 && this.stat_ != gy.getDefaultInstance()) {
            gx gxVarNewBuilder = gy.newBuilder((gy) this.stat_);
            gxVarNewBuilder.mergeFrom((gx) gyVar);
            gyVar = gxVarNewBuilder.buildPartial();
        }
        this.stat_ = gyVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAverageSpeedCameraBarClicked(ha haVar) {
        Objects.requireNonNull(haVar);
        if (this.statCase_ == 6 && this.stat_ != ha.getDefaultInstance()) {
            gz gzVarNewBuilder = ha.newBuilder((ha) this.stat_);
            gzVarNewBuilder.mergeFrom((gz) haVar);
            haVar = gzVarNewBuilder.buildPartial();
        }
        this.stat_ = haVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJamCrossTimeClicked(afr afrVar) {
        Objects.requireNonNull(afrVar);
        if (this.statCase_ == 1 && this.stat_ != afr.getDefaultInstance()) {
            afq afqVarNewBuilder = afr.newBuilder((afr) this.stat_);
            afqVarNewBuilder.mergeFrom((afq) afrVar);
            afrVar = afqVarNewBuilder.buildPartial();
        }
        this.stat_ = afrVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJamCrossTimeRemoved(aft aftVar) {
        Objects.requireNonNull(aftVar);
        if (this.statCase_ == 2 && this.stat_ != aft.getDefaultInstance()) {
            afs afsVarNewBuilder = aft.newBuilder((aft) this.stat_);
            afsVarNewBuilder.mergeFrom((afs) aftVar);
            aftVar = afsVarNewBuilder.buildPartial();
        }
        this.stat_ = aftVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJamCrossTimeShown(afv afvVar) {
        Objects.requireNonNull(afvVar);
        if (this.statCase_ == 3 && this.stat_ != afv.getDefaultInstance()) {
            afu afuVarNewBuilder = afv.newBuilder((afv) this.stat_);
            afuVarNewBuilder.mergeFrom((afu) afvVar);
            afvVar = afuVarNewBuilder.buildPartial();
        }
        this.stat_ = afvVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrafficPillShown(bju bjuVar) {
        Objects.requireNonNull(bjuVar);
        if (this.statCase_ == 7 && this.stat_ != bju.getDefaultInstance()) {
            bjt bjtVarNewBuilder = bju.newBuilder((bju) this.stat_);
            bjtVarNewBuilder.mergeFrom((bjt) bjuVar);
            bjuVar = bjtVarNewBuilder.buildPartial();
        }
        this.stat_ = bjuVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrafficPillToggle(bjw bjwVar) {
        Objects.requireNonNull(bjwVar);
        if (this.statCase_ == 8 && this.stat_ != bjw.getDefaultInstance()) {
            bjv bjvVarNewBuilder = bjw.newBuilder((bjw) this.stat_);
            bjvVarNewBuilder.mergeFrom((bjv) bjwVar);
            bjwVar = bjvVarNewBuilder.buildPartial();
        }
        this.stat_ = bjwVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZonePillShown(bti btiVar) {
        Objects.requireNonNull(btiVar);
        if (this.statCase_ == 9 && this.stat_ != bti.getDefaultInstance()) {
            btg btgVarNewBuilder = bti.newBuilder((bti) this.stat_);
            btgVarNewBuilder.mergeFrom((btg) btiVar);
            btiVar = btgVarNewBuilder.buildPartial();
        }
        this.stat_ = btiVar;
        this.statCase_ = 9;
    }

    public static bjl newBuilder() {
        return (bjl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bjn parseDelimitedFrom(InputStream inputStream) {
        return (bjn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjn parseFrom(com.google.v.v vVar) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bjn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageSpeedCameraAreaEntered(gw gwVar) {
        Objects.requireNonNull(gwVar);
        this.stat_ = gwVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageSpeedCameraAreaExited(gy gyVar) {
        Objects.requireNonNull(gyVar);
        this.stat_ = gyVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageSpeedCameraBarClicked(ha haVar) {
        Objects.requireNonNull(haVar);
        this.stat_ = haVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJamCrossTimeClicked(afr afrVar) {
        Objects.requireNonNull(afrVar);
        this.stat_ = afrVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJamCrossTimeRemoved(aft aftVar) {
        Objects.requireNonNull(aftVar);
        this.stat_ = aftVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJamCrossTimeShown(afv afvVar) {
        Objects.requireNonNull(afvVar);
        this.stat_ = afvVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficPillShown(bju bjuVar) {
        Objects.requireNonNull(bjuVar);
        this.stat_ = bjuVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficPillToggle(bjw bjwVar) {
        Objects.requireNonNull(bjwVar);
        this.stat_ = bjwVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZonePillShown(bti btiVar) {
        Objects.requireNonNull(btiVar);
        this.stat_ = btiVar;
        this.statCase_ = 9;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"stat_", "statCase_", afr.class, aft.class, afv.class, gy.class, gw.class, ha.class, bju.class, bjw.class, bti.class});
        }
        if (iOrdinal == 3) {
            return new bjn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bjl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bjn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bjn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gw getAverageSpeedCameraAreaEntered() {
        return this.statCase_ == 5 ? (gw) this.stat_ : gw.getDefaultInstance();
    }

    public gy getAverageSpeedCameraAreaExited() {
        return this.statCase_ == 4 ? (gy) this.stat_ : gy.getDefaultInstance();
    }

    public ha getAverageSpeedCameraBarClicked() {
        return this.statCase_ == 6 ? (ha) this.stat_ : ha.getDefaultInstance();
    }

    public afr getJamCrossTimeClicked() {
        return this.statCase_ == 1 ? (afr) this.stat_ : afr.getDefaultInstance();
    }

    public aft getJamCrossTimeRemoved() {
        return this.statCase_ == 2 ? (aft) this.stat_ : aft.getDefaultInstance();
    }

    public afv getJamCrossTimeShown() {
        return this.statCase_ == 3 ? (afv) this.stat_ : afv.getDefaultInstance();
    }

    public bjm getStatCase() {
        switch (this.statCase_) {
            case 0:
                return bjm.f54089j;
            case 1:
                return bjm.f54080a;
            case 2:
                return bjm.f54081b;
            case 3:
                return bjm.f54082c;
            case 4:
                return bjm.f54083d;
            case 5:
                return bjm.f54084e;
            case 6:
                return bjm.f54085f;
            case 7:
                return bjm.f54086g;
            case 8:
                return bjm.f54087h;
            case 9:
                return bjm.f54088i;
            default:
                return null;
        }
    }

    public bju getTrafficPillShown() {
        return this.statCase_ == 7 ? (bju) this.stat_ : bju.getDefaultInstance();
    }

    public bjw getTrafficPillToggle() {
        return this.statCase_ == 8 ? (bjw) this.stat_ : bjw.getDefaultInstance();
    }

    public bti getZonePillShown() {
        return this.statCase_ == 9 ? (bti) this.stat_ : bti.getDefaultInstance();
    }

    public boolean hasAverageSpeedCameraAreaEntered() {
        return this.statCase_ == 5;
    }

    public boolean hasAverageSpeedCameraAreaExited() {
        return this.statCase_ == 4;
    }

    public boolean hasAverageSpeedCameraBarClicked() {
        return this.statCase_ == 6;
    }

    public boolean hasJamCrossTimeClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasJamCrossTimeRemoved() {
        return this.statCase_ == 2;
    }

    public boolean hasJamCrossTimeShown() {
        return this.statCase_ == 3;
    }

    public boolean hasTrafficPillShown() {
        return this.statCase_ == 7;
    }

    public boolean hasTrafficPillToggle() {
        return this.statCase_ == 8;
    }

    public boolean hasZonePillShown() {
        return this.statCase_ == 9;
    }

    public static bjl newBuilder(bjn bjnVar) {
        return (bjl) DEFAULT_INSTANCE.createBuilder(bjnVar);
    }

    public static bjn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bjn parseFrom(com.google.v.z zVar) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bjn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bjn parseFrom(InputStream inputStream) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjn parseFrom(ByteBuffer byteBuffer) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bjn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bjn parseFrom(byte[] bArr) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bjn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bjn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
