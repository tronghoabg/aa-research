package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class akdp extends akdf {
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final akdp H = ah(akcl.a, 4);

    public static akdp ah(akcl akclVar, int i) {
        akdp akdpVar;
        if (akclVar == null) {
            akclVar = akcl.j();
        }
        ConcurrentHashMap concurrentHashMap = I;
        akdp[] akdpVarArr = (akdp[]) concurrentHashMap.get(akclVar);
        if (akdpVarArr == null) {
            akdpVarArr = new akdp[7];
            akdp[] akdpVarArr2 = (akdp[]) concurrentHashMap.putIfAbsent(akclVar, akdpVarArr);
            if (akdpVarArr2 != null) {
                akdpVarArr = akdpVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            akdp akdpVar2 = akdpVarArr[i2];
            if (akdpVar2 != null) {
                return akdpVar2;
            }
            synchronized (akdpVarArr) {
                akdpVar = akdpVarArr[i2];
                if (akdpVar == null) {
                    akcl akclVar2 = akcl.a;
                    akdpVar = akclVar == akclVar2 ? new akdp(null, i) : new akdp(akdv.N(ah(akclVar2, i), akclVar), i);
                    akdpVarArr[i2] = akdpVar;
                }
            }
            return akdpVar;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(a.bp(i, "Invalid min days in first week: "));
        }
    }

    private Object readResolve() {
        int i = ((akdc) this).G;
        if (i == 0) {
            i = 4;
        }
        akcd akcdVar = this.a;
        return akcdVar == null ? ah(akcl.a, i) : ah(akcdVar.z(), i);
    }

    @Override // defpackage.akdc, defpackage.akcy
    protected final void M(akcx akcxVar) {
        if (this.a == null) {
            akcxVar.a = akdc.o;
            akcxVar.b = akdc.p;
            akcxVar.c = akdc.q;
            akcxVar.d = akdc.r;
            akcxVar.e = akdc.s;
            akcxVar.f = akdc.t;
            akcxVar.g = akdc.u;
            akcxVar.m = akdc.v;
            akcxVar.n = akdc.w;
            akcxVar.o = akdc.x;
            akcxVar.p = akdc.y;
            akcxVar.q = akdc.z;
            akcxVar.r = akdc.A;
            akcxVar.s = akdc.B;
            akcxVar.u = akdc.C;
            akcxVar.t = akdc.D;
            akcxVar.v = akdc.E;
            akcxVar.w = akdc.F;
            akcxVar.E = new akdj(this);
            akcxVar.F = new akdo(akcxVar.E, this);
            akcf akcfVar = akcxVar.F;
            akcxVar.H = new akeb(new akef(akcfVar, akcfVar == null ? null : akcfVar.p(), 99), akch.d);
            akcxVar.k = akcxVar.H.q();
            akeb akebVar = (akeb) akcxVar.H;
            akcxVar.G = new akef(new akej(akebVar, akebVar.g), akch.e, 1);
            akcxVar.I = new akdl(this);
            akcxVar.x = new akdk(this, akcxVar.f);
            akcxVar.y = new akdd(this, akcxVar.f);
            akcxVar.z = new akde(this, akcxVar.f);
            akcxVar.D = new akdn(this);
            akcxVar.B = new akdi(this);
            akcxVar.A = new akdh(this, akcxVar.g);
            akcf akcfVar2 = akcxVar.B;
            akcm akcmVar = akcxVar.k;
            akch akchVar = akch.j;
            akcxVar.C = new akef(new akej(akcfVar2, akcmVar, akchVar), akchVar, 1);
            akcxVar.j = akcxVar.E.q();
            akcxVar.i = akcxVar.D.q();
            akcxVar.h = akcxVar.B.q();
        }
    }

    @Override // defpackage.akdc
    public final long Z(int i) {
        int i2;
        int i3 = i / 100;
        if (i < 0) {
            i2 = ((((i + 3) >> 2) - i3) + ((i3 + 3) >> 2)) - 1;
        } else {
            int i4 = (i3 >> 2) + ((i >> 2) - i3);
            i2 = ag(i) ? i4 - 1 : i4;
        }
        return ((i * 365) + (i2 - 719527)) * 86400000;
    }

    @Override // defpackage.akcd
    public final akcd a() {
        return H;
    }

    @Override // defpackage.akdc
    public final boolean ag(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    @Override // defpackage.akcd
    public final akcd b(akcl akclVar) {
        return akclVar == z() ? this : ah(akclVar, 4);
    }
}
