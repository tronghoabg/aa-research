package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ttz implements ttv {
    protected final abgl a;
    long b = 0;
    final tty c = new tty();
    protected usz d = null;
    protected final ukz e;

    protected ttz(abgl abglVar, ukz ukzVar) {
        this.a = abglVar;
        this.e = ukzVar;
    }

    @Override // defpackage.ttv
    public final ukp b(ukp ukpVar, too tooVar) {
        int iBinarySearch;
        int i = ukpVar.a;
        uky ukyVarE = e(tooVar);
        byte b = -1;
        if (i <= 127) {
            byte[] bArr = ukyVarE.c;
            if (bArr.length != 0 && (iBinarySearch = Arrays.binarySearch(bArr, (byte) i)) > 0) {
                b = bArr[iBinarySearch - 1];
            }
        }
        if (b < 0) {
            return null;
        }
        return ukpVar.h(b);
    }

    @Override // defpackage.ttv
    public final List c(ukp ukpVar, too tooVar) {
        int i;
        int iBinarySearch;
        byte[] bArr = e(tooVar).c;
        int length = bArr.length;
        byte b = -1;
        if (length != 0 && (i = ukpVar.a) <= 127 && (iBinarySearch = Arrays.binarySearch(bArr, (byte) i)) >= 0 && iBinarySearch != length - 1) {
            b = bArr[iBinarySearch + 1];
        }
        if (b < 0) {
            int i2 = yfq.d;
            return yls.a;
        }
        int i3 = b - ukpVar.a;
        int i4 = 1 << i3;
        ArrayList arrayList = new ArrayList(i4 * i4);
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(new ukp(b, (ukpVar.b << i3) + i6, (ukpVar.c << i3) + i5, ukpVar.d));
            }
        }
        return arrayList;
    }

    @Override // defpackage.ttv
    public final void d(too tooVar) {
        e(tooVar);
    }

    protected final uky e(too tooVar) {
        return this.e.a(tooVar, this.a);
    }

    protected final void f(List list, too tooVar) {
        if (list.size() > 1) {
            tty ttyVar = this.c;
            ttyVar.a = tooVar.a;
            ttyVar.b = tooVar.b;
            Collections.sort(list, ttyVar);
        }
    }
}
