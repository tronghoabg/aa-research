package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ClientNotificationEvent;

/* loaded from: classes2.dex */
public final class spc extends sla implements sle {
    private static final rju a;
    private static final omc l;

    static {
        spb spbVar = new spb();
        l = spbVar;
        a = new rju("ClientNotification.API", spbVar);
    }

    public spc(Context context) {
        super(context, null, a, sku.c, skz.a);
    }

    public final void a(ClientNotificationEvent clientNotificationEvent) {
        snb snbVar = new snb();
        snbVar.b = new Feature[]{sjq.b};
        snbVar.b();
        snbVar.a = new qpy(clientNotificationEvent, 11);
        super.u(2, snbVar.a());
    }
}
