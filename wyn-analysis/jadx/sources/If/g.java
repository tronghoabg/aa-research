package If;

import A7.AbstractC0279p0;
import Ef.H;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import ef.C2515C;
import java.util.ArrayList;
import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public abstract class g implements w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3108h f5473a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5474b;

    /* renamed from: c, reason: collision with root package name */
    public final Gf.a f5475c;

    public g(InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        this.f5473a = interfaceC3108h;
        this.f5474b = i5;
        this.f5475c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // If.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Hf.InterfaceC0602l a(jf.InterfaceC3108h r5, int r6, Gf.a r7) {
        /*
            r4 = this;
            jf.h r0 = r4.f5473a
            jf.h r5 = r5.plus(r0)
            Gf.a r1 = Gf.a.f4780a
            Gf.a r2 = r4.f5475c
            int r3 = r4.f5474b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.AbstractC3340k.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            If.g r5 = r4.e(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: If.g.a(jf.h, int, Gf.a):Hf.l");
    }

    @Override // Hf.InterfaceC0602l
    public Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        Object objL = H.l(new C0624e(interfaceC0603m, this, null), interfaceC3103c);
        return objL == kf.a.f39711a ? objL : C2515C.f34653a;
    }

    public abstract Object d(Gf.t tVar, InterfaceC3103c interfaceC3103c);

    public abstract g e(InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar);

    public InterfaceC0602l f() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C3109i c3109i = C3109i.f38759a;
        InterfaceC3108h interfaceC3108h = this.f5473a;
        if (interfaceC3108h != c3109i) {
            arrayList.add("context=" + interfaceC3108h);
        }
        int i5 = this.f5474b;
        if (i5 != -3) {
            arrayList.add("capacity=" + i5);
        }
        Gf.a aVar = Gf.a.f4780a;
        Gf.a aVar2 = this.f5475c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return AbstractC0279p0.n(sb2, ff.o.w0(arrayList, ", ", null, null, null, 62), ']');
    }
}
