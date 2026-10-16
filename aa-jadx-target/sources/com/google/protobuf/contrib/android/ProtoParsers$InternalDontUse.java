package com.google.protobuf.contrib.android;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ProtoParsers$InternalDontUse<T extends defpackage.abpy> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse<?>> CREATOR = new defpackage.sse(9);
    public volatile byte[] a;
    public volatile defpackage.abpy b;

    public ProtoParsers$InternalDontUse(byte[] bArr, defpackage.abpy abpyVar) {
        boolean z = true;
        if (bArr == null && abpyVar == null) {
            z = false;
        }
        defpackage.ysr.aY(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = abpyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.a == null) {
            int iM = this.b.m();
            byte[] bArr = new byte[iM];
            try {
                this.b.R(new defpackage.aboa(bArr, 0, iM, null));
                this.a = bArr;
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
