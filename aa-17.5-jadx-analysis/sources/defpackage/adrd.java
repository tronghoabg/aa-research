package defpackage;

import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class adrd implements adss {
    public final String a;
    public adwh b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final aeac f;
    public adis g;
    public boolean h;
    public adnq i;
    public boolean j;
    public final sm k;
    private final adkn l;
    private final InetSocketAddress m;
    private final String n;
    private boolean o;
    private boolean p;

    public adrd(sm smVar, InetSocketAddress inetSocketAddress, String str, adis adisVar, Executor executor, aeac aeacVar) {
        inetSocketAddress.getClass();
        this.m = inetSocketAddress;
        this.l = adkn.a(getClass(), inetSocketAddress.toString());
        this.n = str;
        this.a = adue.j("cronet");
        this.e = executor;
        this.k = smVar;
        this.f = aeacVar;
        adis adisVar2 = adis.a;
        adqn adqnVar = new adqn(adis.a);
        adqnVar.c(adua.a, adne.c);
        adqnVar.c(adua.b, adisVar);
        this.g = adqnVar.a();
    }

    final void a(adrb adrbVar, adnq adnqVar) {
        synchronized (this.c) {
            if (this.d.remove(adrbVar)) {
                adnn adnnVar = adnqVar.p;
                boolean z = true;
                if (adnnVar != adnn.CANCELLED && adnnVar != adnn.DEADLINE_EXCEEDED) {
                    z = false;
                }
                adrbVar.p.l(adnqVar, z, new admc());
                d();
            }
        }
    }

    @Override // defpackage.adsk
    public final /* bridge */ /* synthetic */ adsh b(admf admfVar, admc admcVar, adiw adiwVar, adjb[] adjbVarArr) {
        return new adrc(this, "https://" + this.n + "/".concat(admfVar.b), admcVar, admfVar, adzv.h(adjbVarArr, this.g), adiwVar).a;
    }

    @Override // defpackage.adwi
    public final Runnable c(adwh adwhVar) {
        this.b = adwhVar;
        synchronized (this.c) {
            this.j = true;
        }
        return new adpo(this, 2, null);
    }

    final void d() {
        synchronized (this.c) {
            if (this.h && !this.p && this.d.isEmpty()) {
                this.p = true;
                this.b.d();
            }
        }
    }

    @Override // defpackage.adkt
    public final adkn e() {
        return this.l;
    }

    @Override // defpackage.adwi
    public final void q(adnq adnqVar) {
        synchronized (this.c) {
            if (this.h) {
                return;
            }
            synchronized (this.c) {
                if (this.o) {
                    return;
                }
                this.o = true;
                this.b.c(adnqVar, adzt.SUBCHANNEL_SHUTDOWN);
                synchronized (this.c) {
                    this.h = true;
                    this.i = adnqVar;
                }
                d();
            }
        }
    }

    @Override // defpackage.adss
    public final adis s() {
        return this.g;
    }

    public final String toString() {
        InetSocketAddress inetSocketAddress = this.m;
        return super.toString() + "(" + inetSocketAddress.toString() + ")";
    }
}
