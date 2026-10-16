package defpackage;

import android.content.ComponentName;
import android.content.Context;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class opw implements erq {
    private final /* synthetic */ int a;
    private final Object b;

    public opw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.erq
    public final erm a(Class cls) {
        lth lthVarA;
        if (this.a == 0) {
            if (cls.isAssignableFrom(opv.class)) {
                return new opv((Context) this.b);
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        if (!cls.isAssignableFrom(mzy.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class".concat(String.valueOf(cls.getName())));
        }
        boolean zJ = aclu.j();
        Object obj = this.b;
        if (zJ) {
            ComponentName componentName = ((nbf) obj).b;
            String className = componentName.getClassName();
            className.getClass();
            if (className.length() == 0) {
                yzz yzzVar = yzz.DASHBOARD;
                String packageName = componentName.getPackageName();
                packageName.getClass();
                mzw mzwVarQ = mjv.q();
                Duration duration = lto.a;
                ComponentName componentName2 = new ComponentName(packageName, "");
                afco afcoVar = tby.a;
                lthVarA = lto.f(yzzVar, new eqm(componentName2), tby.B(lof.a.a().a(), new lpx(packageName, 12)), mzwVarQ);
            } else {
                yzz yzzVar2 = yzz.DASHBOARD;
                afco afcoVar2 = tby.a;
                lthVarA = lto.a(yzzVar2, new eqm(componentName), mjv.q());
            }
        } else {
            nbf nbfVar = (nbf) obj;
            loz lozVar = nbfVar.a;
            if (lozVar != null) {
                yzz yzzVar3 = yzz.DASHBOARD;
                afco afcoVar3 = tby.a;
                lthVarA = lto.c(yzzVar3, new eqm(lozVar), mjv.q());
            } else {
                ComponentName componentName3 = nbfVar.b;
                yzz yzzVar4 = yzz.DASHBOARD;
                afco afcoVar4 = tby.a;
                lthVarA = lto.a(yzzVar4, new eqm(componentName3), mjv.q());
            }
        }
        return new mzy(lthVarA, 1);
    }

    @Override // defpackage.erq
    public final /* synthetic */ erm b(Class cls, esc escVar) {
        return this.a != 0 ? a(cls) : a(cls);
    }

    @Override // defpackage.erq
    public final /* synthetic */ erm c(afhe afheVar, esc escVar) {
        return this.a != 0 ? ebj.g(this, afheVar, escVar) : ebj.g(this, afheVar, escVar);
    }
}
