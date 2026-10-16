package Va;

import android.os.Process;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class Z8 extends AbstractC0933c9 {

    /* renamed from: g, reason: collision with root package name */
    public static int f13903g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13904h = 1;

    /* renamed from: d, reason: collision with root package name */
    public final V8 f13905d;

    /* renamed from: e, reason: collision with root package name */
    public final V8 f13906e;

    /* renamed from: f, reason: collision with root package name */
    public final J8 f13907f;

    public Z8(V8 v82, V8 v83, J8 j8) {
        this.f13905d = v82;
        this.f13906e = v83;
        this.f13907f = j8;
    }

    public static String e(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 5575)) ^ ((c11 >>> 5) + 36726)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 56351) ^ ((c12 + i11) ^ ((c12 << 4) + 40986))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.AbstractC0933c9
    public final int a() {
        f13903g = (f13904h + 3) % 128;
        int iA = (this.f13906e.a() + this.f13905d.a()) - 1;
        int i5 = f13904h + 85;
        f13903g = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 63 / 0;
        }
        return iA;
    }

    @Override // Va.AbstractC0933c9
    public final int b(C1203x8 c1203x8) {
        int i5 = f13904h + 109;
        f13903g = i5 % 128;
        if (i5 % 2 != 0) {
            c1203x8.e(this);
            throw null;
        }
        if (!c1203x8.e(this)) {
            return this.f13905d.a();
        }
        int i10 = f13904h + 27;
        f13903g = i10 % 128;
        if (i10 % 2 == 0) {
            return 1;
        }
        throw null;
    }

    @Override // Va.AbstractC0933c9
    public final C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        V8 v82 = this.f13905d;
        if (v82 != null) {
            try {
                C1139s8 c1139s8D = v82.d(new C1203x8(c1203x8), c1214y7);
                int i5 = f13904h + 9;
                f13903g = i5 % 128;
                if (i5 % 2 == 0) {
                    return c1139s8D;
                }
                throw null;
            } catch (Throwable th) {
                c1203x8.k(v82);
                V8 v83 = this.f13906e;
                if (v83 != null) {
                    c1203x8.f(this);
                    HashMap map = new HashMap();
                    J8 j8 = this.f13907f;
                    if (j8 != null) {
                        map.put(AbstractC1152t8.a(j8.e()), th);
                        f13904h = (f13903g + 111) % 128;
                    }
                    return v83.d(new C1203x8(map, c1203x8, false), c1214y7);
                }
            }
        }
        return new C1139s8(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r2 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r3.equals(r2) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r2 = r7.f13906e;
        r3 = r6.f13906e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r3.equals(r2) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r7 = r7.f13907f;
        r2 = r6.f13907f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        Va.Z8.f13904h = (Va.Z8.f13903g + 15) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        return r2.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r7 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = Va.Z8.f13903g
            int r0 = r0 + 41
            int r0 = r0 % 128
            Va.Z8.f13904h = r0
            r0 = 1
            if (r6 != r7) goto Lc
            return r0
        Lc:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class r2 = r7.getClass()
            java.lang.Class<Va.Z8> r3 = Va.Z8.class
            if (r3 == r2) goto L18
            goto L66
        L18:
            Va.Z8 r7 = (Va.Z8) r7
            Va.V8 r2 = r7.f13905d
            Va.V8 r3 = r6.f13905d
            if (r3 == 0) goto L3d
            int r4 = Va.Z8.f13903g
            int r4 = r4 + 83
            int r5 = r4 % 128
            Va.Z8.f13904h = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L36
            boolean r2 = r3.equals(r2)
            r3 = 24
            int r3 = r3 / r1
            if (r2 != 0) goto L40
            goto L3f
        L36:
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L40
            goto L3f
        L3d:
            if (r2 == 0) goto L40
        L3f:
            return r1
        L40:
            Va.V8 r2 = r7.f13906e
            Va.V8 r3 = r6.f13906e
            if (r3 == 0) goto L4d
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L50
            goto L4f
        L4d:
            if (r2 == 0) goto L50
        L4f:
            return r1
        L50:
            Va.J8 r7 = r7.f13907f
            Va.J8 r2 = r6.f13907f
            if (r2 == 0) goto L63
            int r0 = Va.Z8.f13903g
            int r0 = r0 + 15
            int r0 = r0 % 128
            Va.Z8.f13904h = r0
            boolean r7 = r2.equals(r7)
            return r7
        L63:
            if (r7 != 0) goto L66
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Z8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        f13903g = (f13904h + 99) % 128;
        int iHashCode2 = 0;
        V8 v82 = this.f13905d;
        int iHashCode3 = (v82 != null ? v82.hashCode() : 0) * 31;
        V8 v83 = this.f13906e;
        if (v83 != null) {
            f13903g = (f13904h + 23) % 128;
            iHashCode = v83.hashCode();
        } else {
            iHashCode = 0;
        }
        int i5 = (iHashCode3 + iHashCode) * 31;
        J8 j8 = this.f13907f;
        if (j8 != null) {
            iHashCode2 = j8.hashCode();
        } else {
            f13904h = (f13903g + 119) % 128;
        }
        return i5 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e((Process.myPid() >> 22) + 4, "싃䏡髛霖").intern());
        sb2.append(this.f13905d);
        sb2.append(e((ViewConfiguration.getKeyRepeatDelay() >> 16) + 8, "\uede5麨\ued12ꕁ䎯怇㋊\u173f").intern());
        sb2.append(this.f13907f);
        sb2.append(e(AndroidCharacter.getMirror('0') - '.', "䳍꾨").intern());
        sb2.append(this.f13906e);
        String string = sb2.toString();
        int i5 = f13903g + 7;
        f13904h = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 26 / 0;
        }
        return string;
    }
}
