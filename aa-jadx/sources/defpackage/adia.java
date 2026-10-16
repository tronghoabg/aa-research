package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adia implements defpackage.adhz {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adhr.b;
        a = rkqVar.t("3", com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE);
        b = rkqVar.t("45403852", "1.13.531108431");
    }

    @Override // defpackage.adhz
    public final java.lang.String a(android.content.Context context) {
        return (java.lang.String) a.fG(context);
    }

    @Override // defpackage.adhz
    public final java.lang.String b(android.content.Context context) {
        return (java.lang.String) b.fG(context);
    }
}
