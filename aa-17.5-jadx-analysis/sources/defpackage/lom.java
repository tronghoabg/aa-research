package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class lom {
    public static final yph a = yph.c("GH.MediaLiveDataFns");

    public static eqj a(ComponentName componentName) {
        eql eqlVar = new eql();
        if (aczc.p() && componentName.getPackageName().isEmpty()) {
            eqlVar.m(false);
            return eqlVar;
        }
        eqlVar.r(loy.j().b(componentName), new lnc(eqlVar, 2));
        return eqlVar;
    }

    public static Object b(Object obj, Class cls) {
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }
}
