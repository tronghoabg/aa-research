package Va;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: Va.b1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0912b1 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14020a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ C1196x1 f14021b;

    public /* synthetic */ C0912b1(int i5) {
        this.f14020a = i5;
    }

    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        switch (this.f14020a) {
            case 0:
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) arrayList.get(0);
                C1196x1.f14762U = (C1196x1.f14761T + 117) % 128;
                C1196x1 c1196x1 = this.f14021b;
                c1196x1.getClass();
                C1184w1 c1184w1 = new C1184w1(c1196x1, threadPoolExecutor, ra2);
                int i5 = (C1196x1.f14762U + 95) % 128;
                C1196x1.f14761T = i5;
                int i10 = i5 + 57;
                C1196x1.f14762U = i10 % 128;
                if (i10 % 2 != 0) {
                    return c1184w1;
                }
                throw null;
            default:
                HashMap map = (HashMap) arrayList.get(0);
                C1196x1.f14762U = (C1196x1.f14761T + 71) % 128;
                C1196x1 c1196x12 = this.f14021b;
                c1196x12.getClass();
                C1171v1 c1171v1 = new C1171v1(c1196x12, map, ra2);
                int i11 = (C1196x1.f14762U + 77) % 128;
                C1196x1.f14761T = i11;
                int i12 = i11 + 61;
                C1196x1.f14762U = i12 % 128;
                if (i12 % 2 != 0) {
                    return c1171v1;
                }
                throw null;
        }
    }
}
