package defpackage;

import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class adqc extends adqe {
    private final admf a;
    private final admc b;
    private final adzv c;

    public adqc(adoz adozVar, int i, admf admfVar, admc admcVar, adzv adzvVar) {
        super(adozVar, i, adzvVar);
        this.a = admfVar;
        this.b = admcVar;
        this.c = adzvVar;
    }

    @Override // defpackage.adqe
    protected final int a(Parcel parcel) throws adnr, IOException {
        admf admfVar = this.a;
        parcel.writeString(admfVar.b);
        adpv.b(parcel, this.b);
        this.c.a();
        return admfVar.a.b() ? 16 : 0;
    }

    @Override // defpackage.adqe
    protected final int b(Parcel parcel) throws IOException {
        return 0;
    }

    final void c(adjr adjrVar) {
        admc admcVar = this.b;
        adlx adlxVar = adue.b;
        admcVar.d(adlxVar);
        admcVar.f(adlxVar, Long.valueOf(adjrVar.b(TimeUnit.NANOSECONDS)));
    }
}
