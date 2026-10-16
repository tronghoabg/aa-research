package com.google.android.gms.auth.api.identity.a;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.o.w;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.a.b implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f4451a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f4452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(h hVar, w wVar, int i2) {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
        this.f4452b = i2;
        this.f4451a = wVar;
        Objects.requireNonNull(hVar);
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        int i4 = this.f4452b;
        if (i4 == 0) {
            if (i2 != 1) {
                return false;
            }
            Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
            com.google.android.gms.auth.api.identity.o oVar = (com.google.android.gms.auth.api.identity.o) com.google.android.a.c.a(parcel, com.google.android.gms.auth.api.identity.o.CREATOR);
            enforceNoDataAvail(parcel);
            ab.d(status, oVar, this.f4451a);
            return true;
        }
        if (i4 == 1) {
            if (i2 != 1) {
                return false;
            }
            Status status2 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
            com.google.android.gms.auth.api.identity.d dVar = (com.google.android.gms.auth.api.identity.d) com.google.android.a.c.a(parcel, com.google.android.gms.auth.api.identity.d.CREATOR);
            enforceNoDataAvail(parcel);
            boolean zF = status2.f();
            w wVar = this.f4451a;
            if (zF) {
                wVar.c(dVar);
                return true;
            }
            wVar.b(ab.b(status2));
            return true;
        }
        if (i4 != 2) {
            if (i2 != 1) {
                return false;
            }
            Status status3 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
            v vVar = (v) com.google.android.a.c.a(parcel, v.CREATOR);
            enforceNoDataAvail(parcel);
            ab.d(status3, vVar, this.f4451a);
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        Status status4 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) com.google.android.a.c.a(parcel, PendingIntent.CREATOR);
        enforceNoDataAvail(parcel);
        ab.d(status4, pendingIntent, this.f4451a);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(k kVar, w wVar, int i2) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
        this.f4452b = i2;
        this.f4451a = wVar;
        Objects.requireNonNull(kVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(n nVar, w wVar, int i2) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
        this.f4452b = i2;
        this.f4451a = wVar;
        Objects.requireNonNull(nVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(n nVar, w wVar, int i2, byte[] bArr) {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
        this.f4452b = i2;
        this.f4451a = wVar;
        Objects.requireNonNull(nVar);
    }
}
