package e.a.f;

import j$.util.Objects;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f47666a;

    c(f fVar) {
        Objects.requireNonNull(fVar);
        this.f47666a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            f fVar = this.f47666a;
            if (fVar.f47676h != null && fVar.f47670b.q() > 0) {
                fVar.f47676h.l(fVar.f47670b, fVar.f47670b.q());
            }
        } catch (IOException e2) {
            this.f47666a.f47672d.e(e2);
        }
        try {
            f fVar2 = this.f47666a;
            if (fVar2.f47676h != null) {
                fVar2.f47676h.close();
            }
        } catch (IOException e3) {
            this.f47666a.f47672d.e(e3);
        }
        try {
            f fVar3 = this.f47666a;
            if (fVar3.f47677i != null) {
                fVar3.f47677i.close();
            }
        } catch (IOException e4) {
            this.f47666a.f47672d.e(e4);
        }
    }
}
