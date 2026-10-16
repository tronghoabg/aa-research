package j2;

import N1.C0760i;
import N1.C0761j;
import N1.C0764m;
import N1.C0765n;
import N1.D;
import Q1.k;
import Q1.x;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class g extends Ca.d {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f38607e;

    /* renamed from: f, reason: collision with root package name */
    public int f38608f;

    /* renamed from: g, reason: collision with root package name */
    public int f38609g;

    /* renamed from: h, reason: collision with root package name */
    public long f38610h;

    /* renamed from: i, reason: collision with root package name */
    public long f38611i;

    /* renamed from: j, reason: collision with root package name */
    public long f38612j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38613l;

    /* renamed from: m, reason: collision with root package name */
    public C3077a f38614m;

    public g(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.k = -1;
        this.f38614m = null;
        this.f38607e = new LinkedList();
    }

    @Override // Ca.d
    public final void d(Object obj) {
        if (obj instanceof b) {
            this.f38607e.add((b) obj);
        } else if (obj instanceof C3077a) {
            k.g(this.f38614m == null);
            this.f38614m = (C3077a) obj;
        }
    }

    @Override // Ca.d
    public final Object e() {
        C3077a c3077a;
        long jS;
        LinkedList linkedList = this.f38607e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        C3077a c3077a2 = this.f38614m;
        if (c3077a2 != null) {
            C0761j c0761j = new C0761j(new C0760i(c3077a2.f38577a, null, "video/mp4", c3077a2.f38578b));
            for (int i5 = 0; i5 < size; i5++) {
                b bVar = bVarArr[i5];
                int i10 = bVar.f38580a;
                if (i10 == 2 || i10 == 1) {
                    int i11 = 0;
                    while (true) {
                        C0765n[] c0765nArr = bVar.f38589j;
                        if (i11 < c0765nArr.length) {
                            C0764m c0764mA = c0765nArr[i11].a();
                            c0764mA.f8198q = c0761j;
                            c0765nArr[i11] = new C0765n(c0764mA);
                            i11++;
                        }
                    }
                }
            }
        }
        int i12 = this.f38608f;
        int i13 = this.f38609g;
        long j8 = this.f38610h;
        long j10 = this.f38611i;
        long j11 = this.f38612j;
        int i14 = this.k;
        boolean z2 = this.f38613l;
        C3077a c3077a3 = this.f38614m;
        long jS2 = -9223372036854775807L;
        if (j10 == 0) {
            c3077a = c3077a3;
            jS = -9223372036854775807L;
        } else {
            int i15 = x.f9724a;
            c3077a = c3077a3;
            jS = x.S(j10, 1000000L, j8, RoundingMode.DOWN);
        }
        if (j11 != 0) {
            int i16 = x.f9724a;
            jS2 = x.S(j11, 1000000L, j8, RoundingMode.DOWN);
        }
        return new c(i12, i13, jS, jS2, i14, z2, c3077a, bVarArr);
    }

    @Override // Ca.d
    public final void m(XmlPullParser xmlPullParser) throws D {
        this.f38608f = Ca.d.l(xmlPullParser, "MajorVersion");
        this.f38609g = Ca.d.l(xmlPullParser, "MinorVersion");
        this.f38610h = Ca.d.k(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new d("Duration", 0);
        }
        try {
            this.f38611i = Long.parseLong(attributeValue);
            this.f38612j = Ca.d.k(xmlPullParser, "DVRWindowLength", 0L);
            this.k = Ca.d.j(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f38613l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            o(Long.valueOf(this.f38610h), "TimeScale");
        } catch (NumberFormatException e7) {
            throw D.b(null, e7);
        }
    }
}
