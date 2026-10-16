package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class hsq extends iec implements Cloneable {
    private List A;
    private hsq B;
    private hsq C;
    private Float D;
    private boolean E = true;
    private boolean F;
    private boolean G;
    public final hss a;
    private final Context v;
    private final Class w;
    private final hsf x;
    private hst y;
    private Object z;

    static {
    }

    protected hsq(hrt hrtVar, hss hssVar, Class cls, Context context) {
        this.a = hssVar;
        this.w = cls;
        this.v = context;
        hsf hsfVar = hssVar.a.b;
        hst hstVar = (hst) hsfVar.c.get(cls);
        if (hstVar == null) {
            for (Map.Entry entry : hsfVar.c.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    hstVar = (hst) entry.getValue();
                }
            }
        }
        this.y = hstVar == null ? hsf.a : hstVar;
        this.x = hrtVar.b;
        Iterator it = hssVar.d.iterator();
        while (it.hasNext()) {
            a((iej) it.next());
        }
        n(hssVar.g());
    }

    private final hsq Z(hsq hsqVar) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        Context context = this.v;
        hsq hsqVar2 = (hsq) hsqVar.N(context.getTheme());
        ConcurrentMap concurrentMap = ifh.a;
        String packageName = context.getPackageName();
        hui huiVar = (hui) ifh.a.get(packageName);
        if (huiVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            ifj ifjVar = new ifj(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            huiVar = (hui) ifh.a.putIfAbsent(packageName, ifjVar);
            if (huiVar == null) {
                huiVar = ifjVar;
            }
        }
        return (hsq) hsqVar2.M(new ifg(context.getResources().getConfiguration().uiMode & 48, huiVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ief aa(Object obj, iev ievVar, iej iejVar, ieh iehVar, hst hstVar, hsh hshVar, int i, int i2, iec iecVar, Executor executor) {
        ieh iehVar2;
        ieh iedVar;
        ief iefVarAb;
        hsh hshVar2;
        hsq hsqVar = this;
        iec iecVar2 = iecVar;
        if (hsqVar.C != null) {
            iedVar = new ied(obj, iehVar);
            iehVar2 = iedVar;
        } else {
            iehVar2 = null;
            iedVar = iehVar;
        }
        hsq hsqVar2 = hsqVar.B;
        if (hsqVar2 == null) {
            iefVarAb = hsqVar.ab(obj, ievVar, iejVar, iecVar2, iedVar, hstVar, hshVar, i, i2, executor);
        } else {
            if (hsqVar.G) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            hst hstVar2 = true == hsqVar2.E ? hstVar : hsqVar2.y;
            if (super.T(8)) {
                hshVar2 = hsqVar2.d;
            } else {
                int i3 = hsp.b[hshVar.ordinal()];
                if (i3 == 1) {
                    hshVar2 = hsh.c;
                } else if (i3 == 2) {
                    hshVar2 = hsh.b;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(hsqVar.d))));
                    }
                    hshVar2 = hsh.a;
                }
            }
            hsh hshVar3 = hshVar2;
            hsq hsqVar3 = hsqVar.B;
            int i4 = hsqVar3.k;
            int i5 = hsqVar3.j;
            if (ify.j(i, i2) && !hsqVar.B.U()) {
                i4 = iecVar2.k;
                i5 = iecVar2.j;
            }
            int i6 = i5;
            ien ienVar = new ien(obj, iedVar);
            ief iefVarAb2 = hsqVar.ab(obj, ievVar, iejVar, iecVar2, ienVar, hstVar, hshVar, i, i2, executor);
            hsqVar.G = true;
            hsq hsqVar4 = hsqVar.B;
            ief iefVarAa = hsqVar4.aa(obj, ievVar, iejVar, ienVar, hstVar2, hshVar3, i4, i6, hsqVar4, executor);
            ien ienVar2 = ienVar;
            hsqVar.G = false;
            ienVar2.a = iefVarAb2;
            ienVar2.b = iefVarAa;
            iecVar2 = iecVar;
            hsqVar = hsqVar;
            iefVarAb = ienVar2;
        }
        ief iefVar = iefVarAb;
        if (iehVar2 == null) {
            return iefVar;
        }
        hsq hsqVar5 = hsqVar.C;
        int i7 = hsqVar5.k;
        int i8 = hsqVar5.j;
        if (ify.j(i, i2) && !hsqVar.C.U()) {
            i7 = iecVar2.k;
            i8 = iecVar2.j;
        }
        hsq hsqVar6 = hsqVar.C;
        ied iedVar2 = iehVar2;
        ief iefVarAa2 = hsqVar6.aa(obj, ievVar, iejVar, iedVar2, hsqVar6.y, hsqVar6.d, i7, i8, hsqVar6, executor);
        iedVar2.a = iefVar;
        iedVar2.b = iefVarAa2;
        return iedVar2;
    }

    private final ief ab(Object obj, iev ievVar, iej iejVar, iec iecVar, ieh iehVar, hst hstVar, hsh hshVar, int i, int i2, Executor executor) {
        Object obj2 = this.z;
        List list = this.A;
        iff iffVar = hstVar.a;
        Context context = this.v;
        Class cls = this.w;
        hsf hsfVar = this.x;
        return new iem(context, hsfVar, obj, obj2, cls, iecVar, i, i2, hshVar, ievVar, iejVar, list, iehVar, hsfVar.d, iffVar, executor);
    }

    public hsq a(iej iejVar) {
        if (this.s) {
            return o().a(iejVar);
        }
        if (iejVar != null) {
            if (this.A == null) {
                this.A = new ArrayList();
            }
            this.A.add(iejVar);
        }
        W();
        return this;
    }

    @Override // defpackage.iec
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public hsq n(iec iecVar) {
        a.al(iecVar, "Argument must not be null");
        return (hsq) super.n(iecVar);
    }

    @Override // defpackage.iec
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public hsq o() {
        hsq hsqVar = (hsq) super.o();
        hsqVar.y = hsqVar.y.clone();
        List list = hsqVar.A;
        if (list != null) {
            hsqVar.A = new ArrayList(list);
        }
        hsq hsqVar2 = hsqVar.B;
        if (hsqVar2 != null) {
            hsqVar.B = hsqVar2.o();
        }
        hsq hsqVar3 = hsqVar.C;
        if (hsqVar3 != null) {
            hsqVar.C = hsqVar3.o();
        }
        return hsqVar;
    }

    public hsq d(iej iejVar) {
        if (this.s) {
            return o().d(iejVar);
        }
        this.A = null;
        return a(iejVar);
    }

    public hsq e(Bitmap bitmap) {
        return k(bitmap).n(iek.c(hwf.b));
    }

    @Override // defpackage.iec
    public final boolean equals(Object obj) {
        if (obj instanceof hsq) {
            hsq hsqVar = (hsq) obj;
            if (super.equals(hsqVar) && Objects.equals(this.w, hsqVar.w) && this.y.equals(hsqVar.y) && Objects.equals(this.z, hsqVar.z) && Objects.equals(this.A, hsqVar.A) && Objects.equals(this.B, hsqVar.B) && Objects.equals(this.C, hsqVar.C)) {
                Float f = hsqVar.D;
                if (Objects.equals(null, null) && this.E == hsqVar.E && this.F == hsqVar.F) {
                    return true;
                }
            }
        }
        return false;
    }

    public hsq f(Uri uri) {
        hsq hsqVarK = k(uri);
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? hsqVarK : Z(hsqVarK);
    }

    public hsq g(Integer num) {
        return Z(k(num));
    }

    public hsq h(Object obj) {
        return k(obj);
    }

    @Override // defpackage.iec
    public final int hashCode() {
        return (((ify.c(null, ify.c(this.C, ify.c(this.B, ify.c(this.A, ify.c(this.z, ify.c(this.y, ify.c(this.w, super.hashCode()))))))) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0);
    }

    public hsq i(String str) {
        return k(str);
    }

    public hsq j(byte[] bArr) {
        hsq hsqVarK = k(bArr);
        if (!super.T(4)) {
            hsqVarK = hsqVarK.n(iek.c(hwf.b));
        }
        if (super.T(256)) {
            return hsqVarK;
        }
        if (iek.a == null) {
            iek.a = (iek) ((iek) new iek().X()).t();
        }
        return hsqVarK.n(iek.a);
    }

    public final hsq k(Object obj) {
        if (this.s) {
            return o().k(obj);
        }
        this.z = obj;
        this.F = true;
        W();
        return this;
    }

    public hsq l(hsq hsqVar) {
        if (this.s) {
            return o().l(hsqVar);
        }
        this.B = hsqVar;
        W();
        return this;
    }

    public hsq m(hst hstVar) {
        if (this.s) {
            return o().m(hstVar);
        }
        this.y = hstVar;
        this.E = false;
        W();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.ify.f()
            java.lang.String r0 = "Argument must not be null"
            defpackage.a.al(r4, r0)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = super.T(r0)
            if (r0 != 0) goto L4e
            boolean r0 = r3.n
            if (r0 == 0) goto L4e
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4e
            int[] r0 = defpackage.hsp.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L45;
                case 2: goto L3c;
                case 3: goto L33;
                case 4: goto L33;
                case 5: goto L33;
                case 6: goto L2a;
                default: goto L29;
            }
        L29:
            goto L4e
        L2a:
            iec r0 = r3.o()
            iec r0 = r0.D()
            goto L4f
        L33:
            iec r0 = r3.o()
            iec r0 = r0.E()
            goto L4f
        L3c:
            iec r0 = r3.o()
            iec r0 = r0.D()
            goto L4f
        L45:
            iec r0 = r3.o()
            iec r0 = r0.C()
            goto L4f
        L4e:
            r0 = r3
        L4f:
            hsf r1 = r3.x
            java.lang.Class r2 = r3.w
            fxy r1 = r1.h
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L63
            iep r1 = new iep
            r1.<init>(r4)
            goto L70
        L63:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L77
            ies r1 = new ies
            r1.<init>(r4)
        L70:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.ifq.a
            r3.r(r1, r4, r0, r2)
            return
        L77:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unhandled class: "
            java.lang.String r0 = ", try .as*(Class).transcode(ResourceTranscoder)"
            java.lang.String r4 = defpackage.a.bW(r2, r4, r0)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsq.p(android.widget.ImageView):void");
    }

    public final void q(iev ievVar) {
        r(ievVar, null, this, ifq.a);
    }

    public final void r(iev ievVar, iej iejVar, iec iecVar, Executor executor) {
        a.al(ievVar, "Argument must not be null");
        if (!this.F) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        ief iefVarAa = aa(new Object(), ievVar, iejVar, null, this.y, iecVar.d, iecVar.k, iecVar.j, iecVar, executor);
        ief iefVarD = ievVar.d();
        if (!iefVarAa.m(iefVarD) || (!iecVar.i && iefVarD.l())) {
            hss hssVar = this.a;
            hssVar.i(ievVar);
            ievVar.h(iefVarAa);
            hssVar.p(ievVar, iefVarAa);
            return;
        }
        a.al(iefVarD, "Argument must not be null");
        if (iefVarD.n()) {
            return;
        }
        iefVarD.b();
    }

    public final iei s() {
        iei ieiVar = new iei();
        r(ieiVar, ieiVar, this, ifq.b);
        return ieiVar;
    }
}
