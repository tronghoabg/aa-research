package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kuy implements defpackage.affg {
    private final /* synthetic */ int a;

    public /* synthetic */ kuy(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.dgd dgdVar;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.jzb.m((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 1:
                return defpackage.jzb.m((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.jzb.m((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.jzb.m((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.jzb.m((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                android.content.ComponentName componentName2 = (android.content.ComponentName) obj2;
                defpackage.mqi mqiVar = componentName == null ? null : new defpackage.mqi(componentName);
                return java.lang.Boolean.valueOf((defpackage.ler.a().i(mqiVar) || !defpackage.ler.a().i(componentName2 != null ? new defpackage.mqi(componentName2) : null) || mqiVar == null) ? false : true);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                otf otfVar = (otf) obj;
                otd otdVar = (otd) obj2;
                defpackage.yqm yqmVar = laf.a;
                defpackage.abor aborVarN = osy.a.n();
                if (!otfVar.equals(otf.a)) {
                    aborVarN.t();
                    osy osyVar = aborVarN.b;
                    otfVar.getClass();
                    osyVar.d = otfVar;
                    osyVar.b |= 2;
                }
                if (otdVar != null) {
                    aborVarN.t();
                    osy osyVar2 = aborVarN.b;
                    osyVar2.e = otdVar;
                    osyVar2.b |= 4;
                }
                return aborVarN.q();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    defpackage.kzi.u(null, bveVar, 0);
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (bveVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    defpackage.ksz.a(null, null, false, null, lgs.a, bveVar2, 24576, 15);
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.bve bveVar3 = (defpackage.bve) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (bveVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    defpackage.kzi.t(bveVar3, 0);
                } else {
                    bveVar3.s();
                }
                return defpackage.afbk.a;
            case 10:
                return java.lang.Boolean.valueOf(defpackage.onn.c((com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj, (defpackage.lmk) obj2) != onp.a);
            case 11:
                return defpackage.onn.c((com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj, (defpackage.lmk) obj2);
            case 12:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                defpackage.lmk lmkVar = (defpackage.lmk) obj2;
                aaPlaybackState.getClass();
                lmkVar.getClass();
                return defpackage.onn.c(aaPlaybackState, lmkVar);
            case 13:
                qs qsVar = (qs) obj;
                android.support.v4.media.session.MediaSessionCompat.Token token = (android.support.v4.media.session.MediaSessionCompat.Token) obj2;
                qsVar.getClass();
                token.getClass();
                ajer ajerVar = qsVar.f;
                java.lang.Class cls = (java.lang.Class) ajerVar.e.get("media_playback");
                if (cls == null) {
                    throw new java.lang.IllegalArgumentException("The name 'media_playback' does not correspond to a car service");
                }
                java.lang.Object objG = ajerVar.g(cls);
                objG.getClass();
                sq sqVar = (sq) objG;
                yq.a();
                try {
                    sqVar.a.c("media_playback", "registerMediaSessionToken", new pv(new androidx.car.app.serialization.Bundleable(token), 2));
                    return defpackage.afbk.a;
                } catch (xy e) {
                    throw new java.lang.IllegalArgumentException("Serialization failure", e);
                }
            case 14:
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                java.util.List list = (java.util.List) obj2;
                charSequence.getClass();
                list.getClass();
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    spannableStringBuilder.append(" ", (androidx.car.app.model.CarIconSpan) it.next(), 33);
                    spannableStringBuilder.append((java.lang.CharSequence) " ");
                }
                spannableStringBuilder.append(charSequence);
                return new android.text.SpannedString(spannableStringBuilder);
            case 15:
                defpackage.yqm yqmVar2 = defpackage.lnb.a;
                return new lon((defpackage.ygw) obj2);
            case 16:
                return new lqx((lqo) obj, ((java.lang.Boolean) obj2).booleanValue());
            case 17:
                return new defpackage.lrd((android.content.ComponentName) obj, (android.content.ComponentName) obj2);
            case 18:
                lsi lsiVar = (lsi) obj;
                j$.time.Instant instant = (j$.time.Instant) obj2;
                defpackage.yqm yqmVar3 = defpackage.lsj.a;
                if (lsiVar == null || instant == null || lsiVar.b.isAfter(instant)) {
                    return lsiVar;
                }
                return null;
            case 19:
                defpackage.bve bveVar4 = (defpackage.bve) obj;
                ((java.lang.Integer) obj2).intValue();
                mcm mcmVar = mcm.a;
                bveVar4.v(227147268);
                defpackage.dgd dgdVarW = defpackage.dgd.w(defpackage.bxi.p(bveVar4).o, 0L, defpackage.dmh.g(12), null, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777213);
                bveVar4.o();
                return dgdVarW;
            default:
                defpackage.bve bveVar5 = (defpackage.bve) obj;
                ((java.lang.Integer) obj2).intValue();
                mcm mcmVar2 = mcm.a;
                bveVar5.v(-1413985978);
                if (defpackage.lee.a.a().b()) {
                    bveVar5.v(983017397);
                    dgdVar = defpackage.bxi.p(bveVar5).B;
                    bveVar5.o();
                } else {
                    bveVar5.v(983093564);
                    dgdVar = defpackage.bxi.p(bveVar5).f;
                    bveVar5.o();
                }
                bveVar5.o();
                return dgdVar;
        }
    }
}
