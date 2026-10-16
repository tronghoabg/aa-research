package com.google.android.gms.auth.a.b.a;

import android.os.IInterface;
import android.os.Parcel;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.o.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.a.b implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f4410a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f4411b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(w wVar, int i2, byte[] bArr) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback");
        this.f4411b = i2;
        this.f4410a = wVar;
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        int i4 = this.f4411b;
        if (i4 == 0) {
            if (i2 != 1) {
                return false;
            }
            Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
            com.google.android.gms.auth.a.b.c cVar = (com.google.android.gms.auth.a.b.c) com.google.android.a.c.a(parcel, com.google.android.gms.auth.a.b.c.CREATOR);
            enforceNoDataAvail(parcel);
            x.f(status, NotificationCompat.CATEGORY_STATUS);
            x.f(cVar, "response");
            ab.d(status, cVar, this.f4410a);
            return true;
        }
        if (i4 != 1) {
            if (i2 != 1) {
                return false;
            }
            Status status2 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
            com.google.android.gms.auth.a.b.e eVar = (com.google.android.gms.auth.a.b.e) com.google.android.a.c.a(parcel, com.google.android.gms.auth.a.b.e.CREATOR);
            enforceNoDataAvail(parcel);
            x.f(status2, NotificationCompat.CATEGORY_STATUS);
            x.f(eVar, "response");
            ab.d(status2, eVar, this.f4410a);
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        Status status3 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
        boolean zD = com.google.android.a.c.d(parcel);
        enforceNoDataAvail(parcel);
        x.f(status3, NotificationCompat.CATEGORY_STATUS);
        ab.d(status3, Boolean.valueOf(zD), this.f4410a);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(w wVar, int i2) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
        this.f4411b = i2;
        this.f4410a = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(w wVar, int i2, char[] cArr) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
        this.f4411b = i2;
        this.f4410a = wVar;
    }
}
