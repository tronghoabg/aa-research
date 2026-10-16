package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* loaded from: classes3.dex */
public final class aabw implements ackr {
    private final acku a;
    private final /* synthetic */ int b;

    public aabw(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                Object baseContext = ((aabk) this.a).a().a;
                while (baseContext instanceof ContextWrapper) {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                Context applicationContext = ((Context) baseContext).getApplicationContext();
                applicationContext.getClass();
                return applicationContext;
            case 1:
                return new sm(((aabj) this.a).a().d, (byte[]) null);
            case 2:
                String packageName = ((Context) ((aabk) this.a).a().a).getPackageName();
                packageName.getClass();
                return packageName;
            case 3:
                return new aaax(((aabk) this.a).a());
            case 4:
                return yfy.k(abgl.GMM_VECTOR_BASE, psr.b(((aaby) this.a).a()));
            case 5:
                Context context = (Context) this.a.a();
                int i = pso.a;
                Context applicationContext2 = context.getApplicationContext();
                Object systemService = applicationContext2.getSystemService(psp.a);
                if (systemService == null) {
                    systemService = new psn(applicationContext2);
                }
                return (psp) systemService;
            case 6:
                return new ajmd((zwm) this.a.a(), null);
            case 7:
                return new erb(((aabm) this.a).a());
            case 8:
                return ((aabj) this.a).a().n;
            case 9:
                return new oct((aezk) this.a);
            case 10:
                pyx pyxVar = (pyx) this.a.a();
                pyxVar.getClass();
                return new ajmd(pyxVar);
            case 11:
                return xxh.h((trc) this.a.a());
            case 12:
                uzz uzzVar = ((vaa) ((rjg) this.a.a()).a).a;
                uzzVar.getClass();
                return uzzVar;
            default:
                Resources resourcesB = ((aabk) this.a).a().B();
                resourcesB.getClass();
                return resourcesB;
        }
    }
}
