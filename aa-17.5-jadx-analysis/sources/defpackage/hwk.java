package defpackage;

/* loaded from: classes2.dex */
public final class hwk implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public hwk(Object obj, Object obj2, int i) {
        this.b = i;
        this.a = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [iel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [iel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [iel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        hvs hvsVar;
        int i = this.b;
        if (i == 0) {
            ?? r0 = this.c;
            synchronized (r0.a()) {
                Object obj = this.a;
                synchronized (obj) {
                    if (((hwn) obj).a.c(r0)) {
                        ((hwn) obj).j.d();
                        try {
                            r0.d(((hwn) obj).j, ((hwn) obj).l);
                            ((hwn) this.a).g(this.c);
                        } finally {
                        }
                    }
                    ((hwn) this.a).c();
                }
            }
            return;
        }
        if (i == 1) {
            ?? r02 = this.c;
            synchronized (r02.a()) {
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (((hwn) obj2).a.c(r02)) {
                        try {
                            ((iem) r02).g(((hwn) obj2).h);
                        } finally {
                        }
                    }
                    ((hwn) obj2).c();
                }
            }
            return;
        }
        Object obj3 = this.a;
        Object obj4 = ((xvs) obj3).e;
        ?? r5 = this.c;
        synchronized (obj4) {
            try {
                ((xvs) obj3).f = (xvp) wub.af(r5);
                throw null;
            } catch (Exception unused) {
                xvr xvrVar = ((xvs) obj3).g;
                if (xvrVar != null && xvrVar.a == r5) {
                    ((xvs) obj3).g = null;
                }
            } catch (Throwable th) {
                xvr xvrVar2 = ((xvs) obj3).g;
                if (xvrVar2 != null && xvrVar2.a == r5) {
                    ((xvs) obj3).g = null;
                }
                throw th;
            }
        }
    }
}
