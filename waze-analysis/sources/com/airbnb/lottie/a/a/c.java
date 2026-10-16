package com.airbnb.lottie.a.a;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f1759a = new ArrayList();

    final void a(u uVar) {
        this.f1759a.add(uVar);
    }

    public final void b(Path path) {
        List list = this.f1759a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            u uVar = (u) list.get(size);
            int i2 = com.airbnb.lottie.g.k.f2415a;
            if (uVar != null && !uVar.h()) {
                com.airbnb.lottie.g.k.e(path, ((com.airbnb.lottie.a.b.j) uVar.c()).o() / 100.0f, ((com.airbnb.lottie.a.b.j) uVar.a()).o() / 100.0f, ((com.airbnb.lottie.a.b.j) uVar.b()).o() / 360.0f);
            }
        }
    }
}
