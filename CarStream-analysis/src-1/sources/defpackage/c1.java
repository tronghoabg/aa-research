package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.PowerManager;
import android.widget.ImageView;
import androidx.car.app.navigation.NavigationManagerCallback;
import com.carstream.tech.car.e;
import com.carstream.tech.media.ControllerService;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class c1 implements d1, r8, y5, NavigationManagerCallback {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c1() {
        this.a = 1;
    }

    @Override // defpackage.d1
    public void a(Bitmap bitmap) {
        switch (this.a) {
            case 0:
                ((ImageView) this.b).setImageBitmap(bitmap);
                break;
            default:
                ((ControllerService) this.b).publishNowPlaying();
                break;
        }
    }

    @Override // defpackage.r8
    public void b(bd bdVar) {
        String str;
        e eVar = ((l3) this.b).b;
        int iH = ad.h(bdVar.a);
        if (iH == 0) {
            eVar.v();
            return;
        }
        if (iH == 1) {
            eVar.l();
            return;
        }
        if (iH == 2) {
            eVar.u();
            return;
        }
        if (iH == 3) {
            eVar.b.toggleFullscreen();
        } else if (iH == 4 && (str = bdVar.c) != null) {
            eVar.z(str);
        }
    }

    @Override // defpackage.y5
    public void c(z5 z5Var) {
        boolean z = z5Var.a;
        String str = z5Var.b;
        if (z) {
            return;
        }
        String str2 = a6.a;
        if ("key_revoked".equals(str) || "key_expired".equals(str) || "key_suspended".equals(str) || "hwid_mismatch".equals(str) || "token_invalid".equals(str) || "key_not_found".equals(str)) {
            Context context = (Context) this.b;
            xc.p(context, "licenseToken", "");
            xc.p(context, "licenseKey", "");
            xc.p(context, "scriptKey", "");
            xc.p(context, "launcherKey", "");
            z6.j();
        }
    }

    public void d(String str) {
        switch (this.a) {
            case 7:
                ((qa) ((u0) this.b).c).c();
                break;
            case 8:
                ((ja) this.b).c.c();
                break;
            default:
                ka kaVar = (ka) this.b;
                kaVar.e.c();
                if (!str.isEmpty()) {
                    kaVar.d.setText("Thêm và tải");
                    kaVar.c.setText(str.concat("\nKiểm tra lại đường dẫn, hoặc thử mở nó trên trình duyệt."));
                    break;
                } else {
                    kaVar.b.dismiss();
                    break;
                }
        }
    }

    public void e() {
        if (((x5) this.b).i) {
            return;
        }
        x5 x5Var = (x5) this.b;
        if (x5Var.e) {
            int i = x5Var.k + 1;
            x5Var.k = i;
            if (i >= 30) {
                synchronized (x5Var) {
                    if (x5Var.i) {
                        return;
                    }
                    x5Var.i = true;
                    try {
                        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) x5Var.a.getApplicationContext().getSystemService("power")).newWakeLock(1, "carstream:mirror");
                        x5Var.j = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                    } catch (Throwable th) {
                        String.valueOf(th);
                    }
                    l7 l7Var = k1.g;
                    if (l7Var != null) {
                        l7Var.c('o');
                    }
                }
            }
        }
    }

    @Override // androidx.car.app.navigation.NavigationManagerCallback
    public void onStopNavigation() {
        ((lb) this.b).b.post(new t7(this, 9));
    }

    @Override // defpackage.r8
    public void seekTo(long j) {
        ((l3) this.b).b.C(j);
    }

    public /* synthetic */ c1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.car.app.navigation.NavigationManagerCallback
    public void onAutoDriveEnabled() {
    }
}
