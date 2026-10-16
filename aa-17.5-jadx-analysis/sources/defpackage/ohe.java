package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;
import com.google.android.gms.feedback.FeedbackOptions;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class ohe {
    public final Object a;
    public final Object b;

    public ohe(Context context) {
        String strN;
        this.b = new suz(context, null);
        sxo.b(context);
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        new ApplicationErrorReport();
        try {
            strN = ((Boolean) srk.a.a()).booleanValue() ? a.ce("_") : thg.n();
        } catch (SecurityException unused) {
            strN = thg.n();
        }
        this.a = thg.x(null, bundle, null, "com.google.android.apps.auto.components.settings.interactivetroubleshooter.INTERACTIVE_TROUBLESHOOTER", arrayList, null, null, strN);
    }

    public final void a(yyv yyvVar) {
        Object obj = this.a;
        if (obj == null) {
            ebf.j().x(33, yyvVar);
        } else {
            ((rpz) obj).c(rqv.h(yxy.GEARHEAD, 33, yyvVar).l());
        }
    }

    public final void b(boolean z, xpv xpvVar, int i) {
        abnp abnpVarN = zac.a.n();
        abnpVarN.t();
        zac zacVar = (zac) abnpVarN.b;
        zacVar.b |= 1;
        zacVar.c = z;
        int iH = fyz.h(xpvVar) - 1;
        abnpVarN.t();
        zac zacVar2 = (zac) abnpVarN.b;
        zacVar2.b |= 2;
        zacVar2.d = iH;
        int i2 = (i <= 2400 || i >= 2500) ? (i <= 4900 || i >= 5900) ? 1 : 3 : 2;
        abnpVarN.t();
        zac zacVar3 = (zac) abnpVarN.b;
        zacVar3.b |= 4;
        zacVar3.e = i2 - 1;
        abnpVarN.t();
        zac zacVar4 = (zac) abnpVarN.b;
        zacVar4.b |= 8;
        zacVar4.f = 1;
        zac zacVar5 = (zac) abnpVarN.q();
        Object obj = this.a;
        Object obj2 = this.b;
        if (obj != null) {
            d((UUID) obj2, false, zacVar5, 0);
        } else {
            ebf.j().E((UUID) obj2, false, zacVar5, 0);
        }
    }

    public final void c(xpv xpvVar, int i) {
        abnp abnpVarN = zac.a.n();
        abnpVarN.t();
        zac zacVar = (zac) abnpVarN.b;
        zacVar.b |= 1;
        zacVar.c = false;
        int iH = fyz.h(xpvVar) - 1;
        abnpVarN.t();
        zac zacVar2 = (zac) abnpVarN.b;
        zacVar2.b |= 2;
        zacVar2.d = iH;
        abnpVarN.t();
        zac zacVar3 = (zac) abnpVarN.b;
        zacVar3.b |= 8;
        zacVar3.f = 2;
        abnpVarN.t();
        zac zacVar4 = (zac) abnpVarN.b;
        zacVar4.b |= 16;
        zacVar4.g = i - 1;
        zac zacVar5 = (zac) abnpVarN.q();
        Object obj = this.a;
        Object obj2 = this.b;
        if (obj != null) {
            d((UUID) obj2, false, zacVar5, null);
        } else {
            ebf.j().E((UUID) obj2, false, zacVar5, null);
        }
    }

    public final void d(UUID uuid, Boolean bool, zac zacVar, Integer num) {
        abnp abnpVarN = zae.a.n();
        abnpVarN.t();
        zae zaeVar = (zae) abnpVarN.b;
        zaeVar.b |= 1;
        zaeVar.c = 1;
        bool.booleanValue();
        abnpVarN.t();
        zae zaeVar2 = (zae) abnpVarN.b;
        zaeVar2.b |= 2;
        zaeVar2.d = false;
        if (zacVar != null) {
            abnpVarN.t();
            zae zaeVar3 = (zae) abnpVarN.b;
            zaeVar3.e = zacVar;
            zaeVar3.b |= 4;
        }
        if (num != null) {
            num.intValue();
            abnpVarN.t();
            zae zaeVar4 = (zae) abnpVarN.b;
            zaeVar4.b |= 8;
            zaeVar4.f = 0;
        }
        abnp abnpVarN2 = yxb.a.n();
        yzj yzjVarS = aclh.s(uuid);
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yzjVarS.getClass();
        yxbVar.C = yzjVarS;
        yxbVar.b |= 536870912;
        zae zaeVar5 = (zae) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar2 = (yxb) abnpVarN2.b;
        zaeVar5.getClass();
        yxbVar2.G = zaeVar5;
        yxbVar2.c |= 16;
        yxb yxbVar3 = (yxb) abnpVarN2.q();
        Object obj = this.a;
        yxc yxcVar = yxc.WIRELESS_START;
        int i = yfq.d;
        ((rpz) obj).e(yxcVar, yxbVar3, yls.a);
    }

    public final void e(int i) {
        ((CoolwalkButton) this.a).setVisibility(i);
        ((View) this.b).setVisibility(i);
    }

    public final void f() {
        ((suz) this.b).f((FeedbackOptions) this.a);
    }

    public final void g() {
        lnm.k().e((lue) this.a);
    }

    public final void h(boolean z) {
        lnm.k().f((lue) this.a, z);
    }

    public final boolean i() {
        return ((lxb) this.a).k();
    }

    public ohe(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public ohe(ajmd ajmdVar, Call call) {
        ajmdVar.getClass();
        this.b = ajmdVar;
        this.a = call;
    }

    public ohe(String str, String str2) {
        this.a = str;
        this.b = str2;
        str2.getBytes(StandardCharsets.UTF_8);
    }

    public ohe(lwz lwzVar, lwb lwbVar) {
        lwzVar.getClass();
        this.a = lwzVar;
        this.b = lwbVar;
    }

    public ohe() {
        this.a = new HashMap();
        this.b = yph.c("GH.NaviSbnConverter");
    }

    public ohe(CoolwalkButton coolwalkButton, View view) {
        this.a = coolwalkButton;
        this.b = view;
    }
}
