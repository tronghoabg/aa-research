package R3;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import u.f;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10223a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f10226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10227e;

    public b(SystemForegroundService systemForegroundService, int i5, Notification notification, int i10) {
        this.f10227e = systemForegroundService;
        this.f10224b = i5;
        this.f10226d = notification;
        this.f10225c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10223a) {
            case 0:
                int i5 = Build.VERSION.SDK_INT;
                int i10 = this.f10225c;
                Notification notification = (Notification) this.f10226d;
                int i11 = this.f10224b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f10227e;
                if (i5 < 31) {
                    if (i5 < 29) {
                        systemForegroundService.startForeground(i11, notification);
                        break;
                    } else {
                        d.a(systemForegroundService, i11, notification, i10);
                        break;
                    }
                } else {
                    e.a(systemForegroundService, i11, notification, i10);
                    break;
                }
            default:
                ((f) this.f10227e).f46068b.onActivityResized(this.f10224b, this.f10225c, (Bundle) this.f10226d);
                break;
        }
    }

    public b(f fVar, int i5, int i10, Bundle bundle) {
        this.f10227e = fVar;
        this.f10224b = i5;
        this.f10225c = i10;
        this.f10226d = bundle;
    }
}
