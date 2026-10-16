package androidx.car.app.serialization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.x;
import defpackage.xo;
import defpackage.xq;
import defpackage.xr;

/* loaded from: classes2.dex */
public final class Bundleable implements Parcelable {
    public static final Parcelable.Creator<Bundleable> CREATOR = new x(20);
    private final Bundle a;

    public Bundleable(Object obj) throws xr {
        String strE = xq.e(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(String.valueOf(strE)));
        }
        this.a = xq.a(obj, strE, xo.a());
    }

    public final Object a() throws xr {
        return xq.b(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public Bundleable(Bundle bundle) {
        this.a = bundle;
    }
}
