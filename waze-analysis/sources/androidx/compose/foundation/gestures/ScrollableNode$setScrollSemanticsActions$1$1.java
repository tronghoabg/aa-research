package androidx.compose.foundation.gestures;

import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ScrollableNode$setScrollSemanticsActions$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ float $x;
    final /* synthetic */ float $y;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNode$setScrollSemanticsActions$1$1(ScrollableNode scrollableNode, float f2, float f3, e<? super ScrollableNode$setScrollSemanticsActions$1$1> eVar) {
        super(2, eVar);
        this.this$0 = scrollableNode;
        this.$x = f2;
        this.$y = f3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ScrollableNode$setScrollSemanticsActions$1$1(this.this$0, this.$x, this.$y, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ScrollableNode$setScrollSemanticsActions$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            ScrollableNode scrollableNode = this.this$0;
            float f2 = this.$x;
            float f3 = this.$y;
            ScrollingLogic scrollingLogic = scrollableNode.scrollingLogic;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
            this.label = 1;
            if (ScrollableKt.m2296semanticsScrollByd4ec7I(scrollingLogic, (jFloatToRawIntBits << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jFloatToRawIntBits2), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
