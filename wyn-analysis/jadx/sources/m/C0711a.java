package M;

import A7.B0;
import Ef.E;
import N.C0718d;
import N.P;
import N.V;
import N.Y;
import N.q0;
import android.content.Context;
import android.graphics.Canvas;
import ba.C1521a;
import e0.AbstractC2451c;
import e0.C2450b;
import e0.C2465q;
import e0.InterfaceC2463o;
import g0.C2661b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import vf.AbstractC4345a;

/* renamed from: M.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711a extends B0 implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7144b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7145c;

    /* renamed from: d, reason: collision with root package name */
    public final V f7146d;

    /* renamed from: e, reason: collision with root package name */
    public final V f7147e;

    /* renamed from: f, reason: collision with root package name */
    public final q f7148f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f7149g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f7150h;

    /* renamed from: i, reason: collision with root package name */
    public long f7151i;

    /* renamed from: j, reason: collision with root package name */
    public int f7152j;
    public final A0.p k;

    public C0711a(boolean z2, V v2, V v10, q qVar) {
        super(z2, v10);
        this.f7144b = z2;
        this.f7145c = Float.NaN;
        this.f7146d = v2;
        this.f7147e = v10;
        this.f7148f = qVar;
        P p10 = P.f7730f;
        this.f7149g = C0718d.G(null, p10);
        this.f7150h = C0718d.G(Boolean.TRUE, p10);
        this.f7151i = d0.f.f33949b;
        this.f7152j = -1;
        this.k = new A0.p(this, 8);
    }

    @Override // A7.B0
    public final void N(D.k kVar) {
        r rVar = (r) this.f7149g.getValue();
        if (rVar != null) {
            rVar.d();
        }
    }

    public final void e0() {
        q qVar = this.f7148f;
        qVar.getClass();
        this.f7149g.setValue(null);
        S3.e eVar = qVar.f7204d;
        eVar.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f10941b;
        r rVar = (r) linkedHashMap.get(this);
        if (rVar != null) {
            rVar.c();
            r rVar2 = (r) linkedHashMap.get(this);
            if (rVar2 != null) {
            }
            linkedHashMap.remove(this);
            qVar.f7203c.add(rVar);
        }
    }

    @Override // N.q0
    public final void j() {
        e0();
    }

    @Override // N.q0
    public final void k() {
        e0();
    }

    @Override // B.S
    public final void l(t0.v vVar) {
        int iJ;
        C2661b c2661b = vVar.f45543a;
        this.f7151i = c2661b.f35484b.y();
        float f10 = this.f7145c;
        boolean zIsNaN = Float.isNaN(f10);
        C1521a c1521a = c2661b.f35484b;
        if (zIsNaN) {
            iJ = AbstractC4345a.H(p.a(vVar, this.f7144b, c1521a.y()));
        } else {
            iJ = vVar.j(f10);
        }
        this.f7152j = iJ;
        long j8 = ((C2465q) this.f7146d.getValue()).f34382a;
        float f11 = ((g) this.f7147e.getValue()).f7172d;
        vVar.a();
        C(vVar, f10, j8);
        InterfaceC2463o interfaceC2463oV = c2661b.f35484b.v();
        ((Boolean) this.f7150h.getValue()).booleanValue();
        r rVar = (r) this.f7149g.getValue();
        if (rVar != null) {
            rVar.e(f11, this.f7152j, c1521a.y(), j8);
            Canvas canvas = AbstractC2451c.f34360a;
            AbstractC3340k.e(interfaceC2463oV, "<this>");
            rVar.draw(((C2450b) interfaceC2463oV).f34357a);
        }
    }

    @Override // A7.B0
    public final void y(D.k interaction, E scope) {
        AbstractC3340k.e(interaction, "interaction");
        AbstractC3340k.e(scope, "scope");
        q qVar = this.f7148f;
        qVar.getClass();
        S3.e eVar = qVar.f7204d;
        eVar.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f10941b;
        r rippleHostView = (r) linkedHashMap.get(this);
        if (rippleHostView == null) {
            ArrayList arrayList = qVar.f7203c;
            AbstractC3340k.e(arrayList, "<this>");
            rippleHostView = (r) (arrayList.isEmpty() ? null : arrayList.remove(0));
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) eVar.f10942c;
            if (rippleHostView == null) {
                int i5 = qVar.f7205e;
                ArrayList arrayList2 = qVar.f7202b;
                if (i5 > AbstractC3935e.z(arrayList2)) {
                    Context context = qVar.getContext();
                    AbstractC3340k.d(context, "context");
                    rippleHostView = new r(context);
                    qVar.addView(rippleHostView);
                    arrayList2.add(rippleHostView);
                } else {
                    rippleHostView = (r) arrayList2.get(qVar.f7205e);
                    AbstractC3340k.e(rippleHostView, "rippleHostView");
                    C0711a c0711a = (C0711a) linkedHashMap2.get(rippleHostView);
                    if (c0711a != null) {
                        c0711a.f7149g.setValue(null);
                        r rVar = (r) linkedHashMap.get(c0711a);
                        if (rVar != null) {
                        }
                        linkedHashMap.remove(c0711a);
                        rippleHostView.c();
                    }
                }
                int i10 = qVar.f7205e;
                if (i10 < qVar.f7201a - 1) {
                    qVar.f7205e = i10 + 1;
                } else {
                    qVar.f7205e = 0;
                }
            }
            linkedHashMap.put(this, rippleHostView);
            linkedHashMap2.put(rippleHostView, this);
        }
        r rVar2 = rippleHostView;
        rVar2.b(interaction, this.f7144b, this.f7151i, this.f7152j, ((C2465q) this.f7146d.getValue()).f34382a, ((g) this.f7147e.getValue()).f7172d, this.k);
        this.f7149g.setValue(rVar2);
    }

    @Override // N.q0
    public final void c() {
    }
}
