package com.google.android.projection.sdk.demand;

/* JADX INFO: loaded from: classes3.dex */
public class TemplateArgument implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.projection.sdk.demand.TemplateArgument> CREATOR = new defpackage.sse(8);
    private final java.lang.String a;
    private final int b;
    private final int c;
    private final android.os.Bundle d;

    public TemplateArgument(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
    }
}
