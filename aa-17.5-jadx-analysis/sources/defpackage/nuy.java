package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class nuy {
    static final /* synthetic */ afia[] a = {new affn(nuy.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/system/notification/internal/NotificationDirector;", 0)};
    public static final /* synthetic */ int b = 0;

    public static final void b(yzy yzyVar, ComponentName componentName) {
        ohu ohuVarA = ohu.a();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.SYSTEM_UI_NOTIFICATION, yzyVar);
        rrbVarH.p(componentName);
        ohuVarA.b((rrc) rrbVarH.l());
    }

    public static final ComponentName c(nuh nuhVar) {
        String str = nuhVar.b;
        str.getClass();
        ComponentName componentNameCreateRelative = ComponentName.createRelative(nuhVar.c.f, str);
        componentNameCreateRelative.getClass();
        return componentNameCreateRelative;
    }

    public final nva a() {
        return (nva) nva.c.getValue(this, a[0]);
    }
}
