package com.google.android.gms.identitycredentials.a;

import android.os.IInterface;
import android.os.Parcel;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class a extends com.google.android.a.b implements IInterface {
    public a() {
        super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    public void a(Status status, com.google.android.gms.identitycredentials.c cVar, com.google.android.gms.common.api.k kVar) {
        x.f(status, NotificationCompat.CATEGORY_STATUS);
        throw new UnsupportedOperationException();
    }

    public void b(Status status, com.google.android.gms.identitycredentials.f fVar, com.google.android.gms.common.api.k kVar) {
        x.f(status, NotificationCompat.CATEGORY_STATUS);
        throw new UnsupportedOperationException();
    }

    public void c(Status status, r rVar, com.google.android.gms.common.api.k kVar) {
        x.f(status, NotificationCompat.CATEGORY_STATUS);
        throw new UnsupportedOperationException();
    }

    public void d(Status status, com.google.android.gms.identitycredentials.x xVar, com.google.android.gms.common.api.k kVar) {
        x.f(status, NotificationCompat.CATEGORY_STATUS);
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                r rVar = (r) com.google.android.a.c.a(parcel, r.CREATOR);
                com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) com.google.android.a.c.a(parcel, com.google.android.gms.common.api.k.CREATOR);
                enforceNoDataAvail(parcel);
                c(status, rVar, kVar);
                return true;
            case 2:
                Status status2 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status2);
                return true;
            case 3:
                Status status3 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status3);
                return true;
            case 4:
                Status status4 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status4);
                return true;
            case 5:
                Status status5 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status5);
                return true;
            case 6:
                Status status6 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status6);
                return true;
            case 7:
                Status status7 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                com.google.android.gms.identitycredentials.f fVar = (com.google.android.gms.identitycredentials.f) com.google.android.a.c.a(parcel, com.google.android.gms.identitycredentials.f.CREATOR);
                com.google.android.gms.common.api.k kVar2 = (com.google.android.gms.common.api.k) com.google.android.a.c.a(parcel, com.google.android.gms.common.api.k.CREATOR);
                enforceNoDataAvail(parcel);
                b(status7, fVar, kVar2);
                return true;
            case 8:
                Status status8 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status8);
                return true;
            case 9:
                Status status9 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                com.google.android.gms.identitycredentials.c cVar = (com.google.android.gms.identitycredentials.c) com.google.android.a.c.a(parcel, com.google.android.gms.identitycredentials.c.CREATOR);
                com.google.android.gms.common.api.k kVar3 = (com.google.android.gms.common.api.k) com.google.android.a.c.a(parcel, com.google.android.gms.common.api.k.CREATOR);
                enforceNoDataAvail(parcel);
                a(status9, cVar, kVar3);
                return true;
            case 10:
                Status status10 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                com.google.android.gms.identitycredentials.x xVar = (com.google.android.gms.identitycredentials.x) com.google.android.a.c.a(parcel, com.google.android.gms.identitycredentials.x.CREATOR);
                com.google.android.gms.common.api.k kVar4 = (com.google.android.gms.common.api.k) com.google.android.a.c.a(parcel, com.google.android.gms.common.api.k.CREATOR);
                enforceNoDataAvail(parcel);
                d(status10, xVar, kVar4);
                return true;
            case 11:
                Status status11 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status11);
                return true;
            case 12:
                Status status12 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status12);
                return true;
            case 13:
                Status status13 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status13);
                return true;
            case 14:
                Status status14 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status14);
                return true;
            case 15:
                Status status15 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status15);
                return true;
            case 16:
                Status status16 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k.a(status16);
                return true;
            default:
                return false;
        }
    }
}
