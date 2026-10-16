package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import l8.AbstractC3409K;
import r6.C3930e;
import s6.C4022i;

/* loaded from: classes.dex */
public final /* synthetic */ class B1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20751c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20753e;

    public /* synthetic */ B1(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f20749a = i5;
        this.f20750b = obj;
        this.f20751c = obj2;
        this.f20752d = obj3;
        this.f20753e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20749a) {
            case 0:
                ((z1) this.f20750b).a((com.applovin.impl.sdk.ad.b) this.f20751c, (com.applovin.impl.sdk.k) this.f20752d, (Activity) this.f20753e, view);
                break;
            default:
                C4022i c4022i = (C4022i) this.f20750b;
                c4022i.getClass();
                E5.I i5 = (E5.I) ((E5.w0) this.f20751c);
                r6.f fVarV0 = i5.v0();
                fVarV0.getClass();
                C3930e c3930e = new C3930e(fVarV0);
                s6.r rVar = (s6.r) this.f20753e;
                r6.p pVar = new r6.p((f6.Z) this.f20752d, AbstractC3409K.n(Integer.valueOf(rVar.f45201b)));
                f6.Z z2 = pVar.f44466a;
                c3930e.a(z2.f35019c);
                c3930e.f44491y.put(z2, pVar);
                c3930e.e(rVar.f45200a.f3130b.f35019c);
                i5.K0(new r6.f(c3930e));
                String str = rVar.f45202c;
                switch (c4022i.k) {
                    case 0:
                        c4022i.f45184l.f45236f.f45196j[1] = str;
                        break;
                }
                c4022i.f45183j.k.dismiss();
                break;
        }
    }
}
