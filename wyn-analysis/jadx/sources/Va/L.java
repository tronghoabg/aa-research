package Va;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class L extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13509c = 1;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ V f13510d;

    public /* synthetic */ L() {
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f13509c) {
            case 0:
                C1169v c1169v = new C1169v(8);
                c1169v.f14690d = this;
                Cb.g(c1169v);
                return;
            default:
                V v2 = this.f13510d;
                int i5 = V.f13769p + 53;
                V.f13770q = i5 % 128;
                int i10 = i5 % 2;
                ArrayList arrayListE = v2.e();
                if (i10 == 0) {
                    int i11 = 27 / 0;
                }
                int i12 = V.f13769p + 7;
                V.f13770q = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 87 / 0;
                }
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    ((B7) it.next()).q();
                }
                List listT = V.t(this.f13510d);
                if (listT != null) {
                    ((ArrayList) listT).clear();
                }
                V v10 = this.f13510d;
                V.f13769p = (V.f13770q + 99) % 128;
                v10.f13773c = null;
                int i14 = (V.f13770q + 83) % 128;
                V.f13769p = i14;
                V v11 = this.f13510d;
                int i15 = i14 + 73;
                V.f13770q = i15 % 128;
                int i16 = i15 % 2;
                v11.f13778h = null;
                if (i16 == 0) {
                    throw null;
                }
                return;
        }
    }

    public L(V v2) {
        this.f13510d = v2;
    }
}
