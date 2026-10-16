package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aivu implements java.lang.Runnable, java.lang.Comparable, defpackage.aivn, defpackage.ajef {
    public volatile java.lang.Object _heap;
    private int a = -1;
    public long b;

    public aivu(long j) {
        this.b = j;
    }

    @Override // defpackage.ajef
    public final int b() {
        return this.a;
    }

    @Override // defpackage.ajef
    public final defpackage.ajee c() {
        java.lang.Object obj = this._heap;
        if (obj instanceof defpackage.ajee) {
            return (defpackage.ajee) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        long j = this.b - ((defpackage.aivu) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.ajef
    public final void d(defpackage.ajee ajeeVar) {
        if (this._heap == defpackage.aivx.a) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        this._heap = ajeeVar;
    }

    @Override // defpackage.ajef
    public final void e(int i) {
        this.a = i;
    }

    @Override // defpackage.aivn
    public final void gK() {
        synchronized (this) {
            java.lang.Object obj = this._heap;
            if (obj != defpackage.aivx.a) {
                defpackage.aivv aivvVar = obj instanceof defpackage.aivv ? (defpackage.aivv) obj : null;
                if (aivvVar != null) {
                    synchronized (aivvVar) {
                        if (c() != null) {
                            int iB = b();
                            boolean z = defpackage.aiuy.a;
                            aivvVar.d(iB);
                        }
                    }
                }
                this._heap = defpackage.aivx.a;
            }
        }
    }

    public java.lang.String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
