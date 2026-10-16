package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class cii implements defpackage.affc {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ cii(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Boolean.valueOf(((defpackage.cjc) obj).k(this.a));
            case 1:
                return java.lang.Boolean.valueOf(((defpackage.cjc) obj).k(this.a));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Boolean.valueOf(((defpackage.cjc) obj).j(this.a));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Class cls = defpackage.czz.a;
                return java.lang.Boolean.valueOf(((defpackage.cjc) obj).k(this.a));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Class cls2 = defpackage.czz.a;
                return java.lang.Boolean.valueOf(((defpackage.cjc) obj).k(this.a));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.content.Context context = (android.content.Context) obj;
                int i = defpackage.jvo.a;
                context.getClass();
                android.support.v4.app.FragmentContainerView fragmentContainerView = new android.support.v4.app.FragmentContainerView(context);
                fragmentContainerView.setId(this.a);
                return fragmentContainerView;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                int i2 = defpackage.kms.a;
                cjaVar.getClass();
                if (cjaVar.b()) {
                    defpackage.kms.b = java.lang.Integer.valueOf(this.a);
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Integer.valueOf(this.a * ((java.lang.Integer) obj).intValue());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Integer.valueOf((-this.a) * ((java.lang.Integer) obj).intValue());
            case 9:
                oqu oquVar = (oqu) obj;
                oquVar.getClass();
                return java.lang.Boolean.valueOf(oquVar.a == this.a);
            case 10:
                ((java.lang.Integer) obj).intValue();
                throw new java.lang.IndexOutOfBoundsException("Collection doesn't contain element at index " + this.a + ".");
            default:
                ((java.lang.Integer) obj).intValue();
                throw new java.lang.IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.a + ".");
        }
    }
}
