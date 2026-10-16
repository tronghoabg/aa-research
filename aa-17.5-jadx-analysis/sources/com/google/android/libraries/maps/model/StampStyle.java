package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqh;
import defpackage.sqj;

/* loaded from: classes3.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new StampStyleCreator();
    protected final BitmapDescriptor a;

    public StampStyle(IBinder iBinder) {
        sqj sqhVar;
        if (iBinder == null) {
            sqhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(iBinder);
        }
        this.a = new BitmapDescriptor(sqhVar);
    }

    public boolean asSprite() {
        return false;
    }

    public BitmapDescriptor getStamp() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        BitmapDescriptor bitmapDescriptor = this.a;
        int iL = spu.l(parcel, 20293);
        spu.y(parcel, 2, bitmapDescriptor.getRemoteObject().asBinder());
        spu.m(parcel, iL);
    }

    protected StampStyle(BitmapDescriptor bitmapDescriptor) {
        this.a = bitmapDescriptor;
    }
}
