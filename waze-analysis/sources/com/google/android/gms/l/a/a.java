package com.google.android.gms.l.a;

import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class a extends com.google.android.a.b implements b {
    public a() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        a(bArrCreateByteArray);
        return true;
    }
}
