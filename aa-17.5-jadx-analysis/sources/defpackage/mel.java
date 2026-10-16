package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.settings.ui.CarSettingsService;
import com.google.android.apps.auto.components.ui.telecom.MaterialUnCallView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class mel implements us {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mel(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v55, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v56, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [afdr, java.lang.Object] */
    @Override // defpackage.us
    public final void onClick() {
        int i = 3;
        switch (this.b) {
            case 0:
                this.a.invoke();
                break;
            case 1:
                this.a.invoke();
                break;
            case 2:
                this.a.invoke();
                break;
            case 3:
                this.a.invoke();
                break;
            case 4:
                ((meu) this.a).b.invoke();
                ebf.j().o(meu.a, yzy.ab);
                break;
            case 5:
                this.a.invoke();
                break;
            case 6:
                this.a.invoke();
                break;
            case 7:
                qw qwVar = (qw) this.a;
                qx qxVarG = qwVar.g();
                qrn qrnVarE = kio.b().e();
                mmu mmuVar = new mmu(qwVar.a);
                nrc.b().a(qrnVarE).fE(mmuVar, new mmt(mmuVar, 0));
                nrc.b();
                mmuVar.g = nrc.d(qrnVarE);
                qxVarG.f(mmuVar);
                break;
            case 8:
                qw qwVar2 = (qw) this.a;
                qn qnVar = qwVar2.a;
                qx qxVarG2 = qwVar2.g();
                yph yphVar = mmx.f;
                qnVar.getClass();
                qrn qrnVarE2 = kio.b().e();
                qrnVarE2.getClass();
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.cX).l());
                mmx mmxVar = new mmx(qnVar);
                nfo.b().a(qrnVarE2).fE(mmxVar, new med(new eyr(mmxVar, 18, (float[][][]) null), 3));
                nfo.b();
                nfp nfpVarD = nfo.d(qrnVarE2);
                nfpVarD.getClass();
                mmxVar.g = nfpVarD;
                qxVarG2.f(mmxVar);
                break;
            case 9:
                qw qwVar3 = (qw) this.a;
                qx qxVarG3 = qwVar3.g();
                yph yphVar2 = mmq.f;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.cX).l());
                mmq mmqVar = new mmq(qwVar3.a);
                nfo.b().a(kio.b().e()).fE(mmqVar, new lsh(mmqVar, 20));
                qxVarG3.f(mmqVar);
                break;
            case 10:
                qw qwVar4 = (qw) this.a;
                qx qxVarG4 = qwVar4.g();
                yph yphVar3 = mmr.f;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.dI).l());
                mmr mmrVar = new mmr(qwVar4.a);
                mmc.c().b(kio.b().e()).fE(mmrVar, new mmt(mmrVar, 1));
                qxVarG4.f(mmrVar);
                break;
            case 11:
                qw qwVar5 = (qw) this.a;
                qx qxVarG5 = qwVar5.g();
                yph yphVar4 = mmo.f;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.dO).l());
                mmo mmoVar = new mmo(qwVar5.a);
                mmc.c().a().fE(mmoVar, new lsh(mmoVar, 19));
                qxVarG5.f(mmoVar);
                break;
            case 12:
                qw qwVar6 = (qw) this.a;
                qx qxVarG6 = qwVar6.g();
                yph yphVar5 = mmv.f;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.du).l());
                mmv mmvVar = new mmv(qwVar6.a);
                mme.b().b.fE(mmvVar, new mmt(mmvVar, 2));
                qxVarG6.f(mmvVar);
                break;
            case 13:
                qw qwVar7 = (qw) this.a;
                qx qxVarG7 = qwVar7.g();
                yph yphVar6 = mms.f;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.dW).l());
                qxVarG7.f(new mms(qwVar7.a));
                break;
            case 14:
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.cM).l());
                CarSettingsService carSettingsService = ((mmm) this.a).h;
                String string = carSettingsService.getBaseContext().getString(R.string.gearhead_on_phone_activity_settings_label);
                string.getClass();
                Context baseContext = carSettingsService.getBaseContext();
                mfe.a();
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity"));
                intent.setFlags(335544320);
                mfe.c(baseContext, intent, string, yzz.SETTINGS_PHONE);
                break;
            case 15:
                qw qwVar8 = (qw) this.a;
                qx qxVarG8 = qwVar8.g();
                yph yphVar7 = mmw.f;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.dv).l());
                mmw mmwVar = new mmw(qwVar8.a);
                mme mmeVarB = mme.b();
                mmeVarB.c.fE(mmwVar, new mmt(mmwVar, i));
                mmeVarB.d.fE(mmwVar, new mmt(mmwVar, 4));
                qxVarG8.f(mmwVar);
                break;
            case 16:
                ((MaterialUnCallView) this.a).p.D();
                break;
            case 17:
                this.a.invoke();
                break;
            default:
                this.a.invoke();
                break;
        }
    }
}
