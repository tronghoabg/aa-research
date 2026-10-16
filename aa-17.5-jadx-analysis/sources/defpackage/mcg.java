package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;

/* loaded from: classes2.dex */
public final /* synthetic */ class mcg implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ mcg(des desVar, ClickableSpan clickableSpan, boolean z, geu geuVar, gft gftVar, int i, int i2) {
        this.g = i2;
        this.f = desVar;
        this.e = clickableSpan;
        this.a = z;
        this.c = geuVar;
        this.d = gftVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, tjg] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i2 = this.b;
            Object obj3 = this.f;
            boolean z = this.a;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = i3 & 613566756;
            ((lxw) this.c).f((String) this.d, this.e, z, (dfw) obj3, buxVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return afak.a;
        }
        if (i == 1) {
            bux buxVar2 = (bux) obj;
            ((Integer) obj2).intValue();
            int i6 = this.b;
            Object obj4 = this.d;
            Object obj5 = this.c;
            int i7 = i6 | 1;
            int i8 = i7 & 306783378;
            int i9 = i7 & 613566756;
            fwl.q((des) this.f, (ClickableSpan) this.e, this.a, (geu) obj5, (gft) obj4, buxVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
            return afak.a;
        }
        if (i == 2) {
            bux buxVar3 = (bux) obj;
            ((Integer) obj2).intValue();
            int i10 = this.b;
            ?? r4 = this.e;
            boolean z2 = this.a;
            Object obj6 = this.d;
            int i11 = i10 | 1;
            int i12 = i11 & 306783378;
            int i13 = i11 & 613566756;
            lvl.F((kjk) this.f, (npe) this.c, (npe) obj6, z2, r4, buxVar3, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
            return afak.a;
        }
        if (i != 3) {
            bux buxVar4 = (bux) obj;
            ((Integer) obj2).intValue();
            int i14 = this.b;
            ?? r10 = this.d;
            boolean z3 = this.a;
            int i15 = i14 | 1;
            int i16 = i15 & 306783378;
            int i17 = 613566756 & i15;
            std.e((tiw) this.f, (CarText) this.e, this.c, z3, r10, buxVar4, (i17 >> 1) | i16 | (i15 & (-920350135)) | ((i16 + i16) & i17));
            return afak.a;
        }
        bux buxVar5 = (bux) obj;
        ((Integer) obj2).intValue();
        int i18 = this.b;
        ?? r42 = this.e;
        boolean z4 = this.a;
        ?? r2 = this.c;
        int i19 = i18 | 1;
        int i20 = i19 & 306783378;
        int i21 = i19 & 613566756;
        mva.M((String) this.f, this.d, r2, z4, r42, buxVar5, (i19 & (-920350135)) | i20 | (i21 >> 1) | ((i20 + i20) & i21));
        return afak.a;
    }

    public /* synthetic */ mcg(String str, afec afecVar, afdr afdrVar, boolean z, cfy cfyVar, int i, int i2) {
        this.g = i2;
        this.f = str;
        this.d = afecVar;
        this.c = afdrVar;
        this.a = z;
        this.e = cfyVar;
        this.b = i;
    }

    public /* synthetic */ mcg(kjk kjkVar, npe npeVar, npe npeVar2, boolean z, cfy cfyVar, int i, int i2) {
        this.g = i2;
        this.f = kjkVar;
        this.c = npeVar;
        this.d = npeVar2;
        this.a = z;
        this.e = cfyVar;
        this.b = i;
    }

    public /* synthetic */ mcg(lxw lxwVar, String str, cfy cfyVar, boolean z, dfw dfwVar, int i, int i2) {
        this.g = i2;
        this.c = lxwVar;
        this.d = str;
        this.e = cfyVar;
        this.a = z;
        this.f = dfwVar;
        this.b = i;
    }

    public /* synthetic */ mcg(tiw tiwVar, CarText carText, tjg tjgVar, boolean z, afeh afehVar, int i, int i2) {
        this.g = i2;
        this.f = tiwVar;
        this.e = carText;
        this.c = tjgVar;
        this.a = z;
        this.d = afehVar;
        this.b = i;
    }
}
