package com.google.d.f;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k extends aa {
    k(Class cls) {
        super("group_by", cls, true);
    }

    @Override // com.google.d.f.aa
    public final void a(Iterator it, z zVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                zVar.a(f(), next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String strF = f();
            sb.append(']');
            zVar.a(strF, sb.toString());
        }
    }
}
