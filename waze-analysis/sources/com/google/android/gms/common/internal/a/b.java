package com.google.android.gms.common.internal.a;

import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends RuntimeException {
    public b(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
