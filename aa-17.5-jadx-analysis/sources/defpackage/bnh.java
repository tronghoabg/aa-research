package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bnh {
    private static final bvf a = new byo(new blv(2));

    public static final long a(bng bngVar, long j) {
        if (j == bngVar.a) {
            return bngVar.b;
        }
        if (j == bngVar.f) {
            return bngVar.g;
        }
        if (j == bngVar.j) {
            return bngVar.k;
        }
        if (j == bngVar.n) {
            return bngVar.o;
        }
        if (j == bngVar.w) {
            return bngVar.x;
        }
        if (j == bngVar.c) {
            return bngVar.d;
        }
        if (j == bngVar.h) {
            return bngVar.i;
        }
        if (j == bngVar.l) {
            return bngVar.m;
        }
        if (j == bngVar.y) {
            return bngVar.z;
        }
        if (j == bngVar.u) {
            return bngVar.v;
        }
        if (j == bngVar.p) {
            return bngVar.q;
        }
        if (j == bngVar.r) {
            return bngVar.s;
        }
        if (j == bngVar.D) {
            return bngVar.q;
        }
        if (j == bngVar.F) {
            return bngVar.q;
        }
        if (j == bngVar.G) {
            return bngVar.q;
        }
        if (j == bngVar.H) {
            return bngVar.q;
        }
        if (j == bngVar.I) {
            return bngVar.q;
        }
        if (j == bngVar.J) {
            return bngVar.q;
        }
        if (j == bngVar.E) {
            return bngVar.q;
        }
        if (j == bngVar.K) {
            return bngVar.M;
        }
        if (j == bngVar.L) {
            return bngVar.M;
        }
        if (j == bngVar.O) {
            return bngVar.Q;
        }
        if (j == bngVar.P) {
            return bngVar.Q;
        }
        if (j == bngVar.S) {
            return bngVar.U;
        }
        if (j == bngVar.T) {
            return bngVar.U;
        }
        float[] fArr = clj.a;
        return cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
    }

    public static final long b(bng bngVar, float f) {
        if (Float.compare(f, BitmapDescriptorFactory.HUE_RED) == 0) {
            return bngVar.p;
        }
        float fLog = (float) Math.log(f + 1.0f);
        long j = bngVar.t;
        float fD = cjv.d(j);
        float fC = cjv.c(j);
        float fB = cjv.b(j);
        float[] fArr = clj.a;
        return cjn.l(cjn.j(fD, fC, fB, ((fLog * 4.5f) + 2.0f) / 100.0f, clj.y[(int) (j & 63)]), bngVar.p);
    }

    public static final long c(bng bngVar, long j, float f, bux buxVar) {
        return (j == bngVar.p && ((Boolean) buxVar.f(a)).booleanValue()) ? b(bngVar, f) : j;
    }

    public static final long d(long j, bux buxVar) {
        buxVar.v(89373914);
        long jA = a(((bog) buxVar.f(boh.a)).a, j);
        if (jA == 16) {
            jA = ((cjv) buxVar.f(bnm.a)).a;
        }
        buxVar.o();
        return jA;
    }

    public static final long e(bng bngVar, int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                return bngVar.n;
            case 1:
                return bngVar.w;
            case 2:
                return bngVar.y;
            case 3:
                return bngVar.v;
            case 4:
                return bngVar.e;
            case 5:
                return bngVar.u;
            case 6:
                return bngVar.o;
            case 7:
                return bngVar.x;
            case 8:
                return bngVar.z;
            case 9:
                return bngVar.b;
            case 10:
                return bngVar.d;
            case 11:
                return bngVar.M;
            case 12:
                return bngVar.N;
            case 13:
                return bngVar.g;
            case 14:
                return bngVar.i;
            case 15:
                return bngVar.Q;
            case 16:
                return bngVar.R;
            case 17:
                return bngVar.q;
            case 18:
                return bngVar.s;
            case 19:
                return bngVar.k;
            case 20:
                return bngVar.m;
            case 21:
                return bngVar.U;
            case 22:
            default:
                return bngVar.V;
            case 23:
                return bngVar.A;
            case 24:
                return bngVar.B;
            case 25:
                return bngVar.a;
            case 26:
                return bngVar.c;
            case 27:
                return bngVar.K;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return bngVar.L;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return bngVar.C;
            case 30:
                return bngVar.f;
            case 31:
                return bngVar.h;
            case 32:
                return bngVar.O;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return bngVar.P;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return bngVar.p;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return bngVar.D;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                return bngVar.F;
            case 37:
                return bngVar.G;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return bngVar.H;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return bngVar.I;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return bngVar.J;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return bngVar.E;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return bngVar.t;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return bngVar.r;
        }
    }

    public static final long f(int i, bux buxVar) {
        return e(((bog) buxVar.f(boh.a)).a, i);
    }
}
