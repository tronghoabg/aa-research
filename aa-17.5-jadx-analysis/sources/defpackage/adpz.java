package defpackage;

import android.os.IBinder;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class adpz extends adqb {
    private final adyq d;

    public adpz(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.d = new adyq(executor);
    }

    @Override // defpackage.adqb
    public final void a(int i, adqf adqfVar) {
        this.d.execute(new adpy(this, i, adqfVar.a(), 0));
        adqfVar.b();
    }
}
