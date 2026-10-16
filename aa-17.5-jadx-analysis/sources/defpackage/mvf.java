package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class mvf implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ mvf(atm atmVar, boolean z, bbt bbtVar, boolean z2, int i, boolean z3, int i2) {
        this.g = i2;
        this.e = atmVar;
        this.a = z;
        this.f = bbtVar;
        this.b = z2;
        this.c = i;
        this.d = z3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [atm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [cfy, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            int i3 = iIntValue & 1;
            yph yphVar = mvk.a;
            if (buxVar.I(i2 != 2, i3)) {
                boolean z = this.d;
                int i4 = this.c;
                boolean z2 = this.b;
                Object obj3 = this.f;
                boolean z3 = this.a;
                ?? r0 = this.e;
                long jH = cjv.h(kfn.i(buxVar).h(), 0.28f);
                mcd.o(r0, z3, (bbt) obj3, das.d(cjn.g(asl.H(cfy.e, gjk.c.k), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcr.d(), true, 0, 1042431), "earth_host_pager_indicator"), z2, kfn.i(buxVar).s(), jH, true, i4, z, null, null, buxVar, 12582912, 0, 1536);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i == 1) {
            ((Integer) obj2).intValue();
            int i5 = this.c;
            boolean z4 = this.d;
            boolean z5 = this.b;
            int i6 = i5 | 1;
            int i7 = i6 & 306783378;
            int i8 = 613566756 & i6;
            gqk.b((bqj) this.f, (bpv) this.e, this.a, z5, z4, (bux) obj, (i8 & (i7 + i7)) | (i6 & (-920350135)) | i7 | (i8 >> 1));
            return afak.a;
        }
        if (i != 2) {
            ((Integer) obj2).intValue();
            int i9 = this.c;
            boolean z6 = this.d;
            boolean z7 = this.b;
            boolean z8 = this.a;
            int i10 = i9 | 1;
            int i11 = i10 & 306783378;
            int i12 = 613566756 & i10;
            kfn.p(this.e, (njw) this.f, z8, z7, z6, (bux) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i13 = this.c;
        boolean z9 = this.d;
        boolean z10 = this.b;
        boolean z11 = this.a;
        int i14 = i13 | 1;
        int i15 = i14 & 306783378;
        int i16 = 613566756 & i14;
        kfn.p(this.e, (njw) this.f, z11, z10, z9, (bux) obj, (i14 & (-920350135)) | i15 | (i16 >> 1) | ((i15 + i15) & i16));
        return afak.a;
    }

    public /* synthetic */ mvf(bqj bqjVar, bpv bpvVar, boolean z, boolean z2, boolean z3, int i, int i2) {
        this.g = i2;
        this.f = bqjVar;
        this.e = bpvVar;
        this.a = z;
        this.b = z2;
        this.d = z3;
        this.c = i;
    }

    public /* synthetic */ mvf(cfy cfyVar, njw njwVar, boolean z, boolean z2, boolean z3, int i, int i2) {
        this.g = i2;
        this.e = cfyVar;
        this.f = njwVar;
        this.a = z;
        this.b = z2;
        this.d = z3;
        this.c = i;
    }
}
