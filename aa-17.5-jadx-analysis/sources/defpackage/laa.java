package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class laa {
    public static final yph a = yph.c("GH.Assistant.SignalLD");

    public static osc a(ComponentName componentName) {
        abnp abnpVarN = osc.a.n();
        String className = componentName.getClassName();
        abnpVarN.t();
        osc oscVar = (osc) abnpVarN.b;
        className.getClass();
        oscVar.b |= 2;
        oscVar.d = className;
        String packageName = componentName.getPackageName();
        abnpVarN.t();
        osc oscVar2 = (osc) abnpVarN.b;
        packageName.getClass();
        oscVar2.b |= 1;
        oscVar2.c = packageName;
        return (osc) abnpVarN.q();
    }
}
