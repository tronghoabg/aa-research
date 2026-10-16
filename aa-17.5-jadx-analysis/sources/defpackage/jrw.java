package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public abstract class jrw extends mot {
    public jrw() {
        super(mkn.h, "AppHost");
    }

    protected abstract mqb a(Intent intent);

    @Override // defpackage.mot
    protected final void c(Intent intent, qql qqlVar) {
        b(intent);
        mqb mqbVarA = a(new Intent(intent));
        g(intent);
        jsf.l(intent, mqbVarA);
        intent.setComponent(mkn.h);
    }

    protected void b(Intent intent) {
    }
}
