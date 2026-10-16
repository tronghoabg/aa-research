package androidx.compose.foundation.text.input.internal;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bm;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ bm<ab> $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(bm<ab> bmVar, ComposeInputMethodManager composeInputMethodManager, e<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1> eVar) {
        super(2, eVar);
        this.$it = bmVar;
        this.$composeImm = composeInputMethodManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(this.$it, this.$composeImm, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r5.collect(new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.AnonymousClass2<>(), r4) == r0) goto L15;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 == r2) goto L14
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L14:
            e.b.c.b(r5)
            goto L47
        L18:
            e.b.c.b(r5)
            goto L30
        L1c:
            e.b.c.b(r5)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$$ExternalSyntheticLambda0 r5 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$$ExternalSyntheticLambda0
            r5.<init>()
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.label = r3
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r1)
            if (r5 != r0) goto L30
            goto L46
        L30:
            kotlinx.coroutines.b.bm<h.ab> r5 = r4.$it
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r1 = r4.$composeImm
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$2 r3 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$2
            r3.<init>()
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.label = r2
            java.lang.Object r4 = r5.collect(r3, r1)
            if (r4 != r0) goto L47
        L46:
            return r0
        L47:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
