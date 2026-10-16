package G6;

import java.util.ArrayList;

/* renamed from: G6.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0556u {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f4637a;

    /* renamed from: b, reason: collision with root package name */
    public final double[] f4638b;

    /* renamed from: c, reason: collision with root package name */
    public final double[] f4639c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4640d;

    /* renamed from: e, reason: collision with root package name */
    public int f4641e;

    public C0556u(C0555t c0555t) {
        ArrayList arrayList = c0555t.f4635b;
        int size = arrayList.size();
        this.f4637a = (String[]) c0555t.f4634a.toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            dArr[i5] = ((Double) arrayList.get(i5)).doubleValue();
        }
        this.f4638b = dArr;
        ArrayList arrayList2 = c0555t.f4636c;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i10 = 0; i10 < size3; i10++) {
            dArr2[i10] = ((Double) arrayList2.get(i10)).doubleValue();
        }
        this.f4639c = dArr2;
        this.f4640d = new int[size];
        this.f4641e = 0;
    }
}
