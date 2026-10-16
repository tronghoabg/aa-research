package B3;

import D.e;
import D.f;
import D.h;
import D.j;
import D.k;
import D3.i;
import Gf.s;
import Gf.t;
import Hf.InterfaceC0592c0;
import Hf.InterfaceC0603m;
import Hf.x0;
import X.p;
import com.moloco.sdk.internal.publisher.V;
import com.moloco.sdk.internal.publisher.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2002l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o;
import ea.C2480D;
import ea.C2500o;
import ef.C2515C;
import ef.C2537u;
import jf.InterfaceC3103c;
import u0.C4165b0;

/* loaded from: classes.dex */
public final class a implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1575b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f1574a = i5;
        this.f1575b = obj;
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        l lVar;
        switch (this.f1574a) {
            case 0:
                ((i) this.f1575b).accept(obj);
                break;
            case 1:
                h hVar = (h) obj;
                boolean z2 = hVar instanceof e;
                p pVar = (p) this.f1575b;
                if (z2) {
                    pVar.add(hVar);
                } else if (hVar instanceof f) {
                    pVar.remove(((f) hVar).f2244a);
                } else if (hVar instanceof D.a) {
                    pVar.add(hVar);
                } else if (hVar instanceof D.b) {
                    pVar.remove(((D.b) hVar).f2237a);
                } else if (hVar instanceof k) {
                    pVar.add(hVar);
                } else if (hVar instanceof D.l) {
                    pVar.remove(((D.l) hVar).f2251a);
                } else if (hVar instanceof j) {
                    pVar.remove(((j) hVar).f2249a);
                }
                break;
            case 2:
                ((V) this.f1575b).f28970y.b();
                break;
            case 3:
                Object objI = ((s) ((t) this.f1575b)).f4839d.i(new C2537u(((C2537u) obj).f34686a), interfaceC3103c);
                if (objI != kf.a.f39711a) {
                    break;
                }
                break;
            case 4:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i adShowListener = ((C2002l) this.f1575b).getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.b();
                }
                break;
            case 5:
                ((i0) this.f1575b).b();
                break;
            case 6:
                if (!((Boolean) obj).booleanValue() && (lVar = ((o) this.f1575b).f30918h) != null) {
                    lVar.f30903a = true;
                }
                break;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((x0) this.f1575b).k(null, bool);
                break;
            case 8:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                x0 x0Var = (x0) ((InterfaceC0592c0) this.f1575b);
                x0Var.getClass();
                x0Var.k(null, bool2);
                break;
            case 9:
                ((C2480D) this.f1575b).f34452c.set((C2500o) obj);
                break;
            default:
                ((C4165b0) this.f1575b).f46199a.setValue(Float.valueOf(((Number) obj).floatValue()));
                break;
        }
        return C2515C.f34653a;
    }
}
