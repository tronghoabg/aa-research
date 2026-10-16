package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nru extends defpackage.mpb {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.AssistantImProc");
    public static final defpackage.nru a = new defpackage.nru();

    private nru() {
        super("Assistant Immersive");
    }

    @Override // defpackage.mpb
    protected final boolean d(android.content.Intent intent, defpackage.qrh qrhVar) {
        if (!defpackage.laq.a().b()) {
            return false;
        }
        defpackage.nqs nqsVar = defpackage.nqw.a;
        return defpackage.nqs.b(intent);
    }

    @Override // defpackage.mpb
    protected final void i(android.content.Intent intent, defpackage.qrh qrhVar) {
        defpackage.nqt nqtVar;
        android.content.ComponentName componentNameUnflattenFromString;
        defpackage.rrv rrvVarH;
        android.content.ComponentName componentNameUnflattenFromString2;
        defpackage.nqw nqwVarA = defpackage.nqw.a();
        intent.getClass();
        defpackage.acmj.h(defpackage.nqs.b(intent), "Intent %s is not an immersive intent", new java.lang.Object[]{intent});
        if (nqwVarA.e.c != 2 && intent.getBooleanExtra("request_partial_immersive_activity", false)) {
            defpackage.nqw.b.l().u("Immersive requesting partial");
            nqtVar = new defpackage.nqt(false, 1, 4);
        } else if (intent.getBooleanExtra("request_fullscreen_immersive_activity", false) || intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_START_MEDIA_REC", false)) {
            defpackage.nqw.b.l().u("Immersive requesting fullscreen");
            nqtVar = new defpackage.nqt(true, 1, 4);
        } else {
            nqtVar = nqwVarA.e;
        }
        boolean z = nqtVar.a;
        if (z) {
            defpackage.nqw.a().e(intent);
        } else {
            defpackage.nqw.a().g(intent);
        }
        defpackage.nqw nqwVarA2 = defpackage.nqw.a();
        intent.getClass();
        if (z) {
            java.lang.String stringExtra = intent.getStringExtra("fullscreen_immersive_component_name");
            if (stringExtra != null && (componentNameUnflattenFromString2 = android.content.ComponentName.unflattenFromString(stringExtra)) != null) {
                intent.setComponent(componentNameUnflattenFromString2);
            }
        } else {
            java.lang.String stringExtra2 = intent.getStringExtra("partial_immersive_component_name");
            if (stringExtra2 != null && (componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(stringExtra2)) != null) {
                intent.setComponent(componentNameUnflattenFromString);
            }
        }
        intent.putExtra("uses_vertical_rail", nqwVarA2.b().F());
        intent.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1024);
        ((defpackage.yqj) b.l().ai((char) 5329)).y("Launching assistant immersive, is fullscreen = %b", java.lang.Boolean.valueOf(z));
        intent.getClass();
        if (intent.getBooleanExtra("ROBIN_DASHBOARD_CAL_EXTRA", false)) {
            defpackage.mqi mqiVarB = defpackage.mqi.b(new android.content.Intent(intent));
            mqiVarB.getClass();
            g(intent);
            jsg.l(intent, mqiVarB);
            if (z) {
                intent.setComponent(defpackage.mkt.i);
            } else {
                intent.setComponent(defpackage.mkt.j);
            }
        }
        qrhVar.e = defpackage.nte.c().b().r(z ? defpackage.nta.w : defpackage.nta.x);
        defpackage.nqw.a();
        nqtVar.getClass();
        if (z) {
            int i = nqtVar.c - 1;
            if (i == 0) {
                rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, defpackage.zbd.yO);
            } else if (i == 1) {
                rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, defpackage.zbd.yQ);
            } else if (i != 2) {
                rrvVarH = null;
            } else {
                rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, defpackage.zbd.yP);
                android.content.ComponentName componentName = nqtVar.b;
                if (componentName != null) {
                    rrvVarH.p(componentName);
                }
            }
            if (rrvVarH != null) {
                defpackage.omf.u().F(rrvVarH.l());
            }
        }
    }
}
