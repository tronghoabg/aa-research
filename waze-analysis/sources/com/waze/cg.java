package com.waze;

import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cg extends com.google.android.a.b implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AIDLService f22248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cg(AIDLService aIDLService) {
        super("com.waze.IServiceAIDL");
        Objects.requireNonNull(aIDLService);
        this.f22248a = aIDLService;
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            int callingPid = getCallingPid();
            parcel2.writeNoException();
            parcel2.writeInt(callingPid);
        } else if (i2 == 2) {
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            if (string != null && !string.equals("")) {
                AIDLService.f13530a = string;
                AIDLService.f13531b = this.f22248a.getApplicationContext().getPackageManager().getNameForUid(Binder.getCallingUid());
            }
            parcel2.writeNoException();
        } else {
            if (i2 != 3) {
                return false;
            }
            parcel.readInt();
            parcel.readLong();
            com.google.android.a.c.d(parcel);
            parcel.readFloat();
            parcel.readDouble();
            parcel.readString();
            enforceNoDataAvail(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
