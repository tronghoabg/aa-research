package W7;

import android.os.Parcel;
import android.os.Parcelable;
import s1.AbstractC3989b;

/* loaded from: classes4.dex */
public final class a extends AbstractC3989b {
    public static final Parcelable.Creator<a> CREATOR = new N7.c(3);

    /* renamed from: c, reason: collision with root package name */
    public boolean f15195c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15195c = parcel.readInt() == 1;
    }

    @Override // s1.AbstractC3989b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f15195c ? 1 : 0);
    }
}
