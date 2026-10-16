package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;
import com.carstream.tech.core.speed.SpeedBubble;
import io.github.muntashirakon.adb.android.AdbMdns;
import java.io.File;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class t implements Runnable {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final /* synthetic */ Object d;

    public t(l9 l9Var, int i, Bundle bundle) {
        this.d = l9Var;
        this.b = i;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strSubstring;
        int i;
        switch (this.a) {
            case 0:
                u5.d("nhan ma (dai " + ((String) this.c).length() + "), cong luc nhan=" + this.b);
                int i2 = this.b;
                for (int i3 = 0; i2 <= 0 && i3 < 20; i3++) {
                    try {
                        Thread.sleep(250L);
                    } catch (Throwable unused) {
                    }
                    i2 = u.a;
                }
                if (i2 <= 0) {
                    u.d = "Chưa thấy máy. Hộp thoại ghép nối phải đang mở.";
                    u5.d("cho 5s van KHONG thay cong ghep noi (mDNS khong ra)");
                    u5.c((Context) this.d, "pair_khong_thay_cong", "mdns_khong_thay_cong");
                    u.a((Context) this.d, u.d);
                    return;
                }
                u5.d("bat dau ghep noi toi " + u.b + ":" + i2);
                Context context = (Context) this.d;
                String str = u.b;
                String str2 = (String) this.c;
                try {
                    a0 a0VarP = b0.p(context);
                    if (str != null) {
                        a0VarP.setHostAddress(str);
                    }
                    boolean zPair = a0VarP.pair(i2, str2);
                    u5.d("pair(" + i2 + ") -> " + (zPair ? "OK" : "may TU CHOI ma"));
                    if (zPair) {
                        try {
                            b0.g(new File(context.getFilesDir(), "adb-da-ghep"), new byte[]{1});
                        } catch (Throwable unused2) {
                        }
                    }
                    strSubstring = zPair ? null : "máy từ chối mã";
                } catch (Throwable th) {
                    String.valueOf(th);
                    String simpleName = th.getClass().getSimpleName();
                    if (th.getMessage() != null) {
                        simpleName = simpleName + ": " + th.getMessage();
                    }
                    u5.d("pair LOI: " + simpleName);
                    strSubstring = simpleName.length() > 90 ? simpleName.substring(0, 90) : simpleName;
                }
                z = strSubstring == null;
                u.d = z ? "Đã ghép nối." : ad.g("Ghép nối hỏng: ", strSubstring);
                u5.d("ket qua ghep noi: " + (z ? "OK" : strSubstring));
                Context context2 = (Context) this.d;
                String str3 = z ? "pair_ok" : "pair_that_bai";
                if (z) {
                    strSubstring = null;
                }
                u5.c(context2, str3, strSubstring);
                synchronized (u.class) {
                    AdbMdns adbMdns = u.c;
                    u.c = null;
                    if (adbMdns != null) {
                        try {
                            adbMdns.stop();
                        } catch (Throwable unused3) {
                        }
                    }
                }
                try {
                    b0.h((Context) this.d, false);
                } catch (Throwable unused4) {
                }
                if (!z) {
                    u.a((Context) this.d, u.d);
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) ((Context) this.d).getSystemService(NotificationManager.class);
                    if (notificationManager != null) {
                        notificationManager.cancel(4712);
                    }
                } catch (Throwable unused5) {
                }
                b0.b((Context) this.d);
                return;
            case 1:
                ((l9) this.d).onReceiveResult(this.b, (Bundle) this.c);
                return;
            default:
                za zaVar = (za) this.d;
                e eVar = zaVar.a;
                FrameLayout frameLayout = (FrameLayout) this.c;
                if ((frameLayout.getWidth() == 0 || zaVar.c.getWidth() == 0) && (i = this.b) > 0) {
                    int i4 = i - 1;
                    FrameLayout frameLayout2 = eVar.b.rootLayout;
                    SpeedBubble speedBubble = zaVar.c;
                    if (speedBubble == null || frameLayout2 == null) {
                        return;
                    }
                    speedBubble.post(new t(zaVar, frameLayout2, i4));
                    return;
                }
                CarScreen carScreen = eVar.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zaVar.c.getLayoutParams();
                int iG = k1.g(carScreen, 12.0f);
                int iMax = Math.max(0, frameLayout.getWidth() - zaVar.c.getWidth());
                int iMax2 = Math.max(0, frameLayout.getHeight() - zaVar.c.getHeight());
                int i5 = carScreen.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getInt(xc.h(za.a(frameLayout)), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                int i6 = carScreen.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getInt(xc.h(za.b(frameLayout)), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                if (i5 != Integer.MIN_VALUE && i6 != Integer.MIN_VALUE) {
                    z = false;
                }
                if (z) {
                    i5 = carScreen.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getInt(xc.h("speedX"), Math.max(0, iMax - iG));
                    i6 = carScreen.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getInt(xc.h("speedY"), iG);
                }
                layoutParams.leftMargin = za.e(i5, iMax);
                layoutParams.topMargin = za.e(i6, iMax2);
                zaVar.c.setLayoutParams(layoutParams);
                if (z) {
                    xc.n(layoutParams.leftMargin, carScreen, za.a(frameLayout));
                    xc.n(layoutParams.topMargin, carScreen, za.b(frameLayout));
                }
                zaVar.c.getWidth();
                zaVar.c.getHeight();
                frameLayout.getWidth();
                frameLayout.getHeight();
                return;
        }
    }

    public t(int i, Context context, String str) {
        this.c = str;
        this.b = i;
        this.d = context;
    }

    public t(za zaVar, FrameLayout frameLayout, int i) {
        this.d = zaVar;
        this.c = frameLayout;
        this.b = i;
    }
}
