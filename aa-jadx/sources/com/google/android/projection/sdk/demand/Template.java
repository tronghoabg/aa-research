package com.google.android.projection.sdk.demand;

/* JADX INFO: loaded from: classes3.dex */
public class Template implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.projection.sdk.demand.Template> CREATOR = new defpackage.sse(7);
    private final int a;
    private final int b;
    private final android.os.Bundle c;

    public Template(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        android.os.Bundle bundle = parcel.readBundle();
        this.c = bundle;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
    }
}
