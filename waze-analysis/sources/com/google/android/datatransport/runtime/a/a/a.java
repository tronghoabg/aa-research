package com.google.android.datatransport.runtime.a.a;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private l f4098a = null;

    /* renamed from: b, reason: collision with root package name */
    private final List f4099b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private d f4100c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f4101d = "";

    a() {
    }

    public final b a() {
        return new b(this.f4098a, DesugarCollections.unmodifiableList(this.f4099b), this.f4100c, this.f4101d);
    }

    public final void b(i iVar) {
        this.f4099b.add(iVar);
    }

    public final void c(String str) {
        this.f4101d = str;
    }

    public final void d(d dVar) {
        this.f4100c = dVar;
    }

    public final void e(l lVar) {
        this.f4098a = lVar;
    }
}
