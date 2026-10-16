package defpackage;

import android.os.Build;

/* loaded from: classes2.dex */
public final class ion extends qtz {
    final /* synthetic */ ioq a;

    public ion(ioq ioqVar) {
        this.a = ioqVar;
    }

    @Override // defpackage.qua
    public final void a(qtu qtuVar) {
        int i;
        ((ype) ioq.E.l().ai((char) 830)).u("AppDecorService is ready callback");
        ioq ioqVar = this.a;
        ioqVar.I = qtuVar;
        if (!acpf.m() || Build.VERSION.SDK_INT < 37 || (i = ioqVar.M) == -1) {
            return;
        }
        ioqVar.N(i);
    }
}
