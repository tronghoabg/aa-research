package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final class ihp implements Cloneable {
    public ihz A;
    public Float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public kzt L;
    public long a = 0;
    public ihz b;
    public Float c;
    public ihz d;
    public Float e;
    public iha f;
    public Float g;
    public iha[] h;
    public iha i;
    public Float j;
    public igr k;
    public List l;
    public iha m;
    public Integer n;
    public Boolean o;
    public String p;
    public String q;
    public String r;
    public Boolean s;
    public Boolean t;
    public ihz u;
    public Float v;
    public String w;
    public String x;
    public ihz y;
    public Float z;

    public static ihp a() {
        ihp ihpVar = new ihp();
        ihpVar.a = -1L;
        igr igrVar = igr.a;
        ihpVar.b = igrVar;
        ihpVar.C = 1;
        Float fValueOf = Float.valueOf(1.0f);
        ihpVar.c = fValueOf;
        ihpVar.d = null;
        ihpVar.e = fValueOf;
        ihpVar.f = new iha(1.0f);
        ihpVar.D = 1;
        ihpVar.E = 1;
        ihpVar.g = Float.valueOf(4.0f);
        ihpVar.h = null;
        ihpVar.i = new iha(BitmapDescriptorFactory.HUE_RED);
        ihpVar.j = fValueOf;
        ihpVar.k = igrVar;
        ihpVar.l = null;
        ihpVar.m = new iha(12.0f, 7);
        ihpVar.n = 400;
        ihpVar.F = 1;
        ihpVar.G = 1;
        ihpVar.H = 1;
        ihpVar.I = 1;
        ihpVar.o = true;
        ihpVar.L = null;
        ihpVar.p = null;
        ihpVar.q = null;
        ihpVar.r = null;
        ihpVar.s = Boolean.TRUE;
        ihpVar.t = Boolean.TRUE;
        ihpVar.u = igrVar;
        ihpVar.v = fValueOf;
        ihpVar.w = null;
        ihpVar.J = 1;
        ihpVar.x = null;
        ihpVar.y = null;
        ihpVar.z = fValueOf;
        ihpVar.A = null;
        ihpVar.B = fValueOf;
        ihpVar.K = 1;
        return ihpVar;
    }

    protected final Object clone() {
        try {
            ihp ihpVar = (ihp) super.clone();
            iha[] ihaVarArr = this.h;
            if (ihaVarArr != null) {
                ihpVar.h = (iha[]) ihaVarArr.clone();
            }
            return ihpVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
