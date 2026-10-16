package a2;

import N1.C0764m;
import N1.C0765n;
import N1.InterfaceC0758g;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
import ka.AbstractC3256n;
import s2.B;
import s2.C;

/* loaded from: classes.dex */
public final class q implements C {

    /* renamed from: f, reason: collision with root package name */
    public static final C0765n f17254f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0765n f17255g;

    /* renamed from: a, reason: collision with root package name */
    public final C f17256a;

    /* renamed from: b, reason: collision with root package name */
    public final C0765n f17257b;

    /* renamed from: c, reason: collision with root package name */
    public C0765n f17258c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f17259d;

    /* renamed from: e, reason: collision with root package name */
    public int f17260e;

    static {
        C0764m c0764m = new C0764m();
        c0764m.f8194m = N1.C.m("application/id3");
        f17254f = new C0765n(c0764m);
        C0764m c0764m2 = new C0764m();
        c0764m2.f8194m = N1.C.m("application/x-emsg");
        f17255g = new C0765n(c0764m2);
    }

    public q(C c10, int i5) {
        this.f17256a = c10;
        if (i5 == 1) {
            this.f17257b = f17254f;
        } else {
            if (i5 != 3) {
                throw new IllegalArgumentException(AbstractC3256n.g(i5, "Unknown metadataType: "));
            }
            this.f17257b = f17255g;
        }
        this.f17259d = new byte[0];
        this.f17260e = 0;
    }

    @Override // s2.C
    public final void a(long j8, int i5, int i10, int i11, B b5) {
        this.f17258c.getClass();
        int i12 = this.f17260e - i11;
        Q1.o oVar = new Q1.o(Arrays.copyOfRange(this.f17259d, i12 - i10, i12));
        byte[] bArr = this.f17259d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f17260e = i11;
        String str = this.f17258c.f8232n;
        C0765n c0765n = this.f17257b;
        if (!Objects.equals(str, c0765n.f8232n)) {
            if (!"application/x-emsg".equals(this.f17258c.f8232n)) {
                Q1.k.w("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f17258c.f8232n);
                return;
            }
            D2.a aVarO = C2.b.O(oVar);
            C0765n c0765nA = aVarO.a();
            String str2 = c0765n.f8232n;
            if (c0765nA == null || !Objects.equals(str2, c0765nA.f8232n)) {
                Q1.k.w("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + aVarO.a());
                return;
            }
            byte[] bArrB = aVarO.b();
            bArrB.getClass();
            oVar = new Q1.o(bArrB);
        }
        int iA = oVar.a();
        C c10 = this.f17256a;
        c10.e(iA, oVar);
        c10.a(j8, i5, iA, 0, b5);
    }

    @Override // s2.C
    public final int b(InterfaceC0758g interfaceC0758g, int i5, boolean z2) throws EOFException {
        int i10 = this.f17260e + i5;
        byte[] bArr = this.f17259d;
        if (bArr.length < i10) {
            this.f17259d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int i11 = interfaceC0758g.read(this.f17259d, this.f17260e, i5);
        if (i11 != -1) {
            this.f17260e += i11;
            return i11;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // s2.C
    public final void c(C0765n c0765n) {
        this.f17258c = c0765n;
        this.f17256a.c(this.f17257b);
    }

    @Override // s2.C
    public final int d(InterfaceC0758g interfaceC0758g, int i5, boolean z2) {
        return b(interfaceC0758g, i5, z2);
    }

    @Override // s2.C
    public final /* synthetic */ void e(int i5, Q1.o oVar) {
        pd.f.b(this, oVar, i5);
    }

    @Override // s2.C
    public final void f(Q1.o oVar, int i5, int i10) {
        int i11 = this.f17260e + i5;
        byte[] bArr = this.f17259d;
        if (bArr.length < i11) {
            this.f17259d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        oVar.f(this.f17260e, i5, this.f17259d);
        this.f17260e += i5;
    }
}
