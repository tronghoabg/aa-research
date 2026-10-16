package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ComposeScrollCaptureCallback$scrollTracker$1 extends g implements p<Float, e<? super Float>, Object> {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, e<? super ComposeScrollCaptureCallback$scrollTracker$1> eVar) {
        super(2, eVar);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, eVar);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object invoke(float f2, e<? super Float> eVar) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f2), eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            float f2 = this.F$0;
            p<Offset, e<? super Offset>, Object> scrollCaptureScrollByAction = ScrollCapture_androidKt.getScrollCaptureScrollByAction(this.this$0.node);
            if (scrollCaptureScrollByAction == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
                throw new h.e();
            }
            boolean reverseScrolling = ((ScrollAxisRange) this.this$0.node.getUnmergedConfig$ui().get(SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())).getReverseScrolling();
            if (reverseScrolling) {
                f2 = -f2;
            }
            Offset offsetM7969boximpl = Offset.m7969boximpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            this.Z$0 = reverseScrolling;
            this.label = 1;
            obj = scrollCaptureScrollByAction.invoke(offsetM7969boximpl, this);
            if (obj == aVar) {
                return aVar;
            }
            z = reverseScrolling;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            c.b(obj);
        }
        int iM7990unboximpl = (int) (((Offset) obj).m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new Float(z ? -Float.intBitsToFloat(iM7990unboximpl) : Float.intBitsToFloat(iM7990unboximpl));
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(Float f2, e<? super Float> eVar) {
        return invoke(f2.floatValue(), eVar);
    }
}
