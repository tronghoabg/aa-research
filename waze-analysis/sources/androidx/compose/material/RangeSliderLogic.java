package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RangeSliderLogic {
    private final MutableInteractionSource endInteractionSource;
    private final State<p<Boolean, Float, ab>> onDrag;
    private final State<Float> rawOffsetEnd;
    private final State<Float> rawOffsetStart;
    private final MutableInteractionSource startInteractionSource;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.RangeSliderLogic$captureThumb$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ boolean $draggingStart;
        final /* synthetic */ Interaction $interaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, Interaction interaction, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$draggingStart = z;
            this.$interaction = interaction;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return RangeSliderLogic.this.new AnonymousClass1(this.$draggingStart, this.$interaction, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                RangeSliderLogic rangeSliderLogic = RangeSliderLogic.this;
                boolean z = this.$draggingStart;
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (rangeSliderLogic.activeInteraction(z).emit(interaction, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends p<? super Boolean, ? super Float, ab>> state3) {
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
        this.rawOffsetStart = state;
        this.rawOffsetEnd = state2;
        this.onDrag = state3;
    }

    public final MutableInteractionSource activeInteraction(boolean z) {
        return z ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void captureThumb(boolean z, float f2, Interaction interaction, af afVar) {
        this.onDrag.getValue().invoke(Boolean.valueOf(z), Float.valueOf(f2 - (z ? this.rawOffsetStart : this.rawOffsetEnd).getValue().floatValue()));
        aj.z(afVar, null, null, new AnonymousClass1(z, interaction, null), 3);
    }

    public final int compareOffsets(float f2) {
        return Float.compare(Math.abs(this.rawOffsetStart.getValue().floatValue() - f2), Math.abs(this.rawOffsetEnd.getValue().floatValue() - f2));
    }

    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    public final State<p<Boolean, Float, ab>> getOnDrag() {
        return this.onDrag;
    }

    public final State<Float> getRawOffsetEnd() {
        return this.rawOffsetEnd;
    }

    public final State<Float> getRawOffsetStart() {
        return this.rawOffsetStart;
    }

    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }
}
