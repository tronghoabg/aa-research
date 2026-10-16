package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rkc {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public rkc(byte[] bArr) {
        this.a = new java.util.ArrayList(200);
        this.b = new java.util.ArrayList(4);
    }

    private final synchronized void i(int i) {
        java.lang.Object obj = this.a;
        if (((android.util.SparseIntArray) obj).indexOfKey(i) >= 0) {
            ((android.util.SparseArray) this.b).delete(((android.util.SparseIntArray) obj).get(i));
            ((android.util.SparseIntArray) obj).delete(i);
        }
    }

    public final com.google.android.gms.car.RadioProgramSelector a() {
        return new com.google.android.gms.car.RadioProgramSelector((com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier) this.b, ((defpackage.ygr) this.a).g());
    }

    public final java.lang.Object b() {
        synchronized (this.a) {
        }
        return this.b;
    }

    public final boolean c() {
        return ((defpackage.qdl) this.a).a((android.content.Context) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void d(java.lang.Object obj, uak uakVar) {
        java.lang.Object objH = ((plv) this.b).h(obj);
        if (objH != null) {
            uakVar.a(objH);
            return;
        }
        ?? r1 = this.a;
        synchronized (r1) {
            java.util.Collection arrayList = (java.util.Collection) r1.get(obj);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                r1.put(obj, arrayList);
            }
            arrayList.add(uakVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void e(java.lang.Object obj, java.lang.Object obj2) {
        ((plv) this.b).n(obj, obj2);
        ?? r2 = this.a;
        synchronized (r2) {
            if (r2.containsKey(obj)) {
                java.util.Iterator it = ((java.util.Collection) r2.get(obj)).iterator();
                while (it.hasNext()) {
                    ((uak) it.next()).a(obj2);
                }
                r2.remove(obj);
            }
        }
    }

    public final synchronized txe f(abdv abdvVar) {
        return (txe) ((android.util.SparseArray) this.b).get(java.lang.System.identityHashCode(abdvVar));
    }

    public final synchronized void g(abdv abdvVar, txe txeVar) {
        ((android.util.SparseArray) this.b).put(java.lang.System.identityHashCode(abdvVar), txeVar);
    }

    public final synchronized void h(abdv abdvVar) {
        int iIdentityHashCode = java.lang.System.identityHashCode(abdvVar);
        i(iIdentityHashCode);
        ((android.util.SparseArray) this.b).delete(iIdentityHashCode);
    }

    public rkc(java.lang.Object obj) {
        this.a = new java.lang.Object();
        this.b = obj;
    }

    public rkc(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public rkc(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public rkc(qnc qncVar) {
        this.b = qncVar;
        this.a = new qnv();
    }

    public rkc(android.content.Context context, defpackage.qdl qdlVar) {
        if (context == null || qdlVar == null) {
            throw null;
        }
        this.b = context;
        this.a = qdlVar;
    }

    public rkc(com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier) {
        this.a = new defpackage.ygr(4);
        this.b = radioProgramIdentifier;
    }

    public rkc() {
        this.b = "c";
        this.a = "d";
    }

    public rkc(char[] cArr) {
        this.b = new android.util.SparseArray();
        this.a = new android.util.SparseIntArray();
    }

    public rkc(android.content.Context context) {
        defpackage.sqs.aA(context);
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.sqs.aB(applicationContext, "Application context can't be null");
        this.b = applicationContext;
        this.a = applicationContext;
    }

    public rkc(uar uarVar) {
        this.a = new java.util.HashMap();
        this.b = uarVar;
    }
}
