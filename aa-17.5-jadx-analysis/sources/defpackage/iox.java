package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class iox {
    public Intent a;
    final /* synthetic */ ipb b;

    public iox(ipb ipbVar) {
        this.b = ipbVar;
    }

    public final void a(Intent intent) {
        this.a = intent;
        if (intent != null) {
            intent.putExtra("PROJECTION_CONFIGURATION", this.b.b.d());
        }
    }
}
