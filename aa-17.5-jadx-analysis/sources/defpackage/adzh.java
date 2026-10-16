package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adzh extends adqs {
    private static final long u;
    final List b;
    public final List c;
    public final List d;
    public final List e;
    public adwt f;
    adjt g;
    long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    adkj m;
    public final adus n;
    adqq o;
    adqs p;
    public final sm q;
    public static final Logger a = Logger.getLogger(adzh.class.getName());
    private static final adwt r = new adzs(adue.o, 0);
    private static final adqs v = new adqs(null, null, null, null);
    private static final adjt s = adjt.b;
    private static final adjf t = adjf.a;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        u = 120000L;
    }

    public adzh(adus adusVar) {
        super(null, null);
        this.q = new sm((byte[]) null, (short[]) null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.p = v;
        this.f = r;
        this.g = s;
        this.h = u;
        this.o = adjr.b;
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = true;
        this.m = adkj.b;
        this.n = adusVar;
        Iterator it = ajlp.o().h().iterator();
        while (it.hasNext()) {
            ((adjg) it.next()).b();
        }
    }
}
