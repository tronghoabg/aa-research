package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
final class idq implements icz {
    final /* synthetic */ ids a;

    public idq(ids idsVar) {
        this.a = idsVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.icz
    public final void a(boolean z) {
        ArrayList arrayList;
        ify.f();
        ids idsVar = this.a;
        synchronized (idsVar) {
            arrayList = new ArrayList((Collection) idsVar.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((icz) arrayList.get(i)).a(z);
        }
    }
}
