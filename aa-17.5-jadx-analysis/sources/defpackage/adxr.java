package defpackage;

/* loaded from: classes.dex */
final class adxr implements adxw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public adxr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [adje, java.lang.Object] */
    @Override // defpackage.adxw
    public final void a(adye adyeVar) {
        int i = this.b;
        if (i == 0) {
            adyeVar.a.i((adjr) this.a);
        } else if (i != 1) {
            adyeVar.a.j((adjt) this.a);
        } else {
            adyeVar.a.h(this.a);
        }
    }
}
