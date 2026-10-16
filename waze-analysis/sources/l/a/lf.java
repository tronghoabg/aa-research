package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class lf extends com.google.v.du<lf, ld> implements com.google.v.fj {
    public static final int CLUSTER_CHANGE_COMPASS_SETTING_FIELD_NUMBER = 1;
    public static final int CLUSTER_CHANGE_SPEED_LIMIT_SETTING_FIELD_NUMBER = 2;
    public static final int CLUSTER_CONNECT_FIELD_NUMBER = 3;
    public static final int CLUSTER_DISCONNECT_FIELD_NUMBER = 4;
    public static final int CLUSTER_SETTING_FIELD_NUMBER = 5;
    public static final int CLUSTER_WINDOW_CLOSED_FIELD_NUMBER = 6;
    public static final int CLUSTER_WINDOW_OPENED_FIELD_NUMBER = 7;
    public static final int CLUSTER_ZOOM_IN_FIELD_NUMBER = 8;
    public static final int CLUSTER_ZOOM_OUT_FIELD_NUMBER = 9;
    private static final lf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<lf> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        lf lfVar = new lf();
        DEFAULT_INSTANCE = lfVar;
        com.google.v.du.registerDefaultInstance(lf.class, lfVar);
    }

    private lf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterChangeCompassSetting() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterChangeSpeedLimitSetting() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterConnect() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterDisconnect() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterSetting() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterWindowClosed() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterWindowOpened() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterZoomIn() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterZoomOut() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static lf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClusterChangeCompassSetting(kv kvVar) {
        Objects.requireNonNull(kvVar);
        if (this.statCase_ == 1 && this.stat_ != kv.getDefaultInstance()) {
            ku kuVarNewBuilder = kv.newBuilder((kv) this.stat_);
            kuVarNewBuilder.mergeFrom((ku) kvVar);
            kvVar = kuVarNewBuilder.buildPartial();
        }
        this.stat_ = kvVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClusterChangeSpeedLimitSetting(kx kxVar) {
        Objects.requireNonNull(kxVar);
        if (this.statCase_ == 2 && this.stat_ != kx.getDefaultInstance()) {
            kw kwVarNewBuilder = kx.newBuilder((kx) this.stat_);
            kwVarNewBuilder.mergeFrom((kw) kxVar);
            kxVar = kwVarNewBuilder.buildPartial();
        }
        this.stat_ = kxVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClusterConnect(kz kzVar) {
        Objects.requireNonNull(kzVar);
        if (this.statCase_ == 3 && this.stat_ != kz.getDefaultInstance()) {
            ky kyVarNewBuilder = kz.newBuilder((kz) this.stat_);
            kyVarNewBuilder.mergeFrom((ky) kzVar);
            kzVar = kyVarNewBuilder.buildPartial();
        }
        this.stat_ = kzVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClusterDisconnect(lb lbVar) {
        Objects.requireNonNull(lbVar);
        if (this.statCase_ == 4 && this.stat_ != lb.getDefaultInstance()) {
            la laVarNewBuilder = lb.newBuilder((lb) this.stat_);
            laVarNewBuilder.mergeFrom((la) lbVar);
            lbVar = laVarNewBuilder.buildPartial();
        }
        this.stat_ = lbVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClusterWindowClosed(lh lhVar) {
        Objects.requireNonNull(lhVar);
        if (this.statCase_ == 6 && this.stat_ != lh.getDefaultInstance()) {
            lg lgVarNewBuilder = lh.newBuilder((lh) this.stat_);
            lgVarNewBuilder.mergeFrom((lg) lhVar);
            lhVar = lgVarNewBuilder.buildPartial();
        }
        this.stat_ = lhVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClusterWindowOpened(lj ljVar) {
        Objects.requireNonNull(ljVar);
        if (this.statCase_ == 7 && this.stat_ != lj.getDefaultInstance()) {
            li liVarNewBuilder = lj.newBuilder((lj) this.stat_);
            liVarNewBuilder.mergeFrom((li) ljVar);
            ljVar = liVarNewBuilder.buildPartial();
        }
        this.stat_ = ljVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClusterZoomIn(ll llVar) {
        Objects.requireNonNull(llVar);
        if (this.statCase_ == 8 && this.stat_ != ll.getDefaultInstance()) {
            lk lkVarNewBuilder = ll.newBuilder((ll) this.stat_);
            lkVarNewBuilder.mergeFrom((lk) llVar);
            llVar = lkVarNewBuilder.buildPartial();
        }
        this.stat_ = llVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClusterZoomOut(ln lnVar) {
        Objects.requireNonNull(lnVar);
        if (this.statCase_ == 9 && this.stat_ != ln.getDefaultInstance()) {
            lm lmVarNewBuilder = ln.newBuilder((ln) this.stat_);
            lmVarNewBuilder.mergeFrom((lm) lnVar);
            lnVar = lmVarNewBuilder.buildPartial();
        }
        this.stat_ = lnVar;
        this.statCase_ = 9;
    }

    public static ld newBuilder() {
        return (ld) DEFAULT_INSTANCE.createBuilder();
    }

    public static lf parseDelimitedFrom(InputStream inputStream) {
        return (lf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lf parseFrom(com.google.v.v vVar) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterChangeCompassSetting(kv kvVar) {
        Objects.requireNonNull(kvVar);
        this.stat_ = kvVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterChangeSpeedLimitSetting(kx kxVar) {
        Objects.requireNonNull(kxVar);
        this.stat_ = kxVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterConnect(kz kzVar) {
        Objects.requireNonNull(kzVar);
        this.stat_ = kzVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterDisconnect(lb lbVar) {
        Objects.requireNonNull(lbVar);
        this.stat_ = lbVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterSetting(lc lcVar) {
        this.stat_ = Integer.valueOf(lcVar.getNumber());
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterSettingValue(int i2) {
        this.statCase_ = 5;
        this.stat_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterWindowClosed(lh lhVar) {
        Objects.requireNonNull(lhVar);
        this.stat_ = lhVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterWindowOpened(lj ljVar) {
        Objects.requireNonNull(ljVar);
        this.stat_ = ljVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterZoomIn(ll llVar) {
        Objects.requireNonNull(llVar);
        this.stat_ = llVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterZoomOut(ln lnVar) {
        Objects.requireNonNull(lnVar);
        this.stat_ = lnVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005?\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"stat_", "statCase_", kv.class, kx.class, kz.class, lb.class, lh.class, lj.class, ll.class, ln.class});
        }
        if (iOrdinal == 3) {
            return new lf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ld(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public kv getClusterChangeCompassSetting() {
        return this.statCase_ == 1 ? (kv) this.stat_ : kv.getDefaultInstance();
    }

    public kx getClusterChangeSpeedLimitSetting() {
        return this.statCase_ == 2 ? (kx) this.stat_ : kx.getDefaultInstance();
    }

    public kz getClusterConnect() {
        return this.statCase_ == 3 ? (kz) this.stat_ : kz.getDefaultInstance();
    }

    public lb getClusterDisconnect() {
        return this.statCase_ == 4 ? (lb) this.stat_ : lb.getDefaultInstance();
    }

    public lc getClusterSetting() {
        if (this.statCase_ != 5) {
            return lc.CLUSTER_SETTING_UNSPECIFIED;
        }
        lc lcVarA = lc.a(((Integer) this.stat_).intValue());
        return lcVarA == null ? lc.UNRECOGNIZED : lcVarA;
    }

    public int getClusterSettingValue() {
        if (this.statCase_ == 5) {
            return ((Integer) this.stat_).intValue();
        }
        return 0;
    }

    public lh getClusterWindowClosed() {
        return this.statCase_ == 6 ? (lh) this.stat_ : lh.getDefaultInstance();
    }

    public lj getClusterWindowOpened() {
        return this.statCase_ == 7 ? (lj) this.stat_ : lj.getDefaultInstance();
    }

    public ll getClusterZoomIn() {
        return this.statCase_ == 8 ? (ll) this.stat_ : ll.getDefaultInstance();
    }

    public ln getClusterZoomOut() {
        return this.statCase_ == 9 ? (ln) this.stat_ : ln.getDefaultInstance();
    }

    public le getStatCase() {
        switch (this.statCase_) {
            case 0:
                return le.f55042j;
            case 1:
                return le.f55033a;
            case 2:
                return le.f55034b;
            case 3:
                return le.f55035c;
            case 4:
                return le.f55036d;
            case 5:
                return le.f55037e;
            case 6:
                return le.f55038f;
            case 7:
                return le.f55039g;
            case 8:
                return le.f55040h;
            case 9:
                return le.f55041i;
            default:
                return null;
        }
    }

    public boolean hasClusterChangeCompassSetting() {
        return this.statCase_ == 1;
    }

    public boolean hasClusterChangeSpeedLimitSetting() {
        return this.statCase_ == 2;
    }

    public boolean hasClusterConnect() {
        return this.statCase_ == 3;
    }

    public boolean hasClusterDisconnect() {
        return this.statCase_ == 4;
    }

    public boolean hasClusterSetting() {
        return this.statCase_ == 5;
    }

    public boolean hasClusterWindowClosed() {
        return this.statCase_ == 6;
    }

    public boolean hasClusterWindowOpened() {
        return this.statCase_ == 7;
    }

    public boolean hasClusterZoomIn() {
        return this.statCase_ == 8;
    }

    public boolean hasClusterZoomOut() {
        return this.statCase_ == 9;
    }

    public static ld newBuilder(lf lfVar) {
        return (ld) DEFAULT_INSTANCE.createBuilder(lfVar);
    }

    public static lf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lf parseFrom(com.google.v.z zVar) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lf parseFrom(InputStream inputStream) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lf parseFrom(ByteBuffer byteBuffer) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lf parseFrom(byte[] bArr) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
