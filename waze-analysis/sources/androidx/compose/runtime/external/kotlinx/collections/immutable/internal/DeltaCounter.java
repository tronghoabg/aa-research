package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DeltaCounter {
    public static final int $stable = 8;
    private int count;

    public /* synthetic */ DeltaCounter(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 0 : i2);
    }

    public static /* synthetic */ DeltaCounter copy$default(DeltaCounter deltaCounter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = deltaCounter.count;
        }
        return deltaCounter.copy(i2);
    }

    public final int component1() {
        return this.count;
    }

    public final DeltaCounter copy(int i2) {
        return new DeltaCounter(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.count == ((DeltaCounter) obj).count;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return this.count;
    }

    public final void plusAssign(int i2) {
        this.count += i2;
    }

    public final void setCount(int i2) {
        this.count = i2;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public DeltaCounter(int i2) {
        this.count = i2;
    }

    public DeltaCounter() {
        this(0, 1, null);
    }
}
