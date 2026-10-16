package O;

import A7.AbstractC0279p0;
import N.C0718d;
import N.C0740o;
import N.I;
import N.J0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784b {

    /* renamed from: a, reason: collision with root package name */
    public final C0740o f8709a;

    /* renamed from: b, reason: collision with root package name */
    public C0783a f8710b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8711c;

    /* renamed from: f, reason: collision with root package name */
    public int f8714f;

    /* renamed from: g, reason: collision with root package name */
    public int f8715g;

    /* renamed from: l, reason: collision with root package name */
    public int f8719l;

    /* renamed from: d, reason: collision with root package name */
    public final I f8712d = new I(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8713e = true;

    /* renamed from: h, reason: collision with root package name */
    public final J0 f8716h = new J0((byte) 0, 0);

    /* renamed from: i, reason: collision with root package name */
    public int f8717i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f8718j = -1;
    public int k = -1;

    public C0784b(C0740o c0740o, C0783a c0783a) {
        this.f8709a = c0740o;
        this.f8710b = c0783a;
    }

    public final void a() {
        c();
        J0 j02 = this.f8716h;
        if (j02.f7714b.isEmpty()) {
            this.f8715g++;
        } else {
            j02.f7714b.remove(r0.size() - 1);
        }
    }

    public final void b() {
        Throwable th;
        int i5;
        C0784b c0784b = this;
        int i10 = c0784b.f8715g;
        int i11 = 0;
        if (i10 > 0) {
            C0783a c0783a = c0784b.f8710b;
            c0783a.getClass();
            z zVar = z.f8748c;
            B b5 = c0783a.f8708b;
            b5.d0(zVar);
            Ba.c.N(b5, 0, i10);
            int i12 = b5.f8706h;
            int i13 = zVar.f8698a;
            th = null;
            int iW = B.W(b5, i13);
            i5 = 1;
            int i14 = zVar.f8699b;
            if (i12 != iW || b5.f8707i != B.W(b5, i14)) {
                StringBuilder sb2 = new StringBuilder();
                int i15 = 0;
                while (i15 < i13) {
                    int i16 = i13;
                    if (((1 << i15) & b5.f8706h) != 0) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(zVar.b(i15));
                        i11++;
                    }
                    i15++;
                    i13 = i16;
                }
                String string = sb2.toString();
                StringBuilder sbW = AbstractC0279p0.w(string, "StringBuilder().apply(builderAction).toString()");
                int i17 = 0;
                int i18 = 0;
                while (i18 < i14) {
                    int i19 = i14;
                    if (((1 << i18) & b5.f8707i) != 0) {
                        if (i11 > 0) {
                            sbW.append(", ");
                        }
                        sbW.append(zVar.c(i18));
                        i17++;
                    }
                    i18++;
                    i14 = i19;
                }
                String string2 = sbW.toString();
                AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder("Error while pushing ");
                sb3.append(zVar);
                sb3.append(". Not all arguments were provided. Missing ");
                AbstractC0279p0.v(sb3, i11, " int arguments (", string, ") and ");
                AbstractC0279p0.x(sb3, i17, " object arguments (", string2, ").");
                throw null;
            }
            c0784b.f8715g = 0;
        } else {
            th = null;
            i5 = 1;
            c0784b = this;
        }
        J0 j02 = c0784b.f8716h;
        if (j02.f7714b.isEmpty()) {
            return;
        }
        C0783a c0783a2 = c0784b.f8710b;
        ArrayList arrayList = j02.f7714b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i20 = 0; i20 < size; i20++) {
            objArr[i20] = arrayList.get(i20);
        }
        c0783a2.getClass();
        if (size != 0) {
            f fVar = f.f8724c;
            B b10 = c0783a2.f8708b;
            b10.d0(fVar);
            Ba.c.O(b10, 0, objArr);
            int i21 = b10.f8706h;
            int i22 = fVar.f8698a;
            int iW2 = B.W(b10, i22);
            int i23 = fVar.f8699b;
            if (i21 != iW2 || b10.f8707i != B.W(b10, i23)) {
                StringBuilder sb4 = new StringBuilder();
                int i24 = 0;
                for (int i25 = 0; i25 < i22; i25++) {
                    if (((i5 << i25) & b10.f8706h) != 0) {
                        if (i24 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(fVar.b(i25));
                        i24++;
                    }
                }
                String string3 = sb4.toString();
                StringBuilder sbW2 = AbstractC0279p0.w(string3, "StringBuilder().apply(builderAction).toString()");
                int i26 = 0;
                int i27 = 0;
                while (i26 < i23) {
                    int i28 = i23;
                    if (((i5 << i26) & b10.f8707i) != 0) {
                        if (i24 > 0) {
                            sbW2.append(", ");
                        }
                        sbW2.append(fVar.c(i26));
                        i27++;
                    }
                    i26++;
                    i23 = i28;
                }
                String string4 = sbW2.toString();
                AbstractC3340k.d(string4, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(fVar);
                sb5.append(". Not all arguments were provided. Missing ");
                AbstractC0279p0.v(sb5, i24, " int arguments (", string3, ") and ");
                AbstractC0279p0.x(sb5, i27, " object arguments (", string4, ").");
                throw th;
            }
        }
        arrayList.clear();
    }

    public final void c() {
        int i5 = this.f8719l;
        if (i5 > 0) {
            int i10 = this.f8717i;
            if (i10 >= 0) {
                b();
                C0783a c0783a = this.f8710b;
                c0783a.getClass();
                s sVar = s.f8741c;
                B b5 = c0783a.f8708b;
                b5.d0(sVar);
                Ba.c.N(b5, 0, i10);
                Ba.c.N(b5, 1, i5);
                int i11 = b5.f8706h;
                int i12 = sVar.f8698a;
                int iW = B.W(b5, i12);
                int i13 = sVar.f8699b;
                if (i11 != iW || b5.f8707i != B.W(b5, i13)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i12) {
                        int i16 = i12;
                        if (((1 << i14) & b5.f8706h) != 0) {
                            if (i15 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(sVar.b(i14));
                            i15++;
                        }
                        i14++;
                        i12 = i16;
                    }
                    String string = sb2.toString();
                    StringBuilder sbW = AbstractC0279p0.w(string, "StringBuilder().apply(builderAction).toString()");
                    int i17 = 0;
                    int i18 = 0;
                    while (i18 < i13) {
                        int i19 = i13;
                        if (((1 << i18) & b5.f8707i) != 0) {
                            if (i15 > 0) {
                                sbW.append(", ");
                            }
                            sbW.append(sVar.c(i18));
                            i17++;
                        }
                        i18++;
                        i13 = i19;
                    }
                    String string2 = sbW.toString();
                    AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb3 = new StringBuilder("Error while pushing ");
                    sb3.append(sVar);
                    sb3.append(". Not all arguments were provided. Missing ");
                    AbstractC0279p0.v(sb3, i15, " int arguments (", string, ") and ");
                    AbstractC0279p0.x(sb3, i17, " object arguments (", string2, ").");
                    throw null;
                }
                this.f8717i = -1;
            } else {
                int i20 = this.k;
                int i21 = this.f8718j;
                b();
                C0783a c0783a2 = this.f8710b;
                c0783a2.getClass();
                p pVar = p.f8738c;
                B b10 = c0783a2.f8708b;
                b10.d0(pVar);
                Ba.c.N(b10, 1, i20);
                Ba.c.N(b10, 0, i21);
                Ba.c.N(b10, 2, i5);
                int i22 = b10.f8706h;
                int i23 = pVar.f8698a;
                int iW2 = B.W(b10, i23);
                int i24 = pVar.f8699b;
                if (i22 != iW2 || b10.f8707i != B.W(b10, i24)) {
                    int i25 = 0;
                    StringBuilder sb4 = new StringBuilder();
                    for (int i26 = 0; i26 < i23; i26++) {
                        if (((1 << i26) & b10.f8706h) != 0) {
                            if (i25 > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(pVar.b(i26));
                            i25++;
                        }
                    }
                    String string3 = sb4.toString();
                    StringBuilder sbW2 = AbstractC0279p0.w(string3, "StringBuilder().apply(builderAction).toString()");
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i24) {
                        int i29 = i24;
                        if (((1 << i27) & b10.f8707i) != 0) {
                            if (i25 > 0) {
                                sbW2.append(", ");
                            }
                            sbW2.append(pVar.c(i27));
                            i28++;
                        }
                        i27++;
                        i24 = i29;
                    }
                    String string4 = sbW2.toString();
                    AbstractC3340k.d(string4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(pVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    AbstractC0279p0.v(sb5, i25, " int arguments (", string3, ") and ");
                    AbstractC0279p0.x(sb5, i28, " object arguments (", string4, ").");
                    throw null;
                }
                this.f8718j = -1;
                this.k = -1;
            }
            this.f8719l = 0;
        }
    }

    public final void d(boolean z2) {
        C0740o c0740o = this.f8709a;
        int i5 = z2 ? c0740o.f7835F.f7937i : c0740o.f7835F.f7935g;
        int i10 = i5 - this.f8714f;
        if (!(i10 >= 0)) {
            C0718d.v("Tried to seek backward");
            throw null;
        }
        if (i10 > 0) {
            C0783a c0783a = this.f8710b;
            c0783a.getClass();
            d dVar = d.f8722c;
            B b5 = c0783a.f8708b;
            b5.d0(dVar);
            Ba.c.N(b5, 0, i10);
            int i11 = b5.f8706h;
            int i12 = dVar.f8698a;
            int iW = B.W(b5, i12);
            int i13 = dVar.f8699b;
            if (i11 == iW && b5.f8707i == B.W(b5, i13)) {
                this.f8714f = i5;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                if (((1 << i15) & b5.f8706h) != 0) {
                    if (i14 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(dVar.b(i15));
                    i14++;
                }
            }
            String string = sb2.toString();
            StringBuilder sbW = AbstractC0279p0.w(string, "StringBuilder().apply(builderAction).toString()");
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                if (((1 << i17) & b5.f8707i) != 0) {
                    if (i14 > 0) {
                        sbW.append(", ");
                    }
                    sbW.append(dVar.c(i17));
                    i16++;
                }
            }
            String string2 = sbW.toString();
            AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(dVar);
            sb3.append(". Not all arguments were provided. Missing ");
            AbstractC0279p0.v(sb3, i14, " int arguments (", string, ") and ");
            AbstractC0279p0.x(sb3, i16, " object arguments (", string2, ").");
            throw null;
        }
    }

    public final void e(int i5, int i10) {
        if (i10 > 0) {
            if (!(i5 >= 0)) {
                C0718d.v("Invalid remove index " + i5);
                throw null;
            }
            if (this.f8717i == i5) {
                this.f8719l += i10;
                return;
            }
            c();
            this.f8717i = i5;
            this.f8719l = i10;
        }
    }
}
