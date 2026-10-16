package com.waze.cg.c;

import android.content.Context;
import com.waze.sound.bp;
import com.waze.sound.fm;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22326a;

    /* renamed from: b, reason: collision with root package name */
    private final fm f22327b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f22328c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22329d;

    public k(Context context, fm fmVar, h.g.a.a aVar) {
        x.f(context, "context");
        x.f(fmVar, "soundPlayer");
        x.f(aVar, "guidanceModeGetter");
        this.f22326a = context;
        this.f22327b = fmVar;
        this.f22328c = aVar;
        this.f22329d = "waze_to_goal";
    }

    public final void a() {
        if (b()) {
            com.waze.sharedui.e.e.i(this.f22327b, com.waze.resources.h.e(this.f22326a, this.f22329d), null, false, false, null, 30);
        }
    }

    public final boolean b() {
        return this.f22328c.invoke() != bp.f39558e;
    }
}
