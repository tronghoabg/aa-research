package com.waze.network.d;

import androidx.core.app.NotificationCompat;
import com.google.d.b.ai;
import e.a.dk;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends dk {

    /* renamed from: a, reason: collision with root package name */
    private final ai f32232a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32233b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.waze.uid.f fVar, ai aiVar, com.waze.shared_infra.i.e eVar, String str) {
        super(fVar);
        x.f(fVar, "delegate");
        x.f(aiVar, NotificationCompat.CATEGORY_STOPWATCH);
        x.f(eVar, "logger");
        x.f(str, "api");
        this.f32232a = aiVar;
        this.f32233b = eVar;
        this.f32234c = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    @Override // e.a.dk, com.waze.uid.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(e.a.ee r10, e.a.cm r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.d.v.a(e.a.ee, e.a.cm):void");
    }
}
