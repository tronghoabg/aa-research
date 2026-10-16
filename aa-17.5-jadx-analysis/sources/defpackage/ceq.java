package defpackage;

/* loaded from: classes.dex */
public final class ceq implements bvl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ceq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bvl
    public final void a() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            bvv bvvVar = (bvv) obj;
            bvvVar.j--;
        } else {
            cer cerVar = (cer) obj;
            cerVar.f--;
        }
    }

    @Override // defpackage.bvl
    public final void b() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((bvv) obj).j++;
        } else {
            ((cer) obj).f++;
        }
    }
}
