package r9;

import A.AbstractC0213f;
import K8.C0694f;
import Va.Za;
import android.util.SparseArray;
import ba.C1521a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import n9.C3610e;
import o9.InterfaceC3658a;
import p7.AbstractC3772b;
import p9.C3776A;

/* renamed from: r9.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3955l implements InterfaceC3658a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f44630n = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3772b f44631a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3949f f44632b;

    /* renamed from: c, reason: collision with root package name */
    public v f44633c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3945b f44634d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3940A f44635e;

    /* renamed from: f, reason: collision with root package name */
    public Za f44636f;

    /* renamed from: g, reason: collision with root package name */
    public final C0694f f44637g;

    /* renamed from: h, reason: collision with root package name */
    public final Y2.B f44638h;

    /* renamed from: i, reason: collision with root package name */
    public final Q f44639i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC3944a f44640j;
    public final SparseArray k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f44641l;

    /* renamed from: m, reason: collision with root package name */
    public final R1.i f44642m;

    public C3955l(AbstractC3772b abstractC3772b, C0694f c0694f, C3610e c3610e) {
        A6.c.z(abstractC3772b.J(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f44631a = abstractC3772b;
        this.f44637g = c0694f;
        Q qG = abstractC3772b.G();
        this.f44639i = qG;
        this.f44640j = abstractC3772b.u();
        R1.i iVar = new R1.i(0, qG.g());
        iVar.f10117b += 2;
        this.f44642m = iVar;
        this.f44635e = abstractC3772b.E();
        Y2.B b5 = new Y2.B((byte) 0, 24);
        this.f44638h = b5;
        this.k = new SparseArray();
        this.f44641l = new HashMap();
        abstractC3772b.D().k(b5);
        c(c3610e);
    }

    public static boolean e(S s10, S s11, v9.t tVar) {
        if (s10.f44602g.isEmpty()) {
            return true;
        }
        long j8 = s11.f44600e.f45390a.f45352a - s10.f44600e.f45390a.f45352a;
        long j10 = f44630n;
        if (j8 >= j10) {
            return true;
        }
        if (s11.f44601f.f45390a.f45352a - s10.f44601f.f45390a.f45352a >= j10) {
            return true;
        }
        if (tVar == null) {
            return false;
        }
        return tVar.f47116e.f19805a.size() + (tVar.f47115d.f19805a.size() + tVar.f47114c.f19805a.size()) > 0;
    }

    public final S a(C3776A c3776a) {
        int i5;
        S sD = this.f44639i.d(c3776a);
        if (sD != null) {
            i5 = sD.f44597b;
        } else {
            C3959p c3959p = new C3959p();
            this.f44631a.P("Allocate target", new RunnableC3954k(this, c3959p, c3776a, 0));
            i5 = c3959p.f44650a;
            sD = (S) c3959p.f44651b;
        }
        SparseArray sparseArray = this.k;
        if (sparseArray.get(i5) == null) {
            sparseArray.put(i5, sD);
            this.f44641l.put(c3776a, Integer.valueOf(i5));
        }
        return sD;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ba.C1521a b(p9.u r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.C3955l.b(p9.u, boolean):ba.a");
    }

    public final void c(C3610e c3610e) {
        AbstractC3772b abstractC3772b = this.f44631a;
        InterfaceC3949f interfaceC3949fY = abstractC3772b.y(c3610e);
        this.f44632b = interfaceC3949fY;
        this.f44633c = abstractC3772b.z(c3610e, interfaceC3949fY);
        InterfaceC3945b interfaceC3945bX = abstractC3772b.x(c3610e);
        this.f44634d = interfaceC3945bX;
        v vVar = this.f44633c;
        InterfaceC3949f interfaceC3949f = this.f44632b;
        InterfaceC3940A interfaceC3940A = this.f44635e;
        this.f44636f = new Za(interfaceC3940A, vVar, interfaceC3945bX, interfaceC3949f);
        interfaceC3940A.K(interfaceC3949f);
        Za za2 = this.f44636f;
        InterfaceC3949f interfaceC3949f2 = this.f44632b;
        C0694f c0694f = this.f44637g;
        c0694f.f6641c = za2;
        c0694f.f6642d = interfaceC3949f2;
        c0694f.f6639a = true;
    }

    public final C1521a d(Map map) {
        boolean z2 = false;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Set setKeySet = map.keySet();
        InterfaceC3940A interfaceC3940A = this.f44635e;
        HashMap mapY = interfaceC3940A.y(setKeySet);
        for (Map.Entry entry : map.entrySet()) {
            s9.h hVar = (s9.h) entry.getKey();
            s9.k kVar = (s9.k) entry.getValue();
            s9.k kVar2 = (s9.k) mapY.get(hVar);
            if (kVar.d() != kVar2.d()) {
                hashSet.add(hVar);
            }
            if (kVar.e() && kVar.f45382c.equals(s9.o.f45389b)) {
                arrayList.add(kVar.f45380a);
                map2.put(hVar, kVar);
            } else if (AbstractC0213f.b(kVar2.f45381b, 1) || kVar.f45382c.compareTo(kVar2.f45382c) > 0 || (kVar.f45382c.compareTo(kVar2.f45382c) == 0 && (kVar2.c() || AbstractC0213f.b(kVar2.f45385f, 2)))) {
                A6.c.z(!s9.o.f45389b.equals(kVar.f45383d), "Cannot add a document when the remote version is zero", new Object[0]);
                interfaceC3940A.F(kVar, kVar.f45383d);
                map2.put(hVar, kVar);
            } else {
                Ba.c.p("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", 1, hVar, kVar2.f45382c, kVar.f45382c);
            }
        }
        interfaceC3940A.z(arrayList);
        return new C1521a(map2, z2, hashSet, 20);
    }
}
