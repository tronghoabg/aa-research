package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class iku implements defpackage.xyd {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iku(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [affc, java.lang.Object] */
    @Override // defpackage.xyd
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                android.graphics.Bitmap bitmapY = defpackage.ikz.y((android.graphics.Bitmap) obj);
                java.lang.Object obj2 = this.a;
                ((rcc) obj2).h = bitmapY;
                return obj2;
            case 1:
                java.lang.Object obj3 = this.a;
                ((uem) obj3).b = (com.google.android.gms.car.RadioMetadata) obj;
                return obj3;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = defpackage.ikz.a;
                return this.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.graphics.Bitmap bitmapY2 = defpackage.ikz.y((android.graphics.Bitmap) obj);
                java.lang.Object obj4 = this.a;
                ((rcd) obj4).f = bitmapY2;
                return obj4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar2 = defpackage.ikz.a;
                return this.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.jnx jnxVar = (defpackage.jnx) this.a;
                return java.lang.Boolean.valueOf(defpackage.jnx.c(jnxVar.b, jnxVar.d));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.jnx jnxVar2 = (defpackage.jnx) this.a;
                return java.lang.Boolean.valueOf(defpackage.jnx.c(jnxVar2.b, jnxVar2.d));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i = defpackage.ygw.d;
                defpackage.ygr ygrVar = new defpackage.ygr(4);
                ygrVar.k(this.a);
                ygrVar.i((kex) obj);
                return ygrVar.g();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.content.Context context = ((defpackage.koa) this.a).b;
                context.getClass();
                return defpackage.omv.b(context, (defpackage.rco) obj, null, null, 0);
            case 9:
                defpackage.yqm yqmVar3 = kqt.a;
                defpackage.abor aborVarK = ((kqs) obj).K();
                aborVarK.w((defpackage.abox) this.a);
                return aborVarK.q();
            case 10:
                defpackage.ldb ldbVar = defpackage.ldd.a;
                return this.a.invoke(obj);
            case 11:
                defpackage.ldb ldbVar2 = defpackage.ldd.a;
                return this.a.invoke(obj);
            case 12:
                defpackage.ldb ldbVar3 = defpackage.ldd.a;
                return this.a.invoke(obj);
            case 13:
                defpackage.ldb ldbVar4 = defpackage.ldd.a;
                return this.a.invoke(obj);
            case 14:
                pab pabVar = pac.a;
                return this.a.invoke(obj);
            case 15:
                pab pabVar2 = pac.a;
                return this.a.invoke(obj);
            case 16:
                pab pabVar3 = pac.a;
                return this.a.invoke(obj);
            case 17:
                pab pabVar4 = pac.a;
                return this.a.invoke(obj);
            case 18:
                pab pabVar5 = pac.a;
                return this.a.invoke(obj);
            case 19:
                pab pabVar6 = pac.a;
                return this.a.invoke(obj);
            default:
                pab pabVar7 = pac.a;
                return this.a.invoke(obj);
        }
    }
}
