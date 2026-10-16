package defpackage;

/* loaded from: classes3.dex */
public final class adab {
    public static volatile String a;
    public static final rju b;
    private static final wcr c;

    static {
        wcs wcsVar = new wcs(new ykz(6));
        wcsVar.c(new ymp("ANDROID_AUTH"));
        wcr wcrVarA = wcsVar.a();
        c = wcrVarA;
        b = new rju("com.google.android.gms.auth_account_client", wcrVarA);
        a = null;
    }

    private adab() {
    }
}
