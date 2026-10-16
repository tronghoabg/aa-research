package Va;

import android.graphics.Color;
import android.view.View;

/* loaded from: classes4.dex */
public final class G8 extends AbstractC1215y8 {

    /* renamed from: e, reason: collision with root package name */
    public static int f13378e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13379f = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1215y8 f13380d;

    public G8(AbstractC1215y8 abstractC1215y8) {
        this.f13380d = abstractC1215y8;
    }

    public static String e(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(7057107540311525502L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 7057107540311525502L));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str2 = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        f13378e = (f13379f + 19) % 128;
        C1139s8 c1139s8C = this.f13380d.c(c1203x8, c1214y7);
        f13378e = (f13379f + 23) % 128;
        return c1139s8C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (Va.G8.class == r5.getClass()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        r5 = ((Va.G8) r5).f13380d;
        r0 = r4.f13380d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        return r0.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r5 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r5 = Va.G8.f13379f + 21;
        Va.G8.f13378e = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if ((r5 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r5 = Va.G8.f13379f + 111;
        Va.G8.f13378e = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if ((r5 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r5 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = Va.G8.f13379f
            int r0 = r0 + 73
            int r1 = r0 % 128
            Va.G8.f13378e = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            r0 = 23
            int r0 = r0 / r2
            if (r4 != r5) goto L17
            goto L16
        L14:
            if (r4 != r5) goto L17
        L16:
            return r1
        L17:
            if (r5 == 0) goto L4e
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<Va.G8> r3 = Va.G8.class
            if (r3 == r0) goto L22
            goto L4e
        L22:
            Va.G8 r5 = (Va.G8) r5
            Va.y8 r5 = r5.f13380d
            Va.y8 r0 = r4.f13380d
            if (r0 == 0) goto L2f
            boolean r5 = r0.equals(r5)
            return r5
        L2f:
            if (r5 != 0) goto L3f
            int r5 = Va.G8.f13379f
            int r5 = r5 + 21
            int r0 = r5 % 128
            Va.G8.f13378e = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L3e
            return r2
        L3e:
            return r1
        L3f:
            int r5 = Va.G8.f13379f
            int r5 = r5 + 111
            int r0 = r5 % 128
            Va.G8.f13378e = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L4c
            return r2
        L4c:
            r5 = 0
            throw r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.G8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        AbstractC1215y8 abstractC1215y8 = this.f13380d;
        if (abstractC1215y8 == null) {
            f13379f = (f13378e + 85) % 128;
            return 0;
        }
        int iHashCode = abstractC1215y8.hashCode();
        f13378e = (f13379f + 95) % 128;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e(Color.green(0), "ゾゖ頾贫⋈").intern());
        sb2.append(this.f13380d);
        sb2.append(e(View.resolveSizeAndState(0, 0, 0), "ણઊ癠밌\uf541").intern());
        String string = sb2.toString();
        f13378e = (f13379f + 95) % 128;
        return string;
    }
}
