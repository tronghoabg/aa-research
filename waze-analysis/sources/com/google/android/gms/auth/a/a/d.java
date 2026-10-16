package com.google.android.gms.auth.a.a;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.o.w;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.a.b implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f4400a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f4401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(h hVar, w wVar, int i2) {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
        this.f4401b = i2;
        this.f4400a = wVar;
        Objects.requireNonNull(hVar);
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (this.f4401b != 0) {
            if (i2 != 1) {
                return false;
            }
            Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
            boolean zD = com.google.android.a.c.d(parcel);
            enforceNoDataAvail(parcel);
            ab.d(status, Boolean.valueOf(zD), this.f4400a);
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        Status status2 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
        int i4 = parcel.readInt();
        enforceNoDataAvail(parcel);
        ab.d(status2, Integer.valueOf(i4), this.f4400a);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(h hVar, w wVar, int i2, byte[] bArr) {
        super("com.google.android.gms.auth.blockstore.internal.IDeleteBytesCallback");
        this.f4401b = i2;
        this.f4400a = wVar;
        Objects.requireNonNull(hVar);
    }
}
