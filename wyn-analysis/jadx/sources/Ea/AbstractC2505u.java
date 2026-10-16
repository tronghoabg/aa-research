package ea;

import A7.AbstractC0279p0;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import kotlin.jvm.internal.AbstractC3340k;
import n7.AbstractC3598c;

/* renamed from: ea.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2505u {

    /* renamed from: a, reason: collision with root package name */
    public static final String f34584a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f34585b;

    static {
        String strF;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            strF = Process.myProcessName();
            AbstractC3340k.d(strF, "myProcessName()");
        } else if ((i5 < 28 || (strF = Application.getProcessName()) == null) && (strF = AbstractC3598c.f()) == null) {
            strF = "";
        }
        byte[] bytes = strF.getBytes(Bf.a.f1670a);
        AbstractC3340k.d(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 10);
        f34584a = AbstractC0279p0.l("firebase_session_", strEncodeToString, "_data");
        f34585b = AbstractC0279p0.l("firebase_session_", strEncodeToString, "_settings");
    }
}
