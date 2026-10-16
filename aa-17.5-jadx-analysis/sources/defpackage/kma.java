package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService;

/* loaded from: classes2.dex */
public final class kma implements lhg {
    private final Context a = mki.a.c;

    @Override // defpackage.lhg
    public final void c() {
        Context context = this.a;
        context.startService(new Intent(context, (Class<?>) CarLocalMediaBrowserService.class));
    }

    @Override // defpackage.lhg
    public final void d() {
        Context context = this.a;
        context.stopService(new Intent(context, (Class<?>) CarLocalMediaBrowserService.class));
    }
}
