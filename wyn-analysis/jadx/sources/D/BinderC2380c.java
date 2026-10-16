package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: d.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2380c extends Binder implements InterfaceC2379b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33922b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2381d f33923a;

    public BinderC2380c(C2381d c2381d) {
        this.f33923a = c2381d;
        attachInterface(this, InterfaceC2379b.f33921Y8);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) {
        String str = InterfaceC2379b.f33921Y8;
        if (i5 >= 1 && i5 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i5 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i5 != 1) {
            return super.onTransact(i5, parcel, parcel2, i10);
        }
        this.f33923a.c(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
