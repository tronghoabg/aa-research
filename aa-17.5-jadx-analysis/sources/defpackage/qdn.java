package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class qdn implements zge {
    private final qdg a;
    private final qdr b;

    public qdn(qdg qdgVar, qdr qdrVar) {
        qdgVar.getClass();
        this.a = qdgVar;
        this.b = qdrVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        this.b.b(this.a);
    }

    @Override // defpackage.zge
    public final void b(Object obj) {
        qdr qdrVar = this.b;
        Object obj2 = qdrVar.a;
        qdg qdgVar = this.a;
        synchronized (obj2) {
            if (qdrVar.b) {
                return;
            }
            Map map = qdrVar.c;
            if (!map.containsKey(qdgVar) && !qdrVar.d.contains(qdgVar)) {
                map.put(qdgVar, obj);
                qdrVar.a();
            }
        }
    }
}
