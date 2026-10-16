package u;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f46072a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f46073b;

    public k(Intent intent, Bundle bundle) {
        this.f46072a = intent;
        this.f46073b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.f46072a;
        intent.setData(uri);
        Y0.e.startActivity(context, intent, this.f46073b);
    }
}
