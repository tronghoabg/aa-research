package com.google.android.gms.l.a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.l.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class e extends com.google.android.a.b implements f {
    public e() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                j(status);
                return true;
            case 2:
                Status status2 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                o(status2);
                return true;
            case 3:
                Status status3 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                n(status3);
                return true;
            case 4:
                Status status4 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                com.google.android.gms.l.b bVar = (com.google.android.gms.l.b) com.google.android.a.c.a(parcel, com.google.android.gms.l.b.CREATOR);
                enforceNoDataAvail(parcel);
                f(status4, bVar);
                return true;
            case 5:
                Status status5 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                a(status5);
                return true;
            case 6:
                Status status6 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                com.google.android.gms.l.d dVar = (com.google.android.gms.l.d) com.google.android.a.c.a(parcel, com.google.android.gms.l.d.CREATOR);
                enforceNoDataAvail(parcel);
                d(status6, dVar);
                return true;
            case 7:
                Status status7 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                com.google.android.gms.l.c cVar = (com.google.android.gms.l.c) com.google.android.a.c.a(parcel, com.google.android.gms.l.c.CREATOR);
                enforceNoDataAvail(parcel);
                b(status7, cVar);
                return true;
            case 8:
                Status status8 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                c(status8);
                return true;
            case 9:
                Status status9 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                com.google.android.gms.l.f fVar = (com.google.android.gms.l.f) com.google.android.a.c.a(parcel, com.google.android.gms.l.f.CREATOR);
                enforceNoDataAvail(parcel);
                g(status9, fVar);
                return true;
            case 10:
                Status status10 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                com.google.android.gms.l.b bVar2 = (com.google.android.gms.l.b) com.google.android.a.c.a(parcel, com.google.android.gms.l.b.CREATOR);
                enforceNoDataAvail(parcel);
                e(status10, bVar2);
                return true;
            case 11:
                Status status11 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                parcel.readLong();
                enforceNoDataAvail(parcel);
                p(status11);
                return true;
            case 12:
                Status status12 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                m(status12);
                return true;
            case 13:
                Status status13 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                i iVar = (i) com.google.android.a.c.a(parcel, i.CREATOR);
                enforceNoDataAvail(parcel);
                i(status13, iVar);
                return true;
            case 14:
                Status status14 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k(status14);
                return true;
            case 15:
                Status status15 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                l(status15);
                return true;
            case 16:
                Status status16 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                long j2 = parcel.readLong();
                enforceNoDataAvail(parcel);
                h(status16, j2);
                return true;
            default:
                return false;
        }
    }
}
