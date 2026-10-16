package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class aq implements Parcelable {
    public static final Parcelable.Creator<aq> CREATOR = new ap();

    /* renamed from: a, reason: collision with root package name */
    final Bundle f132a;

    aq(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f132a = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f132a);
    }

    aq(Bundle bundle) {
        this.f132a = bundle;
    }
}
