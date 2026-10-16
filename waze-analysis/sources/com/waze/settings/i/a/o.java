package com.waze.settings.i.a;

import com.waze.copilot.data.ag;
import com.waze.copilot.data.ah;
import com.waze.ui.af.r;
import com.waze.ui.af.t;
import com.waze.ui.af.v;
import com.waze.ui.af.w;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f37421a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f37422b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f37423c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(m mVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37423c = i2;
        this.f37422b = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f37423c;
        if (i2 == 0) {
            return new o((q) this.f37422b, eVar, 0);
        }
        if (i2 == 1) {
            return new o((m) this.f37422b, eVar, 1);
        }
        Object obj2 = this.f37422b;
        return i2 != 2 ? new o((q) obj2, eVar, 3, (char[]) null) : new o((q) obj2, eVar, 2, (byte[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f37423c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        v vVar;
        Object objD2;
        v vVar2;
        Object objB;
        Object objD3;
        v vVar3;
        Object objD4;
        v vVar4;
        com.waze.ui.af.q wVar;
        int i2 = this.f37423c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f37421a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f37422b;
                this.f37421a = 1;
                if (((q) obj2).f37433h.a().collect(new n(obj2, 0), this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f37421a == 0) {
                e.b.c.b(obj);
                Object obj3 = this.f37422b;
                this.f37421a = 1;
                if (((m) obj3).i().j().collect(new n(obj3, 1), this) == aVar2) {
                    return aVar2;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f37421a == 0) {
                e.b.c.b(obj);
                Object obj4 = this.f37422b;
                this.f37421a = 1;
                if (((q) obj4).f37428c.b().collect(new n(obj4, 2), this) == aVar3) {
                    return aVar3;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f37421a != 0) {
            e.b.c.b(obj);
            objB = ((h.m) obj).b();
        } else {
            e.b.c.b(obj);
            q qVar = (q) this.f37422b;
            bn bnVar = qVar.f37436k;
            do {
                objD = bnVar.d();
                vVar = (v) objD;
                x.d(vVar, "null cannot be cast to non-null type com.waze.ui.voices.VoiceSettings.State.AllVoices");
            } while (!bnVar.f(objD, t.f((t) vVar, null, null, null, true, null, false, 55)));
            String strE = q.e(qVar);
            bn bnVar2 = qVar.f37436k;
            do {
                objD2 = bnVar2.d();
                vVar2 = (v) objD2;
                x.d(vVar2, "null cannot be cast to non-null type com.waze.ui.voices.VoiceSettings.State.AllVoices");
            } while (!bnVar2.f(objD2, t.f((t) vVar2, strE, null, null, false, null, false, 62)));
            this.f37421a = 1;
            objB = qVar.f37427b.b(this);
            if (objB == aVar4) {
                return aVar4;
            }
        }
        Object obj5 = this.f37422b;
        if (h.m.e(objB)) {
            q qVar2 = (q) obj5;
            List<ag> listC = qVar2.f37427b.c();
            ArrayList arrayList = new ArrayList(h.a.i.q(listC, 10));
            for (ag agVar : listC) {
                ah ahVarD = agVar.d();
                ah ahVar = ah.f22965a;
                int iOrdinal = ahVarD.ordinal();
                if (iOrdinal == 0) {
                    wVar = new w(agVar.f(), agVar.i(), agVar.e(), agVar.g());
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    wVar = new r(agVar.f(), agVar.i(), agVar.e(), agVar.g());
                }
                arrayList.add(wVar);
            }
            qVar2.n = arrayList;
            bn bnVar3 = qVar2.f37436k;
            do {
                objD4 = bnVar3.d();
                vVar4 = (v) objD4;
                x.d(vVar4, "null cannot be cast to non-null type com.waze.ui.voices.VoiceSettings.State.AllVoices");
            } while (!bnVar3.f(objD4, t.f((t) vVar4, null, qVar2.n, null, false, null, false, 53)));
        }
        if (h.m.c(objB) != null) {
            bn bnVar4 = ((q) obj5).f37436k;
            do {
                objD3 = bnVar4.d();
                vVar3 = (v) objD3;
                x.d(vVar3, "null cannot be cast to non-null type com.waze.ui.voices.VoiceSettings.State.AllVoices");
            } while (!bnVar4.f(objD3, t.f((t) vVar3, null, null, null, false, com.waze.ui.af.d.f41884a, false, 39)));
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37423c = i2;
        this.f37422b = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f37423c = i2;
        this.f37422b = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f37423c = i2;
        this.f37422b = qVar;
    }
}
