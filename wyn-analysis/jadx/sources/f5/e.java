package F5;

import P2.m;
import Q1.o;
import f6.C2613z;
import java.util.HashMap;
import k2.H;
import m9.S;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements u6.g, Q1.c, Q1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3890d;

    public /* synthetic */ e(m mVar, long j8, int i5) {
        this.f3887a = 1;
        this.f3890d = mVar;
        this.f3888b = j8;
        this.f3889c = i5;
    }

    @Override // Q1.c
    public void accept(Object obj) {
        P2.a aVar = (P2.a) obj;
        m mVar = (m) this.f3890d;
        Q1.k.h(mVar.f9090h);
        byte[] bArrD = S.d(aVar.f9057c, aVar.f9055a);
        o oVar = mVar.f9085c;
        oVar.getClass();
        oVar.E(bArrD.length, bArrD);
        mVar.f9083a.e(bArrD.length, oVar);
        long j8 = aVar.f9056b;
        long j10 = this.f3888b;
        if (j8 == -9223372036854775807L) {
            Q1.k.g(mVar.f9090h.f8237s == Long.MAX_VALUE);
        } else {
            long j11 = mVar.f9090h.f8237s;
            j10 = j11 == Long.MAX_VALUE ? j10 + j8 : j8 + j11;
        }
        mVar.f9083a.a(j10, this.f3889c, bArrD.length, 0, null);
    }

    @Override // u6.g
    public void invoke(Object obj) {
        switch (this.f3887a) {
            case 0:
                j jVar = (j) obj;
                jVar.getClass();
                a aVar = (a) this.f3890d;
                C2613z c2613z = aVar.f3876d;
                if (c2613z != null) {
                    String strC = jVar.f3917b.c(aVar.f3874b, c2613z);
                    HashMap map = jVar.f3923h;
                    Long l10 = (Long) map.get(strC);
                    HashMap map2 = jVar.f3922g;
                    Long l11 = (Long) map2.get(strC);
                    map.put(strC, Long.valueOf((l10 == null ? 0L : l10.longValue()) + this.f3888b));
                    map2.put(strC, Long.valueOf((l11 != null ? l11.longValue() : 0L) + this.f3889c));
                    break;
                }
                break;
            default:
                V1.i iVar = (V1.i) obj;
                iVar.getClass();
                V1.a aVar2 = (V1.a) this.f3890d;
                H h10 = aVar2.f12890d;
                if (h10 != null) {
                    String strD = iVar.f12926b.d(aVar2.f12888b, h10);
                    HashMap map3 = iVar.f12932h;
                    Long l12 = (Long) map3.get(strD);
                    HashMap map4 = iVar.f12931g;
                    Long l13 = (Long) map4.get(strD);
                    map3.put(strD, Long.valueOf((l12 == null ? 0L : l12.longValue()) + this.f3888b));
                    map4.put(strD, Long.valueOf((l13 != null ? l13.longValue() : 0L) + this.f3889c));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(Object obj, int i5, long j8, long j10, int i10) {
        this.f3887a = i10;
        this.f3890d = obj;
        this.f3889c = i5;
        this.f3888b = j8;
    }
}
