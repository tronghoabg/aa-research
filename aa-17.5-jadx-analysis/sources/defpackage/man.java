package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final /* synthetic */ class man implements lgz {
    public final /* synthetic */ eqj a;
    private final /* synthetic */ int b;

    public /* synthetic */ man(eqj eqjVar, int i) {
        this.b = i;
        this.a = eqjVar;
    }

    @Override // defpackage.lgz
    public final void a(ComponentName componentName) {
        int i = this.b;
        eqj eqjVar = this.a;
        if (i != 0) {
            eqjVar.m(componentName);
        } else {
            ((mao) eqjVar).a();
        }
    }
}
