package com.google.android.play.core.a.b;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class d extends com.google.android.a.b implements e {
    public d() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) com.google.android.a.c.a(parcel, Bundle.CREATOR);
        enforceNoDataAvail(parcel);
        a(bundle);
        return true;
    }
}
