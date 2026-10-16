package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class zyl {
    private final Context a;

    public zyl(Context context) {
        zkt.n(context, "context");
        this.a = context;
    }

    public final void a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            zrn.c("Could not start activty.", e);
        }
    }
}
