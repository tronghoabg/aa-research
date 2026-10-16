package o2;

import java.util.ArrayList;
import java.util.Collections;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: h, reason: collision with root package name */
    public static final A0.f f41332h = new A0.f(25);

    /* renamed from: i, reason: collision with root package name */
    public static final A0.f f41333i = new A0.f(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f41334a;

    /* renamed from: e, reason: collision with root package name */
    public int f41338e;

    /* renamed from: f, reason: collision with root package name */
    public int f41339f;

    /* renamed from: g, reason: collision with root package name */
    public int f41340g;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f41336c = new q[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f41335b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f41337d = -1;

    public r(int i5) {
        this.f41334a = i5;
    }

    public final void a(float f10, int i5) {
        q qVar;
        int i10 = this.f41337d;
        ArrayList arrayList = this.f41335b;
        if (i10 != 1) {
            Collections.sort(arrayList, f41332h);
            this.f41337d = 1;
        }
        int i11 = this.f41340g;
        q[] qVarArr = this.f41336c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f41340g = i12;
            qVar = qVarArr[i12];
        } else {
            qVar = new q();
        }
        int i13 = this.f41338e;
        this.f41338e = i13 + 1;
        qVar.f41329a = i13;
        qVar.f41330b = i5;
        qVar.f41331c = f10;
        arrayList.add(qVar);
        this.f41339f += i5;
        while (true) {
            int i14 = this.f41339f;
            int i15 = this.f41334a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            q qVar2 = (q) arrayList.get(0);
            int i17 = qVar2.f41330b;
            if (i17 <= i16) {
                this.f41339f -= i17;
                arrayList.remove(0);
                int i18 = this.f41340g;
                if (i18 < 5) {
                    this.f41340g = i18 + 1;
                    qVarArr[i18] = qVar2;
                }
            } else {
                qVar2.f41330b = i17 - i16;
                this.f41339f -= i16;
            }
        }
    }

    public final float b() {
        int i5 = this.f41337d;
        ArrayList arrayList = this.f41335b;
        if (i5 != 0) {
            Collections.sort(arrayList, f41333i);
            this.f41337d = 0;
        }
        float f10 = 0.5f * this.f41339f;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            q qVar = (q) arrayList.get(i11);
            i10 += qVar.f41330b;
            if (i10 >= f10) {
                return qVar.f41331c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) AbstractC3256n.e(arrayList, 1)).f41331c;
    }
}
