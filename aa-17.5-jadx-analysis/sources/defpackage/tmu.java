package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class tmu {
    public final tml a;
    public final tmp b;

    public tmu(Context context, tmp tmpVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        tmv tmvVar = new tmv();
        tmk tmkVar = new tmk();
        tmkVar.a();
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        tmkVar.a = applicationContext;
        tmkVar.c = new xxm(tmvVar);
        tmkVar.a();
        if (tmkVar.e == 1 && (context2 = tmkVar.a) != null) {
            this.a = new tml(context2, tmkVar.b, tmkVar.c, tmkVar.d);
            this.b = tmpVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (tmkVar.a == null) {
            sb.append(" context");
        }
        if (tmkVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static tmu a(Context context, tmj tmjVar) {
        return new tmu(context, new tmp(tmjVar));
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
