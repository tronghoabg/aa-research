package P3;

import J3.r;
import S3.p;
import android.os.Build;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f9097f;

    static {
        String strF = r.f("NetworkMeteredCtrlr");
        AbstractC3340k.d(strF, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f9097f = strF;
    }

    @Override // P3.b
    public final boolean a(p workSpec) {
        AbstractC3340k.e(workSpec, "workSpec");
        return workSpec.f10986j.f5555a == 5;
    }

    @Override // P3.b
    public final boolean b(Object obj) {
        O3.a value = (O3.a) obj;
        AbstractC3340k.e(value, "value");
        int i5 = Build.VERSION.SDK_INT;
        boolean z2 = value.f8852a;
        if (i5 >= 26) {
            return (z2 && value.f8854c) ? false : true;
        }
        r.d().a(f9097f, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z2;
    }
}
