package com.waze.ui.p;

import androidx.compose.ui.geometry.Rect;
import com.waze.map.b.bg;
import com.waze.map.b.bi;
import com.waze.map.b.ed;
import h.g.b.x;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final ed f43200a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f43201b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f43202c;

    public i(ed edVar, Rect rect) {
        x.f(edVar, "mapController");
        this.f43200a = edVar;
        this.f43201b = ck.b(rect != null ? t.a(rect) : null);
        this.f43202c = edVar.x();
    }

    public final ed a() {
        return this.f43200a;
    }

    public final ch c() {
        return this.f43202c;
    }

    public final void d(bg bgVar) {
        x.f(bgVar, "request");
        this.f43200a.a(bgVar);
    }

    public final void e(bi biVar) {
        x.f(biVar, "request");
        this.f43200a.b(biVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return x.n(this.f43200a, ((i) obj).f43200a);
        }
        return false;
    }

    public final void f(Rect rect) {
        this.f43201b.e(rect != null ? t.a(rect) : null);
    }

    public final int hashCode() {
        return this.f43200a.hashCode();
    }
}
