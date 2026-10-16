package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class gnd implements hzh {
    private final Context a;

    public gnd(Context context) {
        this.a = context;
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return ((Uri) obj).getAuthority().equals("lettertile");
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ ncp b(Object obj, int i, int i2, hum humVar) {
        Uri uri = (Uri) obj;
        return new ncp(new ifj(uri), new gnc(this.a, uri, Math.max(i, i2)));
    }
}
