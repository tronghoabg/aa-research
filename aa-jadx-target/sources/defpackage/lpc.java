package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lpc implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lpc(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.content.ComponentName componentNameA;
        int i = this.c;
        int i2 = 2;
        if (i == 0) {
            j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((defpackage.ygw) obj);
            lph lphVar = (lph) this.b;
            defpackage.lma lmaVar = lphVar.c;
            lmi lmiVar = (lmi) stream.filter(new defpackage.lpa(lmaVar, i2)).findFirst().orElse((java.lang.Object) null);
            java.lang.Object obj2 = this.a;
            if (lmiVar != null) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.lpg.a.f()).ai((char) 4124)).u("Returning connection from the active media controller.");
                defpackage.lpg lpgVar = (defpackage.lpg) obj2;
                los losVar = (los) j$.util.Map.-EL.computeIfAbsent(lpgVar.f, lmaVar, new lpb(lpgVar, lphVar, lmiVar));
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return new defpackage.eqs(losVar);
            }
            defpackage.lpg lpgVar2 = (defpackage.lpg) obj2;
            lpgVar2.f.remove(lmaVar);
            ((defpackage.yqj) ((defpackage.yqj) defpackage.lpg.a.f()).ai((char) 4123)).u("Returning inactive connection since there is no active session.");
            lpe lpeVar = new lpe(defpackage.lor.c, lpgVar2.g(lphVar.a));
            defpackage.afdo afdoVar2 = defpackage.tcu.a;
            return new defpackage.eqs(lpeVar);
        }
        if (i == 1) {
            defpackage.qsh qshVar = (defpackage.qsh) obj;
            java.lang.Object obj3 = this.a;
            java.lang.Object obj4 = this.b;
            if (qshVar == null) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.lpg.a.f()).ai((char) 4127)).u("Returning inactive connection since out of lifecycle");
                lpe lpeVar2 = new lpe(defpackage.lor.f, ((defpackage.lpg) obj3).g(((lph) obj4).a));
                defpackage.afdo afdoVar3 = defpackage.tcu.a;
                return new defpackage.eqs(lpeVar2);
            }
            if (j$.util.Collection.-EL.stream(jxk.a().b(qshVar, defpackage.nze.b())).anyMatch(new defpackage.koo(obj4, 20))) {
                componentNameA = defpackage.ljw.d().a(((lph) obj4).a, qshVar);
            } else {
                componentNameA = ((lph) obj4).a;
            }
            if (componentNameA != null) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.lpg.a.f()).ai((char) 4125)).u("Returning connection from the media browse service.");
                return ((defpackage.lpg) obj3).i(componentNameA).b;
            }
            ((defpackage.yqj) ((defpackage.yqj) defpackage.lpg.a.f()).ai((char) 4126)).u("Returning inactive connection since no MBS to fall back to.");
            lpe lpeVar3 = new lpe(defpackage.lor.c, ((defpackage.lpg) obj3).g(((lph) obj4).a));
            defpackage.afdo afdoVar4 = defpackage.tcu.a;
            return new defpackage.eqs(lpeVar3);
        }
        if (i != 2) {
            if (i == 3) {
                java.util.Set set = ((defpackage.lpx) this.a).c;
                return defpackage.lpx.g((defpackage.qsh) this.b, (java.util.List) obj, set);
            }
            if (i != 4) {
                ?? r0 = this.b;
                return defpackage.lpx.j((defpackage.qsh) this.a, (defpackage.ygw) obj, r0);
            }
            ?? r1 = this.b;
            return defpackage.lpx.j((defpackage.qsh) this.a, (defpackage.ygw) obj, r1);
        }
        defpackage.qsh qshVar2 = (defpackage.qsh) obj;
        java.lang.Object obj5 = this.a;
        java.lang.Object obj6 = this.b;
        if (qshVar2 != null) {
            return ((defpackage.lpg) obj6).i((android.content.ComponentName) obj5);
        }
        defpackage.lor lorVar = defpackage.lor.f;
        defpackage.lpg lpgVar3 = (defpackage.lpg) obj6;
        android.content.ComponentName componentName = (android.content.ComponentName) obj5;
        lpd lpdVar = new lpd(lorVar, lpgVar3.g(componentName));
        defpackage.afdo afdoVar5 = defpackage.tcu.a;
        return new lpf(new defpackage.eqs(lpdVar), new defpackage.eqs(new lpe(lorVar, lpgVar3.g(componentName))));
    }

    public /* synthetic */ lpc(defpackage.lpg lpgVar, android.content.ComponentName componentName, int i) {
        this.c = i;
        this.b = lpgVar;
        this.a = componentName;
    }
}
