package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public abstract class agk {
    private final bwq a = new ParcelableSnapshotMutableState(false, bxp.c);

    public abstract Object a();

    public abstract Object b();

    public abstract void c(Object obj);

    public final void f(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    public final boolean g() {
        return ((Boolean) this.a.a()).booleanValue();
    }
}
