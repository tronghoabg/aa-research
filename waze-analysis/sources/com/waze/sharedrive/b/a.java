package com.waze.sharedrive.b;

import com.waze.settings.ao;
import h.f;
import h.g;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final f f38050a = g.a(new ao(9));

    /* renamed from: b, reason: collision with root package name */
    private final f f38051b = g.a(new ao(10));

    /* renamed from: c, reason: collision with root package name */
    private final f f38052c = g.a(new ao(11));

    public final int a() {
        return ((Number) this.f38052c.getValue()).intValue();
    }

    public final boolean b() {
        Object value = this.f38050a.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public final boolean c() {
        Object value = this.f38051b.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }
}
