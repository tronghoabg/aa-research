package i0;

import ba.C1521a;
import e0.C2454f;
import g0.InterfaceC2663d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2823a extends AbstractC2822B {

    /* renamed from: b, reason: collision with root package name */
    public float[] f36574b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f36575c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public List f36576d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f36577e;

    /* renamed from: f, reason: collision with root package name */
    public C2454f f36578f;

    /* renamed from: g, reason: collision with root package name */
    public C8.i f36579g;

    /* renamed from: h, reason: collision with root package name */
    public A0.p f36580h;

    /* renamed from: i, reason: collision with root package name */
    public String f36581i;

    /* renamed from: j, reason: collision with root package name */
    public float f36582j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public float f36583l;

    /* renamed from: m, reason: collision with root package name */
    public float f36584m;

    /* renamed from: n, reason: collision with root package name */
    public float f36585n;

    /* renamed from: o, reason: collision with root package name */
    public float f36586o;

    /* renamed from: p, reason: collision with root package name */
    public float f36587p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f36588q;

    public C2823a() {
        int i5 = I.f36530a;
        this.f36576d = ff.v.f35432a;
        this.f36577e = true;
        this.f36581i = "";
        this.f36584m = 1.0f;
        this.f36585n = 1.0f;
        this.f36588q = true;
    }

    @Override // i0.AbstractC2822B
    public final void a(InterfaceC2663d interfaceC2663d) {
        AbstractC3340k.e(interfaceC2663d, "<this>");
        if (this.f36588q) {
            float[] fArrH = this.f36574b;
            if (fArrH == null) {
                fArrH = e0.z.h();
                this.f36574b = fArrH;
            } else {
                e0.z.o(fArrH);
            }
            e0.z.v(fArrH, this.f36586o + this.k, this.f36587p + this.f36583l);
            double d3 = (this.f36582j * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d3);
            float fSin = (float) Math.sin(d3);
            float f10 = fArrH[0];
            float f11 = fArrH[4];
            float f12 = (fSin * f11) + (fCos * f10);
            float f13 = -fSin;
            float f14 = (f11 * fCos) + (f10 * f13);
            float f15 = fArrH[1];
            float f16 = fArrH[5];
            float f17 = (fSin * f16) + (fCos * f15);
            float f18 = (f16 * fCos) + (f15 * f13);
            float f19 = fArrH[2];
            float f20 = fArrH[6];
            float f21 = (fSin * f20) + (fCos * f19);
            float f22 = (f20 * fCos) + (f19 * f13);
            float f23 = fArrH[3];
            float f24 = fArrH[7];
            float f25 = (fSin * f24) + (fCos * f23);
            float f26 = (fCos * f24) + (f13 * f23);
            fArrH[0] = f12;
            fArrH[1] = f17;
            fArrH[2] = f21;
            fArrH[3] = f25;
            fArrH[4] = f14;
            fArrH[5] = f18;
            fArrH[6] = f22;
            fArrH[7] = f26;
            float f27 = this.f36584m;
            float f28 = this.f36585n;
            fArrH[0] = f12 * f27;
            fArrH[1] = f17 * f27;
            fArrH[2] = f21 * f27;
            fArrH[3] = f25 * f27;
            fArrH[4] = f14 * f28;
            fArrH[5] = f18 * f28;
            fArrH[6] = f22 * f28;
            fArrH[7] = f26 * f28;
            fArrH[8] = fArrH[8] * 1.0f;
            fArrH[9] = fArrH[9] * 1.0f;
            fArrH[10] = fArrH[10] * 1.0f;
            fArrH[11] = fArrH[11] * 1.0f;
            e0.z.v(fArrH, -this.k, -this.f36583l);
            this.f36588q = false;
        }
        if (this.f36577e) {
            if (!this.f36576d.isEmpty()) {
                C8.i iVar = this.f36579g;
                if (iVar == null) {
                    iVar = new C8.i(13);
                    this.f36579g = iVar;
                } else {
                    ((ArrayList) iVar.f1939b).clear();
                }
                C2454f c2454fE = this.f36578f;
                if (c2454fE == null) {
                    c2454fE = e0.z.e();
                    this.f36578f = c2454fE;
                } else {
                    c2454fE.c();
                }
                List nodes = this.f36576d;
                AbstractC3340k.e(nodes, "nodes");
                ((ArrayList) iVar.f1939b).addAll(nodes);
                iVar.y(c2454fE);
            }
            this.f36577e = false;
        }
        C1521a c1521aU = interfaceC2663d.u();
        long jY = c1521aU.y();
        c1521aU.v().m();
        ad.L l10 = (ad.L) c1521aU.f19414b;
        float[] fArr = this.f36574b;
        C1521a c1521a = (C1521a) l10.f17515b;
        if (fArr != null) {
            c1521a.v().p(fArr);
        }
        C2454f c2454f = this.f36578f;
        if (!this.f36576d.isEmpty() && c2454f != null) {
            c1521a.v().l(c2454f);
        }
        ArrayList arrayList = this.f36575c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC2822B) arrayList.get(i5)).a(interfaceC2663d);
        }
        c1521aU.v().restore();
        c1521aU.J(jY);
    }

    @Override // i0.AbstractC2822B
    public final tf.a b() {
        return this.f36580h;
    }

    @Override // i0.AbstractC2822B
    public final void d(A0.p pVar) {
        this.f36580h = pVar;
        ArrayList arrayList = this.f36575c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC2822B) arrayList.get(i5)).d(pVar);
        }
    }

    public final void e(int i5, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList = this.f36575c;
            if (i5 < arrayList.size()) {
                ((AbstractC2822B) arrayList.get(i5)).d(null);
                arrayList.remove(i5);
            }
        }
        c();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f36581i);
        ArrayList arrayList = this.f36575c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC2822B abstractC2822B = (AbstractC2822B) arrayList.get(i5);
            sb2.append("\t");
            sb2.append(abstractC2822B.toString());
            sb2.append("\n");
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "sb.toString()");
        return string;
    }
}
