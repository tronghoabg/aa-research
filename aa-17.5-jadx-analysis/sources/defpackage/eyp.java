package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.telecom.extensions.Capability;
import androidx.room.MultiInstanceInvalidationService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class eyp extends Binder implements IInterface {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public eyp(aitf aitfVar, int i) {
        this.b = i;
        this.a = aitfVar;
        attachInterface(this, "androidx.core.telecom.extensions.ICapabilityExchange");
    }

    /* JADX WARN: Type inference failed for: r8v20, types: [afck, aitf, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        dyc dyaVar;
        Set setCl;
        int i3 = 0;
        i3 = 0;
        Object eyoVar = null;
        if (this.b != 0) {
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface("androidx.core.telecom.extensions.ICapabilityExchange");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.core.telecom.extensions.ICapabilityExchange");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Capability.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                dyaVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.core.telecom.extensions.ICapabilityExchangeListener");
                dyaVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dyc)) ? new dya(strongBinder) : (dyc) iInterfaceQueryLocalInterface;
            }
            StringBuilder sb = new StringBuilder("registerWithRemoteService: received remote result, caps=");
            sb.append(arrayListCreateTypedArrayList);
            sb.append(", listener is null=");
            sb.append(dyaVar == null);
            Log.d("CallExtensions", sb.toString());
            ?? r8 = this.a;
            if (!r8.h()) {
                return true;
            }
            if (dyaVar != null) {
                if (arrayListCreateTypedArrayList != null) {
                    setCl = woy.cl(arrayListCreateTypedArrayList);
                } else {
                    setCl = Collections.EMPTY_SET;
                    setCl.getClass();
                }
                eyoVar = new dxk(setCl, new dyv(dyaVar));
            }
            r8.w(eyoVar);
            return true;
        }
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        if (i == 1) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                eyoVar = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof eyo)) ? new eyo(strongBinder2) : (eyo) iInterfaceQueryLocalInterface2;
            }
            String string = parcel.readString();
            eyoVar.getClass();
            if (string != null) {
                Object obj = this.a;
                RemoteCallbackList remoteCallbackList = ((MultiInstanceInvalidationService) obj).c;
                synchronized (remoteCallbackList) {
                    int i4 = ((MultiInstanceInvalidationService) obj).a + 1;
                    ((MultiInstanceInvalidationService) obj).a = i4;
                    Integer numValueOf = Integer.valueOf(i4);
                    if (remoteCallbackList.register(eyoVar, numValueOf)) {
                        ((MultiInstanceInvalidationService) obj).b.put(numValueOf, string);
                        i3 = i4;
                    } else {
                        ((MultiInstanceInvalidationService) obj).a--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                eyoVar = (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof eyo)) ? new eyo(strongBinder3) : (eyo) iInterfaceQueryLocalInterface3;
            }
            int i5 = parcel.readInt();
            eyoVar.getClass();
            Object obj2 = this.a;
            RemoteCallbackList remoteCallbackList2 = ((MultiInstanceInvalidationService) obj2).c;
            synchronized (remoteCallbackList2) {
                remoteCallbackList2.unregister(eyoVar);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        Object obj3 = this.a;
        RemoteCallbackList remoteCallbackList3 = ((MultiInstanceInvalidationService) obj3).c;
        synchronized (remoteCallbackList3) {
            Map map = ((MultiInstanceInvalidationService) obj3).b;
            String str = (String) map.get(Integer.valueOf(i6));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return true;
            }
            int iBeginBroadcast = remoteCallbackList3.beginBroadcast();
            for (int i7 = 0; i7 < iBeginBroadcast; i7++) {
                try {
                    Object broadcastCookie = remoteCallbackList3.getBroadcastCookie(i7);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) map.get(num);
                    if (i6 != iIntValue && affa.f(str, str2)) {
                        try {
                            eyo eyoVar2 = (eyo) remoteCallbackList3.getBroadcastItem(i7);
                            Parcel parcelObtain = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                parcelObtain.writeStringArray(strArrCreateStringArray);
                                eyoVar2.a.transact(1, parcelObtain, null, 1);
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                parcelObtain.recycle();
                                throw th;
                            }
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } finally {
                    ((MultiInstanceInvalidationService) obj3).c.finishBroadcast();
                }
            }
            return true;
        }
    }

    public eyp(MultiInstanceInvalidationService multiInstanceInvalidationService, int i) {
        this.b = i;
        this.a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
