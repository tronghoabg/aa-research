package defpackage;

import android.os.Parcel;
import java.util.List;

/* loaded from: classes3.dex */
final class adpi extends adpl {
    public adpi(adox adoxVar, adis adisVar, int i) {
        super(adoxVar, adisVar, i);
    }

    @Override // defpackage.adpl
    protected final void a(adnq adnqVar) {
        ((adzk) this.g).a(adnqVar);
    }

    @Override // defpackage.adpl
    protected final void b() {
        ((adzk) this.g).b();
    }

    @Override // defpackage.adpl
    public final void c(int i, Parcel parcel) throws adnr {
        adzv adzvVar;
        String string = parcel.readString();
        adis adisVar = this.c;
        admc admcVarA = adpv.a(parcel, adisVar);
        adoz adozVar = this.b;
        adox adoxVar = (adox) adozVar;
        List list = adoxVar.a;
        adzv adzvVar2 = adzv.a;
        if (list.isEmpty()) {
            adzvVar = adzv.a;
        } else {
            int size = list.size();
            adqq[] adqqVarArr = new adqq[size];
            for (int i2 = 0; i2 < size; i2++) {
                adqqVarArr[i2] = ((adnk) list.get(i2)).a();
            }
            adzvVar = new adzv(adqqVarArr);
        }
        adqd adqdVar = new adqd(adozVar, this.d, adzvVar);
        adnq adnqVarA = adoxVar.a((i & 16) != 0 ? new adqp(this, adqdVar, adisVar) : new adpx(this, adqdVar, adisVar), string, admcVarA);
        if (!adnqVarA.g()) {
            super.h(adnqVarA, adnqVarA, false);
            return;
        }
        ((adzk) this.g).getClass();
        if (adoxVar.y()) {
            ((adzk) this.g).e();
        }
    }

    final void f() {
        if (p()) {
            return;
        }
        m(adpj.f);
        this.f.f();
        ((adzk) this.g).a(adnq.b);
    }

    @Override // defpackage.adpl
    public final void d(int i, Parcel parcel) {
    }
}
