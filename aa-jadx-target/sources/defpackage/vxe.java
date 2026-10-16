package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class vxe implements defpackage.afak {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vxe(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aclm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r1v7, types: [afak, java.lang.Object] */
    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Boolean.FALSE;
            case 1:
                ?? r1 = this.a;
                if (!((defpackage.xyn) r1.a()).f()) {
                    return null;
                }
                return null;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((com.google.android.projection.gearhead.GhApplication) this.a).a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i = com.google.android.projection.gearhead.GhApplication.b;
                return this.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i2 = com.google.android.projection.gearhead.GhApplication.b;
                return this.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((com.google.android.projection.gearhead.GhApplication) this.a).a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i3 = com.google.android.projection.gearhead.GhApplication.b;
                return this.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return (defpackage.rqv) this.a.fF();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.wzi((android.content.Context) this.a);
            case 9:
                return new defpackage.xgy((android.content.Context) this.a);
            default:
                return new defpackage.xgl((android.content.Context) this.a);
        }
    }
}
