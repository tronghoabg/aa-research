package com.waze.main_screen.l.a;

import com.waze.authentication.at;
import com.waze.navigate.NavigationInfoNativeManager;
import com.waze.rtalerts.RtAlertsNativeManager;
import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final NavigationInfoNativeManager f26593a;

    /* renamed from: b, reason: collision with root package name */
    private final RtAlertsNativeManager f26594b;

    public e(NavigationInfoNativeManager navigationInfoNativeManager, RtAlertsNativeManager rtAlertsNativeManager) {
        x.f(navigationInfoNativeManager, "navigationInfoNativeManager");
        x.f(rtAlertsNativeManager, "rtAlertsNativeManager");
        this.f26593a = navigationInfoNativeManager;
        this.f26594b = rtAlertsNativeManager;
    }

    public final Object a(h.c.e eVar) {
        final CompletableDeferred completableDeferredJ = bo.j();
        this.f26594b.getRtAlertsOnRoute(new l() { // from class: com.waze.main_screen.l.a.b
            /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
            @Override // h.g.a.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r4) {
                /*
                    r3 = this;
                    com.waze.jni.protos.rtalerts.RtAlertItemList r4 = (com.waze.jni.protos.rtalerts.RtAlertItemList) r4
                    if (r4 == 0) goto L55
                    java.util.List r4 = r4.getRtAlertItemList()
                    if (r4 == 0) goto L55
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.List r4 = h.a.i.ac(r4)
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    com.waze.main_screen.l.a.d r0 = com.waze.main_screen.l.a.d.f26592a
                    h.g.a.l r0 = (h.g.a.l) r0
                    com.waze.main_screen.l.a.c r1 = new com.waze.main_screen.l.a.c
                    r1.<init>()
                    java.util.Comparator r0 = j$.util.Comparator.CC.comparingInt(r1)
                    java.lang.String r1 = "comparingInt(...)"
                    h.g.b.x.e(r0, r1)
                    java.util.List r4 = h.a.i.al(r4, r0)
                    if (r4 == 0) goto L55
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r1 = 10
                    int r1 = h.a.i.q(r4, r1)
                    r0.<init>(r1)
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.util.Iterator r4 = r4.iterator()
                L3d:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L52
                    java.lang.Object r1 = r4.next()
                    com.waze.jni.protos.rtalerts.RtAlertItem r1 = (com.waze.jni.protos.rtalerts.RtAlertItem) r1
                    com.waze.main_screen.l.a.f r2 = new com.waze.main_screen.l.a.f
                    r2.<init>(r1)
                    r0.add(r2)
                    goto L3d
                L52:
                    java.util.List r0 = (java.util.List) r0
                    goto L59
                L55:
                    java.util.List r0 = h.a.i.h()
                L59:
                    kotlinx.coroutines.CompletableDeferred r3 = r1
                    r3.a(r0)
                    h.ab r3 = h.ab.f48028a
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.l.a.b.invoke(java.lang.Object):java.lang.Object");
            }
        });
        return completableDeferredJ.c(eVar);
    }

    public final Object b(h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        this.f26593a.getNavigationItems(new at(completableDeferredJ, 6));
        return completableDeferredJ.c(eVar);
    }
}
