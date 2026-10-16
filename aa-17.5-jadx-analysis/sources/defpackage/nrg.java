package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
public final class nrg extends mov {
    private static final yph b = yph.c("GH.AssistantImProc");
    public static final nrg a = new nrg();

    private nrg() {
        super("Assistant Immersive");
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        if (!lal.a().b()) {
            return false;
        }
        nqa nqaVar = nqd.a;
        return nqa.b(intent);
    }

    @Override // defpackage.mov
    protected final void i(Intent intent, qql qqlVar) {
        nqb nqbVar;
        ComponentName componentNameUnflattenFromString;
        rrb rrbVarH;
        ComponentName componentNameUnflattenFromString2;
        nqd nqdVarA = nqd.a();
        intent.getClass();
        aclh.o(nqa.b(intent), "Intent %s is not an immersive intent", new Object[]{intent});
        if (nqdVarA.e.c != 2 && intent.getBooleanExtra("request_partial_immersive_activity", false)) {
            nqd.b.l().u("Immersive requesting partial");
            nqbVar = new nqb(false, 1, 4);
        } else if (intent.getBooleanExtra("request_fullscreen_immersive_activity", false) || intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_START_MEDIA_REC", false)) {
            nqd.b.l().u("Immersive requesting fullscreen");
            nqbVar = new nqb(true, 1, 4);
        } else {
            nqbVar = nqdVarA.e;
        }
        boolean z = nqbVar.a;
        if (z) {
            nqd.a().e(intent);
        } else {
            nqd.a().g(intent);
        }
        nqd nqdVarA2 = nqd.a();
        intent.getClass();
        if (z) {
            String stringExtra = intent.getStringExtra("fullscreen_immersive_component_name");
            if (stringExtra != null && (componentNameUnflattenFromString2 = ComponentName.unflattenFromString(stringExtra)) != null) {
                intent.setComponent(componentNameUnflattenFromString2);
            }
        } else {
            String stringExtra2 = intent.getStringExtra("partial_immersive_component_name");
            if (stringExtra2 != null && (componentNameUnflattenFromString = ComponentName.unflattenFromString(stringExtra2)) != null) {
                intent.setComponent(componentNameUnflattenFromString);
            }
        }
        intent.putExtra("uses_vertical_rail", nqdVarA2.b().F());
        intent.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1024);
        ((ype) b.l().ai((char) 5327)).y("Launching assistant immersive, is fullscreen = %b", Boolean.valueOf(z));
        intent.getClass();
        if (intent.getBooleanExtra("ROBIN_DASHBOARD_CAL_EXTRA", false)) {
            mqb mqbVarB = mqb.b(new Intent(intent));
            mqbVarB.getClass();
            g(intent);
            jsf.l(intent, mqbVarB);
            if (z) {
                intent.setComponent(mkn.i);
            } else {
                intent.setComponent(mkn.j);
            }
        }
        qqlVar.e = nsr.c().b().r(z ? nsn.w : nsn.x);
        nqd.a();
        nqbVar.getClass();
        if (z) {
            int i = nqbVar.c - 1;
            if (i == 0) {
                rrbVarH = rrc.h(yxy.GEARHEAD, yzz.ASSISTANT, yzy.yK);
            } else if (i == 1) {
                rrbVarH = rrc.h(yxy.GEARHEAD, yzz.ASSISTANT, yzy.yM);
            } else if (i != 2) {
                rrbVarH = null;
            } else {
                rrbVarH = rrc.h(yxy.GEARHEAD, yzz.ASSISTANT, yzy.yL);
                ComponentName componentName = nqbVar.b;
                if (componentName != null) {
                    rrbVarH.p(componentName);
                }
            }
            if (rrbVarH != null) {
                ebf.j().F(rrbVarH.l());
            }
        }
    }
}
