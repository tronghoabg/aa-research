package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class izp {
    public final java.util.function.Function a;
    public final java.util.function.Function b;
    public final java.util.function.Function c;
    public defpackage.xzi d;
    public defpackage.jal e;
    public defpackage.rlz f;
    public java.util.function.BiFunction g = new defpackage.kgf(1);
    public iyx h = null;
    public android.content.Context i;
    public defpackage.xzi j;
    public defpackage.jag k;
    public defpackage.jde l;
    public defpackage.jap m;
    public int n;
    public defpackage.fbl o;
    public defpackage.wyz p;

    public izp(final java.io.InputStream inputStream, final java.io.OutputStream outputStream, final java.io.Closeable closeable) {
        int i = defpackage.jcy.c;
        this.n = 1;
        this.j = null;
        this.o = new defpackage.fbl();
        this.m = new defpackage.jan();
        this.a = new java.util.function.Function() { // from class: izo
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                defpackage.izs izsVar = (defpackage.izs) obj;
                defpackage.izp izpVar = this.a;
                android.content.Context context = izpVar.i;
                defpackage.jag jagVar = izpVar.k;
                iyx iyxVar = izpVar.h;
                java.util.function.BiFunction biFunction = izpVar.g;
                defpackage.yqk yqkVar = defpackage.izs.a;
                defpackage.yqk yqkVar2 = defpackage.jak.a;
                defpackage.jad jadVar = new defpackage.jad();
                jadVar.h = new defpackage.izq(izsVar);
                jadVar.i = new defpackage.wyz(izsVar, null);
                jadVar.b = biFunction;
                jadVar.c = inputStream;
                jadVar.d = outputStream;
                jadVar.e = jagVar;
                jadVar.a = iyxVar;
                jadVar.g = context;
                jadVar.f = closeable;
                if (jadVar.e == null) {
                    jadVar.e = defpackage.jag.a().a();
                }
                return new defpackage.jak(jadVar);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        };
        this.b = new defpackage.ilz(9);
        this.c = new defpackage.ilz(10);
    }
}
