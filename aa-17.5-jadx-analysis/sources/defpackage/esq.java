package defpackage;

/* loaded from: classes.dex */
public final class esq extends erm {
    public static final erq a = new esp();
    public final aau b = new aau(null);
    public boolean c = false;

    public final esn a(int i) {
        return (esn) aav.a(this.b, i);
    }

    final void b() {
        this.c = false;
    }

    @Override // defpackage.erm
    protected final void d() {
        aau aauVar = this.b;
        int iC = aauVar.c();
        for (int i = 0; i < iC; i++) {
            ((esn) aauVar.e(i)).a(true);
        }
        int i2 = aauVar.d;
        Object[] objArr = aauVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        aauVar.d = 0;
        aauVar.a = false;
    }
}
