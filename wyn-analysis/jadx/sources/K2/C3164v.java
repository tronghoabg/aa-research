package k2;

import N1.C0764m;
import N1.C0765n;
import N1.C0767p;
import N1.C0769s;
import N1.C0770t;
import N1.C0771u;
import N1.C0772v;
import N1.C0773w;
import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l8.AbstractC3409K;
import l8.C3407I;
import wa.C4398a;

/* renamed from: k2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3164v implements G {

    /* renamed from: a, reason: collision with root package name */
    public final F6.r f39162a;

    /* renamed from: b, reason: collision with root package name */
    public S3.c f39163b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39164c;

    /* renamed from: d, reason: collision with root package name */
    public final long f39165d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39166e;

    /* renamed from: f, reason: collision with root package name */
    public final float f39167f;

    /* renamed from: g, reason: collision with root package name */
    public final float f39168g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39169h;

    public C3164v(Context context) {
        this(new S3.c(context, 20), new s2.k());
    }

    public static G d(Class cls, S3.c cVar) {
        try {
            return (G) cls.getConstructor(S1.g.class).newInstance(cVar);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // k2.G
    public final G a(C4398a c4398a) {
        F6.r rVar = this.f39162a;
        rVar.f4016g = c4398a;
        s2.k kVar = (s2.k) rVar.f4012c;
        synchronized (kVar) {
            kVar.f44910f = c4398a;
        }
        Iterator it = ((HashMap) rVar.f4014e).values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).a(c4398a);
        }
        return this;
    }

    @Override // k2.G
    public final G b(boolean z2) {
        this.f39169h = z2;
        F6.r rVar = this.f39162a;
        rVar.f4011b = z2;
        s2.k kVar = (s2.k) rVar.f4012c;
        synchronized (kVar) {
            kVar.f44909e = z2;
        }
        Iterator it = ((HashMap) rVar.f4014e).values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).b(z2);
        }
        return this;
    }

    @Override // k2.G
    public final AbstractC3144a c(C0773w c0773w) {
        c0773w.f8272b.getClass();
        String scheme = c0773w.f8272b.f8264a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(c0773w.f8272b.f8265b, "application/x-image-uri")) {
            long j8 = c0773w.f8272b.f8269f;
            int i5 = Q1.x.f9724a;
            throw null;
        }
        C0770t c0770t = c0773w.f8272b;
        int iD = Q1.x.D(c0770t.f8264a, c0770t.f8265b);
        if (c0773w.f8272b.f8269f != -9223372036854775807L) {
            s2.k kVar = (s2.k) this.f39162a.f4012c;
            synchronized (kVar) {
                kVar.f44911g = 1;
            }
        }
        try {
            F6.r rVar = this.f39162a;
            HashMap map = (HashMap) rVar.f4014e;
            G g9 = (G) map.get(Integer.valueOf(iD));
            if (g9 == null) {
                g9 = (G) rVar.c(iD).get();
                g9.a((C4398a) rVar.f4016g);
                g9.b(rVar.f4011b);
                map.put(Integer.valueOf(iD), g9);
            }
            E5.Y yA = c0773w.f8273c.a();
            C0769s c0769s = c0773w.f8273c;
            if (c0769s.f8259a == -9223372036854775807L) {
                yA.f3267a = this.f39164c;
            }
            if (c0769s.f8262d == -3.4028235E38f) {
                yA.f3270d = this.f39167f;
            }
            if (c0769s.f8263e == -3.4028235E38f) {
                yA.f3271e = this.f39168g;
            }
            if (c0769s.f8260b == -9223372036854775807L) {
                yA.f3268b = this.f39165d;
            }
            if (c0769s.f8261c == -9223372036854775807L) {
                yA.f3269c = this.f39166e;
            }
            C0769s c0769s2 = new C0769s(yA);
            if (!c0769s2.equals(c0773w.f8273c)) {
                C0767p c0767pA = c0773w.a();
                c0767pA.k = c0769s2.a();
                c0773w = c0767pA.a();
            }
            AbstractC3144a abstractC3144aC = g9.c(c0773w);
            AbstractC3409K abstractC3409K = c0773w.f8272b.f8267d;
            if (!abstractC3409K.isEmpty()) {
                AbstractC3144a[] abstractC3144aArr = new AbstractC3144a[abstractC3409K.size() + 1];
                abstractC3144aArr[0] = abstractC3144aC;
                if (abstractC3409K.size() > 0) {
                    if (!this.f39169h) {
                        this.f39163b.getClass();
                        C0772v c0772v = (C0772v) abstractC3409K.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        C3407I c3407i = AbstractC3409K.f40056b;
                        l8.e0 e0Var = l8.e0.f40101e;
                        List list = Collections.EMPTY_LIST;
                        l8.e0 e0Var2 = l8.e0.f40101e;
                        C0771u c0771u = C0771u.f8270a;
                        Uri uri = Uri.EMPTY;
                        c0772v.getClass();
                        throw null;
                    }
                    C0764m c0764m = new C0764m();
                    ((C0772v) abstractC3409K.get(0)).getClass();
                    ArrayList arrayList = N1.C.f8025a;
                    c0764m.f8194m = null;
                    ((C0772v) abstractC3409K.get(0)).getClass();
                    c0764m.f8186d = null;
                    ((C0772v) abstractC3409K.get(0)).getClass();
                    c0764m.f8187e = 0;
                    ((C0772v) abstractC3409K.get(0)).getClass();
                    c0764m.f8188f = 0;
                    ((C0772v) abstractC3409K.get(0)).getClass();
                    c0764m.f8184b = null;
                    ((C0772v) abstractC3409K.get(0)).getClass();
                    c0764m.f8183a = null;
                    new C0765n(c0764m);
                    ((C0772v) abstractC3409K.get(0)).getClass();
                    throw null;
                }
                abstractC3144aC = new Q(abstractC3144aArr);
            }
            AbstractC3144a c3151h = abstractC3144aC;
            long j10 = c0773w.f8275e.f8258a;
            if (j10 != Long.MIN_VALUE) {
                c3151h = new C3151h(c3151h, 0L, j10, true);
            }
            c0773w.f8272b.getClass();
            c0773w.f8272b.getClass();
            return c3151h;
        } catch (ClassNotFoundException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public C3164v(Context context, s2.k kVar) {
        this(new S3.c(context, 20), kVar);
    }

    public C3164v(S3.c cVar, s2.k kVar) {
        this.f39163b = cVar;
        F6.r rVar = new F6.r(kVar, new C4398a(24));
        this.f39162a = rVar;
        if (cVar != ((S3.c) rVar.f4015f)) {
            rVar.f4015f = cVar;
            ((HashMap) rVar.f4013d).clear();
            ((HashMap) rVar.f4014e).clear();
        }
        this.f39164c = -9223372036854775807L;
        this.f39165d = -9223372036854775807L;
        this.f39166e = -9223372036854775807L;
        this.f39167f = -3.4028235E38f;
        this.f39168g = -3.4028235E38f;
        this.f39169h = true;
    }
}
