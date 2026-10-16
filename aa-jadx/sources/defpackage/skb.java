package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class skb {
    private static volatile defpackage.skb c;
    public int a;
    public final java.lang.Object b;

    public skb(byte[] bArr, byte[] bArr2) {
        this.a = 300;
        defpackage.zo zoVar = defpackage.zp.a;
        this.b = new defpackage.zo(6);
    }

    public static defpackage.skb b() {
        if (c == null) {
            synchronized (defpackage.skb.class) {
                if (c == null) {
                    c = new defpackage.skb();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized void i(java.lang.String str, int i, int i2, com.google.android.gms.clearcut.internal.LogErrorParcelable logErrorParcelable) {
        if (i != 1002) {
            defpackage.dzp dzpVar = new defpackage.dzp(str, java.lang.Integer.valueOf(i));
            ?? r1 = this.b;
            com.google.android.gms.clearcut.internal.LogErrorParcelable logErrorParcelable2 = (com.google.android.gms.clearcut.internal.LogErrorParcelable) r1.get(dzpVar);
            if (logErrorParcelable2 != null) {
                logErrorParcelable2.c = defpackage.ysr.cO(((long) logErrorParcelable2.c) + ((long) i2));
                return;
            } else if (((defpackage.aba) r1).d < 100) {
                if (logErrorParcelable == null) {
                    logErrorParcelable = new com.google.android.gms.clearcut.internal.LogErrorParcelable(str, i, i2);
                }
                r1.put(dzpVar, logErrorParcelable);
                return;
            }
        }
        this.a = defpackage.ysr.cO(((long) this.a) + ((long) i2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable a() {
        java.util.ArrayList arrayList;
        ?? r0 = this.b;
        arrayList = new java.util.ArrayList(r0.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new com.google.android.gms.clearcut.internal.LogErrorParcelable("UNKNOWN", 1002, i));
            this.a = 0;
        }
        r0.clear();
        return new com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable(arrayList);
    }

    public final synchronized void c(com.google.android.gms.clearcut.internal.LogErrorParcelable logErrorParcelable) {
        i(logErrorParcelable.a, logErrorParcelable.b, logErrorParcelable.c, logErrorParcelable);
    }

    public final void d(int i, android.content.Context context) {
        if (defpackage.addq.a.fF().a(context)) {
            e("UNKNOWN", i);
        }
    }

    public final synchronized void e(java.lang.String str, int i) {
        i(str, i, 1, null);
    }

    public final java.lang.Object f() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        java.lang.Object[] objArr = (java.lang.Object[]) this.b;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void g(java.lang.Object obj) {
        int i = this.a;
        if (i < 256) {
            ((java.lang.Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public final defpackage.afq h(java.lang.Object obj, int i) {
        defpackage.afq afqVar = new defpackage.afq(obj, defpackage.afc.d);
        ((defpackage.zo) this.b).g(i, afqVar);
        return afqVar;
    }

    public skb(int i) {
        this.b = new java.util.LinkedList();
        this.a = i;
    }

    public skb(byte[] bArr) {
        this.b = new java.lang.Object[256];
    }

    private skb() {
        this.a = 0;
        this.b = new defpackage.zd();
    }
}
