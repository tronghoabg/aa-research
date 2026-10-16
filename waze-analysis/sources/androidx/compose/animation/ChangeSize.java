package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ChangeSize {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;
    private final l<IntSize, IntSize> size;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.ChangeSize$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<IntSize, IntSize> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            intSize.m11343unboximpl();
            return IntSize.m11331boximpl(0L);
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m1747invokemzRDjE0(long j2) {
            return 0L;
        }
    }

    public /* synthetic */ ChangeSize(Alignment alignment, AnonymousClass1 anonymousClass1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i2, o oVar) {
        this(alignment, (i2 & 2) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1, finiteAnimationSpec, z | (!((i2 & 8) == 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, l lVar, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i2 & 2) != 0) {
            lVar = changeSize.size;
        }
        if ((i2 & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i2 & 8) != 0) {
            z = changeSize.clip;
        }
        return changeSize.copy(alignment, lVar, finiteAnimationSpec, z);
    }

    public final Alignment component1() {
        return this.alignment;
    }

    public final l<IntSize, IntSize> component2() {
        return this.size;
    }

    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.clip;
    }

    public final ChangeSize copy(Alignment alignment, l<? super IntSize, IntSize> lVar, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        return new ChangeSize(alignment, lVar, finiteAnimationSpec, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return x.n(this.alignment, changeSize.alignment) && x.n(this.size, changeSize.size) && x.n(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final l<IntSize, IntSize> getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31) + ChangeSize$$ExternalSyntheticBackport0.m(this.clip);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(Alignment alignment, l<? super IntSize, IntSize> lVar, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        this.alignment = alignment;
        this.size = lVar;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z;
    }
}
