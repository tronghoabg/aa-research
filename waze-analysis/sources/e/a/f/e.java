package e.a.f;

import j$.util.Objects;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f47668b;

    /* synthetic */ e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f47668b = fVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            if (this.f47668b.f47676h == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (Exception e2) {
            this.f47668b.f47672d.e(e2);
        }
    }
}
