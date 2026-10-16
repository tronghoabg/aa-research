package defpackage;

/* loaded from: classes3.dex */
public final class syt extends osq {
    public static final syt a = new syt();

    private syt() {
        super(null);
    }

    public static final wyd S(osn osnVar, aedp aedpVar) {
        aezu aezuVarA = syr.a.a();
        wyd wydVar = (wyd) aezuVarA.a;
        Integer num = (Integer) aezuVarA.b;
        if (wydVar != null && num != null && osnVar.b == num.intValue()) {
            return wydVar;
        }
        aedpVar.b(new adnt(adnq.m, null));
        return null;
    }
}
