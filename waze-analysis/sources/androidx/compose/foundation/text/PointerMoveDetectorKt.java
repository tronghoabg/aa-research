package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ l<Offset, ab> $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        final /* synthetic */ PointerInputScope $this_detectMoves;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
        final class AnonymousClass1 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
            final /* synthetic */ j $currentContext;
            final /* synthetic */ l<Offset, ab> $onMove;
            final /* synthetic */ PointerEventPass $pointerEventPass;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(j jVar, PointerEventPass pointerEventPass, l<? super Offset, ab> lVar, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$currentContext = jVar;
                this.$pointerEventPass = pointerEventPass;
                this.$onMove = lVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, eVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // h.g.a.p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                return ((AnonymousClass1) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Path cross not found for [B:16:0x0056, B:20:0x006e], limit reached: 27 */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0041 -> B:14:0x0044). Please report as a decompilation issue!!! */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    h.c.a.a r0 = h.c.a.a.f48038a
                    int r1 = r7.label
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r1 = r7.L$1
                    h.g.b.aq r1 = (h.g.b.aq) r1
                    java.lang.Object r3 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                    e.b.c.b(r8)
                    goto L44
                L15:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L1d:
                    e.b.c.b(r8)
                    java.lang.Object r8 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                    h.g.b.aq r1 = new h.g.b.aq
                    r1.<init>()
                    r3 = r8
                L2a:
                    h.c.j r8 = r7.$currentContext
                    boolean r8 = h.g.b.o.h(r8)
                    if (r8 == 0) goto La3
                    androidx.compose.ui.input.pointer.PointerEventPass r8 = r7.$pointerEventPass
                    r4 = r7
                    h.c.e r4 = (h.c.e) r4
                    r7.L$0 = r3
                    r7.L$1 = r1
                    r7.label = r2
                    java.lang.Object r8 = r3.awaitPointerEvent(r8, r4)
                    if (r8 != r0) goto L44
                    return r0
                L44:
                    androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
                    int r4 = r8.m9541getType7fucELk()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                    int r5 = r5.m9554getMove7fucELk()
                    boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r4, r5)
                    if (r5 != 0) goto L6e
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                    int r5 = r5.m9552getEnter7fucELk()
                    boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r4, r5)
                    if (r5 != 0) goto L6e
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                    int r5 = r5.m9553getExit7fucELk()
                    boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r4, r5)
                    if (r4 == 0) goto L2a
                L6e:
                    java.util.List r8 = r8.getChanges()
                    java.lang.Object r8 = h.a.i.P(r8)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                    long r4 = r8.m9608getPositionF1C5BW0()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m7969boximpl(r4)
                    long r4 = r8.m7990unboximpl()
                    java.lang.Object r6 = r1.f48105a
                    boolean r4 = androidx.compose.ui.geometry.Offset.m7976equalsimpl(r4, r6)
                    if (r2 != r4) goto L8d
                    r8 = 0
                L8d:
                    if (r8 == 0) goto L2a
                    h.g.a.l<androidx.compose.ui.geometry.Offset, h.ab> r4 = r7.$onMove
                    long r5 = r8.m7990unboximpl()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m7969boximpl(r5)
                    r1.f48105a = r8
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m7969boximpl(r5)
                    r4.invoke(r8)
                    goto L2a
                La3:
                    h.ab r7 = h.ab.f48028a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, l<? super Offset, ab> lVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$this_detectMoves = pointerInputScope;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                j context = getContext();
                this.label = 1;
                if (this.$this_detectMoves.awaitPointerEventScope(new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null), this) == aVar) {
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

    public static final Object detectMoves(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, l<? super Offset, ab> lVar, e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(pointerInputScope, pointerEventPass, lVar, null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, l lVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, lVar, eVar);
    }
}
