package defpackage;

import com.google.android.libraries.handwriting.gui.UIHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class udg extends qrv {
    public static final /* synthetic */ int a = 0;

    static {
        new udg();
    }

    private udg() {
        yly ylyVar = yly.a;
        new qsb(ylyVar, ylyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xxh ah(List list, ygr ygrVar) {
        if (!ygrVar.isEmpty()) {
            String strAi = ai(list);
            yno it = ygrVar.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (strAi.contains(str)) {
                    return xxh.h(str);
                }
            }
        }
        return xvy.a;
    }

    public static String ai(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abcn abcnVar = (abcn) it.next();
            if ((abcnVar.b & 32) != 0) {
                sb.append(' ');
            }
            if ((abcnVar.b & 1) != 0) {
                sb.append(abcnVar.c);
            }
        }
        return sb.toString();
    }

    public static String aj(String str) {
        return str.length() > 20 ? String.valueOf(str.substring(0, 19)).concat(UIHandler.ContinuousWritingQueue.PLACEHOLDER) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean ak(long j, ygr ygrVar) {
        if (ygrVar.isEmpty()) {
            return false;
        }
        yno it = ygrVar.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Long.toHexString(j).contains(str.toLowerCase(Locale.ROOT)) || Long.toString(j).contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static String al(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder(22);
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf == -1) {
            return str.length() > 20 ? String.valueOf(str.substring(0, 19)).concat(UIHandler.ContinuousWritingQueue.PLACEHOLDER) : str;
        }
        int length = str2.length() + iIndexOf;
        int iAu = wub.au(3, (20 - str2.length()) / 2, (20 - (str.length() - length)) - str2.length());
        if (iIndexOf - iAu <= 0) {
            i = iIndexOf;
        } else {
            sb.append(UIHandler.ContinuousWritingQueue.PLACEHOLDER);
            i = iAu - 1;
        }
        sb.append((CharSequence) str, iIndexOf - i, iIndexOf);
        sb.append('|');
        sb.append(str2);
        sb.append('|');
        int iMax = Math.max(3, 20 - (sb.length() - 2)) + length;
        if (iMax >= str.length()) {
            sb.append((CharSequence) str, length, str.length());
        } else {
            sb.append((CharSequence) str, length, iMax - 1);
            sb.append(UIHandler.ContinuousWritingQueue.PLACEHOLDER);
        }
        return sb.toString();
    }
}
