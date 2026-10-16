package M2;

import Q1.x;
import org.apache.tika.fork.ForkServer;
import s2.C;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final C f7324a;

    /* renamed from: d, reason: collision with root package name */
    public v f7327d;

    /* renamed from: e, reason: collision with root package name */
    public h f7328e;

    /* renamed from: f, reason: collision with root package name */
    public int f7329f;

    /* renamed from: g, reason: collision with root package name */
    public int f7330g;

    /* renamed from: h, reason: collision with root package name */
    public int f7331h;

    /* renamed from: i, reason: collision with root package name */
    public int f7332i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7334l;

    /* renamed from: b, reason: collision with root package name */
    public final u f7325b = new u(0);

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f7326c = new Q1.o();

    /* renamed from: j, reason: collision with root package name */
    public final Q1.o f7333j = new Q1.o(1);
    public final Q1.o k = new Q1.o();

    public k(C c10, v vVar, h hVar) {
        this.f7324a = c10;
        this.f7327d = vVar;
        this.f7328e = hVar;
        this.f7327d = vVar;
        this.f7328e = hVar;
        c10.c(vVar.f7452a.f7426g);
        e();
    }

    public final int a() {
        int i5 = !this.f7334l ? this.f7327d.f7458g[this.f7329f] : this.f7325b.f7444i[this.f7329f] ? 1 : 0;
        return b() != null ? i5 | 1073741824 : i5;
    }

    public final t b() {
        if (this.f7334l) {
            u uVar = this.f7325b;
            h hVar = (h) uVar.f7449o;
            int i5 = x.f9724a;
            int i10 = hVar.f7316a;
            t tVar = (t) uVar.f7450p;
            if (tVar == null) {
                t[] tVarArr = this.f7327d.f7452a.f7430l;
                tVar = tVarArr == null ? null : tVarArr[i10];
            }
            if (tVar != null && tVar.f7431a) {
                return tVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f7329f++;
        if (!this.f7334l) {
            return false;
        }
        int i5 = this.f7330g + 1;
        this.f7330g = i5;
        int[] iArr = this.f7325b.f7441f;
        int i10 = this.f7331h;
        if (i5 != iArr[i10]) {
            return true;
        }
        this.f7331h = i10 + 1;
        this.f7330g = 0;
        return false;
    }

    public final int d(int i5, int i10) {
        Q1.o oVar;
        t tVarB = b();
        if (tVarB == null) {
            return 0;
        }
        u uVar = this.f7325b;
        int length = tVarB.f7434d;
        if (length != 0) {
            oVar = (Q1.o) uVar.f7451q;
        } else {
            int i11 = x.f9724a;
            byte[] bArr = tVarB.f7435e;
            int length2 = bArr.length;
            Q1.o oVar2 = this.k;
            oVar2.E(length2, bArr);
            length = bArr.length;
            oVar = oVar2;
        }
        boolean z2 = uVar.f7445j && uVar.k[this.f7329f];
        boolean z10 = z2 || i10 != 0;
        Q1.o oVar3 = this.f7333j;
        oVar3.f9702a[0] = (byte) ((z10 ? 128 : 0) | length);
        oVar3.G(0);
        C c10 = this.f7324a;
        c10.f(oVar3, 1, 1);
        c10.f(oVar, length, 1);
        if (!z10) {
            return length + 1;
        }
        Q1.o oVar4 = this.f7326c;
        if (!z2) {
            oVar4.D(8);
            byte[] bArr2 = oVar4.f9702a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & 255);
            bArr2[4] = (byte) ((i5 >> 24) & 255);
            bArr2[5] = (byte) ((i5 >> 16) & 255);
            bArr2[6] = (byte) ((i5 >> 8) & 255);
            bArr2[7] = (byte) (i5 & 255);
            c10.f(oVar4, 8, 1);
            return length + 9;
        }
        Q1.o oVar5 = (Q1.o) uVar.f7451q;
        int iA = oVar5.A();
        oVar5.H(-2);
        int i12 = (iA * 6) + 2;
        if (i10 != 0) {
            oVar4.D(i12);
            byte[] bArr3 = oVar4.f9702a;
            oVar5.f(0, i12, bArr3);
            int i13 = (((bArr3[2] & ForkServer.ERROR) << 8) | (bArr3[3] & ForkServer.ERROR)) + i10;
            bArr3[2] = (byte) ((i13 >> 8) & 255);
            bArr3[3] = (byte) (i13 & 255);
        } else {
            oVar4 = oVar5;
        }
        c10.f(oVar4, i12, 1);
        return length + 1 + i12;
    }

    public final void e() {
        u uVar = this.f7325b;
        uVar.f7438c = 0;
        uVar.f7447m = 0L;
        uVar.f7448n = false;
        uVar.f7445j = false;
        uVar.f7446l = false;
        uVar.f7450p = null;
        this.f7329f = 0;
        this.f7331h = 0;
        this.f7330g = 0;
        this.f7332i = 0;
        this.f7334l = false;
    }
}
