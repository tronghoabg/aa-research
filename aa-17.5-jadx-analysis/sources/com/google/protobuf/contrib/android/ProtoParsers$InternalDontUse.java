package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abmy;
import defpackage.abow;
import defpackage.srg;
import defpackage.woy;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ProtoParsers$InternalDontUse<T extends abow> implements Parcelable {
    public static final Parcelable.Creator<ProtoParsers$InternalDontUse<?>> CREATOR = new srg(8);
    public volatile byte[] a;
    public volatile abow b;

    public ProtoParsers$InternalDontUse(byte[] bArr, abow abowVar) {
        boolean z = true;
        if (bArr == null && abowVar == null) {
            z = false;
        }
        woy.O(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = abowVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            int iM = this.b.m();
            byte[] bArr = new byte[iM];
            try {
                this.b.R(new abmy(bArr, 0, iM, null));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
