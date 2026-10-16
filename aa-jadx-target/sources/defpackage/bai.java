package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bai implements defpackage.affc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bai(int i, int i2, defpackage.aal aalVar, defpackage.sns snsVar, int i3) {
        this.e = i3;
        this.a = i;
        this.b = i2;
        this.d = aalVar;
        this.c = snsVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object defaultLazyKey;
        if (this.e != 0) {
            int iIntValue = ((java.lang.Integer) obj).intValue();
            ((defpackage.bah) this.d).h((defpackage.epq) this.c, this.a, this.b, iIntValue);
            return defpackage.afbk.a;
        }
        defpackage.ov ovVar = (defpackage.ov) obj;
        defpackage.affc affcVarA = ((defpackage.azb) ovVar.c).a();
        int i = ovVar.a;
        int iMax = java.lang.Math.max(this.a, i);
        int iMin = java.lang.Math.min(this.b, (ovVar.b + i) - 1);
        if (iMax <= iMin) {
            while (true) {
                if (affcVarA == null) {
                    defaultLazyKey = new androidx.compose.foundation.lazy.layout.DefaultLazyKey(iMax);
                } else {
                    defaultLazyKey = affcVarA.invoke(java.lang.Integer.valueOf(iMax - i));
                    if (defaultLazyKey == null) {
                        defaultLazyKey = new androidx.compose.foundation.lazy.layout.DefaultLazyKey(iMax);
                    }
                }
                java.lang.Object obj2 = this.c;
                ((defpackage.aal) this.d).g(defaultLazyKey, iMax);
                defpackage.sns snsVar = (defpackage.sns) obj2;
                ((java.lang.Object[]) snsVar.b)[iMax - snsVar.a] = defaultLazyKey;
                if (iMax == iMin) {
                    break;
                }
                iMax++;
            }
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bai(defpackage.bah bahVar, defpackage.epq epqVar, int i, int i2, int i3) {
        this.e = i3;
        this.d = bahVar;
        this.c = epqVar;
        this.a = i;
        this.b = i2;
    }
}
