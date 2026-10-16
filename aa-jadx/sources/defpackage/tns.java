package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tns {
    public final defpackage.tnj a;
    public final defpackage.tnn b;

    public tns(android.content.Context context, defpackage.tnn tnnVar) {
        android.content.Context context2;
        context.getClass();
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.tnt tntVar = new defpackage.tnt();
        defpackage.tni tniVar = new defpackage.tni();
        tniVar.a();
        if (applicationContext == null) {
            throw new java.lang.NullPointerException("Null context");
        }
        tniVar.a = applicationContext;
        tniVar.c = new defpackage.xys(tntVar);
        tniVar.a();
        if (tniVar.e == 1 && (context2 = tniVar.a) != null) {
            this.a = new defpackage.tnj(context2, tniVar.b, tniVar.c, tniVar.d);
            this.b = tnnVar;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (tniVar.a == null) {
            sb.append(" context");
        }
        if (tniVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static defpackage.tns a(android.content.Context context, defpackage.tnh tnhVar) {
        return new defpackage.tns(context, new defpackage.tnn(tnhVar));
    }

    public final java.lang.String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
