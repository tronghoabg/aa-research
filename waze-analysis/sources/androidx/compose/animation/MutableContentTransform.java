package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableContentTransform {
    public static final int $stable = 8;
    private final MutableTransform initialTransform;
    private final MutableTransform targetTransform;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MutableContentTransform(boolean z, boolean z2, l lVar, int i2, o oVar) {
        lVar = (i2 & 4) != 0 ? AnonymousClass1.INSTANCE : lVar;
        int i3 = i2 & 2;
        int i4 = i2 & 1;
        this(1 == ((z ? 1 : 0) & (i4 ^ 1)), z2 & (i3 == 0), lVar);
    }

    public final MutableTransform getInitialTransform$animation() {
        return this.initialTransform;
    }

    public final MutableTransform getTargetTransform$animation() {
        return this.targetTransform;
    }

    public final void initialContentTransform(p<? super TransformScope, ? super IntSize, ab> pVar) {
        this.initialTransform.invoke(pVar);
    }

    public final void targetContentTransform(p<? super TransformScope, ? super IntSize, ab> pVar) {
        this.targetTransform.invoke(pVar);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.MutableContentTransform$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<MutableContentTransform, ab> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(MutableContentTransform mutableContentTransform) {
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MutableContentTransform mutableContentTransform) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableContentTransform(boolean z, boolean z2, l<? super MutableContentTransform, ab> lVar) {
        int i2 = 2;
        this.targetTransform = new MutableTransform(z2, null, i2, 0 == true ? 1 : 0);
        this.initialTransform = new MutableTransform(z, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        lVar.invoke(this);
    }

    public MutableContentTransform() {
        this(false, false, null, 7, null);
    }
}
