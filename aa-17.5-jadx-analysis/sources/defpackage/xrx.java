package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xrx {
    public xqu a;
    public xqw b;
    public xqx c;
    public xqy d;
    public xrb e;
    public xqm f;
    public xqm g;
    public xqz h;
    public xqn i;
    public xqv j;

    public xrx(xqq xqqVar) {
        this.a = xqqVar.a;
        this.b = xqqVar.b;
        this.c = xqqVar.c;
        this.d = xqqVar.d;
        this.e = xqqVar.e;
        this.f = xqqVar.f;
        this.g = xqqVar.g;
        this.h = xqqVar.h;
        this.i = xqqVar.i;
        this.j = xqqVar.j;
    }

    public final xqm a() {
        xqm xqmVar = this.f;
        return xqmVar == null ? new xqm(null, 2047) : xqmVar;
    }

    public final xqm b() {
        xqm xqmVar = this.g;
        return xqmVar == null ? new xqm("2", 2046) : xqmVar;
    }

    public final xqn c() {
        xqn xqnVar = this.i;
        return xqnVar == null ? new xqn() : xqnVar;
    }

    public final xqq d() {
        return new xqq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final xqw e() {
        xqw xqwVar = this.b;
        return xqwVar == null ? new xqw(null) : xqwVar;
    }

    public final xqz f() {
        xqz xqzVar = this.h;
        return xqzVar == null ? new xqz(null) : xqzVar;
    }

    public final xrb g() {
        xrb xrbVar = this.e;
        return xrbVar == null ? new xrb(BitmapDescriptorFactory.HUE_RED, 64.0f, 1.0f) : xrbVar;
    }

    public xrx() {
        this((byte[]) null);
    }

    public /* synthetic */ xrx(byte[] bArr) {
        this(new xqq(null));
    }
}
