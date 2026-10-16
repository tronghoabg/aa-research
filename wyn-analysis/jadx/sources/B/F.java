package B;

import Ef.C0502n;
import Ef.InterfaceC0501m0;
import Hf.x0;
import N.C0744s;
import N.C0748w;
import N.ChoreographerFrameCallbackC0747v;
import N.EnumC0731j0;
import N.InterfaceC0742p;
import N.K0;
import N.p0;
import c0.C1542g;
import com.unity3d.services.UnityAdsConstants;
import e0.C2439B;
import e0.C2443F;
import e0.InterfaceC2442E;
import ef.C2515C;
import g0.InterfaceC2663d;
import h0.AbstractC2765c;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import l0.C3368a;
import l0.C3370c;
import l0.InterfaceC3369b;
import t0.C4068p;
import u0.C4185l0;
import u0.C4195s;
import u1.C4209G;
import u1.C4222k;
import x.C4421n;
import x0.AbstractC4446p;
import x0.C4435e;
import x0.C4437g;
import z.AbstractC4604i;
import z.C4600e;
import z.EnumC4601f;

/* loaded from: classes.dex */
public final class F extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1367i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1368j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(Object obj, int i5) {
        super(1);
        this.f1367i = i5;
        this.f1368j = obj;
    }

    private final Object a(Object obj) {
        int i5;
        X.k kVar = (X.k) obj;
        synchronized (X.m.f15718b) {
            i5 = X.m.f15720d;
            X.m.f15720d = i5 + 1;
        }
        return new X.f(i5, kVar, (tf.l) this.f1368j);
    }

    private final Object b(Object obj) {
        X.u uVar = (X.u) this.f1368j;
        uVar.getClass();
        synchronized (uVar.f15757f) {
            X.t tVar = uVar.f15759h;
            AbstractC3340k.b(tVar);
            Object obj2 = tVar.f15742b;
            AbstractC3340k.b(obj2);
            int i5 = tVar.f15744d;
            C4421n c4421n = tVar.f15743c;
            if (c4421n == null) {
                c4421n = new C4421n();
                tVar.f15743c = c4421n;
                tVar.f15746f.j(obj2, c4421n);
            }
            tVar.c(obj, i5, obj2, c4421n);
        }
        return C2515C.f34653a;
    }

    private final Object c(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            x0 x0Var = ((C4209G) this.f1368j).f46450g;
            C4222k c4222k = new C4222k(th);
            x0Var.getClass();
            x0Var.k(null, c4222k);
        }
        Object obj2 = C4209G.k;
        C4209G c4209g = (C4209G) this.f1368j;
        synchronized (obj2) {
            C4209G.f46443j.remove(c4209g.c().getAbsolutePath());
        }
        return C2515C.f34653a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    @Override // tf.l
    public final Object invoke(Object it) {
        Object obj = null;
        switch (this.f1367i) {
            case 0:
                c0.l focusProperties = (c0.l) it;
                AbstractC3340k.e(focusProperties, "$this$focusProperties");
                focusProperties.f19516a = (((C3368a) ((C3370c) ((InterfaceC3369b) this.f1368j)).f39843a.getValue()).f39842a == 1 ? 1 : 0) ^ 1;
                return C2515C.f34653a;
            case 1:
                E0.p it2 = (E0.p) it;
                AbstractC3340k.e(it2, "it");
                E0.l fontWeight = it2.f2805b;
                AbstractC3340k.e(fontWeight, "fontWeight");
                return ((E0.f) this.f1368j).a(new E0.p(null, fontWeight, it2.f2806c, it2.f2807d, it2.f2808e)).f2809a;
            case 2:
                Throwable th = (Throwable) it;
                J3.l lVar = (J3.l) this.f1368j;
                if (th == null) {
                    if (!lVar.f5579a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    lVar.f5579a.cancel(true);
                } else {
                    U3.j jVar = lVar.f5579a;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    jVar.j(th);
                }
                return C2515C.f34653a;
            case 3:
                ((p8.p) this.f1368j).cancel(false);
                return C2515C.f34653a;
            case 4:
                L0.b it3 = (L0.b) it;
                AbstractC3340k.e(it3, "it");
                ((t0.t) this.f1368j).B(it3);
                return C2515C.f34653a;
            case 5:
                C0748w.f7943b.removeFrameCallback((ChoreographerFrameCallbackC0747v) this.f1368j);
                return C2515C.f34653a;
            case 6:
                Throwable th2 = (Throwable) it;
                CancellationException cancellationExceptionA = Ef.H.a("Recomposer effect job completed", th2);
                p0 p0Var = (p0) this.f1368j;
                synchronized (p0Var.f7883b) {
                    try {
                        InterfaceC0501m0 interfaceC0501m0 = p0Var.f7884c;
                        if (interfaceC0501m0 != null) {
                            x0 x0Var = p0Var.f7897q;
                            EnumC0731j0 enumC0731j0 = EnumC0731j0.f7794b;
                            x0Var.getClass();
                            x0Var.k(null, enumC0731j0);
                            x0 x0Var2 = p0.f7880u;
                            interfaceC0501m0.cancel(cancellationExceptionA);
                            p0Var.f7895o = null;
                            interfaceC0501m0.invokeOnCompletion(new A.W(14, p0Var, th2));
                        } else {
                            p0Var.f7885d = cancellationExceptionA;
                            x0 x0Var3 = p0Var.f7897q;
                            EnumC0731j0 enumC0731j02 = EnumC0731j0.f7793a;
                            x0Var3.getClass();
                            x0Var3.k(null, enumC0731j02);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return C2515C.f34653a;
            case 7:
                ((C0744s) this.f1368j).v(it);
                return C2515C.f34653a;
            case 8:
                ?? r12 = this.f1368j;
                int size = r12.size();
                while (i < size) {
                    ((tf.l) r12.get(i)).invoke(it);
                    i++;
                }
                return C2515C.f34653a;
            case 9:
                return a(it);
            case 10:
                return b(it);
            case 11:
                ((a4.f) this.f1368j).k = true;
                return C2515C.f34653a;
            case 12:
                C1542g destination = (C1542g) it;
                AbstractC3340k.e(destination, "destination");
                if (destination.equals((C1542g) this.f1368j)) {
                    return Boolean.FALSE;
                }
                if (destination.f19498b == null) {
                    throw new IllegalStateException("Move focus landed at the root.");
                }
                xg.g.M(destination);
                return Boolean.TRUE;
            case 13:
                C2439B c2439b = (C2439B) it;
                AbstractC3340k.e(c2439b, "$this$null");
                C2443F c2443f = (C2443F) this.f1368j;
                c2439b.f34325a = c2443f.f34341b;
                c2439b.f34326b = c2443f.f34342c;
                c2439b.f34327c = c2443f.f34343d;
                c2439b.f34328d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                c2439b.f34331g = c2443f.f34344e;
                c2439b.f34332h = c2443f.f34345f;
                InterfaceC2442E interfaceC2442E = c2443f.f34346g;
                AbstractC3340k.e(interfaceC2442E, "<set-?>");
                c2439b.f34333i = interfaceC2442E;
                c2439b.f34334j = c2443f.f34347h;
                c2439b.f34329e = c2443f.f34348i;
                c2439b.f34330f = c2443f.f34349j;
                return C2515C.f34653a;
            case 14:
                InterfaceC2663d interfaceC2663d = (InterfaceC2663d) it;
                AbstractC3340k.e(interfaceC2663d, "$this$null");
                ((AbstractC2765c) this.f1368j).g(interfaceC2663d);
                return C2515C.f34653a;
            case 15:
                InterfaceC2663d interfaceC2663d2 = (InterfaceC2663d) it;
                AbstractC3340k.e(interfaceC2663d2, "$this$null");
                ((i0.D) this.f1368j).f36466b.a(interfaceC2663d2);
                return C2515C.f34653a;
            case 16:
                N.C DisposableEffect = (N.C) it;
                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                return new A.X((InterfaceC0742p) this.f1368j, 5);
            case 17:
                Throwable th4 = (Throwable) it;
                p0.s sVar = (p0.s) this.f1368j;
                C0502n c0502n = sVar.f43175c;
                if (c0502n != null) {
                    c0502n.a(th4);
                }
                sVar.f43175c = null;
                return C2515C.f34653a;
            case 18:
                C4185l0 it4 = (C4185l0) it;
                AbstractC3340k.e(it4, "it");
                C4195s c4195s = (C4195s) this.f1368j;
                c4195s.getClass();
                if (it4.f46254b.contains(it4)) {
                    c4195s.f46338d.getSnapshotObserver().a(it4, c4195s.f46358y, new C4068p(it4, c4195s));
                }
                return C2515C.f34653a;
            case 19:
                N.C DisposableEffect2 = (N.C) it;
                AbstractC3340k.e(DisposableEffect2, "$this$DisposableEffect");
                return new A.X((u0.O) this.f1368j, 6);
            case 20:
                AbstractC3340k.e(it, "it");
                C2515C c2515c = C2515C.f34653a;
                ((Gf.e) this.f1368j).c(c2515c);
                return c2515c;
            case 21:
                return c(it);
            case 22:
                C4437g fakeSemanticsNode = (C4437g) it;
                AbstractC3340k.e(fakeSemanticsNode, "$this$fakeSemanticsNode");
                AbstractC4446p.b(fakeSemanticsNode, ((C4435e) this.f1368j).f47578a);
                return C2515C.f34653a;
            case 23:
                C2439B graphicsLayer = (C2439B) it;
                AbstractC3340k.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.f34327c = ((Number) ((A.O) this.f1368j).f66h.getValue()).floatValue();
                return C2515C.f34653a;
            case 24:
                C2439B graphicsLayer2 = (C2439B) it;
                AbstractC3340k.e(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.f34327c = ((Number) ((K0) this.f1368j).getValue()).floatValue();
                return C2515C.f34653a;
            default:
                A.N n10 = (A.N) it;
                AbstractC3340k.e(n10, "$this$null");
                EnumC4601f enumC4601f = EnumC4601f.f48218a;
                EnumC4601f enumC4601f2 = EnumC4601f.f48219b;
                boolean zA = n10.a(enumC4601f, enumC4601f2);
                z.n nVar = (z.n) this.f1368j;
                if (zA) {
                    C4600e c4600e = (C4600e) nVar.f48240c.getValue();
                    if (c4600e != null) {
                        obj = c4600e.f48217c;
                    }
                } else if (n10.a(enumC4601f2, EnumC4601f.f48220c)) {
                    C4600e c4600e2 = (C4600e) nVar.f48241d.getValue();
                    if (c4600e2 != null) {
                        obj = c4600e2.f48217c;
                    }
                } else {
                    obj = AbstractC4604i.f48231e;
                }
                return obj == null ? AbstractC4604i.f48231e : obj;
        }
    }
}
