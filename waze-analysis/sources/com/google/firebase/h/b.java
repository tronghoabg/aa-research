package com.google.firebase.h;

import com.google.firebase.components.r;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    private final String f9901a;

    /* renamed from: b, reason: collision with root package name */
    private final c f9902b;

    b(Set set, c cVar) {
        this.f9901a = c(set);
        this.f9902b = cVar;
    }

    public static com.google.firebase.components.c a() {
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(h.class);
        bVarB.b(r.i(d.class));
        bVarB.c(new a());
        return bVarB.a();
    }

    private static String c(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            sb.append(dVar.a());
            sb.append('/');
            sb.append(dVar.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.h.h
    public final String b() {
        c cVar = this.f9902b;
        boolean zIsEmpty = cVar.b().isEmpty();
        String str = this.f9901a;
        if (zIsEmpty) {
            return str;
        }
        return str + " " + c(cVar.b());
    }
}
