package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bw implements Parcelable {
    public static final Parcelable.Creator<bw> CREATOR = new c(3);

    /* renamed from: a, reason: collision with root package name */
    ArrayList f207a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList f208b;

    /* renamed from: c, reason: collision with root package name */
    b[] f209c;

    /* renamed from: d, reason: collision with root package name */
    int f210d;

    /* renamed from: e, reason: collision with root package name */
    String f211e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f212f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList f213g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f214h;

    public bw(Parcel parcel) {
        this.f211e = null;
        this.f212f = new ArrayList();
        this.f213g = new ArrayList();
        this.f207a = parcel.createStringArrayList();
        this.f208b = parcel.createStringArrayList();
        this.f209c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f210d = parcel.readInt();
        this.f211e = parcel.readString();
        this.f212f = parcel.createStringArrayList();
        this.f213g = parcel.createTypedArrayList(d.CREATOR);
        this.f214h = parcel.createTypedArrayList(bo.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f207a);
        parcel.writeStringList(this.f208b);
        parcel.writeTypedArray(this.f209c, i2);
        parcel.writeInt(this.f210d);
        parcel.writeString(this.f211e);
        parcel.writeStringList(this.f212f);
        parcel.writeTypedList(this.f213g);
        parcel.writeTypedList(this.f214h);
    }

    public bw() {
        this.f211e = null;
        this.f212f = new ArrayList();
        this.f213g = new ArrayList();
    }
}
