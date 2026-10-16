package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.car.app.CarAppService;
import androidx.car.app.Screen;
import androidx.car.app.SessionInfo;
import androidx.car.app.mediaextensions.analytics.client.AnalyticsCallback;
import androidx.car.app.mediaextensions.analytics.client.AnalyticsParser;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import com.carstream.tech.launcher.AppRepo;
import com.carstream.tech.launcher.CarLauncherActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AnalyticsParser.lambda$parseAnalyticsBundle$0((AnalyticsCallback) this.b, (Bundle) this.c);
                break;
            case 1:
                AppRepo.lambda$ganDayNhanh$5((Context) this.b, (Runnable) this.c);
                break;
            case 2:
                ((CarAppService) this.b).lambda$onUnbind$0((SessionInfo) this.c);
                break;
            case 3:
                ((CarLauncherActivity) this.b).lambda$moCsopenNeuCo$2((String) this.c);
                break;
            case 4:
                ((Consumer) this.b).accept((Location) this.c);
                break;
            default:
                ((Screen) this.b).lambda$dispatchLifecycleEvent$1((Lifecycle.Event) this.c);
                break;
        }
    }
}
