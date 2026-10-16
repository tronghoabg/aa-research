package defpackage;

import android.content.Context;
import io.github.muntashirakon.adb.android.AdbMdns;
import java.net.InetAddress;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class s implements AdbMdns.OnAdbDaemonDiscoveredListener {
    public final /* synthetic */ Context a;

    public s(Context context) {
        this.a = context;
    }

    @Override // io.github.muntashirakon.adb.android.AdbMdns.OnAdbDaemonDiscoveredListener
    public final void onPortChanged(InetAddress inetAddress, int i) {
        if (i <= 0) {
            u.a = -1;
            u5.d("mDNS bao cong<=0 (hop thoai ghep noi dong) -> bo cong cu");
            u.a(this.a, "Hộp thoại ghép nối đã đóng — mở lại và để nguyên màn hình đó.");
            return;
        }
        u.a = i;
        u.b = inetAddress == null ? null : inetAddress.getHostAddress();
        u5.d("thay cong ghep noi " + u.b + ":" + i);
        u.a(this.a, "Đã thấy máy. Gõ mã 6 số vào đây.");
    }
}
