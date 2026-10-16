package defpackage;

/* loaded from: classes.dex */
public final class adck {
    public static volatile String a;
    public static final rju b;
    private static final wcr c;

    static {
        wcs wcsVar = new wcs(new kpi(15));
        wcsVar.c(ygr.r("METALOG_COUNTERS", "CLEARCUT_LOG_LOSS", "CLEARCUT_FUNNEL", "CLEARCUT_BACKSTOP"));
        wcr wcrVarA = wcsVar.a();
        c = wcrVarA;
        b = new rju("com.google.android.gms.clearcut_client", wcrVarA);
        a = null;
    }

    private adck() {
    }
}
