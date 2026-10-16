package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.core.Token;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class GraphSessionLock$withTokenInAsync$1 extends g implements p<af, e, Object> {
    final /* synthetic */ p<Token, e<? super am>, Object> $action;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GraphSessionLock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GraphSessionLock$withTokenInAsync$1(GraphSessionLock graphSessionLock, p<? super Token, ? super e<? super am>, ? extends Object> pVar, e<? super GraphSessionLock$withTokenInAsync$1> eVar) {
        super(2, eVar);
        this.this$0 = graphSessionLock;
        this.$action = pVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        GraphSessionLock$withTokenInAsync$1 graphSessionLock$withTokenInAsync$1 = new GraphSessionLock$withTokenInAsync$1(this.this$0, this.$action, eVar);
        graphSessionLock$withTokenInAsync$1.L$0 = obj;
        return graphSessionLock$withTokenInAsync$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((GraphSessionLock$withTokenInAsync$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L35
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            e.b.c.b(r10)
            return r10
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L1c:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
            e.b.c.b(r10)
            goto L78
        L24:
            java.lang.Object r1 = r9.L$2
            androidx.camera.camera2.pipe.internal.GraphSessionLock r1 = (androidx.camera.camera2.pipe.internal.GraphSessionLock) r1
            java.lang.Object r4 = r9.L$1
            kotlinx.coroutines.h.a r4 = (kotlinx.coroutines.h.a) r4
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.af r6 = (kotlinx.coroutines.af) r6
            e.b.c.b(r10)
            r10 = r6
            goto L54
        L35:
            e.b.c.b(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.af r10 = (kotlinx.coroutines.af) r10
            androidx.camera.camera2.pipe.internal.GraphSessionLock r1 = r9.this$0
            kotlinx.coroutines.h.a r6 = androidx.camera.camera2.pipe.internal.GraphSessionLock.access$getMutex$p(r1)
            r7 = r9
            h.c.e r7 = (h.c.e) r7
            r9.L$0 = r10
            r9.L$1 = r6
            r9.L$2 = r1
            r9.label = r4
            java.lang.Object r4 = androidx.camera.camera2.pipe.core.MutexesKt.access$lockAndSuspend(r6, r7)
            if (r4 == r0) goto L8c
            r4 = r6
        L54:
            androidx.camera.camera2.pipe.core.MutexToken r6 = new androidx.camera.camera2.pipe.core.MutexToken
            r6.<init>(r4)
            androidx.camera.camera2.pipe.core.Token r6 = (androidx.camera.camera2.pipe.core.Token) r6
            h.g.a.p<androidx.camera.camera2.pipe.core.Token, h.c.e<? super kotlinx.coroutines.am>, java.lang.Object> r4 = r9.$action
            androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1 r7 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1
            r7.<init>(r4, r5)
            h.g.a.p r7 = (h.g.a.p) r7
            r4 = r9
            h.c.e r4 = (h.c.e) r4
            r9.L$0 = r10
            r9.L$1 = r5
            r9.L$2 = r5
            r9.label = r3
            java.lang.Object r1 = androidx.camera.camera2.pipe.internal.GraphSessionLock.access$use(r1, r6, r7, r4)
            if (r1 == r0) goto L8c
            r8 = r1
            r1 = r10
            r10 = r8
        L78:
            kotlinx.coroutines.am r10 = (kotlinx.coroutines.am) r10
            kotlinx.coroutines.aj.i(r1)
            r1 = r9
            h.c.e r1 = (h.c.e) r1
            r9.L$0 = r5
            r9.label = r2
            java.lang.Object r9 = r10.c(r1)
            if (r9 != r0) goto L8b
            goto L8c
        L8b:
            return r9
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
