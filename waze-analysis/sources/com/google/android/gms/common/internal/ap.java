package com.google.android.gms.common.internal;

import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ap extends com.google.android.a.b implements aq {
    public ap() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            com.google.android.gms.g.c cVarC = c();
            parcel2.writeNoException();
            com.google.android.a.c.c(parcel2, cVarC);
        } else {
            if (i2 != 2) {
                return false;
            }
            int iB = b();
            parcel2.writeNoException();
            parcel2.writeInt(iB);
        }
        return true;
    }
}
