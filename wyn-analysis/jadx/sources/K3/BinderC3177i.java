package k3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: k3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC3177i extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f39205a;

    public BinderC3177i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f39205a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final void R(int i5, String[] tables) {
        AbstractC3340k.e(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f39205a;
        synchronized (multiInstanceInvalidationService.f19046c) {
            String str = (String) multiInstanceInvalidationService.f19045b.get(Integer.valueOf(i5));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f19046c.beginBroadcast();
            for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f19046c.getBroadcastCookie(i10);
                    AbstractC3340k.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f19045b.get(num);
                    if (i5 != iIntValue && str.equals(str2)) {
                        try {
                            ((C3174f) multiInstanceInvalidationService.f19046c.getBroadcastItem(i10)).R(tables);
                        } catch (RemoteException e7) {
                            Log.w("ROOM", "Error invoking a remote callback", e7);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f19046c.finishBroadcast();
                }
            }
        }
    }

    public final int S(C3174f callback, String str) {
        AbstractC3340k.e(callback, "callback");
        int i5 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f39205a;
        synchronized (multiInstanceInvalidationService.f19046c) {
            try {
                int i10 = multiInstanceInvalidationService.f19044a + 1;
                multiInstanceInvalidationService.f19044a = i10;
                if (multiInstanceInvalidationService.f19046c.register(callback, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f19045b.put(Integer.valueOf(i10), str);
                    i5 = i10;
                } else {
                    multiInstanceInvalidationService.f19044a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i5;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 >= 1 && i5 <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i5 == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        C3174f callback = null;
        if (i5 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C3174f)) {
                    callback = new C3174f();
                    callback.f39192a = strongBinder;
                } else {
                    callback = (C3174f) iInterfaceQueryLocalInterface;
                }
            }
            int iS = S(callback, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iS);
            return true;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                return super.onTransact(i5, parcel, parcel2, i10);
            }
            R(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof C3174f)) {
                callback = new C3174f();
                callback.f39192a = strongBinder2;
            } else {
                callback = (C3174f) iInterfaceQueryLocalInterface2;
            }
        }
        int i11 = parcel.readInt();
        AbstractC3340k.e(callback, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f39205a;
        synchronized (multiInstanceInvalidationService.f19046c) {
            multiInstanceInvalidationService.f19046c.unregister(callback);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
