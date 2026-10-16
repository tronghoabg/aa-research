package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static o f25435a;

    /* renamed from: b, reason: collision with root package name */
    private static o f25436b;

    public static synchronized o a() {
        o oVar = f25436b;
        if (oVar == null) {
            oVar = (o) com.waze.web.r.h(bh.class);
            f25436b = oVar;
        }
        o oVar2 = f25435a;
        if (oVar2 != null && oVar != oVar2) {
            oVar2.stop();
            com.waze.ifs.ui.z.a().d(f25435a);
        }
        f25435a = oVar;
        com.waze.ifs.ui.z.a().b(f25435a);
        return f25435a;
    }
}
