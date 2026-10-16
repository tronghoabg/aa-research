package z0;

import A.AbstractC0213f;
import android.text.Layout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final m f48328a;

    /* renamed from: b, reason: collision with root package name */
    public final d f48329b;

    /* renamed from: c, reason: collision with root package name */
    public final long f48330c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48331d;

    /* renamed from: e, reason: collision with root package name */
    public final float f48332e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f48333f;

    public n(m mVar, d dVar, long j8) {
        this.f48328a = mVar;
        this.f48329b = dVar;
        this.f48330c = j8;
        ArrayList arrayList = dVar.f48281h;
        boolean zIsEmpty = arrayList.isEmpty();
        float fA = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f48331d = zIsEmpty ? 0.0f : ((f) arrayList.get(0)).f48284a.f4852d.a(0);
        if (!arrayList.isEmpty()) {
            f fVar = (f) ff.o.y0(arrayList);
            H0.a aVar = fVar.f48284a;
            A0.q qVar = aVar.f4852d;
            int i5 = qVar.f230c;
            int i10 = aVar.f4850b;
            fA = (i10 < i5 ? qVar.a(i10 - 1) : qVar.a(i5 - 1)) + fVar.f48289f;
        }
        this.f48332e = fA;
        this.f48333f = dVar.f48280g;
    }

    public static int a(n nVar, int i5) {
        d dVar = nVar.f48329b;
        dVar.c(i5);
        ArrayList arrayList = dVar.f48281h;
        f fVar = (f) arrayList.get(S3.f.r(arrayList, i5));
        H0.a aVar = fVar.f48284a;
        int i10 = i5 - fVar.f48287d;
        Layout layout = aVar.f4852d.f229b;
        return (layout.getEllipsisStart(i10) == 0 ? layout.getLineEnd(i10) : layout.getText().length()) + fVar.f48285b;
    }

    public final int b(int i5) {
        d dVar = this.f48329b;
        dVar.b(i5);
        int length = ((b) dVar.f48274a.f13867a).f48269a.length();
        ArrayList arrayList = dVar.f48281h;
        f fVar = (f) arrayList.get(i5 == length ? AbstractC3935e.z(arrayList) : S3.f.q(arrayList, i5));
        H0.a aVar = fVar.f48284a;
        int i10 = fVar.f48285b;
        return aVar.f4852d.f229b.getLineForOffset(android.support.v4.media.session.b.S(i5, i10, fVar.f48286c) - i10) + fVar.f48287d;
    }

    public final int c(float f10) {
        int iZ;
        d dVar = this.f48329b;
        ArrayList paragraphInfoList = dVar.f48281h;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f10 < dVar.f48278e) {
                AbstractC3340k.e(paragraphInfoList, "paragraphInfoList");
                int size = paragraphInfoList.size() - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > size) {
                        iZ = -(i5 + 1);
                        break;
                    }
                    int i10 = (i5 + size) >>> 1;
                    f fVar = (f) paragraphInfoList.get(i10);
                    char c10 = fVar.f48289f > f10 ? (char) 1 : fVar.f48290g <= f10 ? (char) 65535 : (char) 0;
                    if (c10 >= 0) {
                        if (c10 <= 0) {
                            iZ = i10;
                            break;
                        }
                        size = i10 - 1;
                    } else {
                        i5 = i10 + 1;
                    }
                }
            } else {
                iZ = AbstractC3935e.z(paragraphInfoList);
            }
        } else {
            iZ = 0;
        }
        f fVar2 = (f) paragraphInfoList.get(iZ);
        int i11 = fVar2.f48286c;
        int i12 = fVar2.f48285b;
        if (i11 - i12 == 0) {
            return Math.max(0, i12 - 1);
        }
        float f11 = f10 - fVar2.f48289f;
        A0.q qVar = fVar2.f48284a.f4852d;
        return qVar.f229b.getLineForVertical(qVar.f231d + ((int) f11)) + fVar2.f48287d;
    }

    public final int d(int i5) {
        d dVar = this.f48329b;
        dVar.c(i5);
        ArrayList arrayList = dVar.f48281h;
        f fVar = (f) arrayList.get(S3.f.r(arrayList, i5));
        H0.a aVar = fVar.f48284a;
        return aVar.f4852d.f229b.getLineStart(i5 - fVar.f48287d) + fVar.f48285b;
    }

    public final float e(int i5) {
        d dVar = this.f48329b;
        dVar.c(i5);
        ArrayList arrayList = dVar.f48281h;
        f fVar = (f) arrayList.get(S3.f.r(arrayList, i5));
        H0.a aVar = fVar.f48284a;
        return aVar.f4852d.c(i5 - fVar.f48287d) + fVar.f48289f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f48328a.equals(nVar.f48328a) && this.f48329b.equals(nVar.f48329b) && L0.h.a(this.f48330c, nVar.f48330c) && this.f48331d == nVar.f48331d && this.f48332e == nVar.f48332e && AbstractC3340k.a(this.f48333f, nVar.f48333f);
    }

    public final int f(int i5) {
        d dVar = this.f48329b;
        dVar.b(i5);
        int length = ((b) dVar.f48274a.f13867a).f48269a.length();
        ArrayList arrayList = dVar.f48281h;
        f fVar = (f) arrayList.get(i5 == length ? AbstractC3935e.z(arrayList) : S3.f.q(arrayList, i5));
        H0.a aVar = fVar.f48284a;
        int i10 = fVar.f48285b;
        int iS = android.support.v4.media.session.b.S(i5, i10, fVar.f48286c) - i10;
        A0.q qVar = aVar.f4852d;
        return qVar.f229b.getParagraphDirection(qVar.f229b.getLineForOffset(iS)) == 1 ? 1 : 2;
    }

    public final int hashCode() {
        int iHashCode = (this.f48329b.hashCode() + (this.f48328a.hashCode() * 31)) * 31;
        long j8 = this.f48330c;
        return this.f48333f.hashCode() + AbstractC0213f.c(this.f48332e, AbstractC0213f.c(this.f48331d, (((int) (j8 ^ (j8 >>> 32))) + iHashCode) * 31, 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f48328a + ", multiParagraph=" + this.f48329b + ", size=" + ((Object) L0.h.b(this.f48330c)) + ", firstBaseline=" + this.f48331d + ", lastBaseline=" + this.f48332e + ", placeholderRects=" + this.f48333f + ')';
    }
}
