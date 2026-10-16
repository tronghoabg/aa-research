package Q0;

import R0.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f9656q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f9657r0 = 0;

    public final void R(int i5, n nVar, ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f9657r0; i10++) {
            d dVar = this.f9656q0[i10];
            ArrayList arrayList2 = nVar.f10075a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i11 = 0; i11 < this.f9657r0; i11++) {
            R0.h.b(this.f9656q0[i11], i5, arrayList, nVar);
        }
    }

    public void S() {
    }
}
