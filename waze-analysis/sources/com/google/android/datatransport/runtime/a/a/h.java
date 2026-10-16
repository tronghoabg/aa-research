package com.google.android.datatransport.runtime.a.a;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private String f4121a = "";

    /* renamed from: b, reason: collision with root package name */
    private List f4122b = new ArrayList();

    h() {
    }

    public final i a() {
        return new i(this.f4121a, DesugarCollections.unmodifiableList(this.f4122b));
    }

    public final void b(List list) {
        this.f4122b = list;
    }

    public final void c(String str) {
        this.f4121a = str;
    }
}
