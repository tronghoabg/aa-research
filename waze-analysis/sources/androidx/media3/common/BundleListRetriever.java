package androidx.media3.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BundleListRetriever extends Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private final bn<Bundle> list;

    public BundleListRetriever(List<Bundle> list) {
        this.list = bn.n(list);
    }

    public static bn<Bundle> getList(IBinder iBinder) {
        return iBinder instanceof BundleListRetriever ? ((BundleListRetriever) iBinder).list : getListFromRemoteBinder(iBinder);
    }

    static bn<Bundle> getListFromRemoteBinder(IBinder iBinder) {
        int i2;
        int i3 = bn.f7456d;
        bi biVar = new bi();
        int i4 = 1;
        int i5 = 0;
        while (i4 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i5);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i2 = parcelObtain2.readInt();
                        if (i2 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            an.B(bundle);
                            biVar.g(bundle);
                            i5++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i4 = i2;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return biVar.f();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.list.size();
        int i4 = parcel.readInt();
        while (i4 < size && parcel2.dataSize() < C.SUGGESTED_MAX_IPC_SIZE) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.list.get(i4));
            i4++;
        }
        parcel2.writeInt(i4 < size ? 2 : 0);
        return true;
    }
}
