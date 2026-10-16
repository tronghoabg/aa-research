package N1;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import J9.C0664x;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.ads.BuildConfig;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import n8.AbstractC3604c;

/* renamed from: N1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765n {

    /* renamed from: A, reason: collision with root package name */
    public final int f8208A;

    /* renamed from: B, reason: collision with root package name */
    public final C0757f f8209B;

    /* renamed from: C, reason: collision with root package name */
    public final int f8210C;

    /* renamed from: D, reason: collision with root package name */
    public final int f8211D;

    /* renamed from: E, reason: collision with root package name */
    public final int f8212E;

    /* renamed from: F, reason: collision with root package name */
    public final int f8213F;

    /* renamed from: G, reason: collision with root package name */
    public final int f8214G;

    /* renamed from: H, reason: collision with root package name */
    public final int f8215H;

    /* renamed from: I, reason: collision with root package name */
    public final int f8216I;

    /* renamed from: J, reason: collision with root package name */
    public final int f8217J;

    /* renamed from: K, reason: collision with root package name */
    public final int f8218K;
    public final int L;

    /* renamed from: M, reason: collision with root package name */
    public int f8219M;

    /* renamed from: a, reason: collision with root package name */
    public final String f8220a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8221b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3409K f8222c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8223d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8224e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8225f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8226g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8227h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8228i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8229j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final B f8230l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8231m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8232n;

    /* renamed from: o, reason: collision with root package name */
    public final int f8233o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8234p;

    /* renamed from: q, reason: collision with root package name */
    public final List f8235q;

    /* renamed from: r, reason: collision with root package name */
    public final C0761j f8236r;

    /* renamed from: s, reason: collision with root package name */
    public final long f8237s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8238t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8239u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8240v;

    /* renamed from: w, reason: collision with root package name */
    public final float f8241w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8242x;

    /* renamed from: y, reason: collision with root package name */
    public final float f8243y;

    /* renamed from: z, reason: collision with root package name */
    public final byte[] f8244z;

    static {
        new C0764m().a();
        Q1.x.E(0);
        Q1.x.E(1);
        Q1.x.E(2);
        Q1.x.E(3);
        Q1.x.E(4);
        N0.a.k(5, 6, 7, 8, 9);
        N0.a.k(10, 11, 12, 13, 14);
        N0.a.k(15, 16, 17, 18, 19);
        N0.a.k(20, 21, 22, 23, 24);
        N0.a.k(25, 26, 27, 28, 29);
        Q1.x.E(30);
        Q1.x.E(31);
        Q1.x.E(32);
        Q1.x.E(33);
    }

    public C0765n(C0764m c0764m) throws MissingResourceException {
        boolean z2;
        String str;
        this.f8220a = c0764m.f8183a;
        String strL = Q1.x.L(c0764m.f8186d);
        this.f8223d = strL;
        if (c0764m.f8185c.isEmpty() && c0764m.f8184b != null) {
            this.f8222c = AbstractC3409K.n(new C0766o(strL, c0764m.f8184b));
            this.f8221b = c0764m.f8184b;
        } else if (!c0764m.f8185c.isEmpty() && c0764m.f8184b == null) {
            AbstractC3409K abstractC3409K = c0764m.f8185c;
            this.f8222c = abstractC3409K;
            Iterator it = abstractC3409K.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C0766o) abstractC3409K.get(0)).f8246b;
                    break;
                }
                C0766o c0766o = (C0766o) it.next();
                if (TextUtils.equals(c0766o.f8245a, strL)) {
                    str = c0766o.f8246b;
                    break;
                }
            }
            this.f8221b = str;
        } else if (c0764m.f8185c.isEmpty() && c0764m.f8184b == null) {
            z2 = true;
            Q1.k.g(z2);
            this.f8222c = c0764m.f8185c;
            this.f8221b = c0764m.f8184b;
        } else {
            for (int i5 = 0; i5 < c0764m.f8185c.size(); i5++) {
                if (((C0766o) c0764m.f8185c.get(i5)).f8246b.equals(c0764m.f8184b)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            Q1.k.g(z2);
            this.f8222c = c0764m.f8185c;
            this.f8221b = c0764m.f8184b;
        }
        this.f8224e = c0764m.f8187e;
        Q1.k.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c0764m.f8189g == 0 || (c0764m.f8188f & 32768) != 0);
        this.f8225f = c0764m.f8188f;
        this.f8226g = c0764m.f8189g;
        int i10 = c0764m.f8190h;
        this.f8227h = i10;
        int i11 = c0764m.f8191i;
        this.f8228i = i11;
        this.f8229j = i11 != -1 ? i11 : i10;
        this.k = c0764m.f8192j;
        this.f8230l = c0764m.k;
        this.f8231m = c0764m.f8193l;
        this.f8232n = c0764m.f8194m;
        this.f8233o = c0764m.f8195n;
        this.f8234p = c0764m.f8196o;
        List list = c0764m.f8197p;
        this.f8235q = list == null ? Collections.EMPTY_LIST : list;
        C0761j c0761j = c0764m.f8198q;
        this.f8236r = c0761j;
        this.f8237s = c0764m.f8199r;
        this.f8238t = c0764m.f8200s;
        this.f8239u = c0764m.f8201t;
        this.f8240v = c0764m.f8202u;
        this.f8241w = c0764m.f8203v;
        int i12 = c0764m.f8204w;
        this.f8242x = i12 == -1 ? 0 : i12;
        float f10 = c0764m.f8205x;
        this.f8243y = f10 == -1.0f ? 1.0f : f10;
        this.f8244z = c0764m.f8206y;
        this.f8208A = c0764m.f8207z;
        this.f8209B = c0764m.f8172A;
        this.f8210C = c0764m.f8173B;
        this.f8211D = c0764m.f8174C;
        this.f8212E = c0764m.f8175D;
        int i13 = c0764m.f8176E;
        this.f8213F = i13 == -1 ? 0 : i13;
        int i14 = c0764m.f8177F;
        this.f8214G = i14 != -1 ? i14 : 0;
        this.f8215H = c0764m.f8178G;
        this.f8216I = c0764m.f8179H;
        this.f8217J = c0764m.f8180I;
        this.f8218K = c0764m.f8181J;
        int i15 = c0764m.f8182K;
        if (i15 != 0 || c0761j == null) {
            this.L = i15;
        } else {
            this.L = 1;
        }
    }

    public static String c(C0765n c0765n) {
        String str;
        String str2;
        int i5;
        if (c0765n == null) {
            return "null";
        }
        B8.e eVar = new B8.e(String.valueOf(','));
        StringBuilder sbJ = N0.a.j("id=");
        sbJ.append(c0765n.f8220a);
        sbJ.append(", mimeType=");
        sbJ.append(c0765n.f8232n);
        String str3 = c0765n.f8231m;
        if (str3 != null) {
            sbJ.append(", container=");
            sbJ.append(str3);
        }
        int i10 = c0765n.f8229j;
        if (i10 != -1) {
            sbJ.append(", bitrate=");
            sbJ.append(i10);
        }
        String str4 = c0765n.k;
        if (str4 != null) {
            sbJ.append(", codecs=");
            sbJ.append(str4);
        }
        C0761j c0761j = c0765n.f8236r;
        if (c0761j != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i11 = 0; i11 < c0761j.f8167d; i11++) {
                UUID uuid = c0761j.f8164a[i11].f8160b;
                if (uuid.equals(AbstractC0756e.f8145b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC0756e.f8146c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC0756e.f8148e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC0756e.f8147d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC0756e.f8144a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbJ.append(", drm=[");
            eVar.a(sbJ, linkedHashSet.iterator());
            sbJ.append(']');
        }
        int i12 = c0765n.f8239u;
        if (i12 != -1 && (i5 = c0765n.f8240v) != -1) {
            N0.a.l(i12, i5, ", res=", "x", sbJ);
        }
        float f10 = c0765n.f8243y;
        double d3 = f10;
        int i13 = AbstractC3604c.f40940a;
        if (Math.copySign(d3 - 1.0d, 1.0d) > 0.001d && d3 != 1.0d && (!Double.isNaN(d3) || !Double.isNaN(1.0d))) {
            sbJ.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            int i14 = Q1.x.f9724a;
            sbJ.append(String.format(Locale.US, "%.3f", objArr));
        }
        C0757f c0757f = c0765n.f8209B;
        if (c0757f != null) {
            int i15 = c0757f.f8155f;
            int i16 = c0757f.f8154e;
            if ((i16 != -1 && i15 != -1) || c0757f.d()) {
                sbJ.append(", color=");
                if (c0757f.d()) {
                    String strB = C0757f.b(c0757f.f8150a);
                    String strA = C0757f.a(c0757f.f8151b);
                    String strC = C0757f.c(c0757f.f8152c);
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbJ.append(str2 + "/" + ((i16 == -1 || i15 == -1) ? "NA/NA" : i16 + "/" + i15));
            }
        }
        float f11 = c0765n.f8241w;
        if (f11 != -1.0f) {
            sbJ.append(", fps=");
            sbJ.append(f11);
        }
        int i17 = c0765n.f8210C;
        if (i17 != -1) {
            sbJ.append(", channels=");
            sbJ.append(i17);
        }
        int i18 = c0765n.f8211D;
        if (i18 != -1) {
            sbJ.append(", sample_rate=");
            sbJ.append(i18);
        }
        String str5 = c0765n.f8223d;
        if (str5 != null) {
            sbJ.append(", language=");
            sbJ.append(str5);
        }
        AbstractC3409K abstractC3409K = c0765n.f8222c;
        if (!abstractC3409K.isEmpty()) {
            sbJ.append(", labels=[");
            eVar.a(sbJ, AbstractC3437s.v(abstractC3409K, new C0664x(15)).iterator());
            sbJ.append("]");
        }
        int i19 = c0765n.f8224e;
        if (i19 != 0) {
            sbJ.append(", selectionFlags=[");
            int i20 = Q1.x.f9724a;
            ArrayList arrayList = new ArrayList();
            if ((i19 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i19 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i19 & 2) != 0) {
                arrayList.add("forced");
            }
            eVar.a(sbJ, arrayList.iterator());
            sbJ.append("]");
        }
        int i21 = c0765n.f8225f;
        if (i21 != 0) {
            sbJ.append(", roleFlags=[");
            int i22 = Q1.x.f9724a;
            ArrayList arrayList2 = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i21 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i21 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i21 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i21 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i21 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i21 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i21 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i21 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i21 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i21 & Segment.SHARE_MINIMUM) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i21 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i21 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i21 & Segment.SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i21 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i21 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            eVar.a(sbJ, arrayList2.iterator());
            sbJ.append("]");
        }
        if ((32768 & i21) != 0) {
            sbJ.append(", auxiliaryTrackType=");
            int i23 = Q1.x.f9724a;
            int i24 = c0765n.f8226g;
            if (i24 == 0) {
                str = "undefined";
            } else if (i24 == 1) {
                str = "original";
            } else if (i24 == 2) {
                str = "depth-linear";
            } else if (i24 == 3) {
                str = "depth-inverse";
            } else {
                if (i24 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbJ.append(str);
        }
        return sbJ.toString();
    }

    public final C0764m a() {
        C0764m c0764m = new C0764m();
        c0764m.f8183a = this.f8220a;
        c0764m.f8184b = this.f8221b;
        c0764m.f8185c = this.f8222c;
        c0764m.f8186d = this.f8223d;
        c0764m.f8187e = this.f8224e;
        c0764m.f8188f = this.f8225f;
        c0764m.f8190h = this.f8227h;
        c0764m.f8191i = this.f8228i;
        c0764m.f8192j = this.k;
        c0764m.k = this.f8230l;
        c0764m.f8193l = this.f8231m;
        c0764m.f8194m = this.f8232n;
        c0764m.f8195n = this.f8233o;
        c0764m.f8196o = this.f8234p;
        c0764m.f8197p = this.f8235q;
        c0764m.f8198q = this.f8236r;
        c0764m.f8199r = this.f8237s;
        c0764m.f8200s = this.f8238t;
        c0764m.f8201t = this.f8239u;
        c0764m.f8202u = this.f8240v;
        c0764m.f8203v = this.f8241w;
        c0764m.f8204w = this.f8242x;
        c0764m.f8205x = this.f8243y;
        c0764m.f8206y = this.f8244z;
        c0764m.f8207z = this.f8208A;
        c0764m.f8172A = this.f8209B;
        c0764m.f8173B = this.f8210C;
        c0764m.f8174C = this.f8211D;
        c0764m.f8175D = this.f8212E;
        c0764m.f8176E = this.f8213F;
        c0764m.f8177F = this.f8214G;
        c0764m.f8178G = this.f8215H;
        c0764m.f8179H = this.f8216I;
        c0764m.f8180I = this.f8217J;
        c0764m.f8181J = this.f8218K;
        c0764m.f8182K = this.L;
        return c0764m;
    }

    public final boolean b(C0765n c0765n) {
        List list = this.f8235q;
        if (list.size() != c0765n.f8235q.size()) {
            return false;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!Arrays.equals((byte[]) list.get(i5), (byte[]) c0765n.f8235q.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public final C0765n d(C0765n c0765n) {
        String str;
        AbstractC3409K abstractC3409K;
        String str2;
        C0760i[] c0760iArr;
        if (this == c0765n) {
            return this;
        }
        int iH = C.h(this.f8232n);
        String str3 = c0765n.f8220a;
        String str4 = c0765n.f8221b;
        if (str4 == null) {
            str4 = this.f8221b;
        }
        AbstractC3409K abstractC3409K2 = c0765n.f8222c;
        if (abstractC3409K2.isEmpty()) {
            abstractC3409K2 = this.f8222c;
        }
        if ((iH != 3 && iH != 1) || (str = c0765n.f8223d) == null) {
            str = this.f8223d;
        }
        int i5 = this.f8227h;
        if (i5 == -1) {
            i5 = c0765n.f8227h;
        }
        int i10 = this.f8228i;
        if (i10 == -1) {
            i10 = c0765n.f8228i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strT = Q1.x.t(iH, c0765n.k);
            if (Q1.x.U(strT).length == 1) {
                str5 = strT;
            }
        }
        B bE = c0765n.f8230l;
        B b5 = this.f8230l;
        if (b5 != null) {
            bE = b5.e(bE);
        }
        float f10 = this.f8241w;
        if (f10 == -1.0f && iH == 2) {
            f10 = c0765n.f8241w;
        }
        int i11 = this.f8224e | c0765n.f8224e;
        int i12 = this.f8225f | c0765n.f8225f;
        ArrayList arrayList = new ArrayList();
        C0761j c0761j = c0765n.f8236r;
        if (c0761j != null) {
            C0760i[] c0760iArr2 = c0761j.f8164a;
            abstractC3409K = abstractC3409K2;
            int length = c0760iArr2.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = length;
                C0760i c0760i = c0760iArr2[i13];
                int i15 = i13;
                if (c0760i.f8163e != null) {
                    arrayList.add(c0760i);
                }
                i13 = i15 + 1;
                length = i14;
            }
            str2 = c0761j.f8166c;
        } else {
            abstractC3409K = abstractC3409K2;
            str2 = null;
        }
        C0761j c0761j2 = this.f8236r;
        if (c0761j2 != null) {
            if (str2 == null) {
                str2 = c0761j2.f8166c;
            }
            int size = arrayList.size();
            C0760i[] c0760iArr3 = c0761j2.f8164a;
            int length2 = c0760iArr3.length;
            String str6 = str2;
            int i16 = 0;
            while (i16 < length2) {
                int i17 = length2;
                C0760i c0760i2 = c0760iArr3[i16];
                int i18 = i16;
                if (c0760i2.f8163e != null) {
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size) {
                            c0760iArr = c0760iArr3;
                            arrayList.add(c0760i2);
                            break;
                        }
                        int i20 = i19;
                        c0760iArr = c0760iArr3;
                        if (((C0760i) arrayList.get(i19)).f8160b.equals(c0760i2.f8160b)) {
                            break;
                        }
                        i19 = i20 + 1;
                        c0760iArr3 = c0760iArr;
                    }
                } else {
                    c0760iArr = c0760iArr3;
                }
                i16 = i18 + 1;
                length2 = i17;
                c0760iArr3 = c0760iArr;
            }
            str2 = str6;
        }
        C0761j c0761j3 = arrayList.isEmpty() ? null : new C0761j(str2, arrayList);
        C0764m c0764mA = a();
        c0764mA.f8183a = str3;
        c0764mA.f8184b = str4;
        c0764mA.f8185c = AbstractC3409K.j(abstractC3409K);
        c0764mA.f8186d = str;
        c0764mA.f8187e = i11;
        c0764mA.f8188f = i12;
        c0764mA.f8190h = i5;
        c0764mA.f8191i = i10;
        c0764mA.f8192j = str5;
        c0764mA.k = bE;
        c0764mA.f8198q = c0761j3;
        c0764mA.f8203v = f10;
        c0764mA.f8180I = c0765n.f8217J;
        c0764mA.f8181J = c0765n.f8218K;
        return new C0765n(c0764mA);
    }

    public final boolean equals(Object obj) {
        int i5;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0765n.class != obj.getClass()) {
            return false;
        }
        C0765n c0765n = (C0765n) obj;
        int i10 = this.f8219M;
        return (i10 == 0 || (i5 = c0765n.f8219M) == 0 || i10 == i5) && this.f8224e == c0765n.f8224e && this.f8225f == c0765n.f8225f && this.f8226g == c0765n.f8226g && this.f8227h == c0765n.f8227h && this.f8228i == c0765n.f8228i && this.f8233o == c0765n.f8233o && this.f8237s == c0765n.f8237s && this.f8239u == c0765n.f8239u && this.f8240v == c0765n.f8240v && this.f8242x == c0765n.f8242x && this.f8208A == c0765n.f8208A && this.f8210C == c0765n.f8210C && this.f8211D == c0765n.f8211D && this.f8212E == c0765n.f8212E && this.f8213F == c0765n.f8213F && this.f8214G == c0765n.f8214G && this.f8215H == c0765n.f8215H && this.f8217J == c0765n.f8217J && this.f8218K == c0765n.f8218K && this.L == c0765n.L && Float.compare(this.f8241w, c0765n.f8241w) == 0 && Float.compare(this.f8243y, c0765n.f8243y) == 0 && Objects.equals(this.f8220a, c0765n.f8220a) && Objects.equals(this.f8221b, c0765n.f8221b) && this.f8222c.equals(c0765n.f8222c) && Objects.equals(this.k, c0765n.k) && Objects.equals(this.f8231m, c0765n.f8231m) && Objects.equals(this.f8232n, c0765n.f8232n) && Objects.equals(this.f8223d, c0765n.f8223d) && Arrays.equals(this.f8244z, c0765n.f8244z) && Objects.equals(this.f8230l, c0765n.f8230l) && Objects.equals(this.f8209B, c0765n.f8209B) && Objects.equals(this.f8236r, c0765n.f8236r) && b(c0765n);
    }

    public final int hashCode() {
        if (this.f8219M == 0) {
            String str = this.f8220a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8221b;
            int iHashCode2 = (this.f8222c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f8223d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f8224e) * 31) + this.f8225f) * 31) + this.f8226g) * 31) + this.f8227h) * 31) + this.f8228i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            B b5 = this.f8230l;
            int iHashCode5 = (iHashCode4 + (b5 == null ? 0 : b5.hashCode())) * 961;
            String str5 = this.f8231m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f8232n;
            this.f8219M = ((((((((((((((((((AbstractC0213f.c(this.f8243y, (AbstractC0213f.c(this.f8241w, (((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f8233o) * 31) + ((int) this.f8237s)) * 31) + this.f8239u) * 31) + this.f8240v) * 31, 31) + this.f8242x) * 31, 31) + this.f8208A) * 31) + this.f8210C) * 31) + this.f8211D) * 31) + this.f8212E) * 31) + this.f8213F) * 31) + this.f8214G) * 31) + this.f8215H) * 31) + this.f8217J) * 31) + this.f8218K) * 31) + this.L;
        }
        return this.f8219M;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f8220a);
        sb2.append(", ");
        sb2.append(this.f8221b);
        sb2.append(", ");
        sb2.append(this.f8231m);
        sb2.append(", ");
        sb2.append(this.f8232n);
        sb2.append(", ");
        sb2.append(this.k);
        sb2.append(", ");
        sb2.append(this.f8229j);
        sb2.append(", ");
        sb2.append(this.f8223d);
        sb2.append(", [");
        sb2.append(this.f8239u);
        sb2.append(", ");
        sb2.append(this.f8240v);
        sb2.append(", ");
        sb2.append(this.f8241w);
        sb2.append(", ");
        sb2.append(this.f8209B);
        sb2.append("], [");
        sb2.append(this.f8210C);
        sb2.append(", ");
        return AbstractC0279p0.j(this.f8211D, "])", sb2);
    }
}
