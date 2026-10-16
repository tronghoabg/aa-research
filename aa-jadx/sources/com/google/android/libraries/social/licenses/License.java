package com.google.android.libraries.social.licenses;

/* JADX INFO: loaded from: classes3.dex */
public final class License implements java.lang.Comparable<com.google.android.libraries.social.licenses.License>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.social.licenses.License> CREATOR = new defpackage.sse(1);
    public final java.lang.String a;
    public final long b;
    public final int c;

    public License(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(com.google.android.libraries.social.licenses.License license) {
        return this.a.compareTo(license.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.libraries.social.licenses.License) {
            return this.a.equals(((com.google.android.libraries.social.licenses.License) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }

    public License(java.lang.String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }
}
