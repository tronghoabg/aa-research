package com.waze.settings;

import androidx.lifecycle.ViewModel;
import java.util.LinkedList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final List f36855a;

    /* renamed from: b, reason: collision with root package name */
    private final List f36856b;

    public bb() {
        LinkedList linkedList = new LinkedList();
        this.f36855a = linkedList;
        this.f36856b = linkedList;
    }

    public final List a() {
        return this.f36856b;
    }

    public final void b() {
        if (this.f36856b.isEmpty()) {
            return;
        }
        this.f36855a.remove(0);
    }

    public final void c(com.waze.settings.tree.e eVar) {
        h.g.b.x.f(eVar, "page");
        this.f36855a.add(0, eVar);
    }
}
