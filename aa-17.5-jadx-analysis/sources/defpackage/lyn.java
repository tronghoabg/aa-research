package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class lyn {
    public static final lym a = new lym();
    public static final afgl b = new lcj(mki.b, 13);
    public final yph c = yph.c("GH.MessagingMetaCache");
    public final HashMap d = new HashMap();

    public static final lyn a() {
        return a.a();
    }

    public final ohe b(lwb lwbVar) {
        Long l = (Long) this.d.get(lwbVar);
        if (l == null) {
            return null;
        }
        moa moaVarA = mlq.e().a(yzr.IM_NOTIFICATION, l.longValue());
        if (moaVarA instanceof lwz) {
            return new ohe((lwz) moaVarA, lwbVar);
        }
        return null;
    }
}
