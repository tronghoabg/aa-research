package J5;

import T5.C0829b;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5650a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: b, reason: collision with root package name */
    public static final S3.c f5651b = new S3.c(new F5.d(10));

    /* renamed from: c, reason: collision with root package name */
    public static final S3.c f5652c = new S3.c(new F5.d(11));

    public static void a(ArrayList arrayList, int i5) {
        switch (i5) {
            case 0:
                arrayList.add(new S5.c(1));
                break;
            case 1:
                arrayList.add(new S5.c(2));
                break;
            case 2:
                arrayList.add(new C0829b());
                break;
            case 3:
                arrayList.add(new K5.a());
                break;
            case 4:
                k kVarL = f5651b.l(0);
                if (kVarL == null) {
                    arrayList.add(new M5.b());
                    break;
                } else {
                    arrayList.add(kVarL);
                    break;
                }
            case 5:
                arrayList.add(new N5.b());
                break;
            case 6:
                arrayList.add(new P5.c());
                break;
            case 7:
                arrayList.add(new Q5.d());
                break;
            case 8:
                arrayList.add(new R5.h());
                arrayList.add(new R5.k());
                break;
            case 9:
                arrayList.add(new S5.c(0));
                break;
            case 10:
                arrayList.add(new T5.w());
                break;
            case 11:
                arrayList.add(new T5.z());
                break;
            case 12:
                U5.d dVar = new U5.d();
                dVar.f12334c = 0;
                dVar.f12335d = -1L;
                dVar.f12337f = -1;
                dVar.f12338g = -1L;
                arrayList.add(dVar);
                break;
            case 14:
                arrayList.add(new O5.a());
                break;
            case 15:
                k kVarL2 = f5652c.l(new Object[0]);
                if (kVarL2 != null) {
                    arrayList.add(kVarL2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new L5.b());
                break;
        }
    }
}
