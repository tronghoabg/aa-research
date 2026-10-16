package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CursorAnimationState {
    public static final int $stable = 8;
    private final boolean animate;
    private AtomicReference<br> animationJob = new AtomicReference<>(null);
    private final MutableFloatState cursorAlpha$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ br $oldJob;
            int label;
            final /* synthetic */ CursorAnimationState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(br brVar, CursorAnimationState cursorAnimationState, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$oldJob = brVar;
                this.this$0 = cursorAnimationState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.$oldJob, this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
            
                if (kotlinx.coroutines.aj.q(500, r10) == r0) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:8:0x0017, B:31:0x007b, B:27:0x0060, B:29:0x006b, B:12:0x0023, B:13:0x0027, B:25:0x005a, B:26:0x005f, B:20:0x0041, B:22:0x004e), top: B:38:0x000d }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0079 -> B:31:0x007b). Please report as a decompilation issue!!! */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    h.c.a.a r0 = h.c.a.a.f48038a
                    int r1 = r10.label
                    r2 = 500(0x1f4, double:2.47E-321)
                    r4 = 0
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r9) goto L2b
                    if (r1 == r8) goto L27
                    if (r1 == r7) goto L23
                    if (r1 != r6) goto L1b
                    e.b.c.b(r11)     // Catch: java.lang.Throwable -> L81
                    goto L7b
                L1b:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L23:
                    e.b.c.b(r11)     // Catch: java.lang.Throwable -> L81
                    goto L6b
                L27:
                    e.b.c.b(r11)     // Catch: java.lang.Throwable -> L81
                    goto L5a
                L2b:
                    e.b.c.b(r11)
                    goto L41
                L2f:
                    e.b.c.b(r11)
                    kotlinx.coroutines.br r11 = r10.$oldJob
                    if (r11 == 0) goto L41
                    r1 = r10
                    h.c.e r1 = (h.c.e) r1
                    r10.label = r9
                    java.lang.Object r11 = h.g.b.o.b(r11, r1)
                    if (r11 == r0) goto L83
                L41:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L81
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L81
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L81
                    boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L81
                    if (r11 != 0) goto L60
                    r11 = r10
                    h.c.e r11 = (h.c.e) r11     // Catch: java.lang.Throwable -> L81
                    r10.label = r8     // Catch: java.lang.Throwable -> L81
                    java.lang.Object r11 = kotlinx.coroutines.aj.p(r11)     // Catch: java.lang.Throwable -> L81
                    if (r11 != r0) goto L5a
                    goto L83
                L5a:
                    h.e r11 = new h.e     // Catch: java.lang.Throwable -> L81
                    r11.<init>()     // Catch: java.lang.Throwable -> L81
                    throw r11     // Catch: java.lang.Throwable -> L81
                L60:
                    r11 = r10
                    h.c.e r11 = (h.c.e) r11     // Catch: java.lang.Throwable -> L81
                    r10.label = r7     // Catch: java.lang.Throwable -> L81
                    java.lang.Object r11 = kotlinx.coroutines.aj.q(r2, r11)     // Catch: java.lang.Throwable -> L81
                    if (r11 == r0) goto L83
                L6b:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L81
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r4)     // Catch: java.lang.Throwable -> L81
                    r11 = r10
                    h.c.e r11 = (h.c.e) r11     // Catch: java.lang.Throwable -> L81
                    r10.label = r6     // Catch: java.lang.Throwable -> L81
                    java.lang.Object r11 = kotlinx.coroutines.aj.q(r2, r11)     // Catch: java.lang.Throwable -> L81
                    if (r11 == r0) goto L83
                L7b:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L81
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L81
                    goto L60
                L81:
                    r11 = move-exception
                    goto L84
                L83:
                    return r0
                L84:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r10 = r10.this$0
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r10, r4)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = CursorAnimationState.this.new AnonymousClass2(eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super Boolean> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            af afVar = (af) this.L$0;
            br brVar = (br) CursorAnimationState.this.animationJob.getAndSet(null);
            CursorAnimationState cursorAnimationState = CursorAnimationState.this;
            return Boolean.valueOf(CursorAnimationState$snapToVisibleAndAnimate$2$$ExternalSyntheticBackportWithForwarding0.m(cursorAnimationState.animationJob, null, aj.z(afVar, null, null, new AnonymousClass1(brVar, cursorAnimationState, null), 3)));
        }
    }

    public CursorAnimationState(boolean z) {
        this.animate = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f2) {
        this.cursorAlpha$delegate.setFloatValue(f2);
    }

    public final void cancelAndHide() {
        br andSet = this.animationJob.getAndSet(null);
        if (andSet != null) {
            andSet.s(null);
        }
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha$delegate.getFloatValue();
    }

    public final Object snapToVisibleAndAnimate(e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }
}
