package androidx.camera.camera2.pipe.compat;

import h.g.b.x;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class f {
    static /* synthetic */ String a(boolean z, boolean z2, Object obj, String str, long j2, String str2) {
        Object[] objArr = new Object[z ? 1 : 0];
        objArr[z2 ? 1 : 0] = Double.valueOf(h.o.a.b(j2, h.o.d.f48272c));
        String str3 = String.format((Locale) obj, str, Arrays.copyOf(objArr, z ? 1 : 0));
        x.e(str3, "format(...)");
        return str2 + " - " + str3;
    }
}
