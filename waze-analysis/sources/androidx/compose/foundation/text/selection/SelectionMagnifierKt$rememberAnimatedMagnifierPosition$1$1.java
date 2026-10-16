package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ State<Offset> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, e<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1> eVar) {
        super(2, eVar);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.$targetValue$delegate, this.$animatable, eVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final af afVar = (af) this.L$0;
            final State<Offset> state = this.$targetValue$delegate;
            k kVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new h.g.a.a() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return Offset.m7969boximpl(SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(state));
                }
            });
            final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            this.label = 1;
            if (kVarSnapshotFlow.collect(new l() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.2

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1, reason: invalid class name */
                final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
                    final /* synthetic */ long $targetValue;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Animatable<Offset, AnimationVector2D> animatable, long j2, e<? super AnonymousClass1> eVar) {
                        super(2, eVar);
                        this.$animatable = animatable;
                        this.$targetValue = j2;
                    }

                    @Override // h.c.b.a.a
                    public final e<ab> create(Object obj, e<?> eVar) {
                        return new AnonymousClass1(this.$animatable, this.$targetValue, eVar);
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
                            this.label = 1;
                            if (Animatable.animateTo$default(this.$animatable, Offset.m7969boximpl(this.$targetValue), SelectionMagnifierKt.getMagnifierSpringSpec(), null, null, this, 12, null) == aVar) {
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

                @Override // kotlinx.coroutines.b.l
                public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                    return m3875emit3MmeM6k(((Offset) obj2).m7990unboximpl(), eVar);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m3875emit3MmeM6k(long j2, e<? super ab> eVar) {
                    if ((animatable.getValue().m7990unboximpl() & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats && (j2 & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                        if (Float.intBitsToFloat((int) (animatable.getValue().m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) != Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2))) {
                            aj.z(afVar, null, null, new AnonymousClass1(animatable, j2, null), 3);
                            return ab.f48028a;
                        }
                    }
                    Object objSnapTo = animatable.snapTo(Offset.m7969boximpl(j2), eVar);
                    return objSnapTo == a.f48038a ? objSnapTo : ab.f48028a;
                }
            }, this) == aVar) {
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
