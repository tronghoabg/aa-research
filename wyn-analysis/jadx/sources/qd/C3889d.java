package qd;

import A.d0;
import java.util.ArrayList;

/* renamed from: qd.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3889d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44221a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f44222b;

    public C3889d(d0 d0Var) {
        ArrayList arrayList = d0Var.f140a;
        this.f44222b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String toString() {
        switch (this.f44221a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                String[] strArr = this.f44222b;
                int length = strArr.length / 2;
                for (int i5 = 0; i5 < length; i5++) {
                    int i10 = i5 * 2;
                    String str = null;
                    sb2.append((i10 < 0 || i10 >= strArr.length) ? null : strArr[i10]);
                    sb2.append(": ");
                    int i11 = i10 + 1;
                    if (i11 >= 0 && i11 < strArr.length) {
                        str = strArr[i11];
                    }
                    sb2.append(str);
                    sb2.append("\n");
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public C3889d(String[] strArr) {
        this.f44222b = strArr;
    }
}
