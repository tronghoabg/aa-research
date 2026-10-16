package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zis extends adqq {
    public final Executor a;
    public final Set b;
    public final Deque c;
    public int d;
    public zir e;
    public boolean f;
    public final ziq g;
    public boolean h;
    public adqq i;
    public adqq j;
    private final adix k;
    private final admf l;
    private final yfq m;
    private final LinkedHashMap n;
    private final Set o;
    private final Queue p;
    private final adiw q;
    private final Queue r;
    private int s;
    private admc t;

    public zis(adix adixVar, admf admfVar, adiw adiwVar, yfq yfqVar) {
        super(null, null);
        this.b = yrm.u();
        this.n = new LinkedHashMap();
        this.o = yrm.u();
        this.f = false;
        this.h = false;
        this.k = adixVar;
        this.l = admfVar;
        this.q = adiwVar;
        this.m = yfqVar;
        this.c = new ArrayDeque();
        this.r = new ArrayDeque();
        this.p = new ArrayDeque();
        this.e = new zir(((yls) yfqVar).c, 1, 0, 0);
        Executor executor = adiwVar.c;
        ziq ziqVar = new ziq(executor == null ? zfq.a : executor);
        this.g = ziqVar;
        this.a = new phd(this, new zhb(ziqVar), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ba(zip zipVar, int i, int i2) {
        zipVar.a.getClass();
        while (i < i2) {
            yfq yfqVar = (yfq) this.m.get(i);
            if (yfqVar.size() > 0) {
                ((zim) yfqVar.get(0)).e();
                throw null;
            }
            i++;
        }
        zipVar.c = i2;
        if (zipVar.b.isEmpty()) {
            while (true) {
                Deque deque = this.c;
                if (deque.isEmpty()) {
                    break;
                }
                zip zipVar2 = (zip) deque.peek();
                if (!zipVar2.b.isEmpty() || zipVar2.c != zipVar2.d.e.a) {
                    break;
                }
                Object obj = ((zip) deque.poll()).a;
                if (this.e.e == 4) {
                    this.i.n(obj);
                } else {
                    this.p.add(obj);
                }
            }
            k();
        }
    }

    private final void bb() {
        zir zirVar;
        zir zirVar2 = this.e;
        int i = zirVar2.e;
        woy.aa(!(i == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if (i == 3) {
            zirVar = new zir(zirVar2.a, 4, zirVar2.b, zirVar2.c);
        } else {
            if (i == 1) {
                boolean z = zirVar2.d;
            }
            int i2 = zirVar2.b;
            int i3 = i2 + 1;
            int i4 = zirVar2.a;
            int i5 = zirVar2.c;
            zirVar = i3 < i4 ? new zir(i4, 1, i3, i5) : new zir(i4, 3, i2, i5);
        }
        this.e = zirVar;
        int i6 = zirVar.e - 1;
        if (i6 == 0) {
            o(this.t);
            return;
        }
        if (i6 != 2) {
            l();
            return;
        }
        adqq adqqVarD = this.k.d(this.l, this.q);
        this.i = adqqVarD;
        adqqVarD.b(this.j, this.t);
        int i7 = this.d;
        if (i7 > 0) {
            this.i.m(i7);
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            this.i.n(it.next());
        }
        if (this.f && this.c.isEmpty()) {
            this.i.j();
        }
        bb();
    }

    private static final zre bc(adiw adiwVar, admc admcVar, String str) {
        admcVar.getClass();
        str.getClass();
        return new zre(adiwVar, admcVar, str);
    }

    @Override // defpackage.adqq
    public final void b(adqq adqqVar, admc admcVar) {
        this.j = new zio(this, new ziy(new ziu(adqqVar, this.m, this.o)));
        this.t = admcVar;
        this.a.execute(xur.c(new xab(this, admcVar, 5, null)));
    }

    @Override // defpackage.adqq
    public final void i(String str, Throwable th) {
        this.a.execute(xur.c(new uze(this, str, th, 6)));
    }

    @Override // defpackage.adqq
    public final void j() {
        this.a.execute(xur.c(new wxj(this, 15)));
    }

    public final void k() {
        if (this.f) {
            zip zipVar = (zip) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && zipVar == null) {
                    this.i.j();
                    return;
                }
                return;
            }
            if (zipVar == null || (zipVar.b.isEmpty() && zipVar.c == zipVar.d.e.c + 1)) {
                bb();
            }
        }
    }

    public final void l() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i != 3) {
                return;
            }
            for (zip zipVar : this.c) {
                ba(zipVar, zipVar.c, this.e.a);
            }
            return;
        }
        for (zip zipVar2 : this.c) {
            int i2 = zipVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                ba(zipVar2, i2, i3 + 1);
            }
        }
    }

    @Override // defpackage.adqq
    public final void m(int i) {
        byte[] bArr;
        synchronized (this.r) {
            this.s += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Queue queue = this.r;
        synchronized (queue) {
            bArr = null;
            if (!queue.isEmpty()) {
                int i2 = this.s;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objPoll = queue.poll();
                    if (objPoll != null) {
                        arrayDeque.add(objPoll);
                        this.s--;
                    }
                }
                boolean zIsEmpty = queue.isEmpty();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.j.g(it.next());
                }
                if (zIsEmpty) {
                    this.j.a(adnq.b, null);
                }
            }
        }
        this.a.execute(xur.c(new rgm(this, i, 17, bArr)));
    }

    @Override // defpackage.adqq
    public final void n(Object obj) {
        this.a.execute(xur.c(new xab(this, obj, 6, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(admc admcVar) {
        String strA = this.k.a();
        adiw adiwVar = this.q;
        zre zreVarBc = bc(adiwVar, admcVar, strA);
        yfq yfqVar = (yfq) this.m.get(this.e.b);
        if (yfqVar.size() <= 0) {
            if (this.n.isEmpty()) {
                bb();
            }
        } else {
            zim zimVar = (zim) yfqVar.get(0);
            if (adiwVar != zreVarBc.c) {
                bc(adiwVar, (admc) zreVarBc.a, (String) zreVarBc.b);
            }
            zimVar.d();
            throw null;
        }
    }
}
