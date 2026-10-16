package od;

import Va.Y7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J0 f41580b;

    public /* synthetic */ H0(J0 j02, int i5) {
        this.f41579a = i5;
        this.f41580b = j02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.f41579a) {
            case 0:
                J0 j02 = this.f41580b;
                if (j02.f41613d.f41654B == null) {
                    AtomicReference atomicReference = j02.f41610a;
                    if (atomicReference.get() == M0.f41651j0) {
                        atomicReference.set(null);
                    }
                    j02.f41613d.f41658F.h(M0.f41648g0);
                    return;
                }
                return;
            case 1:
                if (this.f41580b.f41610a.get() == M0.f41651j0) {
                    this.f41580b.f41610a.set(null);
                }
                LinkedHashSet linkedHashSet = this.f41580b.f41613d.f41654B;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((I0) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                Y7 y72 = this.f41580b.f41613d.f41658F;
                md.k0 k0Var = M0.f41647f0;
                y72.h(k0Var);
                synchronized (y72.f13867a) {
                    arrayList = new ArrayList((HashSet) y72.f13868b);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((r) it2.next()).g(k0Var);
                }
                ((M0) y72.f13870d).f41657E.a(k0Var);
                return;
            default:
                this.f41580b.f41613d.s();
                return;
        }
    }
}
