package t6;

import java.util.ArrayList;
import java.util.Collections;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: h, reason: collision with root package name */
    public static final q6.d f45832h = new q6.d(22);

    /* renamed from: i, reason: collision with root package name */
    public static final q6.d f45833i = new q6.d(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f45834a;

    /* renamed from: e, reason: collision with root package name */
    public int f45838e;

    /* renamed from: f, reason: collision with root package name */
    public int f45839f;

    /* renamed from: g, reason: collision with root package name */
    public int f45840g;

    /* renamed from: c, reason: collision with root package name */
    public final C4132H[] f45836c = new C4132H[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f45835b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f45837d = -1;

    public I(int i5) {
        this.f45834a = i5;
    }

    public final void a(float f10, int i5) {
        C4132H c4132h;
        int i10 = this.f45837d;
        ArrayList arrayList = this.f45835b;
        if (i10 != 1) {
            Collections.sort(arrayList, f45832h);
            this.f45837d = 1;
        }
        int i11 = this.f45840g;
        C4132H[] c4132hArr = this.f45836c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f45840g = i12;
            c4132h = c4132hArr[i12];
        } else {
            c4132h = new C4132H();
        }
        int i13 = this.f45838e;
        this.f45838e = i13 + 1;
        c4132h.f45829a = i13;
        c4132h.f45830b = i5;
        c4132h.f45831c = f10;
        arrayList.add(c4132h);
        this.f45839f += i5;
        while (true) {
            int i14 = this.f45839f;
            int i15 = this.f45834a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            C4132H c4132h2 = (C4132H) arrayList.get(0);
            int i17 = c4132h2.f45830b;
            if (i17 <= i16) {
                this.f45839f -= i17;
                arrayList.remove(0);
                int i18 = this.f45840g;
                if (i18 < 5) {
                    this.f45840g = i18 + 1;
                    c4132hArr[i18] = c4132h2;
                }
            } else {
                c4132h2.f45830b = i17 - i16;
                this.f45839f -= i16;
            }
        }
    }

    public final float b() {
        int i5 = this.f45837d;
        ArrayList arrayList = this.f45835b;
        if (i5 != 0) {
            Collections.sort(arrayList, f45833i);
            this.f45837d = 0;
        }
        float f10 = 0.5f * this.f45839f;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C4132H c4132h = (C4132H) arrayList.get(i11);
            i10 += c4132h.f45830b;
            if (i10 >= f10) {
                return c4132h.f45831c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C4132H) AbstractC3256n.e(arrayList, 1)).f45831c;
    }
}
