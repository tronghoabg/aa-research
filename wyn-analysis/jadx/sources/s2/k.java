package s2;

import Y2.C1293a;
import a3.C1327a;
import android.net.Uri;
import ba.C1521a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import t2.C4076a;
import wa.C4398a;
import x2.C4457a;
import y2.C4540b;

/* loaded from: classes.dex */
public final class k implements p {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f44902h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: i, reason: collision with root package name */
    public static final C1521a f44903i = new C1521a(new m9.B(17));

    /* renamed from: j, reason: collision with root package name */
    public static final C1521a f44904j = new C1521a(new m9.B(18));

    /* renamed from: a, reason: collision with root package name */
    public boolean f44905a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44906b;

    /* renamed from: c, reason: collision with root package name */
    public int f44907c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f44908d;

    /* renamed from: g, reason: collision with root package name */
    public int f44911g;

    /* renamed from: f, reason: collision with root package name */
    public C4398a f44910f = new C4398a(24);

    /* renamed from: e, reason: collision with root package name */
    public boolean f44909e = true;

    @Override // s2.p
    public final synchronized m[] a(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f44902h;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iX = gc.b.x((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iX != -1) {
                b(arrayList, iX);
            }
            int iY = gc.b.y(uri);
            if (iY != -1 && iY != iX) {
                b(arrayList, iY);
            }
            for (int i5 = 0; i5 < 21; i5++) {
                int i10 = iArr[i5];
                if (i10 != iX && i10 != iY) {
                    b(arrayList, i10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (m[]) arrayList.toArray(new m[arrayList.size()]);
    }

    public final void b(ArrayList arrayList, int i5) {
        switch (i5) {
            case 0:
                arrayList.add(new C1293a());
                break;
            case 1:
                arrayList.add(new Y2.c());
                break;
            case 2:
                arrayList.add(new Y2.d((this.f44905a ? 1 : 0) | (this.f44906b ? 2 : 0)));
                break;
            case 3:
                arrayList.add(new C4076a((this.f44905a ? 1 : 0) | (this.f44906b ? 2 : 0)));
                break;
            case 4:
                m mVarX = f44903i.x(0);
                if (mVarX == null) {
                    arrayList.add(new C4457a());
                    break;
                } else {
                    arrayList.add(mVarX);
                    break;
                }
            case 5:
                arrayList.add(new C4540b());
                break;
            case 6:
                arrayList.add(new K2.d(this.f44910f, this.f44909e ? 0 : 2));
                break;
            case 7:
                arrayList.add(new L2.d(this.f44907c | (this.f44905a ? 1 : 0) | (this.f44906b ? 2 : 0)));
                break;
            case 8:
                C4398a c4398a = this.f44910f;
                int i10 = this.f44909e ? 0 : 32;
                C3407I c3407i = AbstractC3409K.f40056b;
                arrayList.add(new M2.l(c4398a, i10, null, null, e0.f40101e, null));
                arrayList.add(new M2.o(this.f44910f, this.f44909e ? 0 : 16));
                break;
            case 9:
                arrayList.add(new N2.d());
                break;
            case 10:
                arrayList.add(new Y2.v());
                break;
            case 11:
                if (this.f44908d == null) {
                    C3407I c3407i2 = AbstractC3409K.f40056b;
                    this.f44908d = e0.f40101e;
                }
                arrayList.add(new Y2.y(1, !this.f44909e ? 1 : 0, this.f44910f, new Q1.u(0L), new Y2.f(0, this.f44908d)));
                break;
            case 12:
                Z2.c cVar = new Z2.c();
                cVar.f16947c = 0;
                cVar.f16948d = -1L;
                cVar.f16950f = -1;
                cVar.f16951g = -1L;
                arrayList.add(cVar);
                break;
            case 14:
                arrayList.add(new O2.a(this.f44911g));
                break;
            case 15:
                m mVarX2 = f44904j.x(new Object[0]);
                if (mVarX2 != null) {
                    arrayList.add(mVarX2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new u2.b(1 ^ (this.f44909e ? 1 : 0), this.f44910f));
                break;
            case 17:
                arrayList.add(new O2.a((byte) 0, 0));
                break;
            case 18:
                arrayList.add(new C1327a(0));
                break;
            case 19:
                arrayList.add(new O2.a((byte) 0, 1));
                break;
            case 20:
                arrayList.add(new C1327a(2));
                break;
            case 21:
                arrayList.add(new C1327a(1));
                break;
        }
    }

    public final synchronized void c(boolean z2) {
        this.f44906b = z2;
    }

    public final synchronized void d(int i5) {
        this.f44907c = i5;
    }
}
