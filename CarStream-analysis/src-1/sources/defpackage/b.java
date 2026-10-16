package defpackage;

import io.github.muntashirakon.adb.AbsAdbConnectionManager;
import io.github.muntashirakon.adb.android.AdbMdns;
import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements AdbMdns.OnAdbDaemonDiscoveredListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ CountDownLatch d;

    public /* synthetic */ b(AtomicReference atomicReference, AtomicInteger atomicInteger, CountDownLatch countDownLatch, int i) {
        this.a = i;
        this.b = atomicReference;
        this.c = atomicInteger;
        this.d = countDownLatch;
    }

    @Override // io.github.muntashirakon.adb.android.AdbMdns.OnAdbDaemonDiscoveredListener
    public final void onPortChanged(InetAddress inetAddress, int i) {
        switch (this.a) {
            case 0:
                AbsAdbConnectionManager.lambda$autoConnect$0(this.b, this.c, this.d, inetAddress, i);
                break;
            case 1:
                AbsAdbConnectionManager.lambda$autoConnect$1(this.b, this.c, this.d, inetAddress, i);
                break;
            default:
                AbsAdbConnectionManager.lambda$autoConnect$2(this.b, this.c, this.d, inetAddress, i);
                break;
        }
    }
}
