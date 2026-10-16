package G6;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: G6.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0555t {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4634a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4635b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4636c;

    public C0555t() {
        this.f4634a = new ArrayList();
        this.f4635b = new ArrayList();
        this.f4636c = new ArrayList();
    }

    public String a(int i5, String str, long j8, long j10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4635b;
            int size = arrayList.size();
            ArrayList arrayList2 = this.f4634a;
            if (i10 >= size) {
                sb2.append((String) arrayList2.get(arrayList.size()));
                return sb2.toString();
            }
            sb2.append((String) arrayList2.get(i10));
            if (((Integer) arrayList.get(i10)).intValue() == 1) {
                sb2.append(str);
            } else {
                int iIntValue = ((Integer) arrayList.get(i10)).intValue();
                ArrayList arrayList3 = this.f4636c;
                if (iIntValue == 2) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i10), Long.valueOf(j8)));
                } else if (((Integer) arrayList.get(i10)).intValue() == 3) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i10), Integer.valueOf(i5)));
                } else if (((Integer) arrayList.get(i10)).intValue() == 4) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i10), Long.valueOf(j10)));
                }
            }
            i10++;
        }
    }

    public void b(String str, double d3, double d5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i5 = 0;
        while (true) {
            arrayList = this.f4634a;
            int size = arrayList.size();
            arrayList2 = this.f4635b;
            arrayList3 = this.f4636c;
            if (i5 >= size) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i5)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i5)).doubleValue();
            if (d3 < dDoubleValue || (dDoubleValue == d3 && d5 < dDoubleValue2)) {
                break;
            } else {
                i5++;
            }
        }
        arrayList.add(i5, str);
        arrayList3.add(i5, Double.valueOf(d3));
        arrayList2.add(i5, Double.valueOf(d5));
    }

    public C0555t(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f4634a = arrayList;
        this.f4635b = arrayList2;
        this.f4636c = arrayList3;
    }
}
