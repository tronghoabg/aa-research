package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hej {
    public static final /* synthetic */ int a = 0;
    private static final yob b = yob.c("com/android/car/libraries/apphost/sectioneditem/uiconverter/RowSectionInternalToUiModelConverterKt");
    private static final gcp c = new gcp(false, 10, null, 5);
    private static final gcp d;

    static {
        ghv ghvVar = ghv.a;
        ghvVar.getClass();
        d = new gcp(false, 10, ghvVar, 1);
    }

    public static final fwx a(fwb fwbVar) {
        return fwbVar.g() ? fwx.a : (fwbVar.d() == null && fwbVar.c() == null) ? fwx.d : fwx.b;
    }

    public static final fya b(fwb fwbVar, geu geuVar, hcj hcjVar, boolean z) {
        return new fya(fxa.c(fwbVar, geuVar, z ? fwbVar.d() : null, (!hcjVar.c || fwbVar.g() || fwbVar.b() == null) ? fwbVar.c() : null), a(fwbVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0306  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v17, types: [fwb, gmo] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [hju] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [gcb] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hck c(defpackage.har r32, defpackage.geu r33, boolean r34, defpackage.hcj r35) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hej.c(har, geu, boolean, hcj):hck");
    }

    public static /* synthetic */ hck d(har harVar, geu geuVar, boolean z, hcj hcjVar, int i) {
        if ((i & 4) != 0) {
            hcjVar = hcj.a;
        }
        return c(harVar, geuVar, z | (!((i & 2) == 0)), hcjVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fwb, gmo] */
    private static final hdn e(gmr gmrVar, geu geuVar, hcj hcjVar, boolean z) {
        int i = 1;
        boolean z2 = false;
        if (gmrVar.a.d() != null && z) {
            z2 = true;
        }
        return new hdn(hlb.a(gmrVar, new hei(geuVar, hcjVar, z, i)), z2);
    }

    private static final List f(List list, geu geuVar, hcj hcjVar, boolean z) {
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(hlb.a((gmr) it.next(), new hei(geuVar, hcjVar, z, 0)));
        }
        return arrayList;
    }
}
