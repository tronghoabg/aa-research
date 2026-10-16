package com.waze.as;

import android.content.BroadcastReceiver;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f15475a;

    b(c cVar) {
        this.f15475a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r2 = r2.f();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            h.g.b.x.f(r3, r0)
            java.lang.String r3 = "intent"
            h.g.b.x.f(r4, r3)
            com.waze.as.c r2 = r2.f15475a
            java.lang.String r3 = r4.getAction()
            kotlinx.coroutines.b.bn r4 = com.waze.as.c.e(r2)
            if (r3 == 0) goto L4b
            int r0 = r3.hashCode()
            r1 = -2128145023(0xffffffff81271581, float:-3.0688484E-38)
            if (r0 == r1) goto L40
            r1 = -1454123155(0xffffffffa953d76d, float:-4.7038264E-14)
            if (r0 == r1) goto L33
            r1 = 823795052(0x311a1d6c, float:2.2426674E-9)
            if (r0 == r1) goto L2a
            goto L4b
        L2a:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4b
            goto L3b
        L33:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4b
        L3b:
            com.waze.ui.r.a.e.b.a r2 = com.waze.as.c.d(r2)
            goto L4d
        L40:
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4b
            com.waze.ui.r.a.e.b.a r2 = com.waze.ui.r.a.e.b.a.f43359a
            goto L4d
        L4b:
            com.waze.ui.r.a.e.b.a r2 = com.waze.ui.r.a.e.b.a.f43361c
        L4d:
            r4.e(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.as.b.onReceive(android.content.Context, android.content.Intent):void");
    }
}
