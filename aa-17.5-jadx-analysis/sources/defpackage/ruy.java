package defpackage;

import android.content.Context;
import java.security.Provider;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ruy {
    private static final ypf a = ols.R("CAR.GAL.SECURITY");
    private static ruy b;
    private Boolean c;

    public static synchronized ruy a() {
        ruy ruyVar;
        ruyVar = b;
        if (ruyVar == null) {
            ruyVar = new ruy();
            b = ruyVar;
        }
        return ruyVar;
    }

    static final boolean d(Set set) throws CertificateException {
        ypf ypfVar = a;
        ypfVar.l().ai(8353).u("Installed security providers:");
        for (Provider provider : Security.getProviders()) {
            ypfVar.l().ai(8356).y("%s", provider);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase("AES/CBC/PKCS5Padding")) {
                try {
                    CertificateFactory.getInstance("X.509");
                    return true;
                } catch (CertificateException unused) {
                    a.l().ai(8354).u("Installed providers do not support constructing certificate objects");
                    return false;
                }
            }
        }
        ypfVar.l().ai(8355).y("%s not available on device", "AES/CBC/PKCS5Padding");
        return false;
    }

    public final synchronized Boolean b() {
        return this.c;
    }

    public final synchronized boolean c(Context context) {
        if (this.c == null) {
            rlc.a(rsm.a);
            a.l().ai(8350).u("Installing 0 or more security provider updates on device");
            try {
                svd.a(context);
            } catch (skk e) {
                a.g().p(e).ai(8352).u("GMS not available!");
            } catch (skl e2) {
                a.l().p(e2).ai(8351).u("Unable to update security provider as GMS is out of date");
            }
            this.c = Boolean.valueOf(d(Security.getAlgorithms("Cipher")));
            rlc.a(rsm.a);
        }
        return this.c.booleanValue();
    }
}
