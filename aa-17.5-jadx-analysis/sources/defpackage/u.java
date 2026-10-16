package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class u extends p {
    public final ArrayList al = new ArrayList();

    public void D() {
        q();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p pVar = (p) arrayList.get(i);
            if (pVar instanceof u) {
                ((u) pVar).D();
            }
        }
    }

    public final void F(p pVar) {
        this.al.remove(pVar);
        pVar.r = null;
    }

    @Override // defpackage.p
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.p
    public final void n(int i, int i2) {
        super.n(i, i2);
        ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p) arrayList.get(i3)).n(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.p
    public final void q() {
        super.q();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p pVar = (p) arrayList.get(i);
            pVar.n(b(), c());
            if (!(pVar instanceof q)) {
                pVar.q();
            }
        }
    }

    @Override // defpackage.p
    public final void z(lah lahVar) {
        super.z(lahVar);
        ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((p) arrayList.get(i)).z(lahVar);
        }
    }
}
