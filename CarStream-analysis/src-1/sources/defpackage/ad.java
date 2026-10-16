package defpackage;

import android.widget.LinearLayout;
import com.carstream.tech.mirror.MirrorServer;
import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ad {
    public static LinearLayout a(MainActivity mainActivity, int i) {
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    public static String b(int i, String str) {
        return str + i;
    }

    public static String c(String str, String str2) {
        return str + str2;
    }

    public static String d(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String e(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void f(String str, Throwable th) {
        MirrorServer.J(str.concat(String.valueOf(th)));
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ int h(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }
}
