package defpackage;

import android.content.ComponentName;
import j$.util.Objects;

/* loaded from: classes.dex */
final class lrl implements eqn, epf {
    private ComponentName a;
    private boolean b;
    private boolean c;

    private static void g(ComponentName componentName, boolean z) {
        if (acpl.h() && z) {
            lbt.o.e(mki.a.c);
        }
        ohs ohsVarJ = ebf.j();
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 20, z ? yyv.MEDIA_SESSION_STARTED : yyv.MEDIA_SESSION_STOPPED);
        rquVarH.e(componentName.getPackageName());
        ohsVarJ.F(rquVarH.l());
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        lre lreVar = (lre) obj;
        ComponentName componentName = lreVar.a;
        ComponentName componentName2 = this.a;
        this.a = componentName;
        this.b = componentName != null && lreVar.b == lok.b && lkb.b(lreVar.c) && !lreVar.d;
        if (Objects.equals(componentName2, this.a)) {
            ComponentName componentName3 = this.a;
            if (componentName3 != null) {
                boolean z = this.c;
                boolean z2 = this.b;
                if (z != z2) {
                    g(componentName3, z2);
                    this.c = this.b;
                    return;
                }
                return;
            }
            return;
        }
        if (this.c) {
            componentName2.getClass();
            g(componentName2, false);
            this.c = false;
        }
        if (this.b) {
            ComponentName componentName4 = this.a;
            componentName4.getClass();
            g(componentName4, true);
            this.c = true;
        }
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        if (this.c) {
            ComponentName componentName = this.a;
            componentName.getClass();
            g(componentName, false);
            this.c = false;
        }
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        if (this.b) {
            ComponentName componentName = this.a;
            componentName.getClass();
            g(componentName, true);
            this.c = true;
        }
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }
}
