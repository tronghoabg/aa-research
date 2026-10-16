package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes2.dex */
public class hro extends hqt {
    private final Object n;
    private hqy o;

    public hro(String str, hqy hqyVar, hqx hqxVar) {
        super(0, str, hqxVar);
        this.n = new Object();
        this.o = hqyVar;
    }

    @Override // defpackage.hqt
    public final void f() {
        super.f();
        synchronized (this.n) {
            this.o = null;
        }
    }

    @Override // defpackage.hqt
    protected final /* bridge */ /* synthetic */ void g(Object obj) {
        hqy hqyVar;
        String str = (String) obj;
        synchronized (this.n) {
            hqyVar = this.o;
        }
        if (hqyVar != null) {
            hqyVar.b(str);
        }
    }

    @Override // defpackage.hqt
    protected final scz o(hqq hqqVar) {
        String str;
        String str2;
        try {
            byte[] bArr = hqqVar.b;
            Map map = hqqVar.c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(hqqVar.b);
        }
        return new scz(str, hdm.d(hqqVar));
    }
}
