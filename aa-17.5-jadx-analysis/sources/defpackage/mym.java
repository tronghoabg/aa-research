package defpackage;

import androidx.car.app.model.CarText;

/* loaded from: classes.dex */
public final /* synthetic */ class mym implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ afeh c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ mym(CarText carText, tjg tjgVar, boolean z, boolean z2, afeh afehVar, int i, int i2) {
        this.g = i2;
        this.e = carText;
        this.f = tjgVar;
        this.a = z;
        this.b = z2;
        this.c = afehVar;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, tjg] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i2 = this.d;
            ?? r4 = this.f;
            afeh afehVar = this.c;
            boolean z = this.b;
            boolean z2 = this.a;
            ?? r0 = this.e;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = i3 & 613566756;
            myv.o(r0, z2, z, afehVar, r4, buxVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return afak.a;
        }
        if (i == 1) {
            bux buxVar2 = (bux) obj;
            ((Integer) obj2).intValue();
            int i6 = this.d;
            ?? r42 = this.f;
            afeh afehVar2 = this.c;
            boolean z3 = this.b;
            boolean z4 = this.a;
            ?? r02 = this.e;
            int i7 = i6 | 1;
            int i8 = i7 & 306783378;
            int i9 = i7 & 613566756;
            myv.m(r02, z4, z3, afehVar2, r42, buxVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
            return afak.a;
        }
        if (i != 2) {
            bux buxVar3 = (bux) obj;
            ((Integer) obj2).intValue();
            int i10 = this.d;
            afeh afehVar3 = this.c;
            boolean z5 = this.b;
            boolean z6 = this.a;
            ?? r7 = this.f;
            int i11 = i10 | 1;
            int i12 = i11 & 306783378;
            int i13 = 613566756 & i11;
            std.j((CarText) this.e, r7, z6, z5, afehVar3, buxVar3, (i13 >> 1) | i12 | (i11 & (-920350135)) | ((i12 + i12) & i13));
            return afak.a;
        }
        bux buxVar4 = (bux) obj;
        ((Integer) obj2).intValue();
        int i14 = this.d;
        ?? r43 = this.f;
        afeh afehVar4 = this.c;
        boolean z7 = this.b;
        boolean z8 = this.a;
        ?? r03 = this.e;
        int i15 = i14 | 1;
        int i16 = i15 & 306783378;
        int i17 = i15 & 613566756;
        myv.n(r03, z8, z7, afehVar4, r43, buxVar4, (i15 & (-920350135)) | i16 | (i17 >> 1) | ((i16 + i16) & i17));
        return afak.a;
    }

    public /* synthetic */ mym(cfy cfyVar, boolean z, boolean z2, afeh afehVar, afec afecVar, int i, int i2) {
        this.g = i2;
        this.e = cfyVar;
        this.a = z;
        this.b = z2;
        this.c = afehVar;
        this.f = afecVar;
        this.d = i;
    }
}
