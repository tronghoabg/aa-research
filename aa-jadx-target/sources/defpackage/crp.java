package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class crp extends defpackage.cyc<defpackage.crv> {
    private final java.lang.Object a;
    private final java.lang.Object b;
    private final java.lang.Object[] c = null;
    private final androidx.compose.ui.input.pointer.PointerInputEventHandler d;

    public crp(java.lang.Object obj, java.lang.Object obj2, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.crv(this.a, this.b, this.d);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.crv crvVar = (defpackage.crv) cgeVar;
        java.lang.Object obj = crvVar.a;
        java.lang.Object obj2 = this.a;
        boolean z = !defpackage.afga.f(obj, obj2);
        crvVar.a = obj2;
        java.lang.Object obj3 = crvVar.b;
        java.lang.Object obj4 = this.b;
        boolean z2 = !defpackage.afga.f(obj3, obj4);
        crvVar.b = obj4;
        java.lang.Class<?> cls = crvVar.c.getClass();
        androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls != pointerInputEventHandler.getClass() || (z | z2)) {
            crvVar.u();
        }
        crvVar.c = pointerInputEventHandler;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.crp)) {
            return false;
        }
        defpackage.crp crpVar = (defpackage.crp) obj;
        if (!defpackage.afga.f(this.a, crpVar.a) || !defpackage.afga.f(this.b, crpVar.b)) {
            return false;
        }
        java.lang.Object[] objArr = crpVar.c;
        return this.d == crpVar.d;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Object obj2 = this.b;
        return (((iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 961) + this.d.hashCode();
    }
}
