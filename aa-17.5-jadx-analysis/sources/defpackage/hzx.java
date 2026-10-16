package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes2.dex */
public final class hzx implements hzh {
    private final Context a;
    private final hzh b;
    private final hzh c;
    private final Class d;

    public hzx(Context context, hzh hzhVar, hzh hzhVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = hzhVar;
        this.c = hzhVar2;
        this.d = cls;
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && hdv.g((Uri) obj);
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ ncp b(Object obj, int i, int i2, hum humVar) {
        Uri uri = (Uri) obj;
        return new ncp(new ifj(uri), new hzw(this.a, this.b, this.c, uri, i, i2, humVar, this.d));
    }
}
