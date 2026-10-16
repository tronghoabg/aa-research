package Jd;

import ef.C2532p;
import java.io.Serializable;
import java.util.ArrayList;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Sf.e(with = I.class)
/* loaded from: classes5.dex */
public final class H implements Serializable {

    @NotNull
    public static final G Companion = new G();

    /* renamed from: a, reason: collision with root package name */
    public final String f6026a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6027b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6028c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6029d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6030e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6031f;

    /* renamed from: g, reason: collision with root package name */
    public final D f6032g;

    /* renamed from: h, reason: collision with root package name */
    public final D f6033h;

    /* renamed from: i, reason: collision with root package name */
    public final C2532p f6034i;

    /* renamed from: j, reason: collision with root package name */
    public final C2532p f6035j;
    public final C2532p k;

    /* renamed from: l, reason: collision with root package name */
    public final C2532p f6036l;

    /* renamed from: m, reason: collision with root package name */
    public final C2532p f6037m;

    public H(D d3, String host, int i5, ArrayList arrayList, x parameters, String fragment, String str, String str2, boolean z2, String str3) {
        AbstractC3340k.e(host, "host");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(fragment, "fragment");
        this.f6026a = host;
        this.f6027b = i5;
        this.f6028c = str;
        this.f6029d = str2;
        this.f6030e = z2;
        this.f6031f = str3;
        if (i5 < 0 || i5 >= 65536) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        Fe.c.z(new E(arrayList, 0));
        this.f6032g = d3;
        this.f6033h = d3 == null ? D.f6018c : d3;
        this.f6034i = Fe.c.z(new Bf.g(1, arrayList, this));
        final int i10 = 0;
        this.f6035j = Fe.c.z(new tf.a(this) { // from class: Jd.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f6025b;

            {
                this.f6025b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                H h10 = this.f6025b;
                switch (i10) {
                    case 0:
                        int iV0 = Bf.k.v0(h10.f6031f, '?', 0, 6) + 1;
                        if (iV0 == 0) {
                            return "";
                        }
                        String str4 = h10.f6031f;
                        int iV02 = Bf.k.v0(str4, '#', iV0, 4);
                        if (iV02 == -1) {
                            String strSubstring = str4.substring(iV0);
                            AbstractC3340k.d(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iV0, iV02);
                        AbstractC3340k.d(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iV03 = Bf.k.v0(h10.f6031f, '/', h10.f6033h.f6020a.length() + 3, 4);
                        if (iV03 == -1) {
                            return "";
                        }
                        String str5 = h10.f6031f;
                        int iV04 = Bf.k.v0(str5, '#', iV03, 4);
                        if (iV04 == -1) {
                            String strSubstring3 = str5.substring(iV03);
                            AbstractC3340k.d(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iV03, iV04);
                        AbstractC3340k.d(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = h10.f6028c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = h10.f6033h.f6020a.length() + 3;
                        String str7 = h10.f6031f;
                        String strSubstring5 = str7.substring(length, Bf.k.x0(str7, new char[]{':', '@'}, length, false));
                        AbstractC3340k.d(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = h10.f6029d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = h10.f6033h.f6020a.length() + 3;
                        String str9 = h10.f6031f;
                        String strSubstring6 = str9.substring(Bf.k.v0(str9, ':', length2, 4) + 1, Bf.k.v0(str9, '@', 0, 6));
                        AbstractC3340k.d(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iV05 = Bf.k.v0(h10.f6031f, '#', 0, 6) + 1;
                        if (iV05 == 0) {
                            return "";
                        }
                        String strSubstring7 = h10.f6031f.substring(iV05);
                        AbstractC3340k.d(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i11 = 1;
        Fe.c.z(new tf.a(this) { // from class: Jd.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f6025b;

            {
                this.f6025b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                H h10 = this.f6025b;
                switch (i11) {
                    case 0:
                        int iV0 = Bf.k.v0(h10.f6031f, '?', 0, 6) + 1;
                        if (iV0 == 0) {
                            return "";
                        }
                        String str4 = h10.f6031f;
                        int iV02 = Bf.k.v0(str4, '#', iV0, 4);
                        if (iV02 == -1) {
                            String strSubstring = str4.substring(iV0);
                            AbstractC3340k.d(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iV0, iV02);
                        AbstractC3340k.d(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iV03 = Bf.k.v0(h10.f6031f, '/', h10.f6033h.f6020a.length() + 3, 4);
                        if (iV03 == -1) {
                            return "";
                        }
                        String str5 = h10.f6031f;
                        int iV04 = Bf.k.v0(str5, '#', iV03, 4);
                        if (iV04 == -1) {
                            String strSubstring3 = str5.substring(iV03);
                            AbstractC3340k.d(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iV03, iV04);
                        AbstractC3340k.d(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = h10.f6028c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = h10.f6033h.f6020a.length() + 3;
                        String str7 = h10.f6031f;
                        String strSubstring5 = str7.substring(length, Bf.k.x0(str7, new char[]{':', '@'}, length, false));
                        AbstractC3340k.d(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = h10.f6029d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = h10.f6033h.f6020a.length() + 3;
                        String str9 = h10.f6031f;
                        String strSubstring6 = str9.substring(Bf.k.v0(str9, ':', length2, 4) + 1, Bf.k.v0(str9, '@', 0, 6));
                        AbstractC3340k.d(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iV05 = Bf.k.v0(h10.f6031f, '#', 0, 6) + 1;
                        if (iV05 == 0) {
                            return "";
                        }
                        String strSubstring7 = h10.f6031f.substring(iV05);
                        AbstractC3340k.d(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i12 = 2;
        this.k = Fe.c.z(new tf.a(this) { // from class: Jd.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f6025b;

            {
                this.f6025b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                H h10 = this.f6025b;
                switch (i12) {
                    case 0:
                        int iV0 = Bf.k.v0(h10.f6031f, '?', 0, 6) + 1;
                        if (iV0 == 0) {
                            return "";
                        }
                        String str4 = h10.f6031f;
                        int iV02 = Bf.k.v0(str4, '#', iV0, 4);
                        if (iV02 == -1) {
                            String strSubstring = str4.substring(iV0);
                            AbstractC3340k.d(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iV0, iV02);
                        AbstractC3340k.d(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iV03 = Bf.k.v0(h10.f6031f, '/', h10.f6033h.f6020a.length() + 3, 4);
                        if (iV03 == -1) {
                            return "";
                        }
                        String str5 = h10.f6031f;
                        int iV04 = Bf.k.v0(str5, '#', iV03, 4);
                        if (iV04 == -1) {
                            String strSubstring3 = str5.substring(iV03);
                            AbstractC3340k.d(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iV03, iV04);
                        AbstractC3340k.d(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = h10.f6028c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = h10.f6033h.f6020a.length() + 3;
                        String str7 = h10.f6031f;
                        String strSubstring5 = str7.substring(length, Bf.k.x0(str7, new char[]{':', '@'}, length, false));
                        AbstractC3340k.d(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = h10.f6029d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = h10.f6033h.f6020a.length() + 3;
                        String str9 = h10.f6031f;
                        String strSubstring6 = str9.substring(Bf.k.v0(str9, ':', length2, 4) + 1, Bf.k.v0(str9, '@', 0, 6));
                        AbstractC3340k.d(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iV05 = Bf.k.v0(h10.f6031f, '#', 0, 6) + 1;
                        if (iV05 == 0) {
                            return "";
                        }
                        String strSubstring7 = h10.f6031f.substring(iV05);
                        AbstractC3340k.d(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i13 = 3;
        this.f6036l = Fe.c.z(new tf.a(this) { // from class: Jd.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f6025b;

            {
                this.f6025b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                H h10 = this.f6025b;
                switch (i13) {
                    case 0:
                        int iV0 = Bf.k.v0(h10.f6031f, '?', 0, 6) + 1;
                        if (iV0 == 0) {
                            return "";
                        }
                        String str4 = h10.f6031f;
                        int iV02 = Bf.k.v0(str4, '#', iV0, 4);
                        if (iV02 == -1) {
                            String strSubstring = str4.substring(iV0);
                            AbstractC3340k.d(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iV0, iV02);
                        AbstractC3340k.d(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iV03 = Bf.k.v0(h10.f6031f, '/', h10.f6033h.f6020a.length() + 3, 4);
                        if (iV03 == -1) {
                            return "";
                        }
                        String str5 = h10.f6031f;
                        int iV04 = Bf.k.v0(str5, '#', iV03, 4);
                        if (iV04 == -1) {
                            String strSubstring3 = str5.substring(iV03);
                            AbstractC3340k.d(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iV03, iV04);
                        AbstractC3340k.d(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = h10.f6028c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = h10.f6033h.f6020a.length() + 3;
                        String str7 = h10.f6031f;
                        String strSubstring5 = str7.substring(length, Bf.k.x0(str7, new char[]{':', '@'}, length, false));
                        AbstractC3340k.d(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = h10.f6029d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = h10.f6033h.f6020a.length() + 3;
                        String str9 = h10.f6031f;
                        String strSubstring6 = str9.substring(Bf.k.v0(str9, ':', length2, 4) + 1, Bf.k.v0(str9, '@', 0, 6));
                        AbstractC3340k.d(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iV05 = Bf.k.v0(h10.f6031f, '#', 0, 6) + 1;
                        if (iV05 == 0) {
                            return "";
                        }
                        String strSubstring7 = h10.f6031f.substring(iV05);
                        AbstractC3340k.d(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i14 = 4;
        this.f6037m = Fe.c.z(new tf.a(this) { // from class: Jd.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f6025b;

            {
                this.f6025b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                H h10 = this.f6025b;
                switch (i14) {
                    case 0:
                        int iV0 = Bf.k.v0(h10.f6031f, '?', 0, 6) + 1;
                        if (iV0 == 0) {
                            return "";
                        }
                        String str4 = h10.f6031f;
                        int iV02 = Bf.k.v0(str4, '#', iV0, 4);
                        if (iV02 == -1) {
                            String strSubstring = str4.substring(iV0);
                            AbstractC3340k.d(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iV0, iV02);
                        AbstractC3340k.d(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iV03 = Bf.k.v0(h10.f6031f, '/', h10.f6033h.f6020a.length() + 3, 4);
                        if (iV03 == -1) {
                            return "";
                        }
                        String str5 = h10.f6031f;
                        int iV04 = Bf.k.v0(str5, '#', iV03, 4);
                        if (iV04 == -1) {
                            String strSubstring3 = str5.substring(iV03);
                            AbstractC3340k.d(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iV03, iV04);
                        AbstractC3340k.d(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = h10.f6028c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = h10.f6033h.f6020a.length() + 3;
                        String str7 = h10.f6031f;
                        String strSubstring5 = str7.substring(length, Bf.k.x0(str7, new char[]{':', '@'}, length, false));
                        AbstractC3340k.d(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = h10.f6029d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = h10.f6033h.f6020a.length() + 3;
                        String str9 = h10.f6031f;
                        String strSubstring6 = str9.substring(Bf.k.v0(str9, ':', length2, 4) + 1, Bf.k.v0(str9, '@', 0, 6));
                        AbstractC3340k.d(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iV05 = Bf.k.v0(h10.f6031f, '#', 0, 6) + 1;
                        if (iV05 == 0) {
                            return "";
                        }
                        String strSubstring7 = h10.f6031f.substring(iV05);
                        AbstractC3340k.d(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        return AbstractC3340k.a(this.f6031f, ((H) obj).f6031f);
    }

    public final int hashCode() {
        return this.f6031f.hashCode();
    }

    public final String toString() {
        return this.f6031f;
    }
}
