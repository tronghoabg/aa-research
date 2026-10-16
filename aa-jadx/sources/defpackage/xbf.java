package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xbf extends defpackage.ge {
    private final java.util.List a;
    private final java.util.List b;

    public xbf(java.util.List list, java.util.List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.ge
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.ge
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.ge
    public final boolean c(int i, int i2) {
        java.util.List list = this.a;
        java.lang.Object obj = list.get(i);
        boolean z = obj instanceof defpackage.mrd;
        java.util.List list2 = this.b;
        java.lang.Object obj2 = list2.get(i2);
        if (z) {
            defpackage.mrd mrdVar = (defpackage.mrd) obj;
            if (obj2 instanceof defpackage.mrd) {
                return j$.util.Objects.equals(mrdVar.i(), ((defpackage.mrd) obj2).i());
            }
        }
        return list.get(i).equals(list2.get(i2));
    }

    @Override // defpackage.ge
    public final boolean d(int i, int i2) {
        return this.a.get(i).equals(this.b.get(i2));
    }
}
