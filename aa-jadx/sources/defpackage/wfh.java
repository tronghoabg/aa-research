package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wfh extends defpackage.gg {
    @Override // defpackage.gg
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.social.licenses.License license = (com.google.android.libraries.social.licenses.License) obj;
        com.google.android.libraries.social.licenses.License license2 = (com.google.android.libraries.social.licenses.License) obj2;
        return license.a.equals(license2.a) && license.b == license2.b && license.c == license2.c;
    }

    @Override // defpackage.gg
    public final /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.social.licenses.License) obj).a.equals(((com.google.android.libraries.social.licenses.License) obj2).a);
    }
}
