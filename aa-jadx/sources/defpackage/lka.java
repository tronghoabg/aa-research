package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lka {
    private static final java.lang.String[] a = {"android.media.metadata.ALBUM_ART", "android.media.metadata.ART", "android.media.metadata.DISPLAY_ICON"};
    private static final java.lang.String[] b = {"android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI", "android.media.metadata.DISPLAY_ICON_URI"};

    public static android.graphics.Bitmap a(defpackage.lmk lmkVar) {
        java.lang.String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            android.graphics.Bitmap bitmapP = lmkVar.P(strArr[i]);
            if (bitmapP != null) {
                return bitmapP;
            }
        }
        return null;
    }

    public static android.net.Uri b(defpackage.lmk lmkVar) {
        java.lang.String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            java.lang.String strQ = lmkVar.Q(strArr[i]);
            if (!android.text.TextUtils.isEmpty(strQ)) {
                return android.net.Uri.parse(strQ);
            }
        }
        return null;
    }

    public static boolean c(defpackage.lmj lmjVar, defpackage.lmj lmjVar2) {
        if (lmjVar == null && lmjVar2 == null) {
            return true;
        }
        if (lmjVar != null && lmjVar2 != null) {
            java.lang.CharSequence charSequenceS = lmjVar.S();
            java.lang.String string = charSequenceS != null ? charSequenceS.toString() : null;
            java.lang.CharSequence charSequenceS2 = lmjVar2.S();
            java.lang.String string2 = charSequenceS2 != null ? charSequenceS2.toString() : null;
            java.lang.CharSequence charSequenceR = lmjVar.R();
            java.lang.String string3 = charSequenceR != null ? charSequenceR.toString() : null;
            java.lang.CharSequence charSequenceR2 = lmjVar2.R();
            java.lang.String string4 = charSequenceR2 != null ? charSequenceR2.toString() : null;
            if (android.text.TextUtils.equals(string, string2) && android.text.TextUtils.equals(string3, string4)) {
                return true;
            }
        }
        return false;
    }
}
