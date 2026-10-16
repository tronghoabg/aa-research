package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class snu extends snv {
    final /* synthetic */ Intent a;
    final /* synthetic */ smo b;

    public snu(Intent intent, smo smoVar) {
        this.a = intent;
        this.b = smoVar;
    }

    @Override // defpackage.snv
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
