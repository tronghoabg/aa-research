package androidx.compose.animation;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.y;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SkipToLookaheadSizeNode$measure$2 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ long $constrainedSize;
    final /* synthetic */ Placeable $p;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ SkipToLookaheadSizeNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkipToLookaheadSizeNode$measure$2(SkipToLookaheadSizeNode skipToLookaheadSizeNode, Placeable placeable, long j2, MeasureScope measureScope) {
        super(1);
        this.this$0 = skipToLookaheadSizeNode;
        this.$p = placeable;
        this.$constrainedSize = j2;
        this.$this_measure = measureScope;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        long jMo9734computeScaleFactorH7hwNQA;
        ScaleToBoundsImpl scaleToBounds = this.this$0.getScaleToBounds();
        if (scaleToBounds == null) {
            Placeable.PlacementScope.place$default(placementScope, this.$p, 0, 0, 0.0f, 4, null);
            return;
        }
        SkipToLookaheadSizeNode skipToLookaheadSizeNode = this.this$0;
        ContentScale contentScale = scaleToBounds.getContentScale();
        if (((int) (skipToLookaheadSizeNode.lookaheadSize >> 32)) == 0 || ((int) (this.this$0.lookaheadSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) == 0) {
            long jFloatToRawIntBits = Float.floatToRawIntBits(1.0f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(1.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            ScaleFactor.Companion companion = ScaleFactor.Companion;
            jMo9734computeScaleFactorH7hwNQA = jFloatToRawIntBits2 | (jFloatToRawIntBits << 32);
        } else {
            jMo9734computeScaleFactorH7hwNQA = contentScale.mo9734computeScaleFactorH7hwNQA(IntSizeKt.m11351toSizeozmzZPI(this.this$0.lookaheadSize), IntSizeKt.m11351toSizeozmzZPI(this.$constrainedSize));
        }
        Alignment alignment = scaleToBounds.getAlignment();
        float fIntBitsToFloat = ((int) (this.this$0.lookaheadSize >> 32)) * Float.intBitsToFloat((int) (jMo9734computeScaleFactorH7hwNQA >> 32));
        SkipToLookaheadSizeNode skipToLookaheadSizeNode2 = this.this$0;
        int iB = a.b(fIntBitsToFloat);
        float fIntBitsToFloat2 = ((int) (skipToLookaheadSizeNode2.lookaheadSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * Float.intBitsToFloat((int) (jMo9734computeScaleFactorH7hwNQA & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        long jB = MuxerUtil.UNSIGNED_INT_MAX_VALUE & a.b(fIntBitsToFloat2);
        long jMo7648alignKFBX0sM = alignment.mo7648alignKFBX0sM((iB << 32) | jB, this.$constrainedSize, this.$this_measure.getLayoutDirection());
        Placeable.PlacementScope.placeWithLayer$default(placementScope, this.$p, IntOffset.m11296getXimpl(jMo7648alignKFBX0sM), IntOffset.m11297getYimpl(jMo7648alignKFBX0sM), 0.0f, new AnonymousClass1(jMo9734computeScaleFactorH7hwNQA), 4, (Object) null);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SkipToLookaheadSizeNode$measure$2$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<GraphicsLayerScope, ab> {
        final /* synthetic */ long $resolvedScale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j2) {
            super(1);
            this.$resolvedScale = j2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
            graphicsLayerScope.setScaleX(Float.intBitsToFloat((int) (this.$resolvedScale >> 32)));
            graphicsLayerScope.setScaleY(Float.intBitsToFloat((int) (this.$resolvedScale & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 0.0f));
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return ab.f48028a;
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
