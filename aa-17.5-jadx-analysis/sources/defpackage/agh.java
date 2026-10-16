package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class agh implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ agh(agg aggVar, age ageVar, Object obj, Object obj2, aew aewVar, int i, int i2) {
        this.g = i2;
        this.d = aggVar;
        this.e = ageVar;
        this.a = obj;
        this.b = obj2;
        this.f = aewVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [afeh, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i2 = this.c;
            ?? r4 = this.f;
            Object obj3 = this.b;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = i3 & 613566756;
            afp.q((agg) this.d, (age) this.e, this.a, obj3, r4, buxVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return afak.a;
        }
        if (i != 1) {
            bux buxVar2 = (bux) obj;
            ((Integer) obj2).intValue();
            int i6 = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            Object obj6 = this.d;
            int i7 = i6 & 306783378;
            int i8 = 613566756 & i6;
            ((cct) this.f).e(this.e, obj6, obj5, obj4, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8) | 1);
            return afak.a;
        }
        bux buxVar3 = (bux) obj;
        ((Integer) obj2).intValue();
        int i9 = this.c;
        ?? r42 = this.b;
        ?? r3 = this.a;
        ?? r2 = this.f;
        int i10 = i9 | 1;
        int i11 = i10 & 306783378;
        int i12 = i10 & 613566756;
        ca.J((agg) this.e, this.d, r2, r3, r42, buxVar3, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
        return afak.a;
    }

    public /* synthetic */ agh(agg aggVar, cfy cfyVar, aew aewVar, afec afecVar, afeh afehVar, int i, int i2) {
        this.g = i2;
        this.e = aggVar;
        this.d = cfyVar;
        this.f = aewVar;
        this.a = afecVar;
        this.b = afehVar;
        this.c = i;
    }

    public /* synthetic */ agh(cct cctVar, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.g = i2;
        this.f = cctVar;
        this.e = obj;
        this.d = obj2;
        this.a = obj3;
        this.b = obj4;
        this.c = i;
    }
}
