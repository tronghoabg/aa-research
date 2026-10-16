package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes2.dex */
final class idp implements ifs {
    final /* synthetic */ Context a;

    public idp(Context context) {
        this.a = context;
    }

    @Override // defpackage.ifs
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
