package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ebs {
    public static defpackage.ead a(android.view.View view, defpackage.ead eadVar) {
        android.view.ContentInfo contentInfoD = eadVar.a.d();
        contentInfoD.getClass();
        android.view.ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoD);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoD ? eadVar : new defpackage.ead(new defpackage.eaa(contentInfoPerformReceiveContent));
    }

    public static java.lang.String[] b(android.view.View view) {
        return view.getReceiveContentMimeTypes();
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
