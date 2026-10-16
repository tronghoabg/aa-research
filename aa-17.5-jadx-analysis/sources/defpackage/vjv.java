package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class vjv {
    public final CopyOnWriteArrayList a;
    public final aat b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public final vjo g;
    private final vja h;

    public vjv(vjs... vjsVarArr) {
        vjt vjtVar = new vjt(this);
        this.h = vjtVar;
        this.g = new vju(this);
        this.a = new CopyOnWriteArrayList(vjsVarArr);
        aat aatVar = new aat(1);
        this.b = aatVar;
        this.c = 1;
        vjsVarArr[0].e(vjtVar);
        aatVar.put(vjsVarArr[0], true);
    }

    public final void a() {
        if (this.f || !this.e || this.c == 0) {
            return;
        }
        this.f = true;
        vjq.c().a(this.g);
    }
}
