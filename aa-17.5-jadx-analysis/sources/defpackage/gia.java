package defpackage;

import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class gia extends TimerTask {
    final /* synthetic */ gib a;

    public gia(gib gibVar) {
        this.a = gibVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [afdr, java.lang.Object] */
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.a.invoke();
    }
}
