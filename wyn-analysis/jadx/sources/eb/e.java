package eb;

import android.util.SparseArray;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.q;
import java.util.Iterator;
import lc.C3458b;
import lc.InterfaceC3457a;

/* loaded from: classes4.dex */
public final class e implements InterfaceC3457a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34631b;

    public /* synthetic */ e(Object obj, int i5) {
        this.f34630a = i5;
        this.f34631b = obj;
    }

    @Override // lc.InterfaceC3457a
    public final void a() {
        switch (this.f34630a) {
            case 0:
                ((f) this.f34631b).f34633b.B();
                break;
            default:
                C3458b c3458b = (C3458b) this.f34631b;
                Iterator it = c3458b.f40269t.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3457a) it.next()).a();
                }
                while (true) {
                    q qVar = c3458b.f40267r;
                    SparseArray sparseArray = qVar.k;
                    if (sparseArray.size() <= 0) {
                        while (true) {
                            p pVar = c3458b.f40268s;
                            SparseArray sparseArray2 = pVar.f37125i;
                            if (sparseArray2.size() <= 0) {
                                c3458b.k.f43849f = null;
                                break;
                            } else {
                                pVar.f37131p.e(sparseArray2.keyAt(0));
                            }
                        }
                    } else {
                        qVar.f37153v.e(sparseArray.keyAt(0));
                    }
                }
        }
    }

    @Override // lc.InterfaceC3457a
    public final void b() {
        int i5 = this.f34630a;
    }

    private final void c() {
    }

    private final void d() {
    }
}
