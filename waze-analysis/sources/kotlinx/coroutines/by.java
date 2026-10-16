package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class by implements bl {

    /* renamed from: a, reason: collision with root package name */
    private final ck f51775a;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.a.d f51777c;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.a f51776b = h.e.b.e(false);

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.a.d f51778d = h.e.b.h(null);

    public by(ck ckVar, Throwable th) {
        this.f51775a = ckVar;
        this.f51777c = h.e.b.h(th);
    }

    private final Object j() {
        return this.f51778d.b();
    }

    private final void k(Object obj) {
        this.f51778d.d(obj);
    }

    @Override // kotlinx.coroutines.bl
    public final ck bL() {
        return this.f51775a;
    }

    @Override // kotlinx.coroutines.bl
    public final boolean bM() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) this.f51777c.b();
    }

    public final List d(Throwable th) {
        ArrayList arrayList;
        Object objJ = j();
        if (objJ == null) {
            arrayList = new ArrayList(4);
        } else if (objJ instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objJ);
            arrayList = arrayList2;
        } else {
            if (!(objJ instanceof ArrayList)) {
                Objects.toString(objJ);
                throw new IllegalStateException("State is ".concat(objJ.toString()));
            }
            arrayList = (ArrayList) objJ;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th != null && !h.g.b.x.n(th, thC)) {
            arrayList.add(th);
        }
        k(cg.f51805e);
        return arrayList;
    }

    public final void e(Throwable th) {
        Throwable thC = c();
        if (thC == null) {
            this.f51777c.d(th);
            return;
        }
        if (th == thC) {
            return;
        }
        Object objJ = j();
        if (objJ == null) {
            k(th);
            return;
        }
        if (!(objJ instanceof Throwable)) {
            if (objJ instanceof ArrayList) {
                ((ArrayList) objJ).add(th);
                return;
            } else {
                Objects.toString(objJ);
                throw new IllegalStateException("State is ".concat(objJ.toString()));
            }
        }
        if (th != objJ) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(objJ);
            arrayList.add(th);
            k(arrayList);
        }
    }

    public final boolean f() {
        return c() != null;
    }

    public final boolean g() {
        return this.f51776b.c();
    }

    public final boolean h() {
        return j() == cg.f51805e;
    }

    public final void i() {
        this.f51776b.a(true);
    }

    public final String toString() {
        return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + c() + ", exceptions=" + j() + ", list=" + this.f51775a + "]";
    }
}
