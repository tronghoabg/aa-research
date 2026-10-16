package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class bd implements Runnable, Comparable, ax, kotlinx.coroutines.e.at {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    private int f51749a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f51750b;

    public bd(long j2) {
        this.f51750b = j2;
    }

    @Override // kotlinx.coroutines.e.at
    public final int a() {
        return this.f51749a;
    }

    public final int b(long j2, be beVar, bf bfVar) {
        synchronized (this) {
            if (this._heap == bg.f51755a) {
                return 2;
            }
            be beVar2 = beVar;
            bd bdVar = this;
            synchronized (beVar2) {
                bd bdVar2 = (bd) beVar2.b();
                if (bfVar.y()) {
                    return 1;
                }
                if (bdVar2 == null) {
                    beVar.f51751a = j2;
                } else {
                    long j3 = bdVar2.f51750b;
                    if (j3 - j2 < 0) {
                        j2 = j3;
                    }
                    long j4 = beVar.f51751a;
                    if (j2 - j4 > 0) {
                        beVar.f51751a = j2;
                    } else {
                        j2 = j4;
                    }
                }
                if (this.f51750b - j2 < 0) {
                    this.f51750b = j2;
                }
                beVar2.e(bdVar);
                return 0;
            }
        }
    }

    @Override // kotlinx.coroutines.e.at
    public final kotlinx.coroutines.e.as c() {
        Object obj = this._heap;
        if (obj instanceof kotlinx.coroutines.e.as) {
            return (kotlinx.coroutines.e.as) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j2 = this.f51750b - ((bd) obj).f51750b;
        if (j2 > 0) {
            return 1;
        }
        return j2 >= 0 ? 0 : -1;
    }

    @Override // kotlinx.coroutines.e.at
    public final void d(kotlinx.coroutines.e.as asVar) {
        if (this._heap == bg.f51755a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = asVar;
    }

    @Override // kotlinx.coroutines.ax
    public final void dispose() {
        synchronized (this) {
            Object obj = this._heap;
            if (obj != bg.f51755a) {
                be beVar = obj instanceof be ? (be) obj : null;
                if (beVar != null) {
                    bd bdVar = this;
                    synchronized (beVar) {
                        if (bdVar.c() != null) {
                            int iA = bdVar.a();
                            int i2 = ai.f51347a;
                            beVar.d(iA);
                        }
                    }
                }
                this._heap = bg.f51755a;
            }
        }
    }

    @Override // kotlinx.coroutines.e.at
    public final void e(int i2) {
        this.f51749a = i2;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f51750b + "]";
    }
}
