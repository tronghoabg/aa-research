package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class fb extends com.google.v.du<fb, ez> implements com.google.v.fj {
    public static final int ANDROID_AUTO_CONNECTED_FIELD_NUMBER = 7;
    public static final int ANDROID_AUTO_DISCONNECTED_FIELD_NUMBER = 8;
    public static final int APP_CRASHED_FIELD_NUMBER = 9;
    public static final int APP_RECOVERED_FROM_CRASH_LOOP_FIELD_NUMBER = 15;
    public static final int APP_RUN_IN_BACKGROUND_FIELD_NUMBER = 6;
    public static final int APP_RUN_IN_FOREGROUND_FIELD_NUMBER = 5;
    public static final int CARPLAY_APP_RUN_IN_BACKGROUND_FIELD_NUMBER = 4;
    public static final int CARPLAY_APP_RUN_IN_FOREGROUND_FIELD_NUMBER = 3;
    public static final int CARPLAY_CONNECTED_FIELD_NUMBER = 2;
    public static final int CARPLAY_DISCONNECTED_FIELD_NUMBER = 1;
    private static final fb DEFAULT_INSTANCE;
    public static final int DYNAMIC_SPLASH_SCREEN_HIDDEN_FIELD_NUMBER = 16;
    public static final int DYNAMIC_SPLASH_SCREEN_SHOWN_FIELD_NUMBER = 17;
    public static final int FIRST_LOGIN_AFTER_VERSION_UPDATE_FIELD_NUMBER = 13;
    public static final int FIRST_USE_FIELD_NUMBER = 10;
    public static final int HYBRID_PLATFORM_MODE_ENDED_FIELD_NUMBER = 18;
    public static final int HYBRID_PLATFORM_MODE_STARTED_FIELD_NUMBER = 19;
    private static volatile com.google.v.fo<fb> PARSER = null;
    public static final int REPORT_PREFERENCES_CONFIGS_FIELD_NUMBER = 20;
    public static final int SCREEN_ORIENTATION_SET_FIELD_NUMBER = 14;
    public static final int WAZE_SHUT_DOWN_POPUP_CLICKED_FIELD_NUMBER = 11;
    public static final int WAZE_SHUT_DOWN_POPUP_SHOWN_FIELD_NUMBER = 12;
    private int statCase_ = 0;
    private Object stat_;

    static {
        fb fbVar = new fb();
        DEFAULT_INSTANCE = fbVar;
        com.google.v.du.registerDefaultInstance(fb.class, fbVar);
    }

    private fb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidAutoConnected() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidAutoDisconnected() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppCrashed() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppRecoveredFromCrashLoop() {
        if (this.statCase_ == 15) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppRunInBackground() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppRunInForeground() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayAppRunInBackground() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayAppRunInForeground() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayConnected() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayDisconnected() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynamicSplashScreenHidden() {
        if (this.statCase_ == 16) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynamicSplashScreenShown() {
        if (this.statCase_ == 17) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstLoginAfterVersionUpdate() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstUse() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHybridPlatformModeEnded() {
        if (this.statCase_ == 18) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHybridPlatformModeStarted() {
        if (this.statCase_ == 19) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportPreferencesConfigs() {
        if (this.statCase_ == 20) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenOrientationSet() {
        if (this.statCase_ == 14) {
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
    public void clearWazeShutDownPopupClicked() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeShutDownPopupShown() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static fb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroidAutoConnected(el elVar) {
        Objects.requireNonNull(elVar);
        if (this.statCase_ == 7 && this.stat_ != el.getDefaultInstance()) {
            ek ekVarNewBuilder = el.newBuilder((el) this.stat_);
            ekVarNewBuilder.mergeFrom((ek) elVar);
            elVar = ekVarNewBuilder.buildPartial();
        }
        this.stat_ = elVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroidAutoDisconnected(en enVar) {
        Objects.requireNonNull(enVar);
        if (this.statCase_ == 8 && this.stat_ != en.getDefaultInstance()) {
            em emVarNewBuilder = en.newBuilder((en) this.stat_);
            emVarNewBuilder.mergeFrom((em) enVar);
            enVar = emVarNewBuilder.buildPartial();
        }
        this.stat_ = enVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppCrashed(ey eyVar) {
        Objects.requireNonNull(eyVar);
        if (this.statCase_ == 9 && this.stat_ != ey.getDefaultInstance()) {
            ex exVarNewBuilder = ey.newBuilder((ey) this.stat_);
            exVarNewBuilder.mergeFrom((ex) eyVar);
            eyVar = exVarNewBuilder.buildPartial();
        }
        this.stat_ = eyVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppRecoveredFromCrashLoop(ff ffVar) {
        Objects.requireNonNull(ffVar);
        if (this.statCase_ == 15 && this.stat_ != ff.getDefaultInstance()) {
            fe feVarNewBuilder = ff.newBuilder((ff) this.stat_);
            feVarNewBuilder.mergeFrom((fe) ffVar);
            ffVar = feVarNewBuilder.buildPartial();
        }
        this.stat_ = ffVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppRunInBackground(fh fhVar) {
        Objects.requireNonNull(fhVar);
        if (this.statCase_ == 6 && this.stat_ != fh.getDefaultInstance()) {
            fg fgVarNewBuilder = fh.newBuilder((fh) this.stat_);
            fgVarNewBuilder.mergeFrom((fg) fhVar);
            fhVar = fgVarNewBuilder.buildPartial();
        }
        this.stat_ = fhVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppRunInForeground(fj fjVar) {
        Objects.requireNonNull(fjVar);
        if (this.statCase_ == 5 && this.stat_ != fj.getDefaultInstance()) {
            fi fiVarNewBuilder = fj.newBuilder((fj) this.stat_);
            fiVarNewBuilder.mergeFrom((fi) fjVar);
            fjVar = fiVarNewBuilder.buildPartial();
        }
        this.stat_ = fjVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayAppRunInBackground(iz izVar) {
        Objects.requireNonNull(izVar);
        if (this.statCase_ == 4 && this.stat_ != iz.getDefaultInstance()) {
            iy iyVarNewBuilder = iz.newBuilder((iz) this.stat_);
            iyVarNewBuilder.mergeFrom((iy) izVar);
            izVar = iyVarNewBuilder.buildPartial();
        }
        this.stat_ = izVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayAppRunInForeground(jc jcVar) {
        Objects.requireNonNull(jcVar);
        if (this.statCase_ == 3 && this.stat_ != jc.getDefaultInstance()) {
            ja jaVarNewBuilder = jc.newBuilder((jc) this.stat_);
            jaVarNewBuilder.mergeFrom((ja) jcVar);
            jcVar = jaVarNewBuilder.buildPartial();
        }
        this.stat_ = jcVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayConnected(je jeVar) {
        Objects.requireNonNull(jeVar);
        if (this.statCase_ == 2 && this.stat_ != je.getDefaultInstance()) {
            jd jdVarNewBuilder = je.newBuilder((je) this.stat_);
            jdVarNewBuilder.mergeFrom((jd) jeVar);
            jeVar = jdVarNewBuilder.buildPartial();
        }
        this.stat_ = jeVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayDisconnected(ji jiVar) {
        Objects.requireNonNull(jiVar);
        if (this.statCase_ == 1 && this.stat_ != ji.getDefaultInstance()) {
            jh jhVarNewBuilder = ji.newBuilder((ji) this.stat_);
            jhVarNewBuilder.mergeFrom((jh) jiVar);
            jiVar = jhVarNewBuilder.buildPartial();
        }
        this.stat_ = jiVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDynamicSplashScreenHidden(ti tiVar) {
        Objects.requireNonNull(tiVar);
        if (this.statCase_ == 16 && this.stat_ != ti.getDefaultInstance()) {
            th thVarNewBuilder = ti.newBuilder((ti) this.stat_);
            thVarNewBuilder.mergeFrom((th) tiVar);
            tiVar = thVarNewBuilder.buildPartial();
        }
        this.stat_ = tiVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDynamicSplashScreenShown(tl tlVar) {
        Objects.requireNonNull(tlVar);
        if (this.statCase_ == 17 && this.stat_ != tl.getDefaultInstance()) {
            tj tjVarNewBuilder = tl.newBuilder((tl) this.stat_);
            tjVarNewBuilder.mergeFrom((tj) tlVar);
            tlVar = tjVarNewBuilder.buildPartial();
        }
        this.stat_ = tlVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFirstLoginAfterVersionUpdate(wo woVar) {
        Objects.requireNonNull(woVar);
        if (this.statCase_ == 13 && this.stat_ != wo.getDefaultInstance()) {
            wn wnVarNewBuilder = wo.newBuilder((wo) this.stat_);
            wnVarNewBuilder.mergeFrom((wn) woVar);
            woVar = wnVarNewBuilder.buildPartial();
        }
        this.stat_ = woVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFirstUse(wq wqVar) {
        Objects.requireNonNull(wqVar);
        if (this.statCase_ == 10 && this.stat_ != wq.getDefaultInstance()) {
            wp wpVarNewBuilder = wq.newBuilder((wq) this.stat_);
            wpVarNewBuilder.mergeFrom((wp) wqVar);
            wqVar = wpVarNewBuilder.buildPartial();
        }
        this.stat_ = wqVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHybridPlatformModeEnded(abn abnVar) {
        Objects.requireNonNull(abnVar);
        if (this.statCase_ == 18 && this.stat_ != abn.getDefaultInstance()) {
            abm abmVarNewBuilder = abn.newBuilder((abn) this.stat_);
            abmVarNewBuilder.mergeFrom((abm) abnVar);
            abnVar = abmVarNewBuilder.buildPartial();
        }
        this.stat_ = abnVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHybridPlatformModeStarted(abp abpVar) {
        Objects.requireNonNull(abpVar);
        if (this.statCase_ == 19 && this.stat_ != abp.getDefaultInstance()) {
            abo aboVarNewBuilder = abp.newBuilder((abp) this.stat_);
            aboVarNewBuilder.mergeFrom((abo) abpVar);
            abpVar = aboVarNewBuilder.buildPartial();
        }
        this.stat_ = abpVar;
        this.statCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportPreferencesConfigs(auz auzVar) {
        Objects.requireNonNull(auzVar);
        if (this.statCase_ == 20 && this.stat_ != auz.getDefaultInstance()) {
            auu auuVarNewBuilder = auz.newBuilder((auz) this.stat_);
            auuVarNewBuilder.mergeFrom((auu) auzVar);
            auzVar = auuVarNewBuilder.buildPartial();
        }
        this.stat_ = auzVar;
        this.statCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScreenOrientationSet(axs axsVar) {
        Objects.requireNonNull(axsVar);
        if (this.statCase_ == 14 && this.stat_ != axs.getDefaultInstance()) {
            axq axqVarNewBuilder = axs.newBuilder((axs) this.stat_);
            axqVarNewBuilder.mergeFrom((axq) axsVar);
            axsVar = axqVarNewBuilder.buildPartial();
        }
        this.stat_ = axsVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWazeShutDownPopupClicked(bsh bshVar) {
        Objects.requireNonNull(bshVar);
        if (this.statCase_ == 11 && this.stat_ != bsh.getDefaultInstance()) {
            bsg bsgVarNewBuilder = bsh.newBuilder((bsh) this.stat_);
            bsgVarNewBuilder.mergeFrom((bsg) bshVar);
            bshVar = bsgVarNewBuilder.buildPartial();
        }
        this.stat_ = bshVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWazeShutDownPopupShown(bsj bsjVar) {
        Objects.requireNonNull(bsjVar);
        if (this.statCase_ == 12 && this.stat_ != bsj.getDefaultInstance()) {
            bsi bsiVarNewBuilder = bsj.newBuilder((bsj) this.stat_);
            bsiVarNewBuilder.mergeFrom((bsi) bsjVar);
            bsjVar = bsiVarNewBuilder.buildPartial();
        }
        this.stat_ = bsjVar;
        this.statCase_ = 12;
    }

    public static ez newBuilder() {
        return (ez) DEFAULT_INSTANCE.createBuilder();
    }

    public static fb parseDelimitedFrom(InputStream inputStream) {
        return (fb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fb parseFrom(com.google.v.v vVar) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAutoConnected(el elVar) {
        Objects.requireNonNull(elVar);
        this.stat_ = elVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAutoDisconnected(en enVar) {
        Objects.requireNonNull(enVar);
        this.stat_ = enVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppCrashed(ey eyVar) {
        Objects.requireNonNull(eyVar);
        this.stat_ = eyVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppRecoveredFromCrashLoop(ff ffVar) {
        Objects.requireNonNull(ffVar);
        this.stat_ = ffVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppRunInBackground(fh fhVar) {
        Objects.requireNonNull(fhVar);
        this.stat_ = fhVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppRunInForeground(fj fjVar) {
        Objects.requireNonNull(fjVar);
        this.stat_ = fjVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayAppRunInBackground(iz izVar) {
        Objects.requireNonNull(izVar);
        this.stat_ = izVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayAppRunInForeground(jc jcVar) {
        Objects.requireNonNull(jcVar);
        this.stat_ = jcVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayConnected(je jeVar) {
        Objects.requireNonNull(jeVar);
        this.stat_ = jeVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayDisconnected(ji jiVar) {
        Objects.requireNonNull(jiVar);
        this.stat_ = jiVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynamicSplashScreenHidden(ti tiVar) {
        Objects.requireNonNull(tiVar);
        this.stat_ = tiVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynamicSplashScreenShown(tl tlVar) {
        Objects.requireNonNull(tlVar);
        this.stat_ = tlVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstLoginAfterVersionUpdate(wo woVar) {
        Objects.requireNonNull(woVar);
        this.stat_ = woVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstUse(wq wqVar) {
        Objects.requireNonNull(wqVar);
        this.stat_ = wqVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHybridPlatformModeEnded(abn abnVar) {
        Objects.requireNonNull(abnVar);
        this.stat_ = abnVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHybridPlatformModeStarted(abp abpVar) {
        Objects.requireNonNull(abpVar);
        this.stat_ = abpVar;
        this.statCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportPreferencesConfigs(auz auzVar) {
        Objects.requireNonNull(auzVar);
        this.stat_ = auzVar;
        this.statCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenOrientationSet(axs axsVar) {
        Objects.requireNonNull(axsVar);
        this.stat_ = axsVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeShutDownPopupClicked(bsh bshVar) {
        Objects.requireNonNull(bshVar);
        this.stat_ = bshVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeShutDownPopupShown(bsj bsjVar) {
        Objects.requireNonNull(bsjVar);
        this.stat_ = bsjVar;
        this.statCase_ = 12;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0000\u0001\u0014\u0014\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000", new Object[]{"stat_", "statCase_", ji.class, je.class, jc.class, iz.class, fj.class, fh.class, el.class, en.class, ey.class, wq.class, bsh.class, bsj.class, wo.class, axs.class, ff.class, ti.class, tl.class, abn.class, abp.class, auz.class});
        }
        if (iOrdinal == 3) {
            return new fb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ez(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public el getAndroidAutoConnected() {
        return this.statCase_ == 7 ? (el) this.stat_ : el.getDefaultInstance();
    }

    public en getAndroidAutoDisconnected() {
        return this.statCase_ == 8 ? (en) this.stat_ : en.getDefaultInstance();
    }

    public ey getAppCrashed() {
        return this.statCase_ == 9 ? (ey) this.stat_ : ey.getDefaultInstance();
    }

    public ff getAppRecoveredFromCrashLoop() {
        return this.statCase_ == 15 ? (ff) this.stat_ : ff.getDefaultInstance();
    }

    public fh getAppRunInBackground() {
        return this.statCase_ == 6 ? (fh) this.stat_ : fh.getDefaultInstance();
    }

    public fj getAppRunInForeground() {
        return this.statCase_ == 5 ? (fj) this.stat_ : fj.getDefaultInstance();
    }

    public iz getCarplayAppRunInBackground() {
        return this.statCase_ == 4 ? (iz) this.stat_ : iz.getDefaultInstance();
    }

    public jc getCarplayAppRunInForeground() {
        return this.statCase_ == 3 ? (jc) this.stat_ : jc.getDefaultInstance();
    }

    public je getCarplayConnected() {
        return this.statCase_ == 2 ? (je) this.stat_ : je.getDefaultInstance();
    }

    public ji getCarplayDisconnected() {
        return this.statCase_ == 1 ? (ji) this.stat_ : ji.getDefaultInstance();
    }

    public ti getDynamicSplashScreenHidden() {
        return this.statCase_ == 16 ? (ti) this.stat_ : ti.getDefaultInstance();
    }

    public tl getDynamicSplashScreenShown() {
        return this.statCase_ == 17 ? (tl) this.stat_ : tl.getDefaultInstance();
    }

    public wo getFirstLoginAfterVersionUpdate() {
        return this.statCase_ == 13 ? (wo) this.stat_ : wo.getDefaultInstance();
    }

    public wq getFirstUse() {
        return this.statCase_ == 10 ? (wq) this.stat_ : wq.getDefaultInstance();
    }

    public abn getHybridPlatformModeEnded() {
        return this.statCase_ == 18 ? (abn) this.stat_ : abn.getDefaultInstance();
    }

    public abp getHybridPlatformModeStarted() {
        return this.statCase_ == 19 ? (abp) this.stat_ : abp.getDefaultInstance();
    }

    public auz getReportPreferencesConfigs() {
        return this.statCase_ == 20 ? (auz) this.stat_ : auz.getDefaultInstance();
    }

    public axs getScreenOrientationSet() {
        return this.statCase_ == 14 ? (axs) this.stat_ : axs.getDefaultInstance();
    }

    public fa getStatCase() {
        switch (this.statCase_) {
            case 0:
                return fa.u;
            case 1:
                return fa.f54846a;
            case 2:
                return fa.f54847b;
            case 3:
                return fa.f54848c;
            case 4:
                return fa.f54849d;
            case 5:
                return fa.f54850e;
            case 6:
                return fa.f54851f;
            case 7:
                return fa.f54852g;
            case 8:
                return fa.f54853h;
            case 9:
                return fa.f54854i;
            case 10:
                return fa.f54855j;
            case 11:
                return fa.f54856k;
            case 12:
                return fa.f54857l;
            case 13:
                return fa.m;
            case 14:
                return fa.n;
            case 15:
                return fa.o;
            case 16:
                return fa.p;
            case 17:
                return fa.q;
            case 18:
                return fa.r;
            case 19:
                return fa.s;
            case 20:
                return fa.t;
            default:
                return null;
        }
    }

    public bsh getWazeShutDownPopupClicked() {
        return this.statCase_ == 11 ? (bsh) this.stat_ : bsh.getDefaultInstance();
    }

    public bsj getWazeShutDownPopupShown() {
        return this.statCase_ == 12 ? (bsj) this.stat_ : bsj.getDefaultInstance();
    }

    public boolean hasAndroidAutoConnected() {
        return this.statCase_ == 7;
    }

    public boolean hasAndroidAutoDisconnected() {
        return this.statCase_ == 8;
    }

    public boolean hasAppCrashed() {
        return this.statCase_ == 9;
    }

    public boolean hasAppRecoveredFromCrashLoop() {
        return this.statCase_ == 15;
    }

    public boolean hasAppRunInBackground() {
        return this.statCase_ == 6;
    }

    public boolean hasAppRunInForeground() {
        return this.statCase_ == 5;
    }

    public boolean hasCarplayAppRunInBackground() {
        return this.statCase_ == 4;
    }

    public boolean hasCarplayAppRunInForeground() {
        return this.statCase_ == 3;
    }

    public boolean hasCarplayConnected() {
        return this.statCase_ == 2;
    }

    public boolean hasCarplayDisconnected() {
        return this.statCase_ == 1;
    }

    public boolean hasDynamicSplashScreenHidden() {
        return this.statCase_ == 16;
    }

    public boolean hasDynamicSplashScreenShown() {
        return this.statCase_ == 17;
    }

    public boolean hasFirstLoginAfterVersionUpdate() {
        return this.statCase_ == 13;
    }

    public boolean hasFirstUse() {
        return this.statCase_ == 10;
    }

    public boolean hasHybridPlatformModeEnded() {
        return this.statCase_ == 18;
    }

    public boolean hasHybridPlatformModeStarted() {
        return this.statCase_ == 19;
    }

    public boolean hasReportPreferencesConfigs() {
        return this.statCase_ == 20;
    }

    public boolean hasScreenOrientationSet() {
        return this.statCase_ == 14;
    }

    public boolean hasWazeShutDownPopupClicked() {
        return this.statCase_ == 11;
    }

    public boolean hasWazeShutDownPopupShown() {
        return this.statCase_ == 12;
    }

    public static ez newBuilder(fb fbVar) {
        return (ez) DEFAULT_INSTANCE.createBuilder(fbVar);
    }

    public static fb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fb parseFrom(com.google.v.z zVar) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fb parseFrom(InputStream inputStream) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fb parseFrom(ByteBuffer byteBuffer) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fb parseFrom(byte[] bArr) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
