package defpackage;

/* loaded from: classes2.dex */
public final class fx extends gd {
    final /* synthetic */ isp a;

    public fx(isp ispVar) {
        this.a = ispVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gd
    public final int a() {
        return this.a.d.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gd
    public final int b() {
        return this.a.c.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gd
    public final boolean c(int i, int i2) {
        isp ispVar = this.a;
        ?? r0 = ispVar.d;
        Object obj = ispVar.c.get(i);
        Object obj2 = r0.get(i2);
        if (obj != null && obj2 != null) {
            return ((gf) ((fy) ispVar.b).g.a).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gd
    public final boolean d(int i, int i2) {
        isp ispVar = this.a;
        ?? r0 = ispVar.d;
        Object obj = ispVar.c.get(i);
        Object obj2 = r0.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((gf) ((fy) ispVar.b).g.a).b(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gd
    public final void e(int i, int i2) {
        isp ispVar = this.a;
        ?? r0 = ispVar.d;
        Object obj = ispVar.c.get(i);
        Object obj2 = r0.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
    }
}
