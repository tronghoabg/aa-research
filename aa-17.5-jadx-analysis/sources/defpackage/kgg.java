package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class kgg extends qjm {
    private final AtomicReference a;
    private final Runnable b;

    public kgg(AtomicReference atomicReference, Runnable runnable) {
        this.a = atomicReference;
        this.b = runnable;
    }

    @Override // defpackage.qjm
    public final void e(String str) {
        this.a.set(str);
    }

    @Override // defpackage.qjm
    public final void f() {
        this.b.run();
    }

    @Override // defpackage.qjm
    public final void c() {
    }

    @Override // defpackage.qjm
    public final void a(String str, int i) {
    }

    @Override // defpackage.qjm
    public final void d(String str, String str2) {
    }

    @Override // defpackage.qjm
    public final void b(String str, int i, Bitmap bitmap) {
    }
}
