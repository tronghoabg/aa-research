package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class hzv implements hzi {
    private final Context a;
    private final Class b;

    public hzv(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.hzi
    public final hzh b(hzm hzmVar) {
        Class cls = this.b;
        return new hzx(this.a, hzmVar.a(File.class, cls), hzmVar.a(Uri.class, cls), cls);
    }
}
