package u;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import b.InterfaceC1488a;
import com.moloco.sdk.internal.publisher.H;

/* loaded from: classes.dex */
public final class f extends Binder implements InterfaceC1488a {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f46067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4159a f46068b;

    public f(AbstractC4159a abstractC4159a) {
        this.f46068b = abstractC4159a;
        attachInterface(this, InterfaceC1488a.f19096T8);
        this.f46067a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) {
        String str = InterfaceC1488a.f19096T8;
        if (i5 >= 1 && i5 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i5 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f46067a;
        AbstractC4159a abstractC4159a = this.f46068b;
        switch (i5) {
            case 2:
                int i11 = parcel.readInt();
                Bundle bundle = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new M3.i(this, i11, bundle, 6));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new c(this, string, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new RunnableC4160b(this, bundle3, 1));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new c(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i12 = parcel.readInt();
                Uri uri = (Uri) H.O(parcel, Uri.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new d(this, i12, uri, z2, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = abstractC4159a == null ? null : abstractC4159a.extraCallbackWithResult(parcel.readString(), (Bundle) H.O(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (bundleExtraCallbackWithResult == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleExtraCallbackWithResult.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                Bundle bundle6 = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new R3.b(this, i13, i14, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new RunnableC4160b(this, bundle7, 2));
                    return true;
                }
                return true;
            case 10:
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                Bundle bundle8 = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new e(this, i15, i16, i17, i18, i19, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new RunnableC4160b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) H.O(parcel, Bundle.CREATOR);
                if (abstractC4159a != null) {
                    handler.post(new RunnableC4160b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i5, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
