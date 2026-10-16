package android.support.v4.app;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bs implements br {

    /* renamed from: a, reason: collision with root package name */
    final String f187a;

    /* renamed from: b, reason: collision with root package name */
    final int f188b;

    /* renamed from: c, reason: collision with root package name */
    final int f189c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bv f190d;

    bs(bv bvVar, String str, int i2, int i3) {
        this.f190d = bvVar;
        this.f187a = str;
        this.f188b = i2;
        this.f189c = i3;
    }

    @Override // android.support.v4.app.br
    public final boolean k(ArrayList arrayList, ArrayList arrayList2) {
        bv bvVar = this.f190d;
        ar arVar = bvVar.f200f;
        if (arVar == null || this.f188b >= 0 || this.f187a != null || !arVar.getChildFragmentManager().aP()) {
            return bvVar.aQ(arrayList, arrayList2, this.f187a, this.f188b, this.f189c);
        }
        return false;
    }
}
