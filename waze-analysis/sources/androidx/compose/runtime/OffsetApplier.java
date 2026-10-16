package androidx.compose.runtime;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 8;
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(Applier<N> applier, int i2) {
        this.applier = applier;
        this.offset = i2;
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(p<? super N, Object, ab> pVar, Object obj) {
        this.applier.apply(pVar, obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n) {
        this.nesting++;
        this.applier.down(n);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i2, N n) {
        this.applier.insertBottomUp(i2 + (this.nesting == 0 ? this.offset : 0), n);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i2, N n) {
        this.applier.insertTopDown(i2 + (this.nesting == 0 ? this.offset : 0), n);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i2, int i3, int i4) {
        int i5 = this.nesting == 0 ? this.offset : 0;
        this.applier.move(i2 + i5, i3 + i5, i4);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i2, int i3) {
        this.applier.remove(i2 + (this.nesting == 0 ? this.offset : 0), i3);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.applier.reuse();
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (this.nesting <= 0) {
            ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.up();
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onBeginChanges() {
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onEndChanges() {
    }
}
