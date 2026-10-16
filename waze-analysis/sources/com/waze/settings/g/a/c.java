package com.waze.settings.g.a;

import com.waze.config.d;
import com.waze.settings.ao;
import h.f;
import h.g;
import h.g.b.x;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final f f37292a = g.a(new ao(2));

    /* renamed from: b, reason: collision with root package name */
    private final f f37293b = g.a(new b(this, 0));

    static final k d(c cVar) {
        return cVar.e().k();
    }

    private final d e() {
        return (d) this.f37292a.getValue();
    }

    @Override // com.waze.settings.g.a.a
    public final String a() {
        String strB = e().b();
        x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.settings.g.a.a
    public final k b() {
        Object value = this.f37293b.getValue();
        x.e(value, "getValue(...)");
        return (k) value;
    }

    @Override // com.waze.settings.g.a.a
    public final void c(String str) {
        x.f(str, "value");
        e().d(str);
    }
}
