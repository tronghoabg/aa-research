package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public interface itd {
    int a(int i, int i2, int i3);

    @ResultIgnorabilityUnspecified
    ite b() throws RemoteException;

    int c(yfq yfqVar);

    int d(yfq yfqVar, int i);

    void e(itc itcVar);

    void f(Looper looper);
}
