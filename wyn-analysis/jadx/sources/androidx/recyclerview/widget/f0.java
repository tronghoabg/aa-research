package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import s1.AbstractC3989b;

/* loaded from: classes.dex */
public final class f0 extends AbstractC3989b {
    public static final Parcelable.Creator<f0> CREATOR = new N7.c(5);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f18858c;

    public f0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f18858c = parcel.readParcelable(classLoader == null ? V.class.getClassLoader() : classLoader);
    }

    @Override // s1.AbstractC3989b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeParcelable(this.f18858c, 0);
    }
}
