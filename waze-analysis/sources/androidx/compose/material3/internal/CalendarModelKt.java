package androidx.compose.material3.internal;

import h.g.b.x;
import h.n.f;
import h.n.g;
import h.n.l;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000;

    public static final DateInputFormat datePatternAsInputFormat(String str) {
        String strY = o.y(o.ac(new l("y{1,4}").b(new l("M{1,2}").b(new l("d{1,2}").b(new l("[^dMy/\\-.]").b(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y"), ".");
        g gVarH = l.h(new l("[/\\-.]"), strY);
        x.c(gVarH);
        f fVarA = gVarH.e().a(0);
        x.c(fVarA);
        return new DateInputFormat(strY, fVarA.a().charAt(0));
    }
}
