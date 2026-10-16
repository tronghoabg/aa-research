package od;

import java.util.LinkedHashSet;

/* renamed from: od.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3667B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I0 f41486b;

    public /* synthetic */ RunnableC3667B(I0 i02, int i5) {
        this.f41485a = i5;
        this.f41486b = i02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41485a) {
            case 0:
                this.f41486b.f41594f.b();
                break;
            default:
                I0 i02 = this.f41486b;
                LinkedHashSet linkedHashSet = i02.f41601n.f41613d.f41654B;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(i02);
                    J0 j02 = i02.f41601n;
                    if (j02.f41613d.f41654B.isEmpty()) {
                        M0 m02 = j02.f41613d;
                        m02.f41677Z.W(m02.f41655C, false);
                        M0 m03 = j02.f41613d;
                        m03.f41654B = null;
                        if (m03.f41659G.get()) {
                            j02.f41613d.f41658F.h(M0.f41648g0);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
