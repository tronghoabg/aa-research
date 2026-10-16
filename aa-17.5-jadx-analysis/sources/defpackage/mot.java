package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class mot extends mov {
    private mqb a;
    public final ComponentName b;

    protected mot(ComponentName componentName, String str) {
        super(str);
        this.b = componentName;
    }

    protected abstract void c(Intent intent, qql qqlVar);

    public mqb h() {
        return this.a;
    }

    @Override // defpackage.mov
    protected final void i(Intent intent, qql qqlVar) {
        mqb mqbVarB = mqb.b(intent);
        mqbVarB.getClass();
        this.a = mqbVarB;
        c(intent, qqlVar);
    }
}
