package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class wnb implements wnc {
    private Long a;

    @Override // defpackage.wnc
    public final boolean a() throws NoSuchMethodException, SecurityException {
        Long l = this.a;
        if (l == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.a = l;
            } catch (Exception unused) {
                l = -1L;
                this.a = l;
            }
        }
        return l.longValue() >= 40100;
    }
}
