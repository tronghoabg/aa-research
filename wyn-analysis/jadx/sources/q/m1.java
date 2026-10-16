package q;

import android.os.Parcel;
import android.os.Parcelable;
import s1.AbstractC3989b;

/* loaded from: classes.dex */
public final class m1 extends AbstractC3989b {
    public static final Parcelable.Creator<m1> CREATOR = new N7.c(9);

    /* renamed from: c, reason: collision with root package name */
    public int f43833c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43834d;

    public m1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f43833c = parcel.readInt();
        this.f43834d = parcel.readInt() != 0;
    }

    @Override // s1.AbstractC3989b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f43833c);
        parcel.writeInt(this.f43834d ? 1 : 0);
    }
}
