package Ld;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7094a = 0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[PHI: r7
  0x0053: PHI (r7v2 long) = (r7v1 long), (r7v0 long) binds: [B:18:0x0061, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            java.util.List r0 = Jd.s.f6069f
            Ad.g r1 = new Ad.g
            r2 = 19
            r1.<init>(r2)
            Cd.U r2 = new Cd.U
            r3 = 9
            r2.<init>(r3)
            S3.f.g(r0, r1, r2)
            zf.g r0 = new zf.g
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 1
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r5 = ff.p.a0(r0, r4)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L2b:
            r5 = r0
            zf.f r5 = (zf.f) r5
            boolean r5 = r5.f48505c
            if (r5 == 0) goto L6e
            r5 = r0
            zf.f r5 = (zf.f) r5
            int r5 = r5.a()
            r6 = 48
            if (r6 > r5) goto L46
            r6 = 58
            if (r5 >= r6) goto L46
            long r5 = (long) r5
            r7 = 48
            long r5 = r5 - r7
            goto L66
        L46:
            long r5 = (long) r5
            r7 = 97
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L57
            r9 = 102(0x66, double:5.04E-322)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 > 0) goto L57
        L53:
            long r5 = r5 - r7
            long r7 = (long) r4
            long r5 = r5 + r7
            goto L66
        L57:
            r7 = 65
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L64
            r9 = 70
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 > 0) goto L64
            goto L53
        L64:
            r5 = -1
        L66:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2.add(r5)
            goto L2b
        L6e:
            ff.o.T0(r2)
            zf.g r0 = new zf.g
            r2 = 15
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = ff.p.a0(r0, r4)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L85:
            r2 = r0
            zf.f r2 = (zf.f) r2
            boolean r2 = r2.f48505c
            if (r2 == 0) goto La7
            r2 = r0
            zf.f r2 = (zf.f) r2
            int r2 = r2.a()
            if (r2 >= r4) goto L99
            int r2 = r2 + 48
        L97:
            byte r2 = (byte) r2
            goto L9f
        L99:
            int r2 = r2 + 97
            char r2 = (char) r2
            int r2 = r2 - r4
            char r2 = (char) r2
            goto L97
        L9f:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r1.add(r2)
            goto L85
        La7:
            ff.o.P0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ld.f.<clinit>():void");
    }

    public static final int a(CharSequence charSequence, int i5, int i10) {
        AbstractC3340k.e(charSequence, "<this>");
        int i11 = 0;
        while (i5 < i10) {
            int iCharAt = charSequence.charAt(i5);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i11 = (i11 * 31) + iCharAt;
            i5++;
        }
        return i11;
    }

    public static final void b(b bVar, int i5) {
        throw new NumberFormatException("Invalid number: " + ((Object) bVar) + ", wrong digit: " + bVar.charAt(i5) + " at position " + i5);
    }
}
