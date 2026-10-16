package com.waze.au;

import com.waze.at.c;
import com.waze.bh.d;
import com.waze.copilot.aw;
import com.waze.favorites.j;
import com.waze.main_screen.s;
import com.waze.main_screen.u;
import com.waze.mywaze.b;
import com.waze.planned_drive.ad;
import com.waze.planned_drive.p;
import com.waze.search.k;
import h.a.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15673a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final List f15674b = i.i(s.f27419a, p.f33350a, ad.f33183a, u.f27645a, k.f35975a, j.f23804a, c.f15670a, d.f16791a, b.f30576a, com.waze.inbox.d.f24639a, com.waze.web.d.f45485a, com.waze.search.a.d.f35473a, com.waze.reports_v2.j.f34601a, aw.f22909a, com.waze.c.c.d.f18251a);

    public static final List a() {
        List list = f15674b;
        ArrayList arrayList = new ArrayList(i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.waze.app_nav.c.a) it.next()).b());
        }
        return arrayList;
    }
}
