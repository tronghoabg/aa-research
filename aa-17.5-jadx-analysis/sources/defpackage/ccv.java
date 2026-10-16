package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class ccv implements bxq {
    public final byw a = new byw(new bxr[16]);
    private final Set b;

    public ccv(Set set) {
        this.b = set;
    }

    @Override // defpackage.bxq
    public final void eo() {
        byw bywVar = this.a;
        Object[] objArr = bywVar.a;
        int i = bywVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            bxq bxqVarA = ((bxr) objArr[i2]).a();
            this.b.remove(bxqVarA);
            bxqVarA.eo();
        }
    }

    @Override // defpackage.bxq
    public final void eW() {
    }

    @Override // defpackage.bxq
    public final void eX() {
    }
}
