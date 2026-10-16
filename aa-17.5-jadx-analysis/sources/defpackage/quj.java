package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.AudioFocusInfo;

/* loaded from: classes2.dex */
public interface quj extends IInterface {
    void e(AudioFocusInfo audioFocusInfo) throws RemoteException;

    void f(AudioFocusInfo audioFocusInfo, int i) throws RemoteException;

    void g(AudioFocusInfo audioFocusInfo, boolean z) throws RemoteException;

    void h(AudioFocusInfo audioFocusInfo, int i) throws RemoteException;
}
