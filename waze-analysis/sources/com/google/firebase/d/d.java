package com.google.firebase.d;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f9867a;

    /* renamed from: b, reason: collision with root package name */
    private Map f9868b = null;

    d(String str) {
        this.f9867a = str;
    }

    public final e a() {
        Map map = this.f9868b;
        return new e(this.f9867a, map == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(map)), null);
    }

    public final void b(Annotation annotation) {
        if (this.f9868b == null) {
            this.f9868b = new HashMap();
        }
        this.f9868b.put(com.google.firebase.d.c.f.class, annotation);
    }
}
