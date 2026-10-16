package b2;

import A.C0230x;
import Q1.x;
import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1502a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f19145a;

    public C1502a(c cVar) {
        this.f19145a = cVar;
    }

    @Override // b2.q
    public final boolean a(Uri uri, C0230x c0230x, boolean z2) {
        HashMap map;
        b bVar;
        c cVar = this.f19145a;
        if (cVar.f19168l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f19167j;
            int i5 = x.f9724a;
            List list = lVar.f19222e;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = list.size();
                map = cVar.f19161d;
                if (i10 >= size) {
                    break;
                }
                b bVar2 = (b) map.get(((k) list.get(i10)).f19214a);
                if (bVar2 != null && jElapsedRealtime < bVar2.f19153h) {
                    i11++;
                }
                i10++;
            }
            F6.p pVar = new F6.p(1, 0, cVar.f19167j.f19222e.size(), i11);
            cVar.f19160c.getClass();
            U5.f fVarF = ae.d.f(pVar, c0230x);
            if (fVarF != null && fVarF.f12344a == 2 && (bVar = (b) map.get(uri)) != null) {
                b.a(bVar, fVarF.f12345b);
            }
        }
        return false;
    }

    @Override // b2.q
    public final void g() {
        this.f19145a.f19162e.remove(this);
    }
}
