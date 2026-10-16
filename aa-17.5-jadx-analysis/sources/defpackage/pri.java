package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public class pri implements zge {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/concurrent/FutureChecker$CrashOnFailureDebugCallback");

    @Override // defpackage.zge
    public void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        th.getMessage();
        ((ynz) ((ynz) ((ynz) a.g()).p(th)).ai((char) 6852)).u("Future resolved as failure");
    }

    @Override // defpackage.zge
    public void b(Object obj) {
    }
}
