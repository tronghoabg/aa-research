package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class lt extends com.google.v.du<lt, lr> implements com.google.v.fj {
    public static final int APP_CRASHED_FIELD_NUMBER = 1;
    public static final int APP_RUNNING_MODE_FIELD_NUMBER = 3;
    private static final lt DEFAULT_INSTANCE;
    public static final int EAT_CLICK_FIELD_NUMBER = 8;
    public static final int LOGIN_FIELD_NUMBER = 6;
    public static final int NETWORK_STATE_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<lt> PARSER = null;
    public static final int PUSH_MESSAGE_LAUNCHED_FIELD_NUMBER = 4;
    public static final int SERVER_REQUEST_RESULT_FIELD_NUMBER = 2;
    public static final int WELCOME_SCREEN_SHOWN_FIELD_NUMBER = 7;
    private int statCase_ = 0;
    private Object stat_;

    static {
        lt ltVar = new lt();
        DEFAULT_INSTANCE = ltVar;
        com.google.v.du.registerDefaultInstance(lt.class, ltVar);
    }

    private lt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppCrashed() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppRunningMode() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEatClick() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogin() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkState() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPushMessageLaunched() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerRequestResult() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWelcomeScreenShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static lt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppCrashed(ew ewVar) {
        Objects.requireNonNull(ewVar);
        if (this.statCase_ == 1 && this.stat_ != ew.getDefaultInstance()) {
            ev evVarNewBuilder = ew.newBuilder((ew) this.stat_);
            evVarNewBuilder.mergeFrom((ev) ewVar);
            ewVar = evVarNewBuilder.buildPartial();
        }
        this.stat_ = ewVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppRunningMode(fm fmVar) {
        Objects.requireNonNull(fmVar);
        if (this.statCase_ == 3 && this.stat_ != fm.getDefaultInstance()) {
            fk fkVarNewBuilder = fm.newBuilder((fm) this.stat_);
            fkVarNewBuilder.mergeFrom((fk) fmVar);
            fmVar = fkVarNewBuilder.buildPartial();
        }
        this.stat_ = fmVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEatClick(vd vdVar) {
        Objects.requireNonNull(vdVar);
        if (this.statCase_ == 8 && this.stat_ != vd.getDefaultInstance()) {
            vc vcVarNewBuilder = vd.newBuilder((vd) this.stat_);
            vcVarNewBuilder.mergeFrom((vc) vdVar);
            vdVar = vcVarNewBuilder.buildPartial();
        }
        this.stat_ = vdVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogin(ahc ahcVar) {
        Objects.requireNonNull(ahcVar);
        if (this.statCase_ == 6 && this.stat_ != ahc.getDefaultInstance()) {
            ahb ahbVarNewBuilder = ahc.newBuilder((ahc) this.stat_);
            ahbVarNewBuilder.mergeFrom((ahb) ahcVar);
            ahcVar = ahbVarNewBuilder.buildPartial();
        }
        this.stat_ = ahcVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkState(ane aneVar) {
        Objects.requireNonNull(aneVar);
        if (this.statCase_ == 5 && this.stat_ != ane.getDefaultInstance()) {
            anc ancVarNewBuilder = ane.newBuilder((ane) this.stat_);
            ancVarNewBuilder.mergeFrom((anc) aneVar);
            aneVar = ancVarNewBuilder.buildPartial();
        }
        this.stat_ = aneVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePushMessageLaunched(ast astVar) {
        Objects.requireNonNull(astVar);
        if (this.statCase_ == 4 && this.stat_ != ast.getDefaultInstance()) {
            ass assVarNewBuilder = ast.newBuilder((ast) this.stat_);
            assVarNewBuilder.mergeFrom((ass) astVar);
            astVar = assVarNewBuilder.buildPartial();
        }
        this.stat_ = astVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerRequestResult(bam bamVar) {
        Objects.requireNonNull(bamVar);
        if (this.statCase_ == 2 && this.stat_ != bam.getDefaultInstance()) {
            bal balVarNewBuilder = bam.newBuilder((bam) this.stat_);
            balVarNewBuilder.mergeFrom((bal) bamVar);
            bamVar = balVarNewBuilder.buildPartial();
        }
        this.stat_ = bamVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWelcomeScreenShown(bsu bsuVar) {
        Objects.requireNonNull(bsuVar);
        if (this.statCase_ == 7 && this.stat_ != bsu.getDefaultInstance()) {
            bst bstVarNewBuilder = bsu.newBuilder((bsu) this.stat_);
            bstVarNewBuilder.mergeFrom((bst) bsuVar);
            bsuVar = bstVarNewBuilder.buildPartial();
        }
        this.stat_ = bsuVar;
        this.statCase_ = 7;
    }

    public static lr newBuilder() {
        return (lr) DEFAULT_INSTANCE.createBuilder();
    }

    public static lt parseDelimitedFrom(InputStream inputStream) {
        return (lt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lt parseFrom(com.google.v.v vVar) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppCrashed(ew ewVar) {
        Objects.requireNonNull(ewVar);
        this.stat_ = ewVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppRunningMode(fm fmVar) {
        Objects.requireNonNull(fmVar);
        this.stat_ = fmVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEatClick(vd vdVar) {
        Objects.requireNonNull(vdVar);
        this.stat_ = vdVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogin(ahc ahcVar) {
        Objects.requireNonNull(ahcVar);
        this.stat_ = ahcVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkState(ane aneVar) {
        Objects.requireNonNull(aneVar);
        this.stat_ = aneVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushMessageLaunched(ast astVar) {
        Objects.requireNonNull(astVar);
        this.stat_ = astVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerRequestResult(bam bamVar) {
        Objects.requireNonNull(bamVar);
        this.stat_ = bamVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWelcomeScreenShown(bsu bsuVar) {
        Objects.requireNonNull(bsuVar);
        this.stat_ = bsuVar;
        this.statCase_ = 7;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"stat_", "statCase_", ew.class, bam.class, fm.class, ast.class, ane.class, ahc.class, bsu.class, vd.class});
        }
        if (iOrdinal == 3) {
            return new lt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public ew getAppCrashed() {
        return this.statCase_ == 1 ? (ew) this.stat_ : ew.getDefaultInstance();
    }

    @Deprecated
    public fm getAppRunningMode() {
        return this.statCase_ == 3 ? (fm) this.stat_ : fm.getDefaultInstance();
    }

    @Deprecated
    public vd getEatClick() {
        return this.statCase_ == 8 ? (vd) this.stat_ : vd.getDefaultInstance();
    }

    @Deprecated
    public ahc getLogin() {
        return this.statCase_ == 6 ? (ahc) this.stat_ : ahc.getDefaultInstance();
    }

    @Deprecated
    public ane getNetworkState() {
        return this.statCase_ == 5 ? (ane) this.stat_ : ane.getDefaultInstance();
    }

    @Deprecated
    public ast getPushMessageLaunched() {
        return this.statCase_ == 4 ? (ast) this.stat_ : ast.getDefaultInstance();
    }

    @Deprecated
    public bam getServerRequestResult() {
        return this.statCase_ == 2 ? (bam) this.stat_ : bam.getDefaultInstance();
    }

    public ls getStatCase() {
        switch (this.statCase_) {
            case 0:
                return ls.f55060i;
            case 1:
                return ls.f55052a;
            case 2:
                return ls.f55053b;
            case 3:
                return ls.f55054c;
            case 4:
                return ls.f55055d;
            case 5:
                return ls.f55056e;
            case 6:
                return ls.f55057f;
            case 7:
                return ls.f55058g;
            case 8:
                return ls.f55059h;
            default:
                return null;
        }
    }

    @Deprecated
    public bsu getWelcomeScreenShown() {
        return this.statCase_ == 7 ? (bsu) this.stat_ : bsu.getDefaultInstance();
    }

    @Deprecated
    public boolean hasAppCrashed() {
        return this.statCase_ == 1;
    }

    @Deprecated
    public boolean hasAppRunningMode() {
        return this.statCase_ == 3;
    }

    @Deprecated
    public boolean hasEatClick() {
        return this.statCase_ == 8;
    }

    @Deprecated
    public boolean hasLogin() {
        return this.statCase_ == 6;
    }

    @Deprecated
    public boolean hasNetworkState() {
        return this.statCase_ == 5;
    }

    @Deprecated
    public boolean hasPushMessageLaunched() {
        return this.statCase_ == 4;
    }

    @Deprecated
    public boolean hasServerRequestResult() {
        return this.statCase_ == 2;
    }

    @Deprecated
    public boolean hasWelcomeScreenShown() {
        return this.statCase_ == 7;
    }

    public static lr newBuilder(lt ltVar) {
        return (lr) DEFAULT_INSTANCE.createBuilder(ltVar);
    }

    public static lt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lt parseFrom(com.google.v.z zVar) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lt parseFrom(InputStream inputStream) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lt parseFrom(ByteBuffer byteBuffer) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lt parseFrom(byte[] bArr) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
