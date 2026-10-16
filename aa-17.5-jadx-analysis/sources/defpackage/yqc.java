package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class yqc implements ypy {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ypy
    public final /* synthetic */ void a(yos yosVar, Iterator it, Object obj) {
        if (!yosVar.b) {
            throw new IllegalStateException("non repeating key");
        }
        if (!yosVar.c || yqn.a() <= 20) {
            yosVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(yosVar.a, it.next());
            }
        }
    }
}
