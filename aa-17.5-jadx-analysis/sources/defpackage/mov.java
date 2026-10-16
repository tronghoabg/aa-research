package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public abstract class mov {
    private static final yph c = yph.c("GH.IntentProcessor");
    private final String b;

    protected mov(String str) {
        this.b = str;
    }

    public static mqb e(Intent intent) {
        String stringExtra = intent.getStringExtra("GH.TargetComponent");
        return stringExtra != null ? mpl.c(stringExtra) : mqb.b(intent);
    }

    protected abstract boolean d(Intent intent, qql qqlVar);

    public final void f(Intent intent, qql qqlVar) {
        if (d(intent, qqlVar)) {
            yph yphVar = c;
            ype ypeVar = (ype) yphVar.l().ai(5131);
            String str = this.b;
            ypeVar.M("%s intent processor will process the intent %s", str, intent);
            i(intent, qqlVar);
            ((ype) yphVar.l().ai(5132)).M("%s intent processor processed the intent %s", str, intent);
        }
    }

    protected final void g(Intent intent) {
        mqb mqbVarB = mqb.b(intent);
        intent.putExtra("GH.TargetComponent", mqbVarB == null ? null : mqbVarB.c());
        ((ype) c.l().ai(5133)).M("%s intent processor stored target component for the intent %s", this.b, intent);
    }

    protected abstract void i(Intent intent, qql qqlVar);
}
