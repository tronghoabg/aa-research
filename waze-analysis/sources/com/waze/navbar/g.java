package com.waze.navbar;

import com.waze.R;
import com.waze.navigate.ea;
import j$.util.Map;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f30886a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f30887b;

    static {
        ea eaVar = ea.f31286b;
        Integer numValueOf = Integer.valueOf(R.drawable.big_direction_left);
        ea eaVar2 = ea.f31287c;
        Integer numValueOf2 = Integer.valueOf(R.drawable.big_direction_right);
        ea eaVar3 = ea.f31288d;
        Integer numValueOf3 = Integer.valueOf(R.drawable.big_direction_exit_left);
        ea eaVar4 = ea.f31289e;
        Integer numValueOf4 = Integer.valueOf(R.drawable.big_direction_exit_right);
        ea eaVar5 = ea.f31290f;
        Integer numValueOf5 = Integer.valueOf(R.drawable.big_direction_forward);
        ea eaVar6 = ea.f31291g;
        Integer numValueOf6 = Integer.valueOf(R.drawable.big_directions_roundabout);
        ea eaVar7 = ea.f31293i;
        Integer numValueOf7 = Integer.valueOf(R.drawable.big_directions_roundabout_l);
        ea eaVar8 = ea.f31295k;
        Integer numValueOf8 = Integer.valueOf(R.drawable.big_directions_roundabout_s);
        ea eaVar9 = ea.m;
        Integer numValueOf9 = Integer.valueOf(R.drawable.big_directions_roundabout_r);
        ea eaVar10 = ea.o;
        Integer numValueOf10 = Integer.valueOf(R.drawable.big_directions_roundabout_u);
        ea eaVar11 = ea.q;
        Integer numValueOf11 = Integer.valueOf(R.drawable.big_direction_end);
        ea eaVar12 = ea.A;
        Integer numValueOf12 = Integer.valueOf(R.drawable.big_direction_hov);
        ea eaVar13 = ea.F;
        Integer numValueOf13 = Integer.valueOf(R.drawable.big_direction_stop);
        f30886a = h.a.r.k(new h.k(eaVar, numValueOf), new h.k(eaVar2, numValueOf2), new h.k(eaVar3, numValueOf3), new h.k(eaVar4, numValueOf4), new h.k(eaVar5, numValueOf5), new h.k(eaVar6, numValueOf6), new h.k(ea.f31292h, numValueOf6), new h.k(eaVar7, numValueOf7), new h.k(ea.f31294j, numValueOf7), new h.k(eaVar8, numValueOf8), new h.k(ea.f31296l, numValueOf8), new h.k(eaVar9, numValueOf9), new h.k(ea.n, numValueOf9), new h.k(eaVar10, numValueOf10), new h.k(ea.p, numValueOf10), new h.k(eaVar11, numValueOf11), new h.k(ea.r, numValueOf3), new h.k(ea.s, numValueOf4), new h.k(ea.u, Integer.valueOf(R.drawable.big_directions_uturn)), new h.k(eaVar12, numValueOf12), new h.k(eaVar13, numValueOf13));
        ea eaVar14 = ea.f31291g;
        Integer numValueOf14 = Integer.valueOf(R.drawable.big_directions_roundabout_uk);
        ea eaVar15 = ea.f31293i;
        Integer numValueOf15 = Integer.valueOf(R.drawable.big_directions_roundabout_uk_l);
        ea eaVar16 = ea.f31295k;
        Integer numValueOf16 = Integer.valueOf(R.drawable.big_directions_roundabout_uk_s);
        ea eaVar17 = ea.m;
        Integer numValueOf17 = Integer.valueOf(R.drawable.big_directions_roundabout_r_uk);
        ea eaVar18 = ea.o;
        Integer numValueOf18 = Integer.valueOf(R.drawable.big_directions_roundabout_u_uk);
        f30887b = h.a.r.k(new h.k(ea.f31286b, numValueOf), new h.k(ea.f31287c, numValueOf2), new h.k(ea.f31288d, numValueOf3), new h.k(ea.f31289e, numValueOf4), new h.k(ea.f31290f, numValueOf5), new h.k(eaVar14, numValueOf14), new h.k(ea.f31292h, numValueOf14), new h.k(eaVar15, numValueOf15), new h.k(ea.f31294j, numValueOf15), new h.k(eaVar16, numValueOf16), new h.k(ea.f31296l, numValueOf16), new h.k(eaVar17, numValueOf17), new h.k(ea.n, numValueOf17), new h.k(eaVar18, numValueOf18), new h.k(ea.p, numValueOf18), new h.k(ea.q, numValueOf11), new h.k(ea.r, numValueOf3), new h.k(ea.s, numValueOf4), new h.k(ea.u, Integer.valueOf(R.drawable.big_directions_uturn_uk)), new h.k(ea.A, numValueOf12), new h.k(ea.F, numValueOf13));
    }

    public static final Integer a(ea eaVar, boolean z) {
        if (eaVar == null) {
            return null;
        }
        return (Integer) Map.EL.getOrDefault(z ? f30887b : f30886a, eaVar, null);
    }
}
