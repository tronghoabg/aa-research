package h.d;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.waze.sharedui.web.as;
import h.c.e;
import h.g.b.x;
import l.a.brj;
import l.b.j;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {
    public static final a a(Enum[] enumArr) {
        x.f(enumArr, "entries");
        return new c(enumArr);
    }

    public static final void b(e eVar) {
        x.f(eVar, TypedValues.AttributesType.S_FRAME);
    }

    public static final void c(e eVar) {
        x.f(eVar, TypedValues.AttributesType.S_FRAME);
    }

    public static final void d(e eVar) {
        x.f(eVar, "completion");
    }

    public static final h.p.a e(long j2, long j3) {
        long j4;
        if (j2 != 0) {
            j4 = j2;
        } else {
            if (j3 == 0) {
                return h.p.a.f48287b;
            }
            j4 = 0;
        }
        return new h.p.a(j4, j3, null);
    }

    public static /* synthetic */ int f(long j2, long j3) {
        return Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    public static final /* synthetic */ as g(j jVar) {
        x.f(jVar, "builder");
        return new as(jVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b h(l.b.a aVar) {
        x.f(aVar, "builder");
        return new com.waze.sharedui.d.a.b(aVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b i(brj brjVar) {
        x.f(brjVar, "builder");
        return new com.waze.sharedui.d.a.b(brjVar);
    }
}
