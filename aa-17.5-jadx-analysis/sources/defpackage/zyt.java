package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class zyt implements Runnable {
    public final ExecutorService c;
    public int d;
    private yvx f;
    private final zyq g;
    private final aaau h;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    private boolean e = false;

    public zyt(zyq zyqVar, aaau aaauVar, ExecutorService executorService) {
        this.g = zyqVar;
        this.h = aaauVar;
        this.c = executorService;
    }

    public final synchronized void a() {
        if (!this.e) {
            if (!addm.h()) {
                this.e = true;
                this.c.execute(this);
                return;
            }
            ExecutorService executorService = this.c;
            if (!executorService.isShutdown()) {
                this.e = true;
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zyt.run():void");
    }
}
