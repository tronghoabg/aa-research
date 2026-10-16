package com.waze.sharedui.c;

import com.waze.shared_infra.i.h;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38844a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final String f38845b = "DeeplinksHolder";

    /* renamed from: d, reason: collision with root package name */
    private static final com.waze.bl.b.c.a f38847d = new com.waze.bl.b.c.a((byte[]) null);

    /* renamed from: c, reason: collision with root package name */
    private static final List f38846c = new ArrayList();

    public static final void a(com.waze.shared_infra.f.b bVar) {
        x.f(bVar, "receiver");
        f38847d.c(bVar);
    }

    public static final boolean b(com.waze.shared_infra.f.a aVar) {
        if (aVar == null) {
            h.i(f38845b, "deeplinks are cleared");
            f38846c.clear();
            return false;
        }
        h.i(f38845b, "deeplink is set, action=".concat(String.valueOf(aVar.a())));
        f38846c.add(aVar);
        return d();
    }

    public static final void c(com.waze.shared_infra.f.b bVar) {
        x.f(bVar, "receiver");
        f38847d.b(bVar);
        d();
    }

    private static final boolean d() {
        List list = f38846c;
        if (list.isEmpty()) {
            return false;
        }
        com.waze.shared_infra.f.a aVar = (com.waze.shared_infra.f.a) i.T(list);
        if (!f38847d.d(aVar)) {
            return false;
        }
        h.i(f38845b, "deeplink handled action=".concat(String.valueOf(aVar.a())));
        list.remove(list.size() - 1);
        return true;
    }
}
