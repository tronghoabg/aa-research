package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class lyl {
    public static final lyk a = new lyk();
    public static final afgl b = new lcj(mki.b, 12);
    public final yph c = yph.c("GH.MessagingMetaCache");
    public final HashMap d = new HashMap();

    public static final lyl a() {
        return a.a();
    }

    public final ogz b(lwb lwbVar) {
        Long l = (Long) this.d.get(lwbVar);
        if (l == null) {
            return null;
        }
        lvg lvgVarA = lnm.m().a(l.longValue());
        if (lvgVarA instanceof lvi) {
            return new ogz((lvi) lvgVarA, lwbVar);
        }
        return null;
    }
}
