package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bri extends com.google.v.du<bri, brg> implements com.google.v.fj {
    public static final int ACCOUNT_CREDENTIALS_FOUND_FIELD_NUMBER = 32;
    public static final int ACCOUNT_NOT_FOUND_ERROR_CLICKED_FIELD_NUMBER = 19;
    public static final int ACCOUNT_NOT_FOUND_ERROR_SHOWN_FIELD_NUMBER = 18;
    public static final int ACCOUNT_RECOVERY_FROM_ICLOUD_ATTEMPT_FIELD_NUMBER = 13;
    public static final int ACCOUNT_RECOVERY_RESULT_FIELD_NUMBER = 14;
    public static final int AGE_SCREEN_CLICKED_FIELD_NUMBER = 8;
    public static final int AGE_SCREEN_SHOWN_FIELD_NUMBER = 7;
    public static final int CHOOSE_BETWEEN_ACCOUNTS_CONFIRMATION_CLICKED_FIELD_NUMBER = 29;
    public static final int CHOOSE_BETWEEN_ACCOUNTS_CONFIRMATION_SHOWN_FIELD_NUMBER = 28;
    public static final int CHOOSE_BETWEEN_ACCOUNTS_SCREEN_CLICKED_FIELD_NUMBER = 27;
    public static final int CHOOSE_BETWEEN_ACCOUNTS_SCREEN_SHOWN_FIELD_NUMBER = 26;
    private static final bri DEFAULT_INSTANCE;
    public static final int EMAIL_IS_ALREADY_USED_SCREEN_CLICKED_FIELD_NUMBER = 23;
    public static final int EMAIL_IS_ALREADY_USED_SCREEN_SHOWN_FIELD_NUMBER = 22;
    public static final int EMAIL_VERIFICATION_ERROR_SCREEN_CLICKED_FIELD_NUMBER = 31;
    public static final int EMAIL_VERIFICATION_ERROR_SCREEN_SHOWN_FIELD_NUMBER = 30;
    public static final int EMAIL_VERIFICATION_SCREEN_CLICKED_FIELD_NUMBER = 25;
    public static final int EMAIL_VERIFICATION_SCREEN_SHOWN_FIELD_NUMBER = 24;
    public static final int FIRST_USE_FIELD_NUMBER = 2;
    public static final int GDPR_SCREEN_CLICKED_FIELD_NUMBER = 6;
    public static final int GDPR_SCREEN_SHOWN_FIELD_NUMBER = 5;
    public static final int ND4C_SCREEN_CLICKED_FIELD_NUMBER = 21;
    public static final int ND4C_SCREEN_SHOWN_FIELD_NUMBER = 20;
    public static final int ONBOARDING_COMPLETED_FIELD_NUMBER = 17;
    private static volatile com.google.v.fo<bri> PARSER = null;
    public static final int QR_CODE_LOGIN_SHOWN_FIELD_NUMBER = 3;
    public static final int SIGN_UP_SHEET_CLICKED_FIELD_NUMBER = 16;
    public static final int SIGN_UP_SHEET_SHOWN_FIELD_NUMBER = 15;
    public static final int USER_AGE_WARNING_POPUP_CLICKED_FIELD_NUMBER = 10;
    public static final int USER_AGE_WARNING_POPUP_SHOWN_FIELD_NUMBER = 9;
    public static final int USER_AGE_WARNING_SCREEN_CLICKED_FIELD_NUMBER = 12;
    public static final int USER_AGE_WARNING_SCREEN_SHOWN_FIELD_NUMBER = 11;
    public static final int WELCOME_SCREEN_CLICKED_FIELD_NUMBER = 4;
    public static final int WELCOME_SCREEN_SHOWN_FIELD_NUMBER = 1;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bri briVar = new bri();
        DEFAULT_INSTANCE = briVar;
        com.google.v.du.registerDefaultInstance(bri.class, briVar);
    }

    private bri() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountCredentialsFound() {
        if (this.statCase_ == 32) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountNotFoundErrorClicked() {
        if (this.statCase_ == 19) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountNotFoundErrorShown() {
        if (this.statCase_ == 18) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountRecoveryFromIcloudAttempt() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountRecoveryResult() {
        if (this.statCase_ == 14) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeScreenClicked() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeScreenShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChooseBetweenAccountsConfirmationClicked() {
        if (this.statCase_ == 29) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChooseBetweenAccountsConfirmationShown() {
        if (this.statCase_ == 28) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChooseBetweenAccountsScreenClicked() {
        if (this.statCase_ == 27) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChooseBetweenAccountsScreenShown() {
        if (this.statCase_ == 26) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailIsAlreadyUsedScreenClicked() {
        if (this.statCase_ == 23) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailIsAlreadyUsedScreenShown() {
        if (this.statCase_ == 22) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailVerificationErrorScreenClicked() {
        if (this.statCase_ == 31) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailVerificationErrorScreenShown() {
        if (this.statCase_ == 30) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailVerificationScreenClicked() {
        if (this.statCase_ == 25) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailVerificationScreenShown() {
        if (this.statCase_ == 24) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstUse() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprScreenClicked() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprScreenShown() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNd4CScreenClicked() {
        if (this.statCase_ == 21) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNd4CScreenShown() {
        if (this.statCase_ == 20) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnboardingCompleted() {
        if (this.statCase_ == 17) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQrCodeLoginShown() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignUpSheetClicked() {
        if (this.statCase_ == 16) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignUpSheetShown() {
        if (this.statCase_ == 15) {
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
    public void clearUserAgeWarningPopupClicked() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgeWarningPopupShown() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgeWarningScreenClicked() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgeWarningScreenShown() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWelcomeScreenClicked() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWelcomeScreenShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bri getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccountCredentialsFound(f fVar) {
        Objects.requireNonNull(fVar);
        if (this.statCase_ == 32 && this.stat_ != f.getDefaultInstance()) {
            e eVarNewBuilder = f.newBuilder((f) this.stat_);
            eVarNewBuilder.mergeFrom((e) fVar);
            fVar = eVarNewBuilder.buildPartial();
        }
        this.stat_ = fVar;
        this.statCase_ = 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccountNotFoundErrorClicked(i iVar) {
        Objects.requireNonNull(iVar);
        if (this.statCase_ == 19 && this.stat_ != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder((i) this.stat_);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.stat_ = iVar;
        this.statCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccountNotFoundErrorShown(k kVar) {
        Objects.requireNonNull(kVar);
        if (this.statCase_ == 18 && this.stat_ != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder((k) this.stat_);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.stat_ = kVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccountRecoveryFromIcloudAttempt(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.statCase_ == 13 && this.stat_ != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder((m) this.stat_);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.stat_ = mVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccountRecoveryResult(o oVar) {
        Objects.requireNonNull(oVar);
        if (this.statCase_ == 14 && this.stat_ != o.getDefaultInstance()) {
            n nVarNewBuilder = o.newBuilder((o) this.stat_);
            nVarNewBuilder.mergeFrom((n) oVar);
            oVar = nVarNewBuilder.buildPartial();
        }
        this.stat_ = oVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAgeScreenClicked(bt btVar) {
        Objects.requireNonNull(btVar);
        if (this.statCase_ == 8 && this.stat_ != bt.getDefaultInstance()) {
            bs bsVarNewBuilder = bt.newBuilder((bt) this.stat_);
            bsVarNewBuilder.mergeFrom((bs) btVar);
            btVar = bsVarNewBuilder.buildPartial();
        }
        this.stat_ = btVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAgeScreenShown(by byVar) {
        Objects.requireNonNull(byVar);
        if (this.statCase_ == 7 && this.stat_ != by.getDefaultInstance()) {
            bx bxVarNewBuilder = by.newBuilder((by) this.stat_);
            bxVarNewBuilder.mergeFrom((bx) byVar);
            byVar = bxVarNewBuilder.buildPartial();
        }
        this.stat_ = byVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChooseBetweenAccountsConfirmationClicked(jw jwVar) {
        Objects.requireNonNull(jwVar);
        if (this.statCase_ == 29 && this.stat_ != jw.getDefaultInstance()) {
            jv jvVarNewBuilder = jw.newBuilder((jw) this.stat_);
            jvVarNewBuilder.mergeFrom((jv) jwVar);
            jwVar = jvVarNewBuilder.buildPartial();
        }
        this.stat_ = jwVar;
        this.statCase_ = 29;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChooseBetweenAccountsConfirmationShown(jy jyVar) {
        Objects.requireNonNull(jyVar);
        if (this.statCase_ == 28 && this.stat_ != jy.getDefaultInstance()) {
            jx jxVarNewBuilder = jy.newBuilder((jy) this.stat_);
            jxVarNewBuilder.mergeFrom((jx) jyVar);
            jyVar = jxVarNewBuilder.buildPartial();
        }
        this.stat_ = jyVar;
        this.statCase_ = 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChooseBetweenAccountsScreenClicked(kb kbVar) {
        Objects.requireNonNull(kbVar);
        if (this.statCase_ == 27 && this.stat_ != kb.getDefaultInstance()) {
            ka kaVarNewBuilder = kb.newBuilder((kb) this.stat_);
            kaVarNewBuilder.mergeFrom((ka) kbVar);
            kbVar = kaVarNewBuilder.buildPartial();
        }
        this.stat_ = kbVar;
        this.statCase_ = 27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChooseBetweenAccountsScreenShown(kd kdVar) {
        Objects.requireNonNull(kdVar);
        if (this.statCase_ == 26 && this.stat_ != kd.getDefaultInstance()) {
            kc kcVarNewBuilder = kd.newBuilder((kd) this.stat_);
            kcVarNewBuilder.mergeFrom((kc) kdVar);
            kdVar = kcVarNewBuilder.buildPartial();
        }
        this.stat_ = kdVar;
        this.statCase_ = 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmailIsAlreadyUsedScreenClicked(tq tqVar) {
        Objects.requireNonNull(tqVar);
        if (this.statCase_ == 23 && this.stat_ != tq.getDefaultInstance()) {
            tp tpVarNewBuilder = tq.newBuilder((tq) this.stat_);
            tpVarNewBuilder.mergeFrom((tp) tqVar);
            tqVar = tpVarNewBuilder.buildPartial();
        }
        this.stat_ = tqVar;
        this.statCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmailIsAlreadyUsedScreenShown(ts tsVar) {
        Objects.requireNonNull(tsVar);
        if (this.statCase_ == 22 && this.stat_ != ts.getDefaultInstance()) {
            tr trVarNewBuilder = ts.newBuilder((ts) this.stat_);
            trVarNewBuilder.mergeFrom((tr) tsVar);
            tsVar = trVarNewBuilder.buildPartial();
        }
        this.stat_ = tsVar;
        this.statCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmailVerificationErrorScreenClicked(tv tvVar) {
        Objects.requireNonNull(tvVar);
        if (this.statCase_ == 31 && this.stat_ != tv.getDefaultInstance()) {
            tu tuVarNewBuilder = tv.newBuilder((tv) this.stat_);
            tuVarNewBuilder.mergeFrom((tu) tvVar);
            tvVar = tuVarNewBuilder.buildPartial();
        }
        this.stat_ = tvVar;
        this.statCase_ = 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmailVerificationErrorScreenShown(tx txVar) {
        Objects.requireNonNull(txVar);
        if (this.statCase_ == 30 && this.stat_ != tx.getDefaultInstance()) {
            tw twVarNewBuilder = tx.newBuilder((tx) this.stat_);
            twVarNewBuilder.mergeFrom((tw) txVar);
            txVar = twVarNewBuilder.buildPartial();
        }
        this.stat_ = txVar;
        this.statCase_ = 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmailVerificationScreenClicked(ua uaVar) {
        Objects.requireNonNull(uaVar);
        if (this.statCase_ == 25 && this.stat_ != ua.getDefaultInstance()) {
            tz tzVarNewBuilder = ua.newBuilder((ua) this.stat_);
            tzVarNewBuilder.mergeFrom((tz) uaVar);
            uaVar = tzVarNewBuilder.buildPartial();
        }
        this.stat_ = uaVar;
        this.statCase_ = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmailVerificationScreenShown(uc ucVar) {
        Objects.requireNonNull(ucVar);
        if (this.statCase_ == 24 && this.stat_ != uc.getDefaultInstance()) {
            ub ubVarNewBuilder = uc.newBuilder((uc) this.stat_);
            ubVarNewBuilder.mergeFrom((ub) ucVar);
            ucVar = ubVarNewBuilder.buildPartial();
        }
        this.stat_ = ucVar;
        this.statCase_ = 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFirstUse(wq wqVar) {
        Objects.requireNonNull(wqVar);
        if (this.statCase_ == 2 && this.stat_ != wq.getDefaultInstance()) {
            wp wpVarNewBuilder = wq.newBuilder((wq) this.stat_);
            wpVarNewBuilder.mergeFrom((wp) wqVar);
            wqVar = wpVarNewBuilder.buildPartial();
        }
        this.stat_ = wqVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprScreenClicked(yg ygVar) {
        Objects.requireNonNull(ygVar);
        if (this.statCase_ == 6 && this.stat_ != yg.getDefaultInstance()) {
            yf yfVarNewBuilder = yg.newBuilder((yg) this.stat_);
            yfVarNewBuilder.mergeFrom((yf) ygVar);
            ygVar = yfVarNewBuilder.buildPartial();
        }
        this.stat_ = ygVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprScreenShown(yj yjVar) {
        Objects.requireNonNull(yjVar);
        if (this.statCase_ == 5 && this.stat_ != yj.getDefaultInstance()) {
            yh yhVarNewBuilder = yj.newBuilder((yj) this.stat_);
            yhVarNewBuilder.mergeFrom((yh) yjVar);
            yjVar = yhVarNewBuilder.buildPartial();
        }
        this.stat_ = yjVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNd4CScreenClicked(amx amxVar) {
        Objects.requireNonNull(amxVar);
        if (this.statCase_ == 21 && this.stat_ != amx.getDefaultInstance()) {
            amw amwVarNewBuilder = amx.newBuilder((amx) this.stat_);
            amwVarNewBuilder.mergeFrom((amw) amxVar);
            amxVar = amwVarNewBuilder.buildPartial();
        }
        this.stat_ = amxVar;
        this.statCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNd4CScreenShown(amz amzVar) {
        Objects.requireNonNull(amzVar);
        if (this.statCase_ == 20 && this.stat_ != amz.getDefaultInstance()) {
            amy amyVarNewBuilder = amz.newBuilder((amz) this.stat_);
            amyVarNewBuilder.mergeFrom((amy) amzVar);
            amzVar = amyVarNewBuilder.buildPartial();
        }
        this.stat_ = amzVar;
        this.statCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOnboardingCompleted(aog aogVar) {
        Objects.requireNonNull(aogVar);
        if (this.statCase_ == 17 && this.stat_ != aog.getDefaultInstance()) {
            aoe aoeVarNewBuilder = aog.newBuilder((aog) this.stat_);
            aoeVarNewBuilder.mergeFrom((aoe) aogVar);
            aogVar = aoeVarNewBuilder.buildPartial();
        }
        this.stat_ = aogVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQrCodeLoginShown(ate ateVar) {
        Objects.requireNonNull(ateVar);
        if (this.statCase_ == 3 && this.stat_ != ate.getDefaultInstance()) {
            atd atdVarNewBuilder = ate.newBuilder((ate) this.stat_);
            atdVarNewBuilder.mergeFrom((atd) ateVar);
            ateVar = atdVarNewBuilder.buildPartial();
        }
        this.stat_ = ateVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSignUpSheetClicked(bds bdsVar) {
        Objects.requireNonNull(bdsVar);
        if (this.statCase_ == 16 && this.stat_ != bds.getDefaultInstance()) {
            bdr bdrVarNewBuilder = bds.newBuilder((bds) this.stat_);
            bdrVarNewBuilder.mergeFrom((bdr) bdsVar);
            bdsVar = bdrVarNewBuilder.buildPartial();
        }
        this.stat_ = bdsVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSignUpSheetShown(bdu bduVar) {
        Objects.requireNonNull(bduVar);
        if (this.statCase_ == 15 && this.stat_ != bdu.getDefaultInstance()) {
            bdt bdtVarNewBuilder = bdu.newBuilder((bdu) this.stat_);
            bdtVarNewBuilder.mergeFrom((bdt) bduVar);
            bduVar = bdtVarNewBuilder.buildPartial();
        }
        this.stat_ = bduVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeWarningPopupClicked(bom bomVar) {
        Objects.requireNonNull(bomVar);
        if (this.statCase_ == 10 && this.stat_ != bom.getDefaultInstance()) {
            bol bolVarNewBuilder = bom.newBuilder((bom) this.stat_);
            bolVarNewBuilder.mergeFrom((bol) bomVar);
            bomVar = bolVarNewBuilder.buildPartial();
        }
        this.stat_ = bomVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeWarningPopupShown(boo booVar) {
        Objects.requireNonNull(booVar);
        if (this.statCase_ == 9 && this.stat_ != boo.getDefaultInstance()) {
            bon bonVarNewBuilder = boo.newBuilder((boo) this.stat_);
            bonVarNewBuilder.mergeFrom((bon) booVar);
            booVar = bonVarNewBuilder.buildPartial();
        }
        this.stat_ = booVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeWarningScreenClicked(bor borVar) {
        Objects.requireNonNull(borVar);
        if (this.statCase_ == 12 && this.stat_ != bor.getDefaultInstance()) {
            boq boqVarNewBuilder = bor.newBuilder((bor) this.stat_);
            boqVarNewBuilder.mergeFrom((boq) borVar);
            borVar = boqVarNewBuilder.buildPartial();
        }
        this.stat_ = borVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeWarningScreenShown(bot botVar) {
        Objects.requireNonNull(botVar);
        if (this.statCase_ == 11 && this.stat_ != bot.getDefaultInstance()) {
            bos bosVarNewBuilder = bot.newBuilder((bot) this.stat_);
            bosVarNewBuilder.mergeFrom((bos) botVar);
            botVar = bosVarNewBuilder.buildPartial();
        }
        this.stat_ = botVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWelcomeScreenClicked(bss bssVar) {
        Objects.requireNonNull(bssVar);
        if (this.statCase_ == 4 && this.stat_ != bss.getDefaultInstance()) {
            bsr bsrVarNewBuilder = bss.newBuilder((bss) this.stat_);
            bsrVarNewBuilder.mergeFrom((bsr) bssVar);
            bssVar = bsrVarNewBuilder.buildPartial();
        }
        this.stat_ = bssVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWelcomeScreenShown(bsw bswVar) {
        Objects.requireNonNull(bswVar);
        if (this.statCase_ == 1 && this.stat_ != bsw.getDefaultInstance()) {
            bsv bsvVarNewBuilder = bsw.newBuilder((bsw) this.stat_);
            bsvVarNewBuilder.mergeFrom((bsv) bswVar);
            bswVar = bsvVarNewBuilder.buildPartial();
        }
        this.stat_ = bswVar;
        this.statCase_ = 1;
    }

    public static brg newBuilder() {
        return (brg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bri parseDelimitedFrom(InputStream inputStream) {
        return (bri) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bri parseFrom(com.google.v.v vVar) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bri> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountCredentialsFound(f fVar) {
        Objects.requireNonNull(fVar);
        this.stat_ = fVar;
        this.statCase_ = 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountNotFoundErrorClicked(i iVar) {
        Objects.requireNonNull(iVar);
        this.stat_ = iVar;
        this.statCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountNotFoundErrorShown(k kVar) {
        Objects.requireNonNull(kVar);
        this.stat_ = kVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountRecoveryFromIcloudAttempt(m mVar) {
        Objects.requireNonNull(mVar);
        this.stat_ = mVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountRecoveryResult(o oVar) {
        Objects.requireNonNull(oVar);
        this.stat_ = oVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeScreenClicked(bt btVar) {
        Objects.requireNonNull(btVar);
        this.stat_ = btVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeScreenShown(by byVar) {
        Objects.requireNonNull(byVar);
        this.stat_ = byVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChooseBetweenAccountsConfirmationClicked(jw jwVar) {
        Objects.requireNonNull(jwVar);
        this.stat_ = jwVar;
        this.statCase_ = 29;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChooseBetweenAccountsConfirmationShown(jy jyVar) {
        Objects.requireNonNull(jyVar);
        this.stat_ = jyVar;
        this.statCase_ = 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChooseBetweenAccountsScreenClicked(kb kbVar) {
        Objects.requireNonNull(kbVar);
        this.stat_ = kbVar;
        this.statCase_ = 27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChooseBetweenAccountsScreenShown(kd kdVar) {
        Objects.requireNonNull(kdVar);
        this.stat_ = kdVar;
        this.statCase_ = 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailIsAlreadyUsedScreenClicked(tq tqVar) {
        Objects.requireNonNull(tqVar);
        this.stat_ = tqVar;
        this.statCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailIsAlreadyUsedScreenShown(ts tsVar) {
        Objects.requireNonNull(tsVar);
        this.stat_ = tsVar;
        this.statCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailVerificationErrorScreenClicked(tv tvVar) {
        Objects.requireNonNull(tvVar);
        this.stat_ = tvVar;
        this.statCase_ = 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailVerificationErrorScreenShown(tx txVar) {
        Objects.requireNonNull(txVar);
        this.stat_ = txVar;
        this.statCase_ = 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailVerificationScreenClicked(ua uaVar) {
        Objects.requireNonNull(uaVar);
        this.stat_ = uaVar;
        this.statCase_ = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailVerificationScreenShown(uc ucVar) {
        Objects.requireNonNull(ucVar);
        this.stat_ = ucVar;
        this.statCase_ = 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstUse(wq wqVar) {
        Objects.requireNonNull(wqVar);
        this.stat_ = wqVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprScreenClicked(yg ygVar) {
        Objects.requireNonNull(ygVar);
        this.stat_ = ygVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprScreenShown(yj yjVar) {
        Objects.requireNonNull(yjVar);
        this.stat_ = yjVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNd4CScreenClicked(amx amxVar) {
        Objects.requireNonNull(amxVar);
        this.stat_ = amxVar;
        this.statCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNd4CScreenShown(amz amzVar) {
        Objects.requireNonNull(amzVar);
        this.stat_ = amzVar;
        this.statCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnboardingCompleted(aog aogVar) {
        Objects.requireNonNull(aogVar);
        this.stat_ = aogVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQrCodeLoginShown(ate ateVar) {
        Objects.requireNonNull(ateVar);
        this.stat_ = ateVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignUpSheetClicked(bds bdsVar) {
        Objects.requireNonNull(bdsVar);
        this.stat_ = bdsVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignUpSheetShown(bdu bduVar) {
        Objects.requireNonNull(bduVar);
        this.stat_ = bduVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeWarningPopupClicked(bom bomVar) {
        Objects.requireNonNull(bomVar);
        this.stat_ = bomVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeWarningPopupShown(boo booVar) {
        Objects.requireNonNull(booVar);
        this.stat_ = booVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeWarningScreenClicked(bor borVar) {
        Objects.requireNonNull(borVar);
        this.stat_ = borVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeWarningScreenShown(bot botVar) {
        Objects.requireNonNull(botVar);
        this.stat_ = botVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWelcomeScreenClicked(bss bssVar) {
        Objects.requireNonNull(bssVar);
        this.stat_ = bssVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWelcomeScreenShown(bsw bswVar) {
        Objects.requireNonNull(bswVar);
        this.stat_ = bswVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000 \u0001\u0000\u0001  \u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000", new Object[]{"stat_", "statCase_", bsw.class, wq.class, ate.class, bss.class, yj.class, yg.class, by.class, bt.class, boo.class, bom.class, bot.class, bor.class, m.class, o.class, bdu.class, bds.class, aog.class, k.class, i.class, amz.class, amx.class, ts.class, tq.class, uc.class, ua.class, kd.class, kb.class, jy.class, jw.class, tx.class, tv.class, f.class});
        }
        if (iOrdinal == 3) {
            return new bri();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new brg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bri> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bri.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public f getAccountCredentialsFound() {
        return this.statCase_ == 32 ? (f) this.stat_ : f.getDefaultInstance();
    }

    public i getAccountNotFoundErrorClicked() {
        return this.statCase_ == 19 ? (i) this.stat_ : i.getDefaultInstance();
    }

    public k getAccountNotFoundErrorShown() {
        return this.statCase_ == 18 ? (k) this.stat_ : k.getDefaultInstance();
    }

    public m getAccountRecoveryFromIcloudAttempt() {
        return this.statCase_ == 13 ? (m) this.stat_ : m.getDefaultInstance();
    }

    public o getAccountRecoveryResult() {
        return this.statCase_ == 14 ? (o) this.stat_ : o.getDefaultInstance();
    }

    public bt getAgeScreenClicked() {
        return this.statCase_ == 8 ? (bt) this.stat_ : bt.getDefaultInstance();
    }

    public by getAgeScreenShown() {
        return this.statCase_ == 7 ? (by) this.stat_ : by.getDefaultInstance();
    }

    public jw getChooseBetweenAccountsConfirmationClicked() {
        return this.statCase_ == 29 ? (jw) this.stat_ : jw.getDefaultInstance();
    }

    public jy getChooseBetweenAccountsConfirmationShown() {
        return this.statCase_ == 28 ? (jy) this.stat_ : jy.getDefaultInstance();
    }

    public kb getChooseBetweenAccountsScreenClicked() {
        return this.statCase_ == 27 ? (kb) this.stat_ : kb.getDefaultInstance();
    }

    public kd getChooseBetweenAccountsScreenShown() {
        return this.statCase_ == 26 ? (kd) this.stat_ : kd.getDefaultInstance();
    }

    public tq getEmailIsAlreadyUsedScreenClicked() {
        return this.statCase_ == 23 ? (tq) this.stat_ : tq.getDefaultInstance();
    }

    public ts getEmailIsAlreadyUsedScreenShown() {
        return this.statCase_ == 22 ? (ts) this.stat_ : ts.getDefaultInstance();
    }

    public tv getEmailVerificationErrorScreenClicked() {
        return this.statCase_ == 31 ? (tv) this.stat_ : tv.getDefaultInstance();
    }

    public tx getEmailVerificationErrorScreenShown() {
        return this.statCase_ == 30 ? (tx) this.stat_ : tx.getDefaultInstance();
    }

    public ua getEmailVerificationScreenClicked() {
        return this.statCase_ == 25 ? (ua) this.stat_ : ua.getDefaultInstance();
    }

    public uc getEmailVerificationScreenShown() {
        return this.statCase_ == 24 ? (uc) this.stat_ : uc.getDefaultInstance();
    }

    public wq getFirstUse() {
        return this.statCase_ == 2 ? (wq) this.stat_ : wq.getDefaultInstance();
    }

    public yg getGdprScreenClicked() {
        return this.statCase_ == 6 ? (yg) this.stat_ : yg.getDefaultInstance();
    }

    public yj getGdprScreenShown() {
        return this.statCase_ == 5 ? (yj) this.stat_ : yj.getDefaultInstance();
    }

    public amx getNd4CScreenClicked() {
        return this.statCase_ == 21 ? (amx) this.stat_ : amx.getDefaultInstance();
    }

    public amz getNd4CScreenShown() {
        return this.statCase_ == 20 ? (amz) this.stat_ : amz.getDefaultInstance();
    }

    public aog getOnboardingCompleted() {
        return this.statCase_ == 17 ? (aog) this.stat_ : aog.getDefaultInstance();
    }

    public ate getQrCodeLoginShown() {
        return this.statCase_ == 3 ? (ate) this.stat_ : ate.getDefaultInstance();
    }

    public bds getSignUpSheetClicked() {
        return this.statCase_ == 16 ? (bds) this.stat_ : bds.getDefaultInstance();
    }

    public bdu getSignUpSheetShown() {
        return this.statCase_ == 15 ? (bdu) this.stat_ : bdu.getDefaultInstance();
    }

    public brh getStatCase() {
        switch (this.statCase_) {
            case 0:
                return brh.G;
            case 1:
                return brh.f54561a;
            case 2:
                return brh.f54562b;
            case 3:
                return brh.f54563c;
            case 4:
                return brh.f54564d;
            case 5:
                return brh.f54565e;
            case 6:
                return brh.f54566f;
            case 7:
                return brh.f54567g;
            case 8:
                return brh.f54568h;
            case 9:
                return brh.f54569i;
            case 10:
                return brh.f54570j;
            case 11:
                return brh.f54571k;
            case 12:
                return brh.f54572l;
            case 13:
                return brh.m;
            case 14:
                return brh.n;
            case 15:
                return brh.o;
            case 16:
                return brh.p;
            case 17:
                return brh.q;
            case 18:
                return brh.r;
            case 19:
                return brh.s;
            case 20:
                return brh.t;
            case 21:
                return brh.u;
            case 22:
                return brh.v;
            case 23:
                return brh.w;
            case 24:
                return brh.x;
            case 25:
                return brh.y;
            case 26:
                return brh.z;
            case 27:
                return brh.A;
            case 28:
                return brh.B;
            case 29:
                return brh.C;
            case 30:
                return brh.D;
            case 31:
                return brh.E;
            case 32:
                return brh.F;
            default:
                return null;
        }
    }

    public bom getUserAgeWarningPopupClicked() {
        return this.statCase_ == 10 ? (bom) this.stat_ : bom.getDefaultInstance();
    }

    public boo getUserAgeWarningPopupShown() {
        return this.statCase_ == 9 ? (boo) this.stat_ : boo.getDefaultInstance();
    }

    public bor getUserAgeWarningScreenClicked() {
        return this.statCase_ == 12 ? (bor) this.stat_ : bor.getDefaultInstance();
    }

    public bot getUserAgeWarningScreenShown() {
        return this.statCase_ == 11 ? (bot) this.stat_ : bot.getDefaultInstance();
    }

    public bss getWelcomeScreenClicked() {
        return this.statCase_ == 4 ? (bss) this.stat_ : bss.getDefaultInstance();
    }

    public bsw getWelcomeScreenShown() {
        return this.statCase_ == 1 ? (bsw) this.stat_ : bsw.getDefaultInstance();
    }

    public boolean hasAccountCredentialsFound() {
        return this.statCase_ == 32;
    }

    public boolean hasAccountNotFoundErrorClicked() {
        return this.statCase_ == 19;
    }

    public boolean hasAccountNotFoundErrorShown() {
        return this.statCase_ == 18;
    }

    public boolean hasAccountRecoveryFromIcloudAttempt() {
        return this.statCase_ == 13;
    }

    public boolean hasAccountRecoveryResult() {
        return this.statCase_ == 14;
    }

    public boolean hasAgeScreenClicked() {
        return this.statCase_ == 8;
    }

    public boolean hasAgeScreenShown() {
        return this.statCase_ == 7;
    }

    public boolean hasChooseBetweenAccountsConfirmationClicked() {
        return this.statCase_ == 29;
    }

    public boolean hasChooseBetweenAccountsConfirmationShown() {
        return this.statCase_ == 28;
    }

    public boolean hasChooseBetweenAccountsScreenClicked() {
        return this.statCase_ == 27;
    }

    public boolean hasChooseBetweenAccountsScreenShown() {
        return this.statCase_ == 26;
    }

    public boolean hasEmailIsAlreadyUsedScreenClicked() {
        return this.statCase_ == 23;
    }

    public boolean hasEmailIsAlreadyUsedScreenShown() {
        return this.statCase_ == 22;
    }

    public boolean hasEmailVerificationErrorScreenClicked() {
        return this.statCase_ == 31;
    }

    public boolean hasEmailVerificationErrorScreenShown() {
        return this.statCase_ == 30;
    }

    public boolean hasEmailVerificationScreenClicked() {
        return this.statCase_ == 25;
    }

    public boolean hasEmailVerificationScreenShown() {
        return this.statCase_ == 24;
    }

    public boolean hasFirstUse() {
        return this.statCase_ == 2;
    }

    public boolean hasGdprScreenClicked() {
        return this.statCase_ == 6;
    }

    public boolean hasGdprScreenShown() {
        return this.statCase_ == 5;
    }

    public boolean hasNd4CScreenClicked() {
        return this.statCase_ == 21;
    }

    public boolean hasNd4CScreenShown() {
        return this.statCase_ == 20;
    }

    public boolean hasOnboardingCompleted() {
        return this.statCase_ == 17;
    }

    public boolean hasQrCodeLoginShown() {
        return this.statCase_ == 3;
    }

    public boolean hasSignUpSheetClicked() {
        return this.statCase_ == 16;
    }

    public boolean hasSignUpSheetShown() {
        return this.statCase_ == 15;
    }

    public boolean hasUserAgeWarningPopupClicked() {
        return this.statCase_ == 10;
    }

    public boolean hasUserAgeWarningPopupShown() {
        return this.statCase_ == 9;
    }

    public boolean hasUserAgeWarningScreenClicked() {
        return this.statCase_ == 12;
    }

    public boolean hasUserAgeWarningScreenShown() {
        return this.statCase_ == 11;
    }

    public boolean hasWelcomeScreenClicked() {
        return this.statCase_ == 4;
    }

    public boolean hasWelcomeScreenShown() {
        return this.statCase_ == 1;
    }

    public static brg newBuilder(bri briVar) {
        return (brg) DEFAULT_INSTANCE.createBuilder(briVar);
    }

    public static bri parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bri) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bri parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bri parseFrom(com.google.v.z zVar) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bri parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bri parseFrom(InputStream inputStream) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bri parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bri parseFrom(ByteBuffer byteBuffer) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bri parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bri parseFrom(byte[] bArr) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bri parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bri) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
