package androidx.compose.runtime.reflect;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableInfo {
    public static final int $stable = 0;
    private final int changedParams;
    private final int defaultParams;
    private final boolean isComposable;
    private final int realParamsCount;

    public ComposableInfo(boolean z, int i2, int i3, int i4) {
        this.isComposable = z;
        this.realParamsCount = i2;
        this.changedParams = i3;
        this.defaultParams = i4;
    }

    public static /* synthetic */ ComposableInfo copy$default(ComposableInfo composableInfo, boolean z, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = composableInfo.isComposable;
        }
        if ((i5 & 2) != 0) {
            i2 = composableInfo.realParamsCount;
        }
        if ((i5 & 4) != 0) {
            i3 = composableInfo.changedParams;
        }
        if ((i5 & 8) != 0) {
            i4 = composableInfo.defaultParams;
        }
        return composableInfo.copy(z, i2, i3, i4);
    }

    public final boolean component1() {
        return this.isComposable;
    }

    public final int component2() {
        return this.realParamsCount;
    }

    public final int component3() {
        return this.changedParams;
    }

    public final int component4() {
        return this.defaultParams;
    }

    public final ComposableInfo copy(boolean z, int i2, int i3, int i4) {
        return new ComposableInfo(z, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) obj;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public final int getChangedParams() {
        return this.changedParams;
    }

    public final int getDefaultParams() {
        return this.defaultParams;
    }

    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    public int hashCode() {
        return (((((ComposableInfo$$ExternalSyntheticBackport0.m(this.isComposable) * 31) + this.realParamsCount) * 31) + this.changedParams) * 31) + this.defaultParams;
    }

    public final boolean isComposable() {
        return this.isComposable;
    }

    public String toString() {
        return "ComposableInfo(isComposable=" + this.isComposable + ", realParamsCount=" + this.realParamsCount + ", changedParams=" + this.changedParams + ", defaultParams=" + this.defaultParams + ')';
    }
}
