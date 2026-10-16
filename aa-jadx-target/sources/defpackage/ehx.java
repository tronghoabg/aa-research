package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ehx extends defpackage.affy implements defpackage.afer {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehx(java.lang.Object obj, int i) {
        super(0, obj, java.util.concurrent.Callable.class, "call", "call()Ljava/lang/Object;", 0);
        this.a = i;
    }

    @Override // defpackage.afer
    public final /* synthetic */ java.lang.Object invoke() {
        boolean z;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return (java.io.File) ((java.util.concurrent.Callable) this.receiver).call();
            case 1:
                ((java.lang.Runnable) this.receiver).run();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return (java.io.File) ((java.util.concurrent.Callable) this.receiver).call();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                fvh fvhVar = (fvh) this.receiver;
                if (fvhVar.a == gms.b) {
                    fvv fvvVar = fvhVar.d;
                    android.util.Log.i("GH.AJTelemetry", "onKeyboardExit");
                    fvhVar.a = gms.a;
                    fvhVar.a();
                    z = true;
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                jsu jsuVar = (jsu) this.receiver;
                if (jsuVar.b == gms.b) {
                    jsuVar.a.c();
                    jsuVar.b = gms.a;
                    jsuVar.a();
                } else {
                    ((rb) jsuVar.e.a).g().c();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((lkk) this.receiver).k();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((lkk) this.receiver).i();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((lkk) this.receiver).k();
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((lkk) this.receiver).i();
                return defpackage.afbk.a;
            case 9:
                ((lkk) this.receiver).k();
                return defpackage.afbk.a;
            case 10:
                ((lkk) this.receiver).i();
                return defpackage.afbk.a;
            case 11:
                ((lkk) this.receiver).k();
                return defpackage.afbk.a;
            case 12:
                ((lkk) this.receiver).i();
                return defpackage.afbk.a;
            case 13:
                ((defpackage.nan) this.receiver).u();
                return defpackage.afbk.a;
            case 14:
                ((defpackage.nyf) this.receiver).d();
                return defpackage.afbk.a;
            default:
                ((java.lang.Runnable) this.receiver).run();
                return defpackage.afbk.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehx(java.lang.Object obj, int i, byte[] bArr) {
        super(0, obj, java.lang.Runnable.class, "run", "run()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehx(java.lang.Object obj, int i, float[] fArr) {
        super(0, obj, lkk.class, "showPlaybackScreen", "showPlaybackScreen()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehx(java.lang.Object obj, int i, int[] iArr) {
        super(0, obj, jsu.class, "onBack", "onBack()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehx(java.lang.Object obj, int i, short[] sArr) {
        super(0, obj, fvh.class, "onBack", "onBack()Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehx(java.lang.Object obj, int i, boolean[] zArr) {
        super(0, obj, lkk.class, "showSearchScreen", "showSearchScreen()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehx(java.lang.Object obj, int i, byte[][][] bArr) {
        super(0, obj, defpackage.nan.class, "goToApp", "goToApp()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehx(java.lang.Object obj, int i, char[][][] cArr) {
        super(0, obj, defpackage.nyf.class, "hide", "hide()V", 0);
        this.a = i;
    }
}
