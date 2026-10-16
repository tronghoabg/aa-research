package com.waze.reports_v2.presentation;

import com.waze.navigate.eo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ConversationalReportingNonFteHintStateHolder implements com.waze.ui.r.a.b.a {
    public static final int $stable = 0;
    private final kotlinx.coroutines.b.bn<l> _state;
    private final com.waze.reports_v2.c.ao config;
    private final kotlinx.coroutines.af coroutineScope;
    private final com.waze.shared_infra.i.e logger;
    private final eo navigationState;
    private final kotlinx.coroutines.b.ch<l> state;
    private kotlinx.coroutines.br triggerJob;

    public ConversationalReportingNonFteHintStateHolder(eo eoVar, com.waze.reports_v2.c.ao aoVar) {
        h.g.b.x.f(eoVar, "navigationState");
        h.g.b.x.f(aoVar, "config");
        this.navigationState = eoVar;
        this.config = aoVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ConversationalReportingNonFteHintStateHolder");
        h.g.b.x.e(eVarD, "create(...)");
        this.logger = eVarD;
        this.coroutineScope = com.waze.ui.a.l.p(this, null);
        kotlinx.coroutines.b.bn<l> bnVarB = kotlinx.coroutines.b.ck.b(null);
        this._state = bnVarB;
        this.state = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (kotlinx.coroutines.aj.r(r4, r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitNavigationWithDelay(h.c.e<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.reports_v2.presentation.n
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.reports_v2.presentation.n r0 = (com.waze.reports_v2.presentation.n) r0
            int r1 = r0.f35057c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35057c = r1
            goto L18
        L13:
            com.waze.reports_v2.presentation.n r0 = new com.waze.reports_v2.presentation.n
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f35055a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f35057c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            e.b.c.b(r7)
            goto L52
        L36:
            e.b.c.b(r7)
            com.waze.navigate.eo r7 = r6.navigationState
            kotlinx.coroutines.b.ch r7 = r7.ah()
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            com.waze.reports_v2.presentation.o r2 = new com.waze.reports_v2.presentation.o
            r5 = 0
            r2.<init>(r5)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f35057c = r4
            java.lang.Object r7 = kotlinx.coroutines.b.ai.i(r7, r2, r0)
            if (r7 != r1) goto L52
            goto L6b
        L52:
            com.waze.reports_v2.c.ao r7 = r6.config
            long r4 = r7.d()
            r0.f35057c = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.r(r4, r0)
            if (r7 == r1) goto L6b
        L60:
            com.waze.navigate.eo r6 = r6.navigationState
            boolean r6 = r6.T()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.ConversationalReportingNonFteHintStateHolder.awaitNavigationWithDelay(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishedShowingHint() {
        this.logger.a("Finished showing the ui for this state, setting to null");
        this._state.e(null);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        kotlinx.coroutines.aj.h(this.coroutineScope, null);
    }

    public final kotlinx.coroutines.b.ch<l> getState() {
        return this.state;
    }

    public final Object start(h.c.e<? super h.ab> eVar) {
        kotlinx.coroutines.br brVar = this.triggerJob;
        StringBuilder sb = new StringBuilder("Starting, trigger job exists: ");
        sb.append(brVar != null);
        this.logger.a(sb.toString());
        if (this.triggerJob != null) {
            return h.ab.f48028a;
        }
        this.triggerJob = kotlinx.coroutines.aj.z(this.coroutineScope, null, null, new bj(this, (h.c.e) null, 1), 3);
        return h.ab.f48028a;
    }
}
