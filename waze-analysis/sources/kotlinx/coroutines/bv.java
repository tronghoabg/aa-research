package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class bv extends kotlinx.coroutines.e.z implements ax, bl {

    /* renamed from: c, reason: collision with root package name */
    public cf f51769c;

    public abstract void a(Throwable th);

    @Override // kotlinx.coroutines.bl
    public final ck bL() {
        return null;
    }

    @Override // kotlinx.coroutines.bl
    public final boolean bM() {
        return true;
    }

    public abstract boolean c();

    @Override // kotlinx.coroutines.ax
    public final void dispose() {
        e().K(this);
    }

    public final cf e() {
        cf cfVar = this.f51769c;
        if (cfVar != null) {
            return cfVar;
        }
        h.g.b.x.j("job");
        return null;
    }

    @Override // kotlinx.coroutines.e.z
    public final String toString() {
        return aj.a(this) + "@" + aj.b(this) + "[job@" + aj.b(e()) + "]";
    }
}
