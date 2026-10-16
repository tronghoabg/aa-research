package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajta implements defpackage.ajqi {
    private final org.apache.commons.logging.Log a = org.apache.commons.logging.LogFactory.getLog(getClass());

    @Override // defpackage.ajqi
    public final void a(defpackage.ajqh ajqhVar, defpackage.akca akcaVar) throws defpackage.ajqd, java.io.IOException {
        if (ajqhVar.p().b.equalsIgnoreCase("CONNECT")) {
            ajqhVar.h("Proxy-Connection", "Keep-Alive");
            return;
        }
        defpackage.ajuk ajukVarH = defpackage.ajsw.g(akcaVar).h();
        if (ajukVarH == null) {
            this.a.debug("Connection route not set in the context");
            return;
        }
        if ((ajukVarH.a() == 1 || ajukVarH.g()) && !ajqhVar.k("Connection")) {
            ajqhVar.g("Connection", "Keep-Alive");
        }
        if (ajukVarH.a() != 2 || ajukVarH.g() || ajqhVar.k("Proxy-Connection")) {
            return;
        }
        ajqhVar.g("Proxy-Connection", "Keep-Alive");
    }
}
