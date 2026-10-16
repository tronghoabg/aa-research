package R5;

import J5.w;
import M2.u;
import org.apache.tika.fork.ForkServer;
import u6.v;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final w f10268a;

    /* renamed from: d, reason: collision with root package name */
    public p f10271d;

    /* renamed from: e, reason: collision with root package name */
    public e f10272e;

    /* renamed from: f, reason: collision with root package name */
    public int f10273f;

    /* renamed from: g, reason: collision with root package name */
    public int f10274g;

    /* renamed from: h, reason: collision with root package name */
    public int f10275h;

    /* renamed from: i, reason: collision with root package name */
    public int f10276i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10278l;

    /* renamed from: b, reason: collision with root package name */
    public final u f10269b = new u(1);

    /* renamed from: c, reason: collision with root package name */
    public final Y4.b f10270c = new Y4.b();

    /* renamed from: j, reason: collision with root package name */
    public final Y4.b f10277j = new Y4.b(1);
    public final Y4.b k = new Y4.b();

    public g(w wVar, p pVar, e eVar) {
        this.f10268a = wVar;
        this.f10271d = pVar;
        this.f10272e = eVar;
        this.f10271d = pVar;
        this.f10272e = eVar;
        wVar.a(pVar.f10360a.f10350f);
        d();
    }

    public final o a() {
        if (!this.f10278l) {
            return null;
        }
        u uVar = this.f10269b;
        e eVar = (e) uVar.f7449o;
        int i5 = v.f46721a;
        int i10 = eVar.f10261a;
        o oVar = (o) uVar.f7450p;
        if (oVar == null) {
            oVar = this.f10271d.f10360a.k[i10];
        }
        if (oVar == null || !oVar.f10355a) {
            return null;
        }
        return oVar;
    }

    public final boolean b() {
        this.f10273f++;
        if (!this.f10278l) {
            return false;
        }
        int i5 = this.f10274g + 1;
        this.f10274g = i5;
        int[] iArr = this.f10269b.f7441f;
        int i10 = this.f10275h;
        if (i5 != iArr[i10]) {
            return true;
        }
        this.f10275h = i10 + 1;
        this.f10274g = 0;
        return false;
    }

    public final int c(int i5, int i10) {
        Y4.b bVar;
        o oVarA = a();
        if (oVarA == null) {
            return 0;
        }
        u uVar = this.f10269b;
        int length = oVarA.f10358d;
        if (length != 0) {
            bVar = (Y4.b) uVar.f7451q;
        } else {
            int i11 = v.f46721a;
            byte[] bArr = oVarA.f10359e;
            int length2 = bArr.length;
            Y4.b bVar2 = this.k;
            bVar2.y(length2, bArr);
            length = bArr.length;
            bVar = bVar2;
        }
        boolean z2 = uVar.f7445j && uVar.k[this.f10273f];
        boolean z10 = z2 || i10 != 0;
        Y4.b bVar3 = this.f10277j;
        bVar3.f16679a[0] = (byte) ((z10 ? 128 : 0) | length);
        bVar3.A(0);
        w wVar = this.f10268a;
        wVar.e(1, bVar3);
        wVar.e(length, bVar);
        if (!z10) {
            return length + 1;
        }
        Y4.b bVar4 = this.f10270c;
        if (!z2) {
            bVar4.x(8);
            byte[] bArr2 = bVar4.f16679a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & 255);
            bArr2[4] = (byte) ((i5 >> 24) & 255);
            bArr2[5] = (byte) ((i5 >> 16) & 255);
            bArr2[6] = (byte) ((i5 >> 8) & 255);
            bArr2[7] = (byte) (i5 & 255);
            wVar.e(8, bVar4);
            return length + 9;
        }
        Y4.b bVar5 = (Y4.b) uVar.f7451q;
        int iV = bVar5.v();
        bVar5.B(-2);
        int i12 = (iV * 6) + 2;
        if (i10 != 0) {
            bVar4.x(i12);
            byte[] bArr3 = bVar4.f16679a;
            bVar5.c(0, i12, bArr3);
            int i13 = (((bArr3[2] & ForkServer.ERROR) << 8) | (bArr3[3] & ForkServer.ERROR)) + i10;
            bArr3[2] = (byte) ((i13 >> 8) & 255);
            bArr3[3] = (byte) (i13 & 255);
        } else {
            bVar4 = bVar5;
        }
        wVar.e(i12, bVar4);
        return length + 1 + i12;
    }

    public final void d() {
        u uVar = this.f10269b;
        uVar.f7438c = 0;
        uVar.f7447m = 0L;
        uVar.f7448n = false;
        uVar.f7445j = false;
        uVar.f7446l = false;
        uVar.f7450p = null;
        this.f10273f = 0;
        this.f10275h = 0;
        this.f10274g = 0;
        this.f10276i = 0;
        this.f10278l = false;
    }
}
