package com.waze.modules.c;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ds {

    /* renamed from: a, reason: collision with root package name */
    private final Object f30122a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f30123b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f30124c;

    public ds(android.support.v4.app.av avVar, com.waze.uid.b.h hVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(avVar, "activity");
        h.g.b.x.f(hVar, "controller");
        h.g.b.x.f(aVar, "stringProvider");
        this.f30124c = avVar;
        this.f30122a = hVar;
        this.f30123b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027a A[LOOP:0: B:81:0x0274->B:83:0x027a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03da  */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.waze.av.b.ah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.waze.modules.c.df, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.waze.av.b.ah, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.modules.c.ce r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.ds.a(com.waze.modules.c.ce, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    public final void b(com.waze.uid.b.v vVar) {
        h.g.b.x.f(vVar, NotificationCompat.CATEGORY_EVENT);
        com.waze.sharedui.d.b bVar = new com.waze.sharedui.d.b((Context) this.f30124c, this.f30123b.c(vVar.b(), new Object[0]), vVar.a());
        com.waze.tide.s sVarC = vVar.c();
        if (sVarC != null) {
            bVar.setOnDismissListener(new com.waze.app_nav.hub.b.g(this, sVarC, 1));
        }
        bVar.g();
    }

    public ds(DriveToNativeManager driveToNativeManager, df dfVar, com.waze.av.b.ah ahVar) {
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(dfVar, "routingParamsAndOptionsRepository");
        h.g.b.x.f(ahVar, "wazePlaceRepository");
        this.f30122a = driveToNativeManager;
        this.f30123b = dfVar;
        this.f30124c = ahVar;
    }
}
