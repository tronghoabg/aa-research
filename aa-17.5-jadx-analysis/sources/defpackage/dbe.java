package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class dbe implements cdp {
    public final afdr a;
    private final /* synthetic */ cdp b;

    public dbe(cdp cdpVar, afdr afdrVar) {
        this.b = cdpVar;
        this.a = afdrVar;
    }

    @Override // defpackage.cdp
    public final Object a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.cdp
    public final Map b() {
        return this.b.b();
    }

    @Override // defpackage.cdp
    public final boolean d(Object obj) {
        return this.b.d(obj);
    }

    @Override // defpackage.cdp
    public final rpp e(String str, afdr afdrVar) {
        return this.b.e(str, afdrVar);
    }
}
