package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class coe extends bui {
    public coe(cod codVar) {
        super(codVar);
    }

    private static final cnd m(cod codVar) {
        if (codVar instanceof cnd) {
            return (cnd) codVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // defpackage.bui
    protected final void e() {
        cnd cndVarM = m((cod) this.a);
        cndVarM.f(0, cndVarM.a());
    }

    @Override // defpackage.buj
    public final /* bridge */ /* synthetic */ void i(int i, Object obj) {
        m((cod) this.b).d(i, (cod) obj);
    }

    @Override // defpackage.buj
    public final /* bridge */ /* synthetic */ void j(int i, Object obj) {
    }

    @Override // defpackage.buj
    public final void k(int i, int i2, int i3) {
        cnd cndVarM = m((cod) this.b);
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                List list = cndVarM.a;
                cod codVar = (cod) list.get(i);
                list.remove(i);
                list.add(i2, codVar);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                List list2 = cndVarM.a;
                cod codVar2 = (cod) list2.get(i);
                list2.remove(i);
                list2.add(i2 - 1, codVar2);
                i4++;
            }
        }
        cndVarM.q();
    }

    @Override // defpackage.buj
    public final void l(int i, int i2) {
        m((cod) this.b).f(i, i2);
    }
}
