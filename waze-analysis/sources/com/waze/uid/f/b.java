package com.waze.uid.f;

import com.waze.tide.s;
import com.waze.uid.b.ab;
import com.waze.uid.b.ad;
import com.waze.uid.b.i;
import com.waze.uid.c.bb;
import com.waze.uid.state_impl.add_id.k;
import h.g.b.x;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends ad {

    /* renamed from: a, reason: collision with root package name */
    private final bn f44494a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f44495b;

    /* JADX WARN: Illegal instructions before constructor call */
    public b() {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        x.f(aVarA, "stringProvider");
        super(aVarA);
        bn bnVarB = ck.b(new a(null));
        this.f44494a = bnVarB;
        this.f44495b = bnVarB;
        u(ab.f44136a.a());
    }

    public final ch a() {
        return this.f44495b;
    }

    @Override // com.waze.uid.b.ad
    public final void i(i iVar) {
        x.f(iVar, "state");
        bb bbVarF = iVar.f();
        if (!(bbVarF instanceof bb)) {
            bbVarF = null;
        }
        s sVarE = bbVarF != null ? bbVarF.e() : null;
        k kVar = sVarE instanceof k ? (k) sVarE : null;
        if (kVar != null) {
            this.f44494a.e(new a(kVar.a(), kVar.b()));
        }
    }
}
