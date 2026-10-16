package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackMetadata;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackStatus;

/* loaded from: classes2.dex */
public interface rhr extends IInterface {
    void e(CarLocalMediaPlaybackMetadata carLocalMediaPlaybackMetadata) throws RemoteException;

    void f(CarLocalMediaPlaybackStatus carLocalMediaPlaybackStatus) throws RemoteException;
}
