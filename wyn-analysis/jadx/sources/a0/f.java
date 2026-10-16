package A0;

import N.J;
import N1.C0765n;
import U8.G;
import U8.s0;
import com.applovin.impl.c8;
import com.applovin.impl.d8;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I;
import ef.C2527k;
import g2.C2689j;
import g2.C2690k;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3399A;
import l8.C3443y;
import l8.d0;
import n2.C3582e;
import n2.C3583f;
import n2.C3588k;
import org.apache.tika.language.detect.LanguageDetector;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.utils.CompareUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209a;

    public /* synthetic */ f(int i5) {
        this.f209a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f209a) {
            case 0:
                C2527k c2527k = (C2527k) obj;
                C2527k c2527k2 = (C2527k) obj2;
                return (((Number) c2527k.f34672b).intValue() - ((Number) c2527k.f34671a).intValue()) - (((Number) c2527k2.f34672b).intValue() - ((Number) c2527k2.f34671a).intValue());
            case 1:
                sa.f fVar = (sa.f) obj;
                sa.f fVar2 = (sa.f) obj2;
                if (fVar.e() && !fVar2.e()) {
                    return -1;
                }
                if (!fVar2.e() || fVar.e()) {
                    return Integer.compare(fVar.g().getValue(), fVar2.g().getValue());
                }
                return 1;
            case 2:
                return AbstractC3340k.g(((J) obj).f7711b, ((J) obj2).f7711b);
            case 3:
                return Integer.compare(((Q2.d) obj2).f9777b, ((Q2.d) obj).f9777b);
            case 4:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 5:
                return ((G) ((s0) obj)).f12399a.compareTo(((G) ((s0) obj2)).f12399a);
            case 6:
                Y1.b bVar = (Y1.b) obj;
                Y1.b bVar2 = (Y1.b) obj2;
                int iCompare = Integer.compare(bVar.f16308c, bVar2.f16308c);
                return iCompare != 0 ? iCompare : bVar.f16307b.compareTo(bVar2.f16307b);
            case 7:
                return Integer.compare(((X2.e) obj).f16051a.f16054b, ((X2.e) obj2).f16051a.f16054b);
            case 8:
                return Long.compare(((X2.d) obj).f16048b, ((X2.d) obj2).f16048b);
            case 9:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 10:
                String name = ((File) obj).getName();
                int i5 = X8.a.f16175f;
                return name.substring(0, i5).compareTo(((File) obj2).getName().substring(0, i5));
            case 11:
                return c8.a((d8) obj, (d8) obj2);
            case 12:
                I i10 = (I) obj;
                I i11 = (I) obj2;
                AbstractC3340k.b(i11);
                int i12 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G.i(i11);
                AbstractC3340k.b(i10);
                return AbstractC3340k.g(i12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G.i(i10));
            case 13:
                I i13 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj).f31504h;
                I i14 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj2).f31504h;
                AbstractC3340k.b(i14);
                int i15 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G.i(i14);
                AbstractC3340k.b(i13);
                return AbstractC3340k.g(i15, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G.i(i13));
            case 14:
                return C2690k.b(((C2689j) obj).f35613a.f35609c, ((C2689j) obj2).f35613a.f35609c);
            case 15:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i16 = 0; i16 < bArr.length; i16++) {
                    byte b5 = bArr[i16];
                    byte b10 = bArr2[i16];
                    if (b5 != b10) {
                        return b5 - b10;
                    }
                }
                return 0;
            case 16:
                return Integer.compare(((i6.d) obj2).f36826b, ((i6.d) obj).f36826b);
            case 17:
                return ((C0765n) obj2).f8229j - ((C0765n) obj).f8229j;
            case 18:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 19:
                return Integer.compare(((C3583f) ((List) obj).get(0)).f40835f, ((C3583f) ((List) obj2).get(0)).f40835f);
            case 20:
                return ((C3582e) Collections.max((List) obj)).compareTo((C3582e) Collections.max((List) obj2));
            case 21:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C3443y.f(n2.n.c((n2.n) Collections.max(list, new f(23)), (n2.n) Collections.max(list2, new f(23)))).a(list.size(), list2.size()).b((n2.n) Collections.max(list, new f(24)), (n2.n) Collections.max(list2, new f(24)), new f(24)).e();
            case 22:
                return ((C3588k) ((List) obj).get(0)).compareTo((C3588k) ((List) obj2).get(0));
            case 23:
                return n2.n.c((n2.n) obj, (n2.n) obj2);
            case 24:
                n2.n nVar = (n2.n) obj;
                n2.n nVar2 = (n2.n) obj2;
                d0 d0VarA = (nVar.f40871e && nVar.f40874h) ? n2.o.f40885j : n2.o.f40885j.a();
                C3443y c3443y = AbstractC3399A.f40038a;
                nVar.f40872f.getClass();
                return c3443y.b(Integer.valueOf(nVar.k), Integer.valueOf(nVar2.k), d0VarA).b(Integer.valueOf(nVar.f40876j), Integer.valueOf(nVar2.f40876j), d0VarA).e();
            case 25:
                return ((o2.q) obj).f41329a - ((o2.q) obj2).f41329a;
            case 26:
                return Float.compare(((o2.q) obj).f41331c, ((o2.q) obj2).f41331c);
            case 27:
                return CompareUtils.compareClassName((Translator) obj, (Translator) obj2);
            case 28:
                return CompareUtils.compareClassName((LanguageDetector) obj, (LanguageDetector) obj2);
            default:
                return CompareUtils.compareClassName(obj, obj2);
        }
    }
}
