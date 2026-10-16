package androidx.compose.animation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalLookaheadAnimationVisualDebugConfig$2 extends y implements a<ProvidableCompositionLocal<LookaheadAnimationVisualDebugConfig>> {
    public static final CompositionLocalsKt$LocalLookaheadAnimationVisualDebugConfig$2 INSTANCE = new CompositionLocalsKt$LocalLookaheadAnimationVisualDebugConfig$2();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.CompositionLocalsKt$LocalLookaheadAnimationVisualDebugConfig$2$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<LookaheadAnimationVisualDebugConfig> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final LookaheadAnimationVisualDebugConfig invoke() {
            return new LookaheadAnimationVisualDebugConfig(false, 0L, 0L, 0L, false, 30, null);
        }
    }

    CompositionLocalsKt$LocalLookaheadAnimationVisualDebugConfig$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final ProvidableCompositionLocal<LookaheadAnimationVisualDebugConfig> invoke() {
        return CompositionLocalKt.staticCompositionLocalOf(AnonymousClass1.INSTANCE);
    }
}
