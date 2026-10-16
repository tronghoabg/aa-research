package j2;

import N1.C0765n;
import N1.D;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class h extends Ca.d {

    /* renamed from: e, reason: collision with root package name */
    public final String f38615e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f38616f;

    /* renamed from: g, reason: collision with root package name */
    public int f38617g;

    /* renamed from: h, reason: collision with root package name */
    public String f38618h;

    /* renamed from: i, reason: collision with root package name */
    public long f38619i;

    /* renamed from: j, reason: collision with root package name */
    public String f38620j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public int f38621l;

    /* renamed from: m, reason: collision with root package name */
    public int f38622m;

    /* renamed from: n, reason: collision with root package name */
    public int f38623n;

    /* renamed from: o, reason: collision with root package name */
    public int f38624o;

    /* renamed from: p, reason: collision with root package name */
    public String f38625p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f38626q;

    /* renamed from: r, reason: collision with root package name */
    public long f38627r;

    public h(Ca.d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f38615e = str;
        this.f38616f = new LinkedList();
    }

    @Override // Ca.d
    public final void d(Object obj) {
        if (obj instanceof C0765n) {
            this.f38616f.add((C0765n) obj);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 j2.b, still in use, count: 2, list:
          (r3v0 j2.b) from 0x0082: MOVE (r26v0 j2.b) = (r3v0 j2.b) (LINE:131)
          (r3v0 j2.b) from 0x004e: MOVE (r26v4 j2.b) = (r3v0 j2.b) (LINE:79)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // Ca.d
    public final java.lang.Object e() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.h.e():java.lang.Object");
    }

    @Override // Ca.d
    public final boolean g(String str) {
        return "c".equals(str);
    }

    @Override // Ca.d
    public final void m(XmlPullParser xmlPullParser) throws D {
        int i5 = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new d("Type", 0);
            }
            if (!MimeTypes.BASE_TYPE_AUDIO.equalsIgnoreCase(attributeValue)) {
                if (MimeTypes.BASE_TYPE_VIDEO.equalsIgnoreCase(attributeValue)) {
                    i5 = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw D.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i5 = 3;
                }
            }
            this.f38617g = i5;
            o(Integer.valueOf(i5), "Type");
            if (this.f38617g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new d("Subtype", 0);
                }
                this.f38618h = attributeValue2;
            } else {
                this.f38618h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            o(this.f38618h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f38620j = attributeValue3;
            o(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new d("Url", 0);
            }
            this.k = attributeValue4;
            this.f38621l = Ca.d.j(xmlPullParser, "MaxWidth");
            this.f38622m = Ca.d.j(xmlPullParser, "MaxHeight");
            this.f38623n = Ca.d.j(xmlPullParser, "DisplayWidth");
            this.f38624o = Ca.d.j(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f38625p = attributeValue5;
            o(attributeValue5, "Language");
            long j8 = Ca.d.j(xmlPullParser, "TimeScale");
            this.f38619i = j8;
            if (j8 == -1) {
                this.f38619i = ((Long) f("TimeScale")).longValue();
            }
            this.f38626q = new ArrayList();
            return;
        }
        int size = this.f38626q.size();
        long jK = Ca.d.k(xmlPullParser, "t", -9223372036854775807L);
        if (jK == -9223372036854775807L) {
            if (size == 0) {
                jK = 0;
            } else {
                if (this.f38627r == -1) {
                    throw D.b("Unable to infer start time", null);
                }
                jK = this.f38627r + ((Long) this.f38626q.get(size - 1)).longValue();
            }
        }
        this.f38626q.add(Long.valueOf(jK));
        this.f38627r = Ca.d.k(xmlPullParser, "d", -9223372036854775807L);
        long jK2 = Ca.d.k(xmlPullParser, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, 1L);
        if (jK2 > 1 && this.f38627r == -9223372036854775807L) {
            throw D.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j10 = i5;
            if (j10 >= jK2) {
                return;
            }
            this.f38626q.add(Long.valueOf((this.f38627r * j10) + jK));
            i5++;
        }
    }
}
