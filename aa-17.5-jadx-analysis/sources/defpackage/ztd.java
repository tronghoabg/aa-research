package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class ztd implements ComponentCallbacks2 {
    final /* synthetic */ ExecutorService a;
    final /* synthetic */ xyc b;
    final /* synthetic */ zyb c;
    final /* synthetic */ zbi d;
    final /* synthetic */ Application e;
    final /* synthetic */ ztf f;

    public ztd(ExecutorService executorService, xyc xycVar, zyb zybVar, zbi zbiVar, Application application, ztf ztfVar) {
        this.a = executorService;
        this.b = xycVar;
        this.c = zybVar;
        this.d = zbiVar;
        this.e = application;
        this.f = ztfVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.a.execute(new saq(this.b, this.c, this.d, this.e, 13, (byte[]) null));
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            ztf ztfVar = this.f;
            synchronized (ztfVar) {
                ztfVar.b = 0;
            }
            ztfVar.a();
            tng tngVar = (tng) ztfVar.c.gu();
            if (tngVar != null) {
                if (tngVar.f != -1 && tngVar.e != null) {
                    tngVar.b.execute(new shd(tngVar, 9));
                }
                tngVar.a();
            }
            uxn uxnVar = ztfVar.d;
            if (uxnVar != null) {
                uxnVar.e();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
