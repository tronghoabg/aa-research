package com.waze.sound.e;

import com.waze.settings.ea;
import com.waze.settings.eb;
import com.waze.sound.bj;
import com.waze.sound.bp;
import com.waze.sound.bs;
import com.waze.sound.bu;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final bs f39862a;

    /* renamed from: b, reason: collision with root package name */
    private final eb f39863b;

    /* renamed from: c, reason: collision with root package name */
    private final af f39864c;

    /* renamed from: d, reason: collision with root package name */
    private final List f39865d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f39866e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f39867f;

    public /* synthetic */ m(bs bsVar, eb ebVar, com.waze.sound.a.c cVar, bj bjVar) {
        this.f39862a = bsVar;
        this.f39863b = ebVar;
        af afVarP = com.waze.ui.a.l.p(this, null);
        this.f39864c = afVarP;
        this.f39865d = (List) bsVar.a().d();
        this.f39866e = bsVar.b();
        kotlinx.coroutines.b.k kVarQ = ai.q(cVar.e(), bjVar.b(), new l(null));
        int i2 = bz.f51630a;
        this.f39867f = ai.V(kVarQ, afVarP, by.b(), "");
    }

    public final List a() {
        return this.f39865d;
    }

    public final ch b() {
        return this.f39866e;
    }

    public final ch c() {
        return this.f39867f;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f39864c, bo.g("Closed", null));
    }

    public final void d() {
        this.f39863b.i();
    }

    public final void e(bp bpVar) {
        ea eaVar;
        x.f(bpVar, "newGuidanceMode");
        bs bsVar = this.f39862a;
        if (bsVar.b().d() != bpVar) {
            bsVar.d(bpVar, bu.f39572a);
            eb ebVar = this.f39863b;
            bp bpVar2 = bp.f39554a;
            int iOrdinal = bpVar.ordinal();
            if (iOrdinal == 0) {
                eaVar = ea.f37159a;
            } else if (iOrdinal == 1) {
                eaVar = ea.f37165g;
            } else if (iOrdinal == 2) {
                eaVar = ea.f37166h;
            } else if (iOrdinal == 3) {
                eaVar = ea.f37161c;
            } else {
                if (iOrdinal != 4) {
                    throw new h.i();
                }
                eaVar = ea.f37160b;
            }
            ebVar.h(eaVar);
        }
    }
}
