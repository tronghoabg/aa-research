package M1;

import N2.j;
import X0.C1289q;
import X0.E;
import X0.w;
import android.app.Notification;
import android.os.Build;

/* loaded from: classes.dex */
public final class c extends E {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7285e;

    @Override // X0.E
    public final void b(j jVar) {
        switch (this.f7285e) {
            case 0:
                int i5 = Build.VERSION.SDK_INT;
                Notification.Builder builder = (Notification.Builder) jVar.f8381d;
                if (i5 < 34) {
                    a.d(builder, a.b(a.a(), null, null));
                    break;
                } else {
                    a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), null, null));
                    break;
                }
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    ((Notification.Builder) jVar.f8381d).setStyle(w.a());
                    break;
                }
                break;
        }
    }

    @Override // X0.E
    public String c() {
        switch (this.f7285e) {
            case 1:
                return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
            default:
                return super.c();
        }
    }

    @Override // X0.E
    public final void d() {
        switch (this.f7285e) {
            case 0:
                break;
            default:
                if (Build.VERSION.SDK_INT < 24) {
                    ((C1289q) this.f15788b).getClass();
                    ((C1289q) this.f15788b).getClass();
                    break;
                }
                break;
        }
    }

    @Override // X0.E
    public final void e() {
        switch (this.f7285e) {
            case 0:
                break;
            default:
                if (Build.VERSION.SDK_INT < 24) {
                    ((C1289q) this.f15788b).getClass();
                    break;
                }
                break;
        }
    }

    @Override // X0.E
    public void f() {
        switch (this.f7285e) {
            case 1:
                if (Build.VERSION.SDK_INT < 24) {
                    ((C1289q) this.f15788b).getClass();
                    ((C1289q) this.f15788b).getClass();
                    break;
                }
                break;
        }
    }

    private final void j() {
    }

    private final void k() {
    }
}
