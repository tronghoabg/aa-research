package androidx.compose.animation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalLookaheadAnimationVisualDebugColor$2 extends y implements a<ProvidableCompositionLocal<Color>> {
    public static final CompositionLocalsKt$LocalLookaheadAnimationVisualDebugColor$2 INSTANCE = new CompositionLocalsKt$LocalLookaheadAnimationVisualDebugColor$2();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.CompositionLocalsKt$LocalLookaheadAnimationVisualDebugColor$2$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<Color> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m8218boximpl(m1750invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m1750invoke0d7_KjU() {
            return Color.Companion.m8264getUnspecified0d7_KjU();
        }
    }

    CompositionLocalsKt$LocalLookaheadAnimationVisualDebugColor$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final ProvidableCompositionLocal<Color> invoke() {
        return CompositionLocalKt.staticCompositionLocalOf(AnonymousClass1.INSTANCE);
    }
}
