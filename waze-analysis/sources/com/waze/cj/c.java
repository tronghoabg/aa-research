package com.waze.cj;

import com.waze.shared_infra.q.e;
import com.waze.sharedui.e.g;
import com.waze.speech.k;
import h.c.j;
import h.g.b.x;
import j$.time.Instant;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final e f22428a;

    /* renamed from: b, reason: collision with root package name */
    private final af f22429b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f22430c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f22431d;

    /* renamed from: e, reason: collision with root package name */
    private com.waze.sharedui.e.c f22432e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22433f;

    /* renamed from: g, reason: collision with root package name */
    private Instant f22434g;

    public c(g gVar, j jVar, e eVar, k kVar) {
        x.f(gVar, "locationService");
        x.f(jVar, "coroutineContext");
        x.f(eVar, "clock");
        x.f(kVar, "config");
        this.f22428a = eVar;
        af afVarE = aj.e(jVar.plus(aj.Q()));
        this.f22429b = afVarE;
        bn bnVarB = ck.b(false);
        this.f22430c = bnVarB;
        this.f22431d = ai.U(bnVarB);
        aj.z(afVarE, null, null, new b(gVar, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void b(com.waze.cj.c r7, com.waze.sharedui.e.c r8) {
        /*
            boolean r0 = r7.f22433f
            r1 = 1
            java.lang.String r2 = "getValue(...)"
            if (r0 != 0) goto L3d
            com.waze.sharedui.e.c r0 = r7.f22432e
            if (r0 == 0) goto L2e
            com.waze.shared_infra.h.c r0 = r0.f()
            com.waze.shared_infra.h.c r3 = r8.f()
            float r0 = com.waze.shared_infra.h.b.c(r0, r3)
            com.waze.config.c r3 = com.waze.config.ConfigValues.CONFIG_VALUE_ZERO_SPEED_MIN_DISTANCE_METERS
            java.lang.Long r3 = r3.b()
            h.g.b.x.e(r3, r2)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L3d
            r7.f22433f = r1
            goto L3d
        L2e:
            r0 = r7
            com.waze.cj.c r0 = (com.waze.cj.c) r0
            com.waze.shared_infra.h.c r0 = r8.f()
            boolean r0 = r0.g()
            if (r0 != 0) goto L3d
            r7.f22432e = r8
        L3d:
            float r8 = r8.b()
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 * r0
            com.waze.config.c r0 = com.waze.config.ConfigValues.CONFIG_VALUE_ZERO_SPEED_NOT_MOVING_SPEED_MMSEC
            java.lang.Long r0 = r0.b()
            h.g.b.x.e(r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            long r5 = (long) r8
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L65
            j$.time.Instant r8 = r7.f22434g
            if (r8 != 0) goto L7b
            com.waze.shared_infra.q.e r8 = r7.f22428a
            j$.time.Instant r8 = r8.b()
            r7.f22434g = r8
            goto L7b
        L65:
            com.waze.config.c r8 = com.waze.config.ConfigValues.CONFIG_VALUE_ZERO_SPEED_START_MOVING_SPEED_MMSEC
            java.lang.Long r8 = r8.b()
            h.g.b.x.e(r8, r2)
            java.lang.Number r8 = (java.lang.Number) r8
            long r3 = r8.longValue()
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 < 0) goto L7b
            r8 = 0
            r7.f22434g = r8
        L7b:
            j$.time.Instant r8 = r7.f22434g
            if (r8 == 0) goto L8f
            com.waze.shared_infra.q.e r0 = r7.f22428a
            j$.time.temporal.Temporal r8 = (j$.time.temporal.Temporal) r8
            j$.time.Instant r0 = r0.b()
            j$.time.temporal.Temporal r0 = (j$.time.temporal.Temporal) r0
            j$.time.Duration r8 = j$.time.Duration.between(r8, r0)
            if (r8 != 0) goto L91
        L8f:
            j$.time.Duration r8 = j$.time.Duration.ZERO
        L91:
            kotlinx.coroutines.b.bn r0 = r7.f22430c
            boolean r7 = r7.f22433f
            r3 = 0
            if (r7 == 0) goto Lb7
            com.waze.config.c r7 = com.waze.config.ConfigValues.CONFIG_VALUE_ZERO_SPEED_IDLE_SEC
            java.lang.Long r7 = r7.b()
            h.g.b.x.e(r7, r2)
            java.lang.Number r7 = (java.lang.Number) r7
            long r4 = r7.longValue()
            j$.time.Duration r7 = j$.time.Duration.ofSeconds(r4)
            java.lang.String r2 = "ofSeconds(...)"
            h.g.b.x.e(r7, r2)
            int r7 = r8.compareTo(r7)
            if (r7 < 0) goto Lb7
            goto Lb8
        Lb7:
            r1 = r3
        Lb8:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r0.e(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.cj.c.b(com.waze.cj.c, com.waze.sharedui.e.c):void");
    }

    public final ch a() {
        return this.f22431d;
    }
}
