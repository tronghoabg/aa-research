package androidx.camera.camera2.compat.workaround;

import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class a {
    static /* synthetic */ String a(StringBuilder sb, String str, String str2) {
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        int i2 = Build.VERSION.SDK_INT;
        sb.append(str);
        sb.append(str3);
        sb.append(", Model: ");
        sb.append(str4);
        sb.append(", API Level: ");
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }
}
