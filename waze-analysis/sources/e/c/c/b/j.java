package e.c.c.b;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Map map = k.f47897d;
        ArrayList arrayList = new ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) arrayList.get(i2);
            if (scheduledThreadPoolExecutor.isShutdown()) {
                map.remove(scheduledThreadPoolExecutor);
            } else {
                scheduledThreadPoolExecutor.purge();
            }
        }
    }
}
