package x0;

import U8.v0;
import kotlin.jvm.internal.AbstractC3340k;
import t0.C4061i;
import t0.t;
import t0.y;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4433c implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static int f47571e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final t f47572a;

    /* renamed from: b, reason: collision with root package name */
    public final t f47573b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.d f47574c;

    /* renamed from: d, reason: collision with root package name */
    public final L0.i f47575d;

    public C4433c(t subtreeRoot, t tVar) {
        AbstractC3340k.e(subtreeRoot, "subtreeRoot");
        this.f47572a = subtreeRoot;
        this.f47573b = tVar;
        this.f47575d = subtreeRoot.f45525p;
        y yVarG = v0.G(tVar);
        C4061i c4061i = subtreeRoot.f45533x;
        this.f47574c = (c4061i.S() && yVarG.S()) ? c4061i.U(yVarG, true) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(x0.C4433c r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC3340k.e(r9, r0)
            r0 = 1
            d0.d r1 = r8.f47574c
            if (r1 != 0) goto Lc
            goto Lb7
        Lc:
            d0.d r2 = r9.f47574c
            if (r2 != 0) goto L12
            goto Lb8
        L12:
            int r3 = x0.C4433c.f47571e
            float r4 = r1.f33938b
            float r5 = r2.f33938b
            r6 = 0
            if (r3 != r0) goto L2e
            float r3 = r1.f33940d
            float r3 = r3 - r5
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L24
            goto Lb8
        L24:
            float r3 = r2.f33940d
            float r3 = r4 - r3
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 < 0) goto L2e
            goto Lb7
        L2e:
            L0.i r3 = L0.i.f6806a
            L0.i r7 = r8.f47575d
            if (r7 != r3) goto L42
            float r3 = r1.f33937a
            float r7 = r2.f33937a
            float r3 = r3 - r7
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L3e
            goto L4b
        L3e:
            if (r3 >= 0) goto Lb7
            goto Lb8
        L42:
            float r3 = r1.f33939c
            float r7 = r2.f33939c
            float r3 = r3 - r7
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto Lb5
        L4b:
            float r4 = r4 - r5
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto Lb2
            float r3 = r1.b()
            float r4 = r2.b()
            float r3 = r3 - r4
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto Laf
            float r1 = r1.c()
            float r2 = r2.c()
            float r1 = r1 - r2
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto Lac
            t0.t r1 = r8.f47573b
            t0.y r2 = U8.v0.G(r1)
            d0.d r2 = Fe.g.q(r2)
            t0.t r3 = r9.f47573b
            t0.y r4 = U8.v0.G(r3)
            d0.d r4 = Fe.g.q(r4)
            x0.b r5 = new x0.b
            r6 = 0
            r5.<init>(r2, r6)
            t0.t r1 = U8.v0.E(r1, r5)
            x0.b r2 = new x0.b
            r5 = 1
            r2.<init>(r4, r5)
            t0.t r2 = U8.v0.E(r3, r2)
            if (r1 == 0) goto La9
            if (r2 == 0) goto La9
            x0.c r0 = new x0.c
            t0.t r3 = r8.f47572a
            r0.<init>(r3, r1)
            x0.c r1 = new x0.c
            t0.t r9 = r9.f47572a
            r1.<init>(r9, r2)
            int r9 = r0.compareTo(r1)
            return r9
        La9:
            if (r1 == 0) goto Lb8
            goto Lb7
        Lac:
            if (r1 >= 0) goto Lb8
            goto Lb7
        Laf:
            if (r3 >= 0) goto Lb8
            goto Lb7
        Lb2:
            if (r3 >= 0) goto Lb7
            goto Lb8
        Lb5:
            if (r3 >= 0) goto Lb8
        Lb7:
            return r0
        Lb8:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C4433c.compareTo(x0.c):int");
    }
}
