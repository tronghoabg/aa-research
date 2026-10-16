package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eeh;
import defpackage.fhw;
import defpackage.fhx;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new eeh(10);
    public final fhx a;

    public ParcelImpl(Parcel parcel) {
        this.a = new fhw(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        new fhw(parcel).k(this.a);
    }

    public ParcelImpl(fhx fhxVar) {
        this.a = fhxVar;
    }
}
