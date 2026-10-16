package com.google.d.f;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l extends aa {
    l(Class cls) {
        super("tags", cls, false);
    }

    @Override // com.google.d.f.aa
    public final /* bridge */ /* synthetic */ void b(Object obj, z zVar) {
        com.google.d.f.c.j jVar = (com.google.d.f.c.j) obj;
        if (jVar == null) {
            return;
        }
        for (Map.Entry entry : jVar.d().entrySet()) {
            if (((Set) entry.getValue()).isEmpty()) {
                zVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    zVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
