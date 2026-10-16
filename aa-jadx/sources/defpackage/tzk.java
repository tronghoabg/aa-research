package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tzk implements defpackage.trs {
    private boolean a = false;
    private java.util.List b = new java.util.ArrayList();

    public final void b(java.lang.Runnable runnable) {
        boolean z;
        synchronized (this) {
            z = this.a;
            if (!z) {
                java.util.List list = this.b;
                list.getClass();
                list.add(runnable);
            }
        }
        if (z) {
            runnable.run();
        }
    }

    @Override // defpackage.trs
    public final void fy(defpackage.abia abiaVar, int i) {
        java.util.List list;
        synchronized (this) {
            list = null;
            if (!this.a) {
                java.util.List list2 = this.b;
                this.b = null;
                list = list2;
            }
            this.a = true;
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }
}
