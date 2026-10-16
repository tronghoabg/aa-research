package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new Z6.c(16);

    /* renamed from: a, reason: collision with root package name */
    public int f18999a;

    /* renamed from: b, reason: collision with root package name */
    public int f19000b;

    /* renamed from: c, reason: collision with root package name */
    public int f19001c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f19002d;

    /* renamed from: e, reason: collision with root package name */
    public int f19003e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f19004f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f19005g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19006h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19007i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19008j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f18999a);
        parcel.writeInt(this.f19000b);
        parcel.writeInt(this.f19001c);
        if (this.f19001c > 0) {
            parcel.writeIntArray(this.f19002d);
        }
        parcel.writeInt(this.f19003e);
        if (this.f19003e > 0) {
            parcel.writeIntArray(this.f19004f);
        }
        parcel.writeInt(this.f19006h ? 1 : 0);
        parcel.writeInt(this.f19007i ? 1 : 0);
        parcel.writeInt(this.f19008j ? 1 : 0);
        parcel.writeList(this.f19005g);
    }
}
