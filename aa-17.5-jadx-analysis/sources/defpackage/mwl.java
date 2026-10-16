package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class mwl implements afeh {
    final /* synthetic */ bbt a;
    final /* synthetic */ cfy b;
    final /* synthetic */ boolean c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ afec h;

    public mwl(bbt bbtVar, cfy cfyVar, boolean z, long j, boolean z2, int i, boolean z3, afec afecVar) {
        this.a = bbtVar;
        this.b = cfyVar;
        this.c = z;
        this.d = j;
        this.e = z2;
        this.f = i;
        this.g = z3;
        this.h = afecVar;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((cjv) obj).a;
        bux buxVar = (bux) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != buxVar.B(j) ? 2 : 4;
        }
        if (buxVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
            mcd.v(this.a, this.b, this.c, this.d, j, this.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f, this.g, this.h, buxVar, (iIntValue << 12) & 57344, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
