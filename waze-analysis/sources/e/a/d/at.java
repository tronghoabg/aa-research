package e.a.d;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f46623a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private volatile e.a.w f46624b = e.a.w.f47854d;

    at() {
    }

    final void a(e.a.w wVar) {
        com.google.d.b.an.C(wVar, "newState");
        if (this.f46624b == wVar || this.f46624b == e.a.w.f47855e) {
            return;
        }
        this.f46624b = wVar;
        if (this.f46623a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f46623a;
        this.f46623a = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
