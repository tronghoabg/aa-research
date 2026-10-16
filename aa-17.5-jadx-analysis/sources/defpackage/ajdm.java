package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class ajdm extends aiuz {
    private final String a;
    private final ajdj b;

    public ajdm(int i, int i2, long j, String str) {
        this.a = str;
        this.b = new ajdj(i, i2, j, str);
    }

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        this.b.a(runnable, false, false);
    }

    public void close() {
        this.b.f();
    }

    @Override // defpackage.aiuz
    public final Executor e() {
        return this.b;
    }

    @Override // defpackage.aitu
    public final void f(afco afcoVar, Runnable runnable) {
        this.b.a(runnable, false, true);
    }

    public final void h(Runnable runnable, boolean z) {
        this.b.a(runnable, true, z);
    }
}
