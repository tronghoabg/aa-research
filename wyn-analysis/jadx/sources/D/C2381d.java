package d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;

/* renamed from: d.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2381d implements Parcelable {
    public static final Parcelable.Creator<C2381d> CREATOR = new C1559a(17);

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2379b f33924a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        synchronized (this) {
            try {
                if (this.f33924a == null) {
                    this.f33924a = new BinderC2380c(this);
                }
                parcel.writeStrongBinder(this.f33924a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(int i5, Bundle bundle) {
    }
}
