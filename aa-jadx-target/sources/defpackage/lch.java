package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lch {
    public final defpackage.zbd a;
    public final int b;
    public final int c;
    public final java.lang.Integer d;
    private final defpackage.ygw e;

    public /* synthetic */ lch(defpackage.zbd zbdVar, int i, int i2, defpackage.ygw ygwVar, java.lang.Integer num, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = defpackage.ygw.d;
            ygwVar = defpackage.ymx.a;
            ygwVar.getClass();
        }
        i = (i3 & 2) != 0 ? 0 : i;
        num = (i3 & 16) != 0 ? null : num;
        ygwVar.getClass();
        this.a = zbdVar;
        this.b = i;
        this.c = i2;
        this.e = ygwVar;
        this.d = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String a(android.content.Context context) {
        context.getClass();
        defpackage.ygw ygwVar = this.e;
        if (ygwVar.isEmpty()) {
            java.lang.String string = context.getString(this.c);
            string.getClass();
            return string;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(ygwVar, 10));
        defpackage.you youVarListIterator = ygwVar.listIterator(0);
        while (youVarListIterator.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) youVarListIterator.next();
            num.getClass();
            arrayList.add(context.getString(num.intValue()));
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        java.lang.String string2 = context.getString(this.c, java.util.Arrays.copyOf(strArr, strArr.length));
        string2.getClass();
        return string2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.lch)) {
            return false;
        }
        defpackage.lch lchVar = (defpackage.lch) obj;
        return defpackage.afga.f(this.a, lchVar.a) && this.b == lchVar.b && this.c == lchVar.c && defpackage.afga.f(this.e, lchVar.e) && defpackage.afga.f(this.d, lchVar.d);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.e.hashCode();
        java.lang.Integer num = this.d;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "ResponseOption(action=" + this.a + ", icon=" + this.b + ", text=" + this.c + ", textArgs=" + this.e + ", semanticAction=" + this.d + ")";
    }
}
