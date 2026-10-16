package defpackage;

/* loaded from: classes3.dex */
public class zsy implements hqz {
    public static final String c = "zsy";

    public static String d(hrc hrcVar) {
        String str;
        hqq hqqVar = hrcVar.a;
        if (hqqVar == null) {
            return "VolleyError(\"" + hrcVar.getMessage() + "\")";
        }
        zsa zsaVarA = zsa.a(hrcVar);
        zsaVarA.e("ResponseCode", hqqVar.a);
        zsaVarA.b("Headers", String.valueOf(hqqVar.c));
        byte[] bArr = hqqVar.b;
        if (bArr == null) {
            str = "<empty>";
        } else {
            str = "[" + bArr.length + " bytes]";
        }
        zsaVarA.b("Data", str);
        return zsaVarA.toString();
    }

    public static String e(hqt hqtVar) {
        String str;
        String strValueOf;
        try {
            byte[] bArrL = hqtVar.l();
            if (bArrL == null) {
                str = "<empty>";
            } else {
                str = "[" + bArrL.length + " bytes]";
            }
        } catch (hqg unused) {
            str = "[Error retrieving body]";
        }
        try {
            strValueOf = String.valueOf(hqtVar.d());
        } catch (hqg unused2) {
            strValueOf = "[Error retrieving headers]";
        }
        zsa zsaVarA = zsa.a(hqtVar);
        zsaVarA.b("URL", hqtVar.c);
        zsaVarA.b("Headers", strValueOf);
        zsaVarA.b("Method", hqtVar.b != 0 ? "POST" : "GET");
        zsaVarA.b("Body", str);
        zsaVarA.b("BodyContentType", hqtVar.b());
        return zsaVarA.toString();
    }

    public static String f(scz sczVar) {
        if (sczVar.d()) {
            return "Response{OK}";
        }
        Object obj = sczVar.e;
        zkt.m(obj);
        return "Response{Error=" + d((hrc) obj) + "}";
    }

    @Override // defpackage.hqz
    public void a(hqt hqtVar, hrc hrcVar) {
        throw null;
    }

    @Override // defpackage.hqz
    public void b(hqt hqtVar, scz sczVar) {
        throw null;
    }

    @Override // defpackage.hqz
    public final void c(hqt hqtVar, scz sczVar, Runnable runnable) {
        throw null;
    }
}
