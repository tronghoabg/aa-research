package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class lrr {
    private static final yph b = yph.c("GH.MediaNotifSuppr");
    public final Set a = new HashSet();

    public static lrr a() {
        return (lrr) mki.a.b(lrr.class, new lpu(6));
    }

    public final void b(Object obj) {
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 4244)).y("addForegroundedMediaComponent mediaComponent=%s", new zjd(zjc.a, obj));
        if (this.a.add(obj)) {
            return;
        }
        ((ype) ((ype) yphVar.h()).ai((char) 4245)).y("mediaComponent=%s was already in foregrounded set", obj);
    }

    public final void c(Object obj) {
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 4246)).y("removeForegroundedMediaComponent mediaComponent=%s", new zjd(zjc.a, obj));
        if (this.a.remove(obj)) {
            return;
        }
        ((ype) ((ype) yphVar.h()).ai((char) 4247)).y("mediaComponent=%s was not originally in foregrounded set", obj);
    }
}
