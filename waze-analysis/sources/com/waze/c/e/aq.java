package com.waze.c.e;

import android.content.Context;
import com.waze.ConfigManager;
import com.waze.navigate.fy;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final bm f18535a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bz.a f18536b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.c.e.a.b f18537c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.c.d.h f18538d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.c.d.am f18539e;

    /* renamed from: f, reason: collision with root package name */
    private final fy f18540f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigManager f18541g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f18542h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18543i;

    public aq(bm bmVar, com.waze.bz.a aVar, com.waze.c.e.a.b bVar, com.waze.c.d.h hVar, com.waze.c.d.am amVar, fy fyVar, ConfigManager configManager, Context context, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(bmVar, "alternativeRouteCardTransformerFactory");
        h.g.b.x.f(aVar, "tollInfoDialogStateHolderFactory");
        h.g.b.x.f(bVar, "alternateRoutesMapStateHolderFactory");
        h.g.b.x.f(hVar, "alternateRoutesControllerFactory");
        h.g.b.x.f(amVar, "alternateRoutesStatsSender");
        h.g.b.x.f(fyVar, "tollInfoStatSender");
        h.g.b.x.f(configManager, "configManager");
        h.g.b.x.f(context, "appContext");
        h.g.b.x.f(eVar, "logger");
        this.f18535a = bmVar;
        this.f18536b = aVar;
        this.f18537c = bVar;
        this.f18538d = hVar;
        this.f18539e = amVar;
        this.f18540f = fyVar;
        this.f18541g = configManager;
        this.f18542h = context;
        this.f18543i = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.j r17, com.waze.map.b.aj r18, h.c.e r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof com.waze.c.e.ap
            if (r2 == 0) goto L17
            r2 = r1
            com.waze.c.e.ap r2 = (com.waze.c.e.ap) r2
            int r3 = r2.f18534e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f18534e = r3
            goto L1c
        L17:
            com.waze.c.e.ap r2 = new com.waze.c.e.ap
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f18532c
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r2.f18534e
            r5 = 1
            if (r4 == 0) goto L3d
            if (r4 != r5) goto L35
            java.lang.Object r3 = r2.f18531b
            com.waze.map.b.aj r3 = (com.waze.map.b.aj) r3
            java.lang.Object r2 = r2.f18530a
            h.c.j r2 = (h.c.j) r2
            e.b.c.b(r1)
            r5 = r2
            r6 = r3
            goto L56
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            e.b.c.b(r1)
            com.waze.c.d.h r1 = r0.f18538d
            com.waze.c.d.am r4 = r0.f18539e
            r6 = r17
            r2.f18530a = r6
            r7 = r18
            r2.f18531b = r7
            r2.f18534e = r5
            java.lang.Object r1 = r1.a(r4, r2)
            if (r1 == r3) goto L73
            r5 = r6
            r6 = r7
        L56:
            r7 = r1
            com.waze.c.d.ae r7 = (com.waze.c.d.ae) r7
            if (r7 != 0) goto L5d
            r0 = 0
            return r0
        L5d:
            com.waze.c.e.a.b r8 = r0.f18537c
            com.waze.c.e.bm r9 = r0.f18535a
            com.waze.bz.a r10 = r0.f18536b
            com.waze.c.d.am r11 = r0.f18539e
            com.waze.navigate.fy r12 = r0.f18540f
            com.waze.ConfigManager r13 = r0.f18541g
            android.content.Context r14 = r0.f18542h
            com.waze.shared_infra.i.e r15 = r0.f18543i
            com.waze.c.e.bc r4 = new com.waze.c.e.bc
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r4
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.aq.a(h.c.j, com.waze.map.b.aj, h.c.e):java.lang.Object");
    }
}
