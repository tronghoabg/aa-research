package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import java.lang.reflect.InvocationTargetException;
import v3.b;
import v3.c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C2555b(19);

    /* renamed from: a, reason: collision with root package name */
    public final c f19048a;

    public ParcelImpl(Parcel parcel) {
        this.f19048a = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new b(parcel).l(this.f19048a);
    }
}
