package defpackage;

/* loaded from: classes2.dex */
public abstract class aiuv implements Runnable, Comparable, aiuo, ajdf {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public aiuv(long j) {
        this.b = j;
    }

    @Override // defpackage.ajdf
    public final int b() {
        return this.a;
    }

    @Override // defpackage.ajdf
    public final ajde c() {
        Object obj = this._heap;
        if (obj instanceof ajde) {
            return (ajde) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((aiuv) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.ajdf
    public final void d(ajde ajdeVar) {
        if (this._heap == aiuy.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = ajdeVar;
    }

    @Override // defpackage.ajdf
    public final void e(int i) {
        this.a = i;
    }

    @Override // defpackage.aiuo
    public final void hy() {
        synchronized (this) {
            Object obj = this._heap;
            if (obj != aiuy.a) {
                aiuw aiuwVar = obj instanceof aiuw ? (aiuw) obj : null;
                if (aiuwVar != null) {
                    synchronized (aiuwVar) {
                        if (c() != null) {
                            int iB = b();
                            boolean z = aitz.a;
                            aiuwVar.d(iB);
                        }
                    }
                }
                this._heap = aiuy.a;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
