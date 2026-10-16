package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class jmx implements rxp {
    private final /* synthetic */ int a;

    public /* synthetic */ jmx(int i) {
        this.a = i;
    }

    @Override // defpackage.rxp
    public final yfq a(Context context, ScheduledExecutorService scheduledExecutorService, xxh xxhVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? kfl.f(context, scheduledExecutorService, xxhVar) : kfl.f(context, scheduledExecutorService, xxhVar) : kfl.f(context, scheduledExecutorService, xxhVar);
    }
}
