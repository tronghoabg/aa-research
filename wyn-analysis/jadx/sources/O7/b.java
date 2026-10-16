package O7;

import android.os.Parcel;
import android.os.Parcelable;
import s1.AbstractC3989b;

/* loaded from: classes4.dex */
public final class b extends AbstractC3989b {
    public static final Parcelable.Creator<b> CREATOR = new N7.c(1);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8888c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f8888c = parcel.readInt() == 1;
    }

    @Override // s1.AbstractC3989b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f8888c ? 1 : 0);
    }
}
