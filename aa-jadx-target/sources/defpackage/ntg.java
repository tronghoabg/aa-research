package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ntg implements defpackage.ntk {
    final java.util.Set a = new android.util.ArraySet();

    @Override // defpackage.ntk
    public final defpackage.ygw a(com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.ntb ntbVarA = defpackage.nte.c().a(carRegionId.h);
        com.google.android.gms.car.display.CarRegionGroup carRegionGroupQ = ntbVarA.q(carRegionId);
        if (carRegionGroupQ == null) {
            int i = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(((defpackage.yde) ntbVarA.j).c(carRegionGroupQ));
        arrayList.remove(carRegionId);
        return defpackage.ygw.o(arrayList);
    }

    @Override // defpackage.ntk
    public final boolean b(com.google.android.gms.car.display.CarRegionId carRegionId) {
        com.google.android.gms.car.display.CarRegionGroup carRegionGroupQ = defpackage.nte.c().a(carRegionId.h).q(carRegionId);
        return carRegionGroupQ == null || carRegionId.equals(carRegionGroupQ.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ntk
    public final void c(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        java.util.Iterator it;
        java.util.Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            defpackage.mpj mpjVar = (defpackage.mpj) ((defpackage.wyz) it2.next()).a;
            if (mpjVar.m()) {
                ((defpackage.yqj) defpackage.mpj.a.l().ai((char) 5156)).y("Layout changed start when inactive, ignoring changed display %s", carDisplayId);
            } else {
                defpackage.mpi mpiVar = mpjVar.h;
                java.util.Map map = (java.util.Map) mpiVar.e();
                map.getClass();
                java.util.HashMap map2 = new java.util.HashMap(map);
                boolean z = false;
                for (java.util.Map.Entry entry : new java.util.HashMap(mpjVar.e).entrySet()) {
                    com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) entry.getKey();
                    defpackage.mpg mpgVar = (defpackage.mpg) entry.getValue();
                    if (carRegionId.h.equals(carDisplayId)) {
                        defpackage.ygw ygwVarA = defpackage.lyd.r().a(carRegionId);
                        if (!carRegionId.equals(mpgVar.b)) {
                            it = it2;
                            if (!ygwVarA.contains(mpgVar.b)) {
                                ((defpackage.yqj) defpackage.mpj.a.l().ai(5154)).M("Removing %s from %s due to group change", mpgVar.c, carRegionId);
                                mpgVar.c = null;
                                mpgVar.b = null;
                                z |= map2.remove(carRegionId) != null;
                            }
                            it2 = it;
                        } else if (defpackage.lyd.r().b(carRegionId)) {
                            defpackage.mqj mqjVar = (defpackage.mqj) map2.get(carRegionId);
                            mqjVar.getClass();
                            int size = ygwVarA.size();
                            int i = 0;
                            while (i < size) {
                                com.google.android.gms.car.display.CarRegionId carRegionId2 = (com.google.android.gms.car.display.CarRegionId) ygwVarA.get(i);
                                defpackage.mpg mpgVarA = mpjVar.a(carRegionId2);
                                java.util.Iterator it3 = it2;
                                if (!j$.util.Objects.equals(mpgVar.c, mpgVarA.c)) {
                                    ((defpackage.yqj) defpackage.mpj.a.l().ai(5155)).M("Setting %s to %s due to group change", carRegionId2, mpgVar.c);
                                    mpgVarA.c = mpgVar.c;
                                    mpgVarA.b = carRegionId;
                                    map2.put(carRegionId2, mqjVar);
                                    z = true;
                                }
                                i++;
                                it2 = it3;
                            }
                        }
                    }
                    it = it2;
                    it2 = it;
                }
                java.util.Iterator it4 = it2;
                if (z) {
                    mpiVar.m(map2);
                }
                it2 = it4;
            }
        }
    }

    @Override // defpackage.ntk
    public final boolean d(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (carRegionId == null) {
            return false;
        }
        return carRegionId.a() || a(new com.google.android.gms.car.display.CarRegionId(0, carRegionId.h)).contains(carRegionId);
    }

    @Override // defpackage.ntk
    public final void e(defpackage.wyz wyzVar) {
        this.a.add(wyzVar);
    }

    @Override // defpackage.ntk
    public final void f(defpackage.wyz wyzVar) {
        this.a.remove(wyzVar);
    }
}
