package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class hlm implements defpackage.eqt {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hlm(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        int i = 7;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                com.android.car.libraries.apphost.view.MicrophoneRecordingView microphoneRecordingViewJ = ((hlo) this.a).j();
                int iOrdinal = ((gdz) obj).ordinal();
                if (iOrdinal == 0) {
                    com.android.car.libraries.apphost.view.MicrophoneRecordingView.RecordingBarContainer recordingBarContainer = microphoneRecordingViewJ.a;
                    recordingBarContainer.requestFocus();
                    android.animation.TimeAnimator.TimeListener hlpVar = new hlp(recordingBarContainer);
                    android.animation.TimeAnimator timeAnimator = recordingBarContainer.b;
                    timeAnimator.setTimeListener(hlpVar);
                    timeAnimator.start();
                    microphoneRecordingViewJ.setVisibility(0);
                    return;
                }
                if (iOrdinal != 1) {
                    return;
                }
                microphoneRecordingViewJ.setVisibility(8);
                android.animation.TimeAnimator timeAnimator2 = microphoneRecordingViewJ.a.b;
                if (timeAnimator2 != null) {
                    timeAnimator2.cancel();
                    timeAnimator2.setTimeListener(null);
                    timeAnimator2.removeAllListeners();
                    return;
                }
                return;
            case 1:
                ((aiyl) this.a).j(obj);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.Map map = (java.util.Map) obj;
                if (map != null && j$.util.Collection.-EL.stream(map.entrySet()).anyMatch(new defpackage.hmj(i))) {
                    defpackage.jqu jquVar = (defpackage.jqu) this.a;
                    if (jquVar.e()) {
                        android.content.Intent intent = new android.content.Intent("com.google.android.projection.gearhead.ACTION_DSA_AAPM_HUN");
                        android.content.Context context = jquVar.a;
                        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, 0, intent.setPackage(context.getPackageName()), 201326592);
                        aafz aafzVar = new aafz((byte[]) null);
                        aafzVar.d = context.getString(2132083043);
                        aafzVar.a = 1;
                        aafzVar.b = broadcast;
                        nvb nvbVar = new nvb(aafzVar);
                        nvc nvcVar = new nvc();
                        nvcVar.d = com.google.android.apps.auto.components.graphics.icon.GhIcon.q(context.getResources(), 2131231856);
                        nvcVar.f = context.getPackageName();
                        nvcVar.x = defpackage.nve.a;
                        nvcVar.a = nvf.d;
                        nvcVar.m = context.getString(2132083045);
                        nvcVar.n = context.getString(2132083044);
                        nvcVar.p = nvbVar;
                        defpackage.nuz.b().j("AAPM_HUN", 0L, nvcVar.b());
                        defpackage.jqu.a(defpackage.zbe.AAPM, defpackage.zbd.Nd);
                    }
                    jquVar.b();
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((jsg) this.a).m((defpackage.ksh) obj);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                jsq jsqVar = (jsq) this.a;
                android.widget.TextView textView = jsqVar.m;
                if (textView == null) {
                    return;
                }
                textView.setText(charSequence);
                jsqVar.m.setVisibility(true == jsqVar.p.l ? 0 : 8);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.eqp) this.a).m((java.lang.Boolean) obj);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ksh kshVar = (defpackage.ksh) obj;
                jsq jsqVar2 = (jsq) this.a;
                if (kshVar != jsqVar2.g) {
                    jsqVar2.g = kshVar;
                    jsqVar2.c.c(new defpackage.ixc(i));
                    return;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                gfb.c(new defpackage.jhc(this.a, ((java.lang.Boolean) obj).booleanValue(), 6));
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.jyp) this.a).a = ((java.lang.Boolean) obj).booleanValue();
                return;
            case 9:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                com.google.android.apps.auto.components.apphost.view.TemplateView templateView = (com.google.android.apps.auto.components.apphost.view.TemplateView) this.a;
                gha ghaVar = templateView.n;
                if (ghaVar != null) {
                    ghaVar.b(zBooleanValue);
                }
                templateView.q();
                return;
            case 10:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                kcl kclVar = (kcl) this.a;
                kclVar.h = zBooleanValue2;
                kclVar.w();
                return;
            case 11:
                ((kcr) this.a).s((java.lang.String) obj);
                return;
            case 12:
                ((kcr) this.a).t((java.lang.String) obj);
                return;
            case 13:
                ((kcr) this.a).u((olv) obj);
                return;
            case 14:
                ((kcr) this.a).w(((java.lang.Integer) obj).intValue());
                return;
            case 15:
                ((defpackage.kev) this.a).b = ((java.lang.Boolean) obj).booleanValue();
                return;
            case 16:
                ((rb) this.a).j();
                return;
            case 17:
                ((defpackage.khr) this.a).a();
                return;
            case 18:
                thj thjVar = (defpackage.tis) obj;
                defpackage.yqm yqmVar = defpackage.kic.a;
                java.lang.Object obj2 = this.a;
                try {
                    java.util.function.Function functionIdentity = j$.util.function.Function.-CC.identity();
                    if (!(thjVar instanceof defpackage.thk)) {
                        throw ((java.lang.Throwable) a$.ExternalSyntheticApiModelOutline2.m(functionIdentity, thjVar.a));
                    }
                    ((defpackage.eqp) obj2).m(((defpackage.thk) thjVar).a);
                    return;
                } catch (java.lang.Throwable th) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kic.a.g()).p(th)).ai((char) 3110)).u("Ignoring unsuccessful result.");
                    return;
                }
            case 19:
                defpackage.mpc mpcVar = (defpackage.mpc) obj;
                ((defpackage.yqj) com.google.android.apps.auto.components.carhome.ProjectedHomeActivity.m.l().ai((char) 3202)).y("update state: %s", mpcVar);
                if (mpcVar == null) {
                    defpackage.rox.o("GH.HomeActivity", "got a null ui state update", new java.lang.Object[0]);
                    return;
                }
                java.lang.Object obj3 = this.a;
                int iOrdinal2 = mpcVar.ordinal();
                if (iOrdinal2 == 0) {
                    com.google.android.apps.auto.components.carhome.ProjectedHomeActivity projectedHomeActivity = (com.google.android.apps.auto.components.carhome.ProjectedHomeActivity) obj3;
                    projectedHomeActivity.q = projectedHomeActivity.n;
                    projectedHomeActivity.p = false;
                } else if (iOrdinal2 == 1) {
                    com.google.android.apps.auto.components.carhome.ProjectedHomeActivity projectedHomeActivity2 = (com.google.android.apps.auto.components.carhome.ProjectedHomeActivity) obj3;
                    projectedHomeActivity2.q = projectedHomeActivity2.o;
                    projectedHomeActivity2.p = true;
                } else if (iOrdinal2 == 2) {
                    ((com.google.android.apps.auto.components.carhome.ProjectedHomeActivity) obj3).finish();
                    return;
                }
                ((com.google.android.apps.auto.components.carhome.ProjectedHomeActivity) obj3).A();
                return;
            default:
                defpackage.mkp.a.d.execute(new defpackage.kos(this.a, (j$.util.Optional) obj, 5));
                return;
        }
    }
}
