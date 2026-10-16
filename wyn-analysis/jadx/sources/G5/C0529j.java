package G5;

import java.util.Arrays;
import l8.j0;

/* renamed from: G5.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0529j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0529j f4416c = new C0529j(8, new int[]{2});

    /* renamed from: d, reason: collision with root package name */
    public static final C0529j f4417d = new C0529j(8, new int[]{2, 5, 6});

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f4418e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4420b;

    static {
        E4.n nVar = new E4.n(4, 18);
        nVar.v(5, 6);
        nVar.v(17, 6);
        nVar.v(7, 6);
        nVar.v(18, 6);
        nVar.v(6, 8);
        nVar.v(8, 8);
        nVar.v(14, 8);
        f4418e = nVar.e();
    }

    public C0529j(int i5, int[] iArr) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f4419a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f4419a = new int[0];
        }
        this.f4420b = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(E5.T r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f3238l
            r0.getClass()
            java.lang.String r1 = r10.f3236i
            int r0 = u6.k.a(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            l8.j0 r2 = G5.C0529j.f4418e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L1a
            goto La2
        L1a:
            int[] r1 = r9.f4419a
            r4 = 7
            r5 = 6
            r6 = 8
            r7 = 18
            if (r0 != r7) goto L2d
            int r8 = java.util.Arrays.binarySearch(r1, r7)
            if (r8 < 0) goto L2b
            goto L2d
        L2b:
            r0 = r5
            goto L37
        L2d:
            if (r0 != r6) goto L37
            int r8 = java.util.Arrays.binarySearch(r1, r6)
            if (r8 < 0) goto L36
            goto L37
        L36:
            r0 = r4
        L37:
            int r1 = java.util.Arrays.binarySearch(r1, r0)
            if (r1 < 0) goto Lb0
            r1 = -1
            int r8 = r10.f3251y
            if (r8 == r1) goto L4a
            if (r0 != r7) goto L45
            goto L4a
        L45:
            int r10 = r9.f4420b
            if (r8 <= r10) goto L75
            goto La2
        L4a:
            int r10 = r10.f3252z
            if (r10 == r1) goto L4f
            goto L52
        L4f:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L52:
            int r1 = u6.v.f46721a
            r7 = 29
            if (r1 < r7) goto L5e
            int r10 = G5.AbstractC0528i.b(r0, r10)
        L5c:
            r8 = r10
            goto L75
        L5e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r10 = r2.get(r10)
            if (r10 == 0) goto L6e
            r1 = r10
        L6e:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            goto L5c
        L75:
            int r10 = u6.v.f46721a
            r1 = 28
            if (r10 > r1) goto L89
            if (r8 != r4) goto L7f
            r5 = r6
            goto L8a
        L7f:
            r1 = 3
            if (r8 == r1) goto L8a
            r1 = 4
            if (r8 == r1) goto L8a
            r1 = 5
            if (r8 != r1) goto L89
            goto L8a
        L89:
            r5 = r8
        L8a:
            r1 = 26
            if (r10 > r1) goto L9c
            java.lang.String r10 = "fugu"
            java.lang.String r1 = u6.v.f46722b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L9c
            r10 = 1
            if (r5 != r10) goto L9c
            r5 = 2
        L9c:
            int r10 = u6.v.k(r5)
            if (r10 != 0) goto La3
        La2:
            return r3
        La3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Lb0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.C0529j.a(E5.T):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0529j)) {
            return false;
        }
        C0529j c0529j = (C0529j) obj;
        return Arrays.equals(this.f4419a, c0529j.f4419a) && this.f4420b == c0529j.f4420b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f4419a) * 31) + this.f4420b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f4420b + ", supportedEncodings=" + Arrays.toString(this.f4419a) + "]";
    }
}
