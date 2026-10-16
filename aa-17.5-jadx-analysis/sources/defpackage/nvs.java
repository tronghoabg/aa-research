package defpackage;

import android.app.PendingIntent;
import android.os.Handler;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class nvs {
    public static final yph a = yph.c("GH.AsstHunPresenter");
    public nuh e;
    private nwq f;
    public final Handler b = new Handler();
    public Runnable d = new iqz(4);
    private Runnable g = new iqz(5);
    public final kww c = new nvr(this, 0);

    public final void a(nuh nuhVar, nwq nwqVar, Runnable runnable) {
        this.e = nuhVar;
        this.f = nwqVar;
        this.g = runnable;
    }

    public final void b(yzy yzyVar) {
        ((ype) a.l().ai((char) 5470)).u("AssistantHunPresenter.logHunEvent");
        nwq nwqVar = this.f;
        nur nurVar = this.e.c;
        PendingIntent pendingIntent = nurVar.c;
        nul nulVar = nurVar.p;
        nul nulVar2 = nurVar.q;
        nul nulVar3 = nurVar.r;
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.SYSTEM_UI_NOTIFICATION, yzyVar);
        abnp abnpVarE = rrbVarH.E();
        abnpVarE.t();
        yza yzaVar = (yza) abnpVarE.b;
        yza yzaVar2 = yza.a;
        yzaVar.b |= 4;
        yzaVar.e = (pendingIntent == null ? 0 : 1) + (nulVar == null ? 0 : 1) + (nulVar2 == null ? 0 : 1) + (nulVar3 != null ? 1 : 0);
        String str = nwqVar.b;
        abnpVarE.t();
        yza yzaVar3 = (yza) abnpVarE.b;
        str.getClass();
        yzaVar3.b |= 1;
        yzaVar3.c = str;
        int iA = nwqVar.c.a();
        abnpVarE.t();
        yza yzaVar4 = (yza) abnpVarE.b;
        yzaVar4.d = iA - 1;
        yzaVar4.b |= 2;
        long j = nwqVar.d;
        abnpVarE.t();
        yza yzaVar5 = (yza) abnpVarE.b;
        yzaVar5.b |= 8;
        yzaVar5.f = j;
        boolean z = nwqVar.e;
        abnpVarE.t();
        yza yzaVar6 = (yza) abnpVarE.b;
        yzaVar6.b |= 16;
        yzaVar6.g = z;
        ebf.j().f(rrbVarH);
    }

    public final void c() {
        try {
            this.d = this.g;
            kfl.h().r(this.c);
            nud nudVar = this.e.c.t;
            nudVar.getClass();
            PendingIntent pendingIntent = nudVar.i;
            pendingIntent.getClass();
            pendingIntent.send();
            b(yzy.oI);
        } catch (PendingIntent.CanceledException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 5476)).u("onShow action intent canceled");
            kfl.h().I(this.c);
        }
    }

    public final boolean d(nuh nuhVar) {
        nuh nuhVar2 = this.e;
        return nuhVar2 != null && Objects.equals(nuhVar.d, nuhVar2.d);
    }

    public final String toString() {
        return getClass().getName();
    }
}
