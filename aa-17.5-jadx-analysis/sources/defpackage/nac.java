package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
public final /* synthetic */ class nac implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ afeh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ nac(bqj bqjVar, cfy cfyVar, boolean z, bpv bpvVar, asf asfVar, afeh afehVar, afeh afehVar2, int i, int i2) {
        this.i = i2;
        this.e = bqjVar;
        this.d = cfyVar;
        this.a = z;
        this.g = bpvVar;
        this.f = asfVar;
        this.h = afehVar;
        this.b = afehVar2;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [afeh, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.c;
            afeh afehVar = this.b;
            Object obj3 = this.h;
            Object obj4 = this.g;
            Object obj5 = this.f;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            mjv.l(this.a, (Duration) this.d, this.e, (acp) obj5, (acq) obj4, (String) obj3, afehVar, buxVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i5 = this.c;
        afeh afehVar2 = this.b;
        ?? r9 = this.h;
        ?? r8 = this.f;
        Object obj6 = this.g;
        boolean z = this.a;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        bqh.d((bqj) this.e, this.d, z, (bpv) obj6, r8, r9, afehVar2, buxVar2, (i8 >> 1) | i7 | (i6 & (-920350135)) | ((i7 + i7) & i8));
        return afak.a;
    }

    public /* synthetic */ nac(boolean z, Duration duration, cfy cfyVar, acp acpVar, acq acqVar, String str, afeh afehVar, int i, int i2) {
        this.i = i2;
        this.a = z;
        this.d = duration;
        this.e = cfyVar;
        this.f = acpVar;
        this.g = acqVar;
        this.h = str;
        this.b = afehVar;
        this.c = i;
    }
}
