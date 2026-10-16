package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Process;

/* loaded from: classes3.dex */
public final /* synthetic */ class zvu implements xyc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zvu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        int i = this.b;
        if (i == 0) {
            int i2 = zvw.e;
            Context context = (Context) this.a;
            if (context.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == 0) {
                zvw.a.f(100);
            } else {
                zvw.a.f(102);
            }
            return new str(context);
        }
        if (i != 1) {
            return ((twq) this.a).e.c;
        }
        int i3 = zuq.d;
        String strValueOf = String.valueOf(zkt.n);
        Context context2 = (Context) this.a;
        String packageName = context2.getPackageName();
        zta ztaVar = zta.a;
        return String.valueOf(String.format("Mozilla/5.0 (%s; U; %s; %s; ) AppleWebKit/0.0 (KHTML, like Gecko) Version/0.0; GmmClient:%s/%s/%s/%s/%s/%s", "Android", Build.VERSION.SDK, strValueOf, "android", packageName, "3.4.0", "Mobile", ztaVar.c(zkt.c), ztaVar.b(context2))).concat(String.valueOf(String.format("/%s/%s/%s", "", String.valueOf(ztaVar.a(context2, packageName).versionCode), "9.0.0")));
    }
}
