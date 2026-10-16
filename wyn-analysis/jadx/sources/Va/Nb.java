package Va;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class Nb extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13554c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ C0921ba f13555d;

    public /* synthetic */ Nb(int i5) {
        this.f13554c = i5;
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f13554c) {
            case 0:
                C0921ba c0921ba = this.f13555d;
                ArrayList arrayList = new ArrayList(C0921ba.q(c0921ba).values());
                C0921ba.q(c0921ba).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1001i) it.next()).E();
                }
                return;
            case 1:
                C0921ba c0921ba2 = this.f13555d;
                ArrayList arrayList2 = new ArrayList(C0921ba.m(c0921ba2).values());
                C0921ba.m(c0921ba2).clear();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Tb tb = (Tb) it2.next();
                    tb.getClass();
                    int i5 = Tb.f13728t + 99;
                    Tb.f13727s = i5 % 128;
                    if (i5 % 2 != 0) {
                        tb.l(null);
                        tb.R(null);
                        C0974fb.e().k(tb);
                        throw null;
                    }
                    tb.l(null);
                    tb.R(null);
                    C0974fb.e().k(tb);
                    int i10 = Tb.f13727s + 111;
                    Tb.f13728t = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                }
                return;
            default:
                C0921ba c0921ba3 = this.f13555d;
                ArrayList arrayList3 = new ArrayList(C0921ba.b(c0921ba3).values());
                C0921ba.b(c0921ba3).clear();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ViewOnLayoutChangeListenerC0936d viewOnLayoutChangeListenerC0936d = (ViewOnLayoutChangeListenerC0936d) it3.next();
                    viewOnLayoutChangeListenerC0936d.getClass();
                    ViewOnLayoutChangeListenerC0936d.f14085o = (ViewOnLayoutChangeListenerC0936d.f14086p + 43) % 128;
                    viewOnLayoutChangeListenerC0936d.l(null);
                    Za.n().m(viewOnLayoutChangeListenerC0936d);
                    int i11 = ViewOnLayoutChangeListenerC0936d.f14086p + 21;
                    ViewOnLayoutChangeListenerC0936d.f14085o = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 3 / 0;
                    }
                }
                return;
        }
    }
}
