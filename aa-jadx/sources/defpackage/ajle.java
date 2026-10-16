package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajle {
    public final defpackage.ajkm a;
    public final defpackage.ajjc b;
    public final defpackage.sdv c;
    private final java.util.List d;
    private final int e;
    private int f;

    public ajle(defpackage.ajkm ajkmVar, java.util.List list, int i, defpackage.sdv sdvVar, defpackage.ajjc ajjcVar) {
        this.a = ajkmVar;
        this.d = list;
        this.e = i;
        this.c = sdvVar;
        this.b = ajjcVar;
    }

    public static /* synthetic */ defpackage.ajle b(defpackage.ajle ajleVar, int i, defpackage.sdv sdvVar, defpackage.ajjc ajjcVar, int i2) {
        if ((i2 & 1) != 0) {
            i = ajleVar.e;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            sdvVar = ajleVar.c;
        }
        defpackage.sdv sdvVar2 = sdvVar;
        if ((i2 & 4) != 0) {
            ajjcVar = ajleVar.b;
        }
        defpackage.ajjc ajjcVar2 = ajjcVar;
        ajjcVar2.getClass();
        return new defpackage.ajle(ajleVar.a, ajleVar.d, i3, sdvVar2, ajjcVar2);
    }

    public final defpackage.ajjf a(defpackage.ajjc ajjcVar) throws java.io.IOException {
        ajjcVar.getClass();
        java.util.List list = this.d;
        int i = this.e;
        if (i >= list.size()) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.f++;
        defpackage.sdv sdvVar = this.c;
        if (sdvVar != null) {
            if (!((defpackage.ajki) sdvVar.d).f.e(ajjcVar.a)) {
                throw new java.lang.IllegalStateException("network interceptor " + list.get(i - 1) + " must retain the same host and port");
            }
            if (this.f != 1) {
                throw new java.lang.IllegalStateException("network interceptor " + list.get(i - 1) + " must call proceed() exactly once");
            }
        }
        int i2 = i + 1;
        defpackage.ajle ajleVarB = b(this, i2, null, ajjcVar, 58);
        defpackage.ajix ajixVar = (defpackage.ajix) list.get(i);
        defpackage.ajjf ajjfVarA = ajixVar.a(ajleVarB);
        if (sdvVar == null || i2 >= list.size() || ajleVarB.f == 1) {
            return ajjfVarA;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(ajixVar, "network interceptor ", " must call proceed() exactly once"));
    }
}
