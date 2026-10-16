package com.google.firebase.abt.component;

import com.google.firebase.g.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8831a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final c f8832b;

    protected a(c cVar) {
        this.f8832b = cVar;
    }

    public final synchronized com.google.firebase.abt.c a() {
        Map map;
        map = this.f8831a;
        if (!map.containsKey("frc")) {
            map.put("frc", new com.google.firebase.abt.c(this.f8832b));
        }
        return (com.google.firebase.abt.c) map.get("frc");
    }
}
