package defpackage;

import android.os.RemoteException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public interface rzd extends Callable {
    @Override // java.util.concurrent.Callable
    Object call() throws RemoteException;
}
