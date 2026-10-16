package defpackage;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes3.dex */
final class xcl implements sef {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;

    public xcl(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sef
    public final void a(seh sehVar) {
        Activity activity = (Activity) sehVar;
        Intent intent = new Intent();
        intent.putExtra("EXTRA_FRX_HAS_ERROR", this.a);
        ((ype) xco.a.l().ai((char) 10086)).y("Intent: %s", intent.toUri(0));
        if (this.b) {
            activity.setResult(-1, intent);
        } else {
            activity.setResult(0, intent);
        }
        if (activity.isFinishing()) {
            return;
        }
        activity.finish();
    }
}
