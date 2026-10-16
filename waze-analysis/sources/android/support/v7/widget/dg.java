package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class dg implements Parcelable {
    public static final Parcelable.Creator<dg> CREATOR = new df(0);

    /* renamed from: a, reason: collision with root package name */
    int f1342a;

    /* renamed from: b, reason: collision with root package name */
    int f1343b;

    /* renamed from: c, reason: collision with root package name */
    boolean f1344c;

    dg(Parcel parcel) {
        this.f1342a = parcel.readInt();
        this.f1343b = parcel.readInt();
        this.f1344c = parcel.readInt() == 1;
    }

    final void a() {
        this.f1342a = -1;
    }

    final boolean b() {
        return this.f1342a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1342a);
        parcel.writeInt(this.f1343b);
        parcel.writeInt(this.f1344c ? 1 : 0);
    }

    public dg(dg dgVar) {
        this.f1342a = dgVar.f1342a;
        this.f1343b = dgVar.f1343b;
        this.f1344c = dgVar.f1344c;
    }

    public dg() {
    }
}
