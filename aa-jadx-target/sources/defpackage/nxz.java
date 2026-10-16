package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nxz implements defpackage.affc {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public nxz(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [afdk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [afdk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case 1:
                android.view.KeyEvent keyEvent = ((cpx) obj).a;
                keyEvent.getClass();
                boolean z = true;
                if (defpackage.a.X(defpackage.tn.h(keyEvent), 1) && defpackage.a.i(defpackage.tn.i(keyEvent), defpackage.tn.e(4))) {
                    nyc.a.l().u("Closing due to KEYCODE_BACK.");
                    this.a.invoke();
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.cla claVar = (defpackage.cla) obj;
                claVar.getClass();
                ?? r7 = this.a;
                claVar.z(((java.lang.Number) r7.a()).floatValue());
                claVar.A(((java.lang.Number) r7.a()).floatValue());
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((emt) this.a).b();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((android.view.View) obj).getClass();
                ?? r8 = this.a;
                defpackage.afbk afbkVar = defpackage.afbk.a;
                r8.w(afbkVar);
                return afbkVar;
            default:
                ?? r9 = this.a;
                defpackage.afbk afbkVar2 = defpackage.afbk.a;
                r9.w(afbkVar2);
                return afbkVar2;
        }
    }
}
