package Jd;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public final class B {
    public static final H k = xg.g.c("http://localhost");

    /* renamed from: a, reason: collision with root package name */
    public String f6007a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6008b;

    /* renamed from: c, reason: collision with root package name */
    public int f6009c;

    /* renamed from: d, reason: collision with root package name */
    public D f6010d;

    /* renamed from: e, reason: collision with root package name */
    public String f6011e;

    /* renamed from: f, reason: collision with root package name */
    public String f6012f;

    /* renamed from: g, reason: collision with root package name */
    public String f6013g;

    /* renamed from: h, reason: collision with root package name */
    public List f6014h;

    /* renamed from: i, reason: collision with root package name */
    public z f6015i;

    /* renamed from: j, reason: collision with root package name */
    public S3.l f6016j;

    public B() {
        ff.v<String> vVar = ff.v.f35432a;
        x.f6091b.getClass();
        this.f6007a = "";
        this.f6008b = false;
        this.f6009c = 0;
        this.f6010d = null;
        this.f6011e = null;
        this.f6012f = null;
        Set set = AbstractC0668b.f6042a;
        Charset charset = Bf.a.f1670a;
        AbstractC3340k.e(charset, "charset");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        AbstractC3340k.d(charsetEncoderNewEncoder, "newEncoder(...)");
        AbstractC0668b.f(AbstractC3935e.x(charsetEncoderNewEncoder, "", 0, 0), new Af.r(sb2, 7));
        this.f6013g = sb2.toString();
        ArrayList arrayList = new ArrayList(ff.p.a0(vVar, 10));
        for (String str : vVar) {
            AbstractC3340k.e(str, "<this>");
            StringBuilder sb3 = new StringBuilder();
            Charset charset2 = Bf.a.f1670a;
            int i5 = 0;
            while (i5 < str.length()) {
                char cCharAt = str.charAt(i5);
                if (!AbstractC0668b.f6043b.contains(Character.valueOf(cCharAt))) {
                    if (!AbstractC0668b.f6045d.contains(Character.valueOf(cCharAt))) {
                        int i10 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                        CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                        AbstractC3340k.d(charsetEncoderNewEncoder2, "newEncoder(...)");
                        int i11 = i10 + i5;
                        Pf.a aVarX = AbstractC3935e.x(charsetEncoderNewEncoder2, str, i5, i11);
                        while (!aVarX.exhausted()) {
                            while (!aVarX.exhausted()) {
                                sb3.append(AbstractC0668b.g(aVarX.readByte()));
                            }
                        }
                        i5 = i11;
                    }
                }
                sb3.append(cCharAt);
                i5++;
            }
            arrayList.add(sb3.toString());
        }
        this.f6014h = arrayList;
        z zVar = new z(8);
        for (String name : ff.x.f35434a) {
            AbstractC3340k.e(name, "name");
            String strE = AbstractC0668b.e(name, false);
            ArrayList arrayList2 = new ArrayList(ff.p.a0(vVar, 10));
            for (String str2 : vVar) {
                AbstractC3340k.e(str2, "<this>");
                arrayList2.add(AbstractC0668b.e(str2, true));
            }
            zVar.f(strE, arrayList2);
        }
        this.f6015i = zVar;
        this.f6016j = new S3.l(zVar);
    }

    public final void a() {
        if (this.f6007a.length() <= 0 && !AbstractC3340k.a(c().f6020a, "file")) {
            H h10 = k;
            this.f6007a = h10.f6026a;
            if (this.f6010d == null) {
                this.f6010d = h10.f6032g;
            }
            if (this.f6009c == 0) {
                d(h10.f6027b);
            }
        }
    }

    public final H b() {
        a();
        D d3 = this.f6010d;
        String str = this.f6007a;
        int i5 = this.f6009c;
        List list = this.f6014h;
        ArrayList arrayList = new ArrayList(ff.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0668b.c((String) it.next()));
        }
        x xVarP = A6.c.p((z) this.f6016j.f10967a);
        String strD = AbstractC0668b.d(0, 0, 15, this.f6013g);
        String str2 = this.f6011e;
        String strC = str2 != null ? AbstractC0668b.c(str2) : null;
        String str3 = this.f6012f;
        String strC2 = str3 != null ? AbstractC0668b.c(str3) : null;
        boolean z2 = this.f6008b;
        a();
        StringBuilder sb2 = new StringBuilder(256);
        AbstractC4345a.g(this, sb2);
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return new H(d3, str, i5, arrayList, xVarP, strD, strC, strC2, z2, string);
    }

    public final D c() {
        D d3 = this.f6010d;
        if (d3 != null) {
            return d3;
        }
        D d5 = D.f6018c;
        return D.f6018c;
    }

    public final void d(int i5) {
        if (i5 < 0 || i5 >= 65536) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        this.f6009c = i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        AbstractC4345a.g(this, sb2);
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }
}
