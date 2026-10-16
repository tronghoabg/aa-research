package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class cqx {
    public cst a;
    public cql b;
    public final /* synthetic */ cra c;
    public int d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cqx(cra craVar) {
        this();
        this.c = craVar;
        this.d = 1;
    }

    public final void a(cql cqlVar, boolean z) {
        List list = cqlVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((cqu) list.get(i)).c()) {
                c(cqlVar);
                return;
            }
        }
        cst cstVar = this.a;
        if (cstVar == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        tl.h(cqlVar, cstVar.j(0L), new bpi(this, this.c, 3, null), false);
        if (this.d == 2) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((cqu) list.get(i2)).b();
                }
            }
            xa xaVar = cqlVar.f;
            if (xaVar != null) {
                xaVar.a = !r3.b;
            }
        }
    }

    public final void b() {
        this.d = 1;
        this.c.b = false;
        this.b = null;
    }

    public final void c(cql cqlVar) {
        if (this.d == 2) {
            cst cstVar = this.a;
            if (cstVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            tl.h(cqlVar, cstVar.j(0L), new chk(this.c, 9), true);
        }
        this.d = 3;
    }

    public cqx() {
    }
}
