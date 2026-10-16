package s1;

import N7.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3989b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f44826a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3988a f44825b = new C3988a();
    public static final Parcelable.Creator<AbstractC3989b> CREATOR = new c(10);

    public AbstractC3989b() {
        this.f44826a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f44826a, i5);
    }

    public AbstractC3989b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f44826a = parcelable == f44825b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC3989b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f44826a = parcelable == null ? f44825b : parcelable;
    }
}
