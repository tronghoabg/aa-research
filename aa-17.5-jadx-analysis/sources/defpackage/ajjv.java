package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ajjv {
    public final ajhc a;
    public List b;
    public int c;
    public List d;
    public final List e;
    public final erb f;

    public ajjv(ajhc ajhcVar, erb erbVar) {
        List listE;
        this.a = ajhcVar;
        this.f = erbVar;
        afbe afbeVar = afbe.a;
        this.b = afbeVar;
        this.d = afbeVar;
        this.e = new ArrayList();
        URI uriF = ajhcVar.h.f();
        if (uriF.getHost() == null) {
            listE = ajis.e(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = ajhcVar.g.select(uriF);
            listE = (listSelect == null || listSelect.isEmpty()) ? ajis.e(new Proxy[]{Proxy.NO_PROXY}) : ajis.d(listSelect);
        }
        this.b = listE;
        this.c = 0;
        listE.getClass();
    }

    public final boolean a() {
        return b() || !this.e.isEmpty();
    }

    public final boolean b() {
        return this.c < this.b.size();
    }
}
