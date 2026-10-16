package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ebs {
    public static ead a(android.view.View view, ead eadVar) {
        android.view.ContentInfo contentInfoD = eadVar.a.d();
        contentInfoD.getClass();
        android.view.ContentInfo contentInfoM = a$.ExternalSyntheticApiModelOutline0.m(view, contentInfoD);
        if (contentInfoM == null) {
            return null;
        }
        return contentInfoM == contentInfoD ? eadVar : new ead(new eaa(contentInfoM));
    }

    public static java.lang.String[] b(android.view.View view) {
        return a$.ExternalSyntheticApiModelOutline0.m(view);
    }

    public static final void c(boolean z, defpackage.ebr ebrVar) {
        ebrVar.d(z);
    }

    public static final void d(boolean z, defpackage.ebr ebrVar) {
        ebrVar.e(z);
    }

    public static final java.lang.String e(java.lang.String str) {
        java.lang.String strDecode = android.net.Uri.decode(str);
        strDecode.getClass();
        return strDecode;
    }

    public static final android.net.Uri f(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        uri.getClass();
        return uri;
    }
}
