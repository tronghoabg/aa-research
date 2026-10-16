package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class ljt {
    private static final String[] a = {"android.media.metadata.ALBUM_ART", "android.media.metadata.ART", "android.media.metadata.DISPLAY_ICON"};
    private static final String[] b = {"android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI", "android.media.metadata.DISPLAY_ICON_URI"};

    public static Bitmap a(lmd lmdVar) {
        String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            Bitmap bitmapP = lmdVar.P(strArr[i]);
            if (bitmapP != null) {
                return bitmapP;
            }
        }
        return null;
    }

    public static Uri b(lmd lmdVar) {
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            String strQ = lmdVar.Q(strArr[i]);
            if (!TextUtils.isEmpty(strQ)) {
                return Uri.parse(strQ);
            }
        }
        return null;
    }

    public static boolean c(lmc lmcVar, lmc lmcVar2) {
        if (lmcVar == null && lmcVar2 == null) {
            return true;
        }
        if (lmcVar != null && lmcVar2 != null) {
            CharSequence charSequenceS = lmcVar.S();
            String string = charSequenceS != null ? charSequenceS.toString() : null;
            CharSequence charSequenceS2 = lmcVar2.S();
            String string2 = charSequenceS2 != null ? charSequenceS2.toString() : null;
            CharSequence charSequenceR = lmcVar.R();
            String string3 = charSequenceR != null ? charSequenceR.toString() : null;
            CharSequence charSequenceR2 = lmcVar2.R();
            String string4 = charSequenceR2 != null ? charSequenceR2.toString() : null;
            if (TextUtils.equals(string, string2) && TextUtils.equals(string3, string4)) {
                return true;
            }
        }
        return false;
    }
}
