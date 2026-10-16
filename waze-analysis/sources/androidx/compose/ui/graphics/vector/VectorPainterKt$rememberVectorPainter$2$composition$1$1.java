package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.p;
import h.g.a.r;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorPainterKt$rememberVectorPainter$2$composition$1$1 extends y implements p<Composer, Integer, ab> {
    final /* synthetic */ r<Float, Float, Composer, Integer, ab> $content;
    final /* synthetic */ long $viewport;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VectorPainterKt$rememberVectorPainter$2$composition$1$1(r<? super Float, ? super Float, ? super Composer, ? super Integer, ab> rVar, long j2) {
        super(2);
        this.$content = rVar;
        this.$viewport = j2;
    }

    public final void invoke(Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1749374910, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:154)");
        }
        this.$content.invoke(Float.valueOf(Float.intBitsToFloat((int) (this.$viewport >> 32))), Float.valueOf(Float.intBitsToFloat((int) (this.$viewport & MuxerUtil.UNSIGNED_INT_MAX_VALUE))), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return ab.f48028a;
    }
}
