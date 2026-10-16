package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kmr implements defpackage.afer {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ kmr(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        boolean z;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return java.lang.Integer.valueOf(this.a);
            }
            defpackage.yqm yqmVar = defpackage.mzk.a;
            return java.lang.Integer.valueOf(this.a);
        }
        java.lang.Integer num = defpackage.kms.b;
        if (num != null) {
            z = num.intValue() == this.a;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
