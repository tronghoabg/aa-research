package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class cxl extends cxk implements cto {
    private Map f;
    public final cyc g;
    public long h = 0;
    public final ctn p = new ctn(this);
    public final aae q;
    private ctq r;

    public cxl(cyc cycVar) {
        this.g = cycVar;
        aae aaeVar = aaf.a;
        this.q = new aae(6);
    }

    public final void B(long j) {
        if (this.h != j) {
            this.h = j;
            cxn cxnVar = L().w.p;
            if (cxnVar != null) {
                cxnVar.t();
            }
            W(this.g);
        }
        if (this.m) {
            return;
        }
        R(K());
    }

    public final void C(ctq ctqVar) {
        Map map;
        if (ctqVar != null) {
            z((ctqVar.c() << 32) | (ctqVar.b() & 4294967295L));
        } else {
            z(0L);
        }
        if (!affa.f(this.r, ctqVar) && ctqVar != null && ((((map = this.f) != null && !map.isEmpty()) || !ctqVar.f().isEmpty()) && !affa.f(ctqVar.f(), this.f))) {
            ((cxn) u()).p.e();
            Map linkedHashMap = this.f;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(ctqVar.f());
        }
        this.r = ctqVar;
    }

    public final long D(cxl cxlVar) {
        long jD = 0;
        while (!affa.f(this, cxlVar)) {
            boolean z = this.k;
            jD = dlo.d(jD, this.h);
            cyc cycVar = this.g.x;
            cycVar.getClass();
            this = cycVar.C();
            this.getClass();
        }
        return jD;
    }

    @Override // defpackage.cxk
    public final long I() {
        return this.h;
    }

    @Override // defpackage.cxk
    public final cst J() {
        return this.p;
    }

    @Override // defpackage.cxk
    public final ctq K() {
        ctq ctqVar = this.r;
        if (ctqVar != null) {
            return ctqVar;
        }
        crt.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new aezp();
    }

    @Override // defpackage.cxk, defpackage.cxr
    public final cxb L() {
        return this.g.t;
    }

    @Override // defpackage.cxk
    public final cxk N() {
        cyc cycVar = this.g.w;
        if (cycVar != null) {
            return cycVar.C();
        }
        return null;
    }

    @Override // defpackage.cxk
    public final cxk O() {
        cyc cycVar = this.g.x;
        if (cycVar != null) {
            return cycVar.C();
        }
        return null;
    }

    @Override // defpackage.cxk
    public final void S() {
        ev(this.h, BitmapDescriptorFactory.HUE_RED, null);
    }

    @Override // defpackage.cxk
    public final boolean V() {
        return this.r != null;
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.g.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.g.b();
    }

    public int c(int i) {
        throw null;
    }

    public int d(int i) {
        throw null;
    }

    public int e(int i) {
        throw null;
    }

    @Override // defpackage.cxk, defpackage.csq
    public final boolean eM() {
        return true;
    }

    @Override // defpackage.cuo
    public final void ev(long j, float f, afec afecVar) {
        B(j);
        if (this.l) {
            return;
        }
        s();
    }

    public int f(int i) {
        throw null;
    }

    @Override // defpackage.cuo, defpackage.csp
    public final Object g() {
        return this.g.g();
    }

    @Override // defpackage.csq
    public final dlr p() {
        return this.g.p();
    }

    protected void s() {
        K().h();
    }

    public final long t() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final cvw u() {
        cxn cxnVar = this.g.t.w.p;
        cxnVar.getClass();
        return cxnVar;
    }
}
