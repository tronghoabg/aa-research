package com.waze.app_nav;

import com.waze.R;
import com.waze.planned_drive.ay;
import com.waze.settings.cg;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final List f15419a = h.a.i.i(ay.class, com.waze.inbox.i.class, cg.class, com.waze.web.i.class, com.waze.mywaze.l.class);

    /* renamed from: b, reason: collision with root package name */
    private final d f15420b = new d(R.anim.main_slide_up_bottom, R.anim.main_slide_down_bottom, R.anim.main_slide_up_bottom, R.anim.main_slide_down_bottom);

    /* renamed from: c, reason: collision with root package name */
    private final d f15421c = new d(R.anim.rewire_slide_in_right, R.anim.rewire_slide_out_right, R.anim.rewire_slide_in_right, R.anim.rewire_slide_out_right);

    @Override // com.waze.app_nav.e
    public final d a(Class cls) {
        h.g.b.x.f(cls, "fragmentClass");
        return h.a.i.ax(this.f15419a, cls) ? this.f15421c : this.f15420b;
    }
}
