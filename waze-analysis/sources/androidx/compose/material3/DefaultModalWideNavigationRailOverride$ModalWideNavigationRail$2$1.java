package androidx.compose.material3;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ o<Boolean> $channel;
    final /* synthetic */ ModalWideNavigationRailState $modalState;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ ModalWideNavigationRailState $modalState;
        final /* synthetic */ boolean $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, ModalWideNavigationRailState modalWideNavigationRailState, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$newTarget = z;
            this.$modalState = modalWideNavigationRailState;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$newTarget, this.$modalState, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (r1.expand(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r1.collapse(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            return r0;
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
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L15:
                e.b.c.b(r5)
                goto L3a
            L19:
                e.b.c.b(r5)
                boolean r5 = r4.$newTarget
                androidx.compose.material3.ModalWideNavigationRailState r1 = r4.$modalState
                if (r5 == 0) goto L2e
                r5 = r4
                h.c.e r5 = (h.c.e) r5
                r4.label = r3
                java.lang.Object r4 = r1.expand(r5)
                if (r4 != r0) goto L3a
                goto L39
            L2e:
                r5 = r4
                h.c.e r5 = (h.c.e) r5
                r4.label = r2
                java.lang.Object r4 = r1.collapse(r5)
                if (r4 != r0) goto L3a
            L39:
                return r0
            L3a:
                h.ab r4 = h.ab.f48028a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1(o<Boolean> oVar, ModalWideNavigationRailState modalWideNavigationRailState, e<? super DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1> eVar) {
        super(2, eVar);
        this.$channel = oVar;
        this.$modalState = modalWideNavigationRailState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1 defaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1(this.$channel, this.$modalState, eVar);
        defaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1.L$0 = obj;
        return defaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:12:0x003b). Please report as a decompilation issue!!! */
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
            kotlinx.coroutines.a.q r1 = (kotlinx.coroutines.a.q) r1
            java.lang.Object r3 = r7.L$0
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            e.b.c.b(r8)
            goto L3b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1d:
            e.b.c.b(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.af r8 = (kotlinx.coroutines.af) r8
            kotlinx.coroutines.a.o<java.lang.Boolean> r1 = r7.$channel
            kotlinx.coroutines.a.q r1 = r1.p()
            r3 = r8
        L2b:
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r7.L$0 = r3
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r8 = r1.a(r8)
            if (r8 != r0) goto L3b
            return r0
        L3b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r1.b()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            kotlinx.coroutines.a.o<java.lang.Boolean> r4 = r7.$channel
            java.lang.Object r4 = r4.h()
            java.lang.Object r4 = kotlinx.coroutines.a.t.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L5f
            boolean r8 = r4.booleanValue()
        L5f:
            androidx.compose.material3.ModalWideNavigationRailState r4 = r7.$modalState
            androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1$1 r5 = new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1$1
            r6 = 0
            r5.<init>(r8, r4, r6)
            h.g.a.p r5 = (h.g.a.p) r5
            r8 = 3
            kotlinx.coroutines.aj.z(r3, r6, r6, r5, r8)
            goto L2b
        L6e:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
