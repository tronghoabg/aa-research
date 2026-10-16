package android.support.v4.app;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bu implements br {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f192a;

    /* renamed from: b, reason: collision with root package name */
    private final String f193b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f194c;

    bu(bv bvVar, String str, int i2) {
        this.f194c = i2;
        this.f192a = bvVar;
        this.f193b = str;
    }

    @Override // android.support.v4.app.br
    public final boolean k(ArrayList arrayList, ArrayList arrayList2) {
        int i2 = this.f194c;
        if (i2 == 0) {
            return this.f192a.aS(arrayList, arrayList2, this.f193b);
        }
        bv bvVar = this.f192a;
        if (i2 != 1) {
            return bvVar.aT(arrayList, arrayList2, this.f193b);
        }
        String str = this.f193b;
        if (bvVar.aS(arrayList, arrayList2, str)) {
            return bvVar.aQ(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }
}
