package z0;

import ff.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f48273a = 0;

    static {
        int i5 = 6 & 2;
        v paragraphStyles = v.f35432a;
        v spanStyles = i5 != 0 ? paragraphStyles : null;
        if ((6 & 4) == 0) {
            paragraphStyles = null;
        }
        AbstractC3340k.e(spanStyles, "spanStyles");
        AbstractC3340k.e(paragraphStyles, "paragraphStyles");
        int i10 = -1;
        for (int i11 = 0; i11 < 0; i11++) {
            a aVar = (a) paragraphStyles.get(i11);
            if (aVar.f48266b < i10) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            i10 = aVar.f48267c;
            if (i10 > 0) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + aVar.f48266b + ", " + i10 + ") is out of boundary").toString());
            }
        }
    }

    public static final ArrayList a(int i5, int i10, List list) {
        if (i5 > i10) {
            throw new IllegalArgumentException(("start (" + i5 + ") should be less than or equal to end (" + i10 + ')').toString());
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            a aVar = (a) obj;
            if (b(i5, i10, aVar.f48266b, aVar.f48267c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            a aVar2 = (a) arrayList.get(i12);
            arrayList2.add(new a(aVar2.f48268d, Math.max(i5, aVar2.f48266b) - i5, Math.min(i10, aVar2.f48267c) - i5, aVar2.f48265a));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(int r4, int r5, int r6, int r7) {
        /*
            int r0 = java.lang.Math.max(r4, r6)
            int r1 = java.lang.Math.min(r5, r7)
            r2 = 1
            if (r0 < r1) goto L33
            r0 = 0
            if (r4 > r6) goto L1f
            if (r7 > r5) goto L1f
            if (r5 != r7) goto L33
            if (r6 != r7) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r0
        L17:
            if (r4 != r5) goto L1b
            r3 = r2
            goto L1c
        L1b:
            r3 = r0
        L1c:
            if (r1 != r3) goto L1f
            goto L33
        L1f:
            if (r6 > r4) goto L32
            if (r5 > r7) goto L32
            if (r7 != r5) goto L33
            if (r4 != r5) goto L29
            r4 = r2
            goto L2a
        L29:
            r4 = r0
        L2a:
            if (r6 != r7) goto L2e
            r5 = r2
            goto L2f
        L2e:
            r5 = r0
        L2f:
            if (r4 != r5) goto L32
            goto L33
        L32:
            return r0
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.c.b(int, int, int, int):boolean");
    }
}
