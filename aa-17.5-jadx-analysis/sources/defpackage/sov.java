package defpackage;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class sov extends RuntimeException {
    public sov(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
