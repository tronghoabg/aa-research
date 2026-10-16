package defpackage;

import android.os.Parcel;
import java.io.IOException;

/* loaded from: classes3.dex */
final class adqd extends adqe {
    public admc a;
    public adnq b;
    public admc c;

    @Override // defpackage.adqe
    protected final int a(Parcel parcel) throws adnr, IOException {
        adpv.b(parcel, this.a);
        return 0;
    }

    @Override // defpackage.adqe
    protected final int b(Parcel parcel) throws adnr, IOException {
        int iH = adqs.h(parcel, this.b);
        adpv.b(parcel, this.c);
        this.d.x(this.e);
        return iH;
    }
}
