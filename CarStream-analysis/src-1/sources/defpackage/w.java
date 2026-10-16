package defpackage;

import io.github.muntashirakon.adb.android.AdbMdns;
import java.net.InetAddress;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class w implements AdbMdns.OnAdbDaemonDiscoveredListener {
    @Override // io.github.muntashirakon.adb.android.AdbMdns.OnAdbDaemonDiscoveredListener
    public final void onPortChanged(InetAddress inetAddress, int i) {
        if (i > 0) {
            b0.j = i;
            b0.i = inetAddress == null ? null : inetAddress.getHostAddress();
        }
    }
}
