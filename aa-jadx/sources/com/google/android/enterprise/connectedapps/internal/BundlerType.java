package com.google.android.enterprise.connectedapps.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class BundlerType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.enterprise.connectedapps.internal.BundlerType> CREATOR = new defpackage.kid(13);
    public final java.lang.String a;
    public final java.util.List b;

    public BundlerType(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.createTypedArrayList(CREATOR);
    }

    public static com.google.android.enterprise.connectedapps.internal.BundlerType a(java.lang.String str) {
        return new com.google.android.enterprise.connectedapps.internal.BundlerType(str, java.util.Collections.EMPTY_LIST);
    }

    public static com.google.android.enterprise.connectedapps.internal.BundlerType b(com.google.android.enterprise.connectedapps.internal.BundlerType... bundlerTypeArr) {
        return new com.google.android.enterprise.connectedapps.internal.BundlerType("java.util.List", java.util.Arrays.asList(bundlerTypeArr));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType = (com.google.android.enterprise.connectedapps.internal.BundlerType) obj;
            if (this.a.equals(bundlerType.a) && this.b.equals(bundlerType.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedList(this.b);
    }

    private BundlerType(java.lang.String str, java.util.List list) {
        this.a = str;
        this.b = list;
    }
}
