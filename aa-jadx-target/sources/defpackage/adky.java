package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class adky extends defpackage.admp {
    protected adky() {
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [aebf, java.lang.Object] */
    @Override // defpackage.admp
    public defpackage.admn a() {
        adjz adjzVar;
        defpackage.admp admpVarB = b();
        defpackage.adxc adxcVar = (defpackage.adxc) admpVarB;
        adtn adtnVarA = adxcVar.z.a();
        defpackage.aecg aecgVarE = defpackage.adkx.a ? defpackage.adxc.e(adxcVar.k, adxcVar.i) : defpackage.adxc.d(adxcVar.k, adxcVar.i);
        java.util.Collection collectionB = adtnVarA.b();
        boolean z = true;
        if (collectionB != null && !collectionB.containsAll(((defpackage.adnt) aecgVarE.a).e())) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Address types of NameResolver '%s' for '%s' not supported by transport", ((defpackage.adnt) aecgVarE.a).c(), aecgVarE.b));
        }
        ?? r4 = aecgVarE.b;
        java.lang.Object obj = aecgVarE.a;
        defpackage.aeas aeasVar = new defpackage.aeas(defpackage.adve.o, 0);
        defpackage.xzi xziVar = defpackage.adve.q;
        r4.toString();
        java.util.List list = adxcVar.h;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (true) {
            adjz adjzVar2 = null;
            if (!it.hasNext()) {
                boolean z2 = z;
                defpackage.adrs.C();
                boolean z3 = adxcVar.t;
                java.lang.reflect.Method method = defpackage.adxc.e;
                if (method != null) {
                    try {
                        boolean z4 = ((defpackage.adxc) admpVarB).u;
                        boolean z5 = ((defpackage.adxc) admpVarB).v;
                        boolean z6 = ((defpackage.adxc) admpVarB).w;
                        java.lang.Object[] objArr = new java.lang.Object[4];
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        objArr[0] = bool;
                        objArr[z2 ? 1 : 0] = bool;
                        objArr[2] = java.lang.Boolean.FALSE;
                        objArr[3] = bool;
                        adjzVar = (adjz) method.invoke(null, objArr);
                    } catch (java.lang.IllegalAccessException e) {
                        defpackage.adxc.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e);
                        adjzVar = null;
                    } catch (java.lang.reflect.InvocationTargetException e2) {
                        defpackage.adxc.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e2);
                        adjzVar = null;
                    }
                } else {
                    adjzVar = null;
                }
                if (adjzVar != null) {
                    arrayList.add(0, adjzVar);
                }
                boolean z7 = adxcVar.x;
                try {
                    adjzVar2 = (adjz) java.lang.Class.forName("adru").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (java.lang.ClassNotFoundException e3) {
                    defpackage.adxc.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e3);
                } catch (java.lang.IllegalAccessException e4) {
                    defpackage.adxc.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e4);
                } catch (java.lang.NoSuchMethodException e5) {
                    defpackage.adxc.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e5);
                } catch (java.lang.reflect.InvocationTargetException e6) {
                    defpackage.adxc.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e6);
                }
                if (adjzVar2 != null) {
                    arrayList.add(0, adjzVar2);
                }
                return new defpackage.adxe(new defpackage.adww(adxcVar, adtnVarA, r4, (defpackage.adnt) obj, aeasVar, xziVar, arrayList, defpackage.aeba.a));
            }
            adxb adxbVar = (adjz) it.next();
            boolean z8 = z;
            if (adxbVar instanceof adxb) {
                admo admoVar = adxbVar.a;
                throw null;
            }
            arrayList.add(adxbVar);
            z = z8;
        }
    }

    protected abstract defpackage.admp b();

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("delegate", b());
        return xymVarBy.toString();
    }
}
