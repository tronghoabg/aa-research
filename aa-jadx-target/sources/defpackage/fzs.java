package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class fzs implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fzs(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v37, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v39, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v41, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.Object, tf] */
    /* JADX WARN: Type inference failed for: r7v6, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.Object, uv] */
    /* JADX WARN: Type inference failed for: r7v62, types: [java.lang.Object, sw] */
    /* JADX WARN: Type inference failed for: r7v9, types: [bwx, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean boolValueOf = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                hsz hszVar = (hsz) obj;
                hszVar.getClass();
                hsz hszVarA = hszVar.a(new fzu((defpackage.bwx) this.a));
                hszVarA.getClass();
                return hszVarA;
            case 1:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                cuwVar.getClass();
                cuwVar.x((defpackage.cux) this.a, 0, 0);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                fqh fqhVar = (fqh) obj;
                fqhVar.getClass();
                this.a.b(fqhVar.a);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
                drawable.getClass();
                if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                    this.a.b(null);
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Object obj2 = this.a;
                int i = gau.a;
                return defpackage.tna.aT((defpackage.cux) obj2, (defpackage.cuw) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                gjg gjgVar = (gjg) obj;
                gjgVar.getClass();
                gvv gvvVar = gvv.a;
                int iOrdinal = gjgVar.ordinal();
                java.lang.Object obj3 = this.a;
                if (iOrdinal == 0) {
                    boolValueOf = java.lang.Boolean.valueOf(((defpackage.cit) obj3).a(5));
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        boolValueOf = java.lang.Boolean.valueOf(((defpackage.cit) obj3).a(3));
                    } else if (iOrdinal != 3) {
                        throw new defpackage.afas();
                    }
                }
                return java.lang.Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                gjg gjgVar2 = (gjg) obj;
                gjgVar2.getClass();
                gvv gvvVar2 = gvv.a;
                int iOrdinal2 = gjgVar2.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 == 2) {
                        boolValueOf = java.lang.Boolean.valueOf(((defpackage.cit) this.a).a(3));
                    } else if (iOrdinal2 != 3) {
                        throw new defpackage.afas();
                    }
                }
                return java.lang.Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                ?? r7 = this.a;
                defpackage.bvm bvmVar = ggn.a;
                cjaVar.getClass();
                r7.b(java.lang.Boolean.valueOf(cjaVar.b()));
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cim cimVar = (defpackage.cim) obj;
                cimVar.getClass();
                defpackage.cit citVar = (defpackage.cit) this.a;
                cimVar.e(citVar);
                cimVar.h(citVar);
                return defpackage.afbk.a;
            case 9:
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
                motionEvent.getClass();
                this.a.invoke(new giq(motionEvent, android.os.SystemClock.elapsedRealtime()));
                return java.lang.Boolean.FALSE;
            case 10:
                android.view.KeyEvent keyEvent = (android.view.KeyEvent) obj;
                keyEvent.getClass();
                if (keyEvent.getAction() == 1) {
                    this.a.invoke(new gir(keyEvent, android.os.SystemClock.elapsedRealtime()));
                }
                return java.lang.Boolean.FALSE;
            case 11:
                defpackage.cja cjaVar2 = (defpackage.cja) obj;
                cjaVar2.getClass();
                if (!cjaVar2.b()) {
                    return defpackage.afbk.a;
                }
                defpackage.fxj.l(new gby(this.a, 5));
                return defpackage.afbk.a;
            case 12:
                csb csbVar = (csb) obj;
                csbVar.getClass();
                this.a.invoke(new gio(csbVar, android.os.SystemClock.elapsedRealtime()));
                return java.lang.Boolean.FALSE;
            case 13:
                ((defpackage.ctc) obj).getClass();
                this.a.b(java.lang.Boolean.TRUE);
                return defpackage.afbk.a;
            case 14:
                this.a.invoke();
                return defpackage.afbk.a;
            case 15:
                android.view.KeyEvent keyEvent2 = (android.view.KeyEvent) obj;
                keyEvent2.getClass();
                java.lang.Boolean bool = (java.lang.Boolean) ((gjo) this.a).a.invoke(keyEvent2);
                bool.booleanValue();
                return bool;
            case 16:
                android.view.MotionEvent motionEvent2 = (android.view.MotionEvent) obj;
                motionEvent2.getClass();
                int actionMasked = motionEvent2.getActionMasked();
                java.lang.Object obj4 = this.a;
                if (actionMasked == 0) {
                    ((gjq) obj4).c = motionEvent2.getDownTime();
                } else if (actionMasked == 1 || actionMasked == 3) {
                    ((gjq) obj4).c = -1L;
                }
                gjq gjqVar = (gjq) obj4;
                return java.lang.Boolean.valueOf(gjqVar.b ? ((java.lang.Boolean) gjqVar.a.invoke(motionEvent2)).booleanValue() : false);
            case 17:
                ((java.lang.Integer) obj).getClass();
                ((defpackage.ype) defpackage.gju.a.e().o(defpackage.yqn.a, "CarApp.H").ai(57)).u("Cache miss, computing most common color for the given bitmap");
                return java.lang.Integer.valueOf(defpackage.gju.c((android.graphics.Bitmap) this.a));
            case 18:
                gep gepVar = (gep) obj;
                gepVar.getClass();
                this.a.sendDismiss(gepVar);
                return defpackage.afbk.a;
            case 19:
                gep gepVar2 = (gep) obj;
                gepVar2.getClass();
                this.a.sendClick(gepVar2);
                return defpackage.afbk.a;
            default:
                gep gepVar3 = (gep) obj;
                gepVar3.getClass();
                this.a.sendMarkAsRead(gepVar3);
                return defpackage.afbk.a;
        }
    }
}
