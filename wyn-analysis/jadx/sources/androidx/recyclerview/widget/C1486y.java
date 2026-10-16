package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.recyclerview.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1486y implements Parcelable {
    public static final Parcelable.Creator<C1486y> CREATOR = new Z6.c(14);

    /* renamed from: a, reason: collision with root package name */
    public int f19037a;

    /* renamed from: b, reason: collision with root package name */
    public int f19038b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19039c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f19037a);
        parcel.writeInt(this.f19038b);
        parcel.writeInt(this.f19039c ? 1 : 0);
    }
}
