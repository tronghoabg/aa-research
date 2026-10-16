package e.c.c.b;

import java.util.concurrent.ThreadFactory;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final g[] f47871a;

    a(int i2, ThreadFactory threadFactory) {
        this.f47871a = new g[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f47871a[i3] = new g(threadFactory);
        }
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            g[] gVarArr = this.f47871a;
            if (i2 >= gVarArr.length) {
                return;
            }
            gVarArr[i2].a();
            i2++;
        }
    }
}
