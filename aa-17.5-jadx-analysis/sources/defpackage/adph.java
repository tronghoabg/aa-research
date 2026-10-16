package defpackage;

import android.os.Parcel;

/* loaded from: classes3.dex */
final class adph extends adpl {
    public final boolean a;
    private adnq h;
    private admc i;

    public adph(ador adorVar, adis adisVar, int i, boolean z) {
        super(adorVar, adisVar, i);
        this.a = z;
    }

    @Override // defpackage.adpl
    protected final void a(adnq adnqVar) {
        ((adsj) this.g).a(adnqVar, adsi.a, new admc());
    }

    @Override // defpackage.adpl
    protected final void b() {
        this.f.e();
        this.f.f();
        m(adpj.f);
        ((adsj) this.g).a(this.h, adsi.a, this.i);
        o();
    }

    @Override // defpackage.adpl
    public final void c(int i, Parcel parcel) throws adnr {
        admc admcVarA = adpv.a(parcel, this.c);
        this.f.d();
        ((adsj) this.g).c(admcVarA);
    }

    @Override // defpackage.adpl
    public final void d(int i, Parcel parcel) throws adnr {
        this.h = adqs.i(i, parcel);
        this.i = adpv.a(parcel, this.c);
    }

    @Override // defpackage.adpl
    public final boolean e() {
        return this.a;
    }
}
