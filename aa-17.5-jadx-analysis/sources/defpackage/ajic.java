package defpackage;

/* loaded from: classes3.dex */
public final class ajic {
    public ajhx a;
    public String b;
    public ajin c;
    public erb d;

    public ajic(ajid ajidVar) {
        this.c = ajil.a;
        this.a = ajidVar.a;
        this.b = ajidVar.b;
        this.c = ajidVar.d;
        this.d = ahdw.j(ajidVar.c);
    }

    public final void a(ajhg ajhgVar) {
        ajhgVar.getClass();
        String strH = ahdw.h(ajhgVar);
        if (strH.length() == 0) {
            d("Cache-Control");
        } else {
            b("Cache-Control", strH);
        }
    }

    public final void b(String str, String str2) {
        ahdw.n(this.d, str, str2);
    }

    public final void c(String str) {
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (affa.f(str, "POST") || affa.f(str, "PUT") || affa.f(str, "PATCH") || affa.f(str, "PROPPATCH") || affa.f(str, "QUERY") || affa.f(str, "REPORT")) {
            throw new IllegalArgumentException(a.bq(str, "method ", " must have a request body."));
        }
        this.b = str;
    }

    public final void d(String str) {
        ahdw.m(this.d, str);
    }

    public ajic() {
        this.c = ajil.a;
        this.b = "GET";
        this.d = new erb((byte[]) null, (short[]) null);
    }
}
