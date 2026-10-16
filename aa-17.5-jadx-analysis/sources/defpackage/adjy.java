package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class adjy extends adjx {
    protected adjy() {
    }

    @Override // defpackage.adjx
    @Deprecated
    public abstract adlo b();

    public final void c(long j, TimeUnit timeUnit) {
        adlo adloVarB = b();
        woy.R(true, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            ((adwb) adloVarB).p = -1L;
        } else {
            ((adwb) adloVarB).p = Math.max(timeUnit.toMillis(j), adwb.c);
        }
    }
}
