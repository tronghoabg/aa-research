package r9;

import java.util.HashMap;
import java.util.Map;

/* renamed from: r9.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3950g {

    /* renamed from: a, reason: collision with root package name */
    public final int f44617a;

    /* renamed from: b, reason: collision with root package name */
    public final c9.c f44618b;

    public C3950g(int i5, c9.c cVar) {
        this.f44617a = i5;
        this.f44618b = cVar;
    }

    public static C3950g a(int i5, HashMap map) {
        c9.c cVarG = s9.g.f45372a;
        for (Map.Entry entry : map.entrySet()) {
            cVarG = cVarG.g((s9.h) entry.getKey(), ((x) entry.getValue()).f44677a);
        }
        return new C3950g(i5, cVarG);
    }
}
