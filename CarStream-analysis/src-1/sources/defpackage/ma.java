package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.widget.TextView;
import com.carstream.tech.core.call.CallWatch;
import com.carstream.tech.phone.MainActivity;
import java.util.HashSet;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ma implements n8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qa c;

    public /* synthetic */ ma(qa qaVar, String str, int i) {
        this.a = i;
        this.c = qaVar;
        this.b = str;
    }

    @Override // defpackage.n8
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                qa qaVar = this.c;
                MainActivity mainActivity = qaVar.a;
                String str = this.b;
                xc.m(mainActivity, str, z);
                qaVar.d();
                TextView textView = qaVar.e;
                if (textView != null) {
                    textView.setText(qaVar.o());
                }
                TextView textView2 = qaVar.f;
                if (textView2 != null) {
                    textView2.setText(qaVar.r());
                }
                if ("showSpeed".equals(str) || "callBar".equals(str) || "launcherEnabled".equals(str)) {
                    qaVar.c();
                }
                if ("callBar".equals(str) && z && !CallWatch.coQuyen(mainActivity)) {
                    CallWatch.moTrangCapQuyen(mainActivity);
                }
                if (z) {
                    try {
                        if ("showSpeed".equals(str)) {
                            if (mainActivity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                                mainActivity.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 9);
                            }
                        } else if ("voiceOpenFirst".equals(str)) {
                            if (mainActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                mainActivity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 9);
                            }
                        } else if ("vietmapWatchdog".equals(str) && !Settings.canDrawOverlays(mainActivity)) {
                            mainActivity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + mainActivity.getPackageName())).addFlags(268435456));
                        }
                        break;
                    } catch (Throwable th) {
                        String.valueOf(th);
                        return;
                    }
                }
                break;
            default:
                HashSet hashSet = this.c.c;
                String str2 = this.b;
                if (!z) {
                    hashSet.remove(str2);
                    break;
                } else {
                    hashSet.add(str2);
                    break;
                }
        }
    }
}
