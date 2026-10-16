package defpackage;

import android.os.RemoteException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
interface jpu extends Callable {
    @Override // java.util.concurrent.Callable
    Object call() throws RemoteException, jnq;
}
