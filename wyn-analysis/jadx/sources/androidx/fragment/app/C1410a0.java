package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.fragment.app.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410a0 implements Parcelable {
    public static final Parcelable.Creator<C1410a0> CREATOR = new Z6.c(11);

    /* renamed from: a, reason: collision with root package name */
    public String f18368a;

    /* renamed from: b, reason: collision with root package name */
    public int f18369b;

    public C1410a0(String str, int i5) {
        this.f18368a = str;
        this.f18369b = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f18368a);
        parcel.writeInt(this.f18369b);
    }
}
