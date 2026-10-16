package defpackage;

import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aacp extends tqp implements zxe {
    static final abfi a = abfi.WORLD_ENCODING_LAT_LNG_DOUBLE;
    public final zxi b;
    public final aacl c;
    public final zrt d;
    volatile boolean e;
    boolean f;
    public final twq g;
    final abnr h;
    private final float i;
    private final Executor j;
    private final int k;
    private final aabf l;
    private final List m;
    private final List n;
    private final abnp o;
    private final abnp p;

    public aacp(float f, twq twqVar, zxi zxiVar, int i) {
        aabf aabfVar = new aabf(twqVar);
        Executor executorB = zrz.b();
        aacl aaclVar = aacl.b;
        zrt zrtVar = zrt.a;
        this.i = f;
        zkt.n(twqVar, "phoenixGoogleMap");
        this.g = twqVar;
        this.b = zxiVar;
        this.k = i;
        this.l = aabfVar;
        this.j = executorB;
        zkt.n(aaclVar, "multiZoomStyleFactoryPhoenix");
        this.c = aaclVar;
        zkt.n(zrtVar, "uiThreadChecker");
        this.d = zrtVar;
        this.e = false;
        this.f = false;
        this.h = (abnr) abax.a.n();
        this.o = abdx.a.n();
        this.p = abes.a.n();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    private final tqq f() {
        if (this.b.k()) {
            return this;
        }
        return null;
    }

    private final void g() {
        int iD;
        abnr abnrVar = this.h;
        int i = ((abax) abnrVar.b).i;
        zxi zxiVar = this.b;
        int iC = zxiVar.m() ? zxiVar.c() : 0;
        if (zxiVar.n() != null) {
            twq twqVar = this.g;
            PatternItem[] patternItemArrN = zxiVar.n();
            abnp abnpVar = this.p;
            float fA = zxiVar.a();
            float f = this.i;
            float fB = zxiVar.b();
            zkt.n(patternItemArrN, "patternItems");
            zkt.n(abnpVar, "strokeStyleBuilder");
            trh trhVar = new trh(fA, f);
            zkt.n(patternItemArrN, "patternItems");
            zkt.n(abnpVar, "strokeStyleBuilder");
            int iE = aaaw.e(fB);
            yfq yfqVarQ = yfq.q(new tpq((abes) abnpVar.q(), aacl.a(patternItemArrN, trhVar), null, null));
            tqv tqvVar = twqVar.b;
            tqo tqoVarB = tqvVar.b(iE, yfqVarQ);
            iD = ((txk) tqvVar.a(iC, iE, tqoVarB)).e;
            tqvVar.e(tqoVarB);
        } else {
            iD = this.c.d(this.g, this.p, iC, zxiVar.b());
        }
        abnrVar.t();
        abax abaxVar = (abax) abnrVar.b;
        abaxVar.b |= 128;
        abaxVar.i = iD;
        this.l.b((abax) abnrVar.q(), a, f(), 1.0f, new rgm(this, i, 19, null));
    }

    private final void h() {
        zxi zxiVar = this.b;
        boolean zL = zxiVar.l();
        abnp abnpVar = this.o;
        if (zL) {
            abnpVar.t();
            abdx abdxVar = (abdx) abnpVar.b;
            abdx abdxVar2 = abdx.a;
            abdxVar.b |= 4;
            abdxVar.h = 0;
            abnpVar.t();
            abdx abdxVar3 = (abdx) abnpVar.b;
            abdxVar3.b &= -9;
            abdxVar3.j = -1;
        } else {
            abnpVar.t();
            abdx abdxVar4 = (abdx) abnpVar.b;
            abdx abdxVar5 = abdx.a;
            abdxVar4.b |= 8;
            abdxVar4.j = 0;
            abnpVar.t();
            abdx abdxVar6 = (abdx) abnpVar.b;
            abdxVar6.b &= -5;
            abdxVar6.h = -1;
        }
        List list = this.m;
        zxiVar.h(list);
        List list2 = this.n;
        zxiVar.g(list2);
        zkt.e(!list.isEmpty(), "Outline cannot be empty");
        ArrayList<List> arrayList = new ArrayList(list2.size() + 1);
        arrayList.add(list);
        arrayList.addAll(list2);
        int size = 0;
        for (List list3 : arrayList) {
            zkt.n(list3, arrayList.toString());
            size += list3.size();
        }
        double[] dArr = new double[size + size];
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            List<LatLng> list4 = (List) arrayList.get(i2);
            if (!list4.isEmpty()) {
                for (LatLng latLng : list4) {
                    dArr[i] = latLng.latitude;
                    dArr[i + 1] = latLng.longitude;
                    i += 2;
                }
                arrayList2.add(Integer.valueOf(i / 2));
            }
        }
        aaav aaavVar = new aaav(dArr, arrayList2);
        abnp abnpVar2 = this.o;
        double[] dArr2 = aaavVar.a;
        abms abmsVarG = tss.g(dArr2);
        abnpVar2.t();
        abdx abdxVar7 = (abdx) abnpVar2.b;
        abmsVarG.getClass();
        abdxVar7.b |= 1;
        abdxVar7.c = abmsVarG;
        int length = dArr2.length >> 1;
        abnpVar2.t();
        abdx abdxVar8 = (abdx) abnpVar2.b;
        abdxVar8.b |= 2;
        abdxVar8.f = length;
        abnpVar2.t();
        ((abdx) abnpVar2.b).d = abnw.a;
        List list5 = aaavVar.b;
        abnpVar2.t();
        abdx abdxVar9 = (abdx) abnpVar2.b;
        abod abodVar = abdxVar9.d;
        if (!abodVar.c()) {
            abdxVar9.d = abnv.G(abodVar);
        }
        abmc.i(list5, abdxVar9.d);
        abnr abnrVar = this.h;
        abnrVar.t();
        abax abaxVar = (abax) abnrVar.b;
        abdx abdxVar10 = (abdx) abnpVar2.q();
        abax abaxVar2 = abax.a;
        abdxVar10.getClass();
        abaxVar.c = abdxVar10;
        abaxVar.b |= 1;
    }

    private final void i() {
        zxi zxiVar = this.b;
        int iD = zxiVar.m() ? zxiVar.d() : 0;
        abnp abnpVar = this.p;
        abnpVar.t();
        abes abesVar = (abes) abnpVar.b;
        abes abesVar2 = abes.a;
        abesVar.b |= 1;
        abesVar.c = iD;
    }

    private final void j() {
        int iRound = Math.round((this.b.a() / this.i) * 8.0f);
        abnp abnpVar = this.p;
        abnpVar.t();
        abes abesVar = (abes) abnpVar.b;
        abes abesVar2 = abes.a;
        abesVar.b |= 8;
        abesVar.e = iRound;
    }

    private final void k() {
        int iF = this.b.f();
        if (iF == 0) {
            abnr abnrVar = this.h;
            abnrVar.t();
            abax abaxVar = (abax) abnrVar.b;
            abax abaxVar2 = abax.a;
            abaxVar.f = 1;
            abaxVar.b |= 8;
            return;
        }
        if (iF == 1) {
            abnr abnrVar2 = this.h;
            abnrVar2.t();
            abax abaxVar3 = (abax) abnrVar2.b;
            abax abaxVar4 = abax.a;
            abaxVar3.f = 0;
            abaxVar3.b |= 8;
            return;
        }
        abnr abnrVar3 = this.h;
        if (iF != 2) {
            abnrVar3.t();
            abax abaxVar5 = (abax) abnrVar3.b;
            abax abaxVar6 = abax.a;
            abaxVar5.f = 1;
            abaxVar5.b |= 8;
            return;
        }
        abnrVar3.t();
        abax abaxVar7 = (abax) abnrVar3.b;
        abax abaxVar8 = abax.a;
        abaxVar7.f = 2;
        abaxVar7.b |= 8;
    }

    @Override // defpackage.zxe
    public final void a(Set set) {
        this.d.a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c(((Integer) it.next()).intValue());
        }
        set.clear();
    }

    @Override // defpackage.tqq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.j.execute(new aabr(this, 4));
    }

    @Override // defpackage.zxe
    public final void c(int i) {
        this.d.a();
        zkt.g(this.e, "init() should be called first");
        if (this.f) {
            return;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
                h();
                this.l.b((abax) this.h.q(), a, f(), 1.0f, null);
                return;
            case 3:
                j();
                g();
                return;
            case 4:
            case 6:
                i();
                g();
                return;
            case 5:
            case 7:
            case 11:
                g();
                return;
            case 8:
            case 9:
            default:
                throw new IllegalArgumentException(a.bn(i, "Invalid notifyPropertyUpdated(", ")"));
            case 10:
                k();
                this.l.b((abax) this.h.q(), a, f(), 1.0f, null);
                return;
            case 12:
                this.l.c(f());
                return;
        }
    }

    @Override // defpackage.zxe
    public final void d() {
        this.d.a();
        zkt.g(this.e, "init() should be called first");
        if (this.f) {
            return;
        }
        this.c.c(this.g, ((abax) this.h.b).i);
        this.l.a();
        this.f = true;
    }

    public final void e() {
        zkt.h((this.e || this.f) ? false : true, "isInitialized=%s isRemoved=%s", Boolean.valueOf(this.e), Boolean.valueOf(this.f));
        abnr abnrVar = this.h;
        int i = this.k;
        abnrVar.t();
        abax abaxVar = (abax) abnrVar.b;
        abax abaxVar2 = abax.a;
        abaxVar.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        abaxVar.k = i;
        abnrVar.t();
        abax abaxVar3 = (abax) abnrVar.b;
        abaxVar3.b |= 4;
        abaxVar3.e = true;
        h();
        k();
        j();
        i();
        g();
        this.e = true;
    }
}
