package A;

import A7.C0237b0;
import Ef.C0502n;
import Hf.x0;
import N.C0722f;
import N.C0724g;
import N.ChoreographerFrameCallbackC0747v;
import N.EnumC0731j0;
import N.p0;
import ef.C2515C;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class W extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f93j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i5, Object obj, Object obj2) {
        super(1);
        this.f92i = i5;
        this.f93j = obj;
        this.k = obj2;
    }

    private final Object a(Object obj) {
        C0724g c0724g = (C0724g) this.f93j;
        Object obj2 = c0724g.f7768b;
        C0722f c0722f = (C0722f) this.k;
        synchronized (obj2) {
            c0724g.f7770d.remove(c0722f);
            if (c0724g.f7770d.isEmpty()) {
                c0724g.f7772f.set(0);
            }
        }
        return C2515C.f34653a;
    }

    private final Object b(Object obj) {
        C0237b0 c0237b0 = (C0237b0) this.f93j;
        Object obj2 = c0237b0.f813c;
        C0502n c0502n = (C0502n) this.k;
        synchronized (obj2) {
            ((ArrayList) c0237b0.f814d).remove(c0502n);
        }
        return C2515C.f34653a;
    }

    private final Object c(Object obj) {
        Throwable th = (Throwable) obj;
        p0 p0Var = (p0) this.f93j;
        Object obj2 = p0Var.f7883b;
        Throwable th2 = (Throwable) this.k;
        synchronized (obj2) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                try {
                    if (th instanceof CancellationException) {
                        th = null;
                    }
                    if (th != null) {
                        Fe.b.d(th2, th);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            p0Var.f7885d = th2;
            x0 x0Var = p0Var.f7897q;
            EnumC0731j0 enumC0731j0 = EnumC0731j0.f7793a;
            x0Var.getClass();
            x0Var.k(null, enumC0731j0);
        }
        return C2515C.f34653a;
    }

    private final Object d(Object obj) {
        u0.B b5 = (u0.B) this.f93j;
        ChoreographerFrameCallbackC0747v choreographerFrameCallbackC0747v = (ChoreographerFrameCallbackC0747v) this.k;
        synchronized (b5.f46084d) {
            b5.f46086f.remove(choreographerFrameCallbackC0747v);
        }
        return C2515C.f34653a;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f2  */
    @Override // tf.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.W.invoke(java.lang.Object):java.lang.Object");
    }
}
