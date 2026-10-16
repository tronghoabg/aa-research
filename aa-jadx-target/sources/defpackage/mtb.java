package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mtb implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mtb(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v29, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v31, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v40, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v42, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v53, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v58, types: [bwx, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.qts qtsVar = (defpackage.qts) obj;
                qtsVar.getClass();
                defpackage.ntb ntbVar = (defpackage.ntb) this.a;
                qtsVar.b(true != ntbVar.E() ? 2130772045 : 2130772052);
                qtsVar.c(true != ntbVar.E() ? 2130772046 : 2130772047);
                defpackage.lel lelVar = defpackage.lem.a;
                if (lelVar.a().b()) {
                    i = 2132149924;
                } else {
                    lelVar.a();
                    i = 2132149923;
                }
                qtsVar.n = i;
                qtsVar.m = 512;
                if (defpackage.lee.a.a().b()) {
                    int i2 = (int) defpackage.gjr.P1.k;
                    qtsVar.e = new android.graphics.Rect(i2, i2, i2, i2);
                }
                qtsVar.l = true;
                return defpackage.afbk.a;
            case 1:
                java.lang.Object obj2 = this.a;
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment) obj2;
                defpackage.w wVar = new defpackage.w(fragment.getParentFragmentManager());
                wVar.h(fragment, bool.booleanValue() ? defpackage.epx.e : defpackage.epx.d);
                wVar.i(false, true);
                if (bool.booleanValue()) {
                    defpackage.xzg xzgVar = ((defpackage.mtc) obj2).a;
                    xzgVar.d();
                    xzgVar.e();
                } else {
                    defpackage.xzg xzgVar2 = ((defpackage.mtc) obj2).a;
                    if (xzgVar2.a) {
                        xzgVar2.f();
                        defpackage.oim oimVarU = defpackage.omf.u();
                        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.DASHBOARD, defpackage.zbd.HG);
                        rrvVarH.u(xzgVar2.a(java.util.concurrent.TimeUnit.MILLISECONDS));
                        oimVarU.F(rrvVarH.l());
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                this.a.b(list);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (((java.lang.Integer) obj).intValue() == 0) {
                    defpackage.msw mswVarA = defpackage.mvm.a(this.a);
                    if (mswVarA instanceof defpackage.msr) {
                        return 2131231718;
                    }
                    if (mswVarA instanceof mst) {
                        return 2131231612;
                    }
                    if (mswVarA instanceof defpackage.msq) {
                        return 2131231802;
                    }
                }
                return null;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.List list2 = (java.util.List) obj;
                defpackage.yqm yqmVar = mvv.a;
                list2.getClass();
                this.a.b(list2);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                ?? r9 = this.a;
                defpackage.bvm bvmVar = mwn.a;
                cjaVar.getClass();
                r9.b(java.lang.Boolean.valueOf(cjaVar.a()));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cim cimVar = (defpackage.cim) obj;
                defpackage.yqm yqmVar2 = defpackage.myx.a;
                cimVar.getClass();
                cimVar.k((defpackage.cit) this.a);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cxn cxnVar = (defpackage.cxn) obj;
                java.lang.Object obj3 = this.a;
                defpackage.yqm yqmVar3 = defpackage.myx.a;
                cxnVar.getClass();
                defpackage.dai.aI(cxnVar, (defpackage.cka) obj3, 0L, 0L, null, 0, 126);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((java.lang.Float) obj).floatValue();
                defpackage.yqm yqmVar4 = defpackage.myx.a;
                return java.lang.Float.valueOf(((defpackage.byh) this.a).e());
            case 9:
                defpackage.cja cjaVar2 = (defpackage.cja) obj;
                ?? r10 = this.a;
                defpackage.yqm yqmVar5 = defpackage.mzk.a;
                cjaVar2.getClass();
                r10.b(java.lang.Boolean.valueOf(cjaVar2.a()));
                return defpackage.afbk.a;
            case 10:
                defpackage.cim cimVar2 = (defpackage.cim) obj;
                defpackage.yqm yqmVar6 = defpackage.mzk.a;
                cimVar2.getClass();
                defpackage.cit citVar = (defpackage.cit) this.a;
                cimVar2.b(citVar);
                cimVar2.j(citVar);
                return defpackage.afbk.a;
            case 11:
                defpackage.yqm yqmVar7 = defpackage.mzk.a;
                this.a.b((java.util.List) obj);
                return defpackage.afbk.a;
            case 12:
                defpackage.yqm yqmVar8 = defpackage.mzu.a;
                ((defpackage.qsh) obj).getClass();
                return this.a;
            case 13:
                java.lang.Object obj4 = this.a;
                defpackage.yqm yqmVar9 = defpackage.mzu.a;
                defpackage.gkc gkcVar = new defpackage.gkc((defpackage.xzo) defpackage.ojm.a().b);
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return defpackage.tcu.r(new defpackage.eqs(gkcVar), (j$.time.Duration) obj4);
            case 14:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj5 = this.a;
                int i3 = true != zBooleanValue ? 2 : 1;
                int i4 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                ((com.google.android.apps.auto.components.ui.media.PlayPauseStopCoolwalkButton) obj5).d = i3;
                return defpackage.afbk.a;
            case 15:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                int i5 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                aaPlaybackState.getClass();
                int iQ = aaPlaybackState.Q();
                java.lang.Object obj6 = this.a;
                ((com.google.android.apps.auto.components.ui.media.PlayPauseStopCoolwalkButton) obj6).c = iQ;
                ((com.google.android.material.button.MaterialButton) obj6).refreshDrawableState();
                return defpackage.afbk.a;
            case 16:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                int i6 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                ((android.widget.ProgressBar) this.a).setIndeterminate(zBooleanValue2);
                return defpackage.afbk.a;
            case 17:
                j$.time.Duration duration = (j$.time.Duration) obj;
                int i7 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                duration.getClass();
                ((android.widget.ProgressBar) this.a).setProgress((int) duration.toMillis());
                return defpackage.afbk.a;
            case 18:
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                int i8 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                charSequence.getClass();
                ((android.widget.TextView) this.a).setText(charSequence);
                return defpackage.afbk.a;
            case 19:
                java.lang.CharSequence charSequence2 = (java.lang.CharSequence) obj;
                int i9 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                charSequence2.getClass();
                java.lang.Object obj7 = this.a;
                ((android.widget.TextView) obj7).setText(charSequence2);
                ((android.view.View) obj7).setVisibility(true == afzh.v(charSequence2) ? 8 : 0);
                return defpackage.afbk.a;
            default:
                int i10 = true == ((java.lang.Boolean) obj).booleanValue() ? 4 : 0;
                int i11 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                ((android.view.View) this.a).setVisibility(i10);
                return defpackage.afbk.a;
        }
    }
}
