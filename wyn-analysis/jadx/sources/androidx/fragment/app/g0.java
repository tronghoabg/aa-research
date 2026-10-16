package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new Z6.c(12);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f18441a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f18442b;

    /* renamed from: c, reason: collision with root package name */
    public C1411b[] f18443c;

    /* renamed from: d, reason: collision with root package name */
    public int f18444d;

    /* renamed from: e, reason: collision with root package name */
    public String f18445e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f18446f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f18447g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f18448h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStringList(this.f18441a);
        parcel.writeStringList(this.f18442b);
        parcel.writeTypedArray(this.f18443c, i5);
        parcel.writeInt(this.f18444d);
        parcel.writeString(this.f18445e);
        parcel.writeStringList(this.f18446f);
        parcel.writeTypedList(this.f18447g);
        parcel.writeTypedList(this.f18448h);
    }
}
