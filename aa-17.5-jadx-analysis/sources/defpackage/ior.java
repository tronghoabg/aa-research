package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final /* synthetic */ class ior implements inf {
    private final /* synthetic */ int a;

    public /* synthetic */ ior(int i) {
        this.a = i;
    }

    @Override // defpackage.inf
    public final ioc a(iob iobVar, ComponentName componentName) {
        if (this.a != 0) {
            inf infVar = ioj.E;
            return new ioh(iobVar, componentName);
        }
        yph yphVar = ipb.E;
        return new ioz(iobVar, componentName);
    }
}
