package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2856a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f36885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36886b;

    public AbstractC2856a(IBinder iBinder, String str) {
        this.f36885a = iBinder;
        this.f36886b = str;
    }

    public final void R(int i5, Parcel parcel) {
        try {
            this.f36885a.transact(i5, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f36885a;
    }
}
