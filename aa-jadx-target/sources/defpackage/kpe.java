package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kpe implements defpackage.xzi {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kpe(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xzi
    public final java.lang.Object fF() throws java.lang.Throwable {
        java.lang.Integer numValueOf;
        int i = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.a;
                return new defpackage.sbg((android.content.Context) this.a);
            case 1:
                defpackage.jqk jqkVar = (defpackage.jqk) this.a;
                if (!jqkVar.i.f()) {
                    return jqkVar.b.c(jqkVar.h) ? jqkVar.j : new jqp();
                }
                jqkVar.p();
                defpackage.jnt jntVar = jqkVar.k;
                int callingUid = android.os.Binder.getCallingUid();
                boolean z = false;
                if (android.os.Process.myUid() == callingUid) {
                    int i2 = defpackage.ygw.d;
                    java.lang.Object[] objArr = {"com.google.android.projection.gearhead"};
                    defpackage.ysr.B(objArr, 1);
                    jntVar.b(new defpackage.yne(new defpackage.ymx(objArr, 1), defpackage.ymn.a), true);
                } else {
                    java.util.SortedSet sortedSet = (java.util.SortedSet) jntVar.b.get(java.lang.Integer.valueOf(callingUid));
                    if (sortedSet == null) {
                        java.lang.String[] packagesForUid = jntVar.c.getPackageManager().getPackagesForUid(callingUid);
                        if (packagesForUid != null) {
                            defpackage.yii yiiVarW = defpackage.yii.w(defpackage.ymn.a, packagesForUid.length, (java.lang.Comparable[]) packagesForUid.clone());
                            try {
                                defpackage.yot it = ((defpackage.yne) yiiVarW).iterator();
                                boolean zBv = false;
                                do {
                                    try {
                                        if (it.hasNext()) {
                                            try {
                                                zBv = jntVar.d.bv((java.lang.String) it.next(), defpackage.qqe.e.ordinal());
                                            } catch (android.os.RemoteException e) {
                                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.jnt.a.h()).p(e)).ai(2410)).u("Failure while checking if package is allowed.");
                                                zBv = false;
                                            }
                                            numValueOf = java.lang.Integer.valueOf(callingUid);
                                        } else {
                                            jntVar.b(yiiVarW, zBv);
                                        }
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        z = zBv;
                                        jntVar.b(yiiVarW, z);
                                        throw th;
                                    }
                                    break;
                                } while (!zBv);
                                ((defpackage.yqj) defpackage.jnt.a.l().ai(2409)).w("Allowing call from UID %d", callingUid);
                                jntVar.b.put(numValueOf, yiiVarW);
                                jntVar.b(yiiVarW, true);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                        }
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.jnt.a.h()).ai((char) 2407)).w("Call from UID %d is not allowed.", callingUid);
                        throw new java.lang.SecurityException("Caller is not allowed");
                    }
                    jntVar.b(sortedSet, true);
                }
                return jqkVar.j;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar2 = com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.a;
                return new defpackage.rhc((android.content.Context) this.a, new defpackage.ydk(i));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.oiw(((defpackage.oix) this.a).b);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.roy(this.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.v));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.ac));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.ad));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.ae));
            case 9:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.af));
            case 10:
                return java.lang.Integer.valueOf(((defpackage.ref) this.a).B("projected_presentation_config_max_checks", 10));
            case 11:
                return java.lang.Integer.valueOf(((defpackage.ref) this.a).B("projected_presentation_config_check_delay", 20));
            case 12:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.G));
            case 13:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.V));
            case 14:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.X));
            case 15:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.Y));
            case 16:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.aa));
            case 17:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.I));
            case 18:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.K));
            case 19:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.F));
            default:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).p(defpackage.rbf.ab));
        }
    }
}
