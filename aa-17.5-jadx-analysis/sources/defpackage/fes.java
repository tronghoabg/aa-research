package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
final class fes extends fge {
    final /* synthetic */ Object a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Object c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ fev e;

    public fes(fev fevVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = fevVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void b(fgc fgcVar) {
        fgcVar.P(this);
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void f() {
        Object obj = this.a;
        if (obj != null) {
            this.e.g(obj, this.b, (ArrayList) null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.e.g(obj2, this.d, (ArrayList) null);
        }
    }
}
