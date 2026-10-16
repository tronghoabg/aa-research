package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gi implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f1556a;

    gi(int i2) {
        this.f1556a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.f1556a != 0 ? new ew(parcel, null) : new gj(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return this.f1556a != 0 ? new ew[i2] : new gj[i2];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f1556a != 0 ? new ew(parcel, classLoader) : new gj(parcel, classLoader);
    }
}
