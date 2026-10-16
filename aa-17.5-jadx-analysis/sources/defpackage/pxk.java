package defpackage;

import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public final class pxk implements psu {
    final /* synthetic */ URL a;
    final /* synthetic */ aezk b;

    public pxk(URL url, aezk aezkVar) {
        this.a = url;
        this.b = aezkVar;
    }

    @Override // defpackage.psu
    public final URL a() {
        aezk aezkVar = this.b;
        if ((((aacd) aezkVar).a().b & 32) != 0) {
            try {
                return new URL(((aacd) aezkVar).a().g);
            } catch (MalformedURLException e) {
                ((ynz) ((ynz) ((ynz) pxl.a.g()).p(e)).ai((char) 6928)).u("Malformed Paint URL in client parameters.");
            }
        }
        return this.a;
    }
}
