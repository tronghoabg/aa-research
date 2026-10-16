package defpackage;

/* loaded from: classes2.dex */
public final class gkj {
    public boolean a;
    public Object b;
    public Object c;

    public gkj(aebt aebtVar) {
        this.c = aebtVar.c;
        this.b = aebtVar.d;
        this.a = aebtVar.e;
    }

    public final void a(aebs... aebsVarArr) {
        String[] strArr = new String[aebsVarArr.length];
        for (int i = 0; i < aebsVarArr.length; i++) {
            strArr[i] = aebsVarArr[i].bb;
        }
        this.c = strArr;
    }

    public final void b() {
        this.a = true;
    }

    public final void c(aecc... aeccVarArr) {
        String[] strArr = new String[aeccVarArr.length];
        for (int i = 0; i < aeccVarArr.length; i++) {
            strArr[i] = aeccVarArr[i].f;
        }
        this.b = strArr;
    }
}
