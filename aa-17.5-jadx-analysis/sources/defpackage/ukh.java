package defpackage;

import android.util.SparseIntArray;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ukh {
    public static final yob c = yob.c("com/google/android/libraries/geo/mapcore/internal/model/StyleEntryTable");
    public static final ukf d = new ukf(0, new ujf[]{ujf.c}, new byte[]{0}, null, false);
    public static final byte[] e = new byte[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(defpackage.abcf r13, defpackage.ukg r14) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukh.a(abcf, ukg):void");
    }

    public static SparseIntArray j(abeu abeuVar) {
        if (abeuVar.b.size() <= 0 || abeuVar.c.size() <= 0) {
            return null;
        }
        int iMin = Math.min(abeuVar.b.size(), abeuVar.c.size());
        SparseIntArray sparseIntArray = new SparseIntArray(iMin);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return sparseIntArray;
            }
            sparseIntArray.put(abeuVar.b.e(iMin), abeuVar.c.e(iMin));
        }
    }

    public static uis k(List list, boolean z) throws IOException {
        uis uisVar = new uis(list, z);
        ukg ukgVar = new ukg(false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                uisVar.a(m((abdr) it.next(), ukgVar));
            } catch (IndexOutOfBoundsException e2) {
                throw new IOException("unpackProtoInTile: Error in parsing multiZoomStyle", e2);
            }
        }
        return uisVar;
    }

    public static ujj l(byte[] bArr, abft abftVar, achh achhVar) throws IOException {
        try {
            float f = achhVar.e;
            return new ujj(new uji(bArr, abftVar), achhVar.c);
        } catch (IndexOutOfBoundsException e2) {
            throw new IOException("unpackProtoLazily: Error in parsing multiZoomStyleTable", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ukf m(abdr abdrVar, ukg ukgVar) {
        abeu abeuVar = abdrVar.e;
        if (abeuVar == null) {
            abeuVar = abeu.a;
        }
        SparseIntArray sparseIntArrayJ = j(abeuVar);
        int size = abdrVar.c.size();
        if (size <= 0) {
            return new ukf(abdrVar.b, null, null, sparseIntArrayJ, ukgVar.c);
        }
        ukgVar.c(size);
        for (int i = 0; i < size; i++) {
            abcf abcfVar = (abcf) abdrVar.c.get(i);
            a(abcfVar, ukgVar);
            ukgVar.b(abcfVar.c);
        }
        ukf ukfVarA = ukgVar.a(abdrVar.b, sparseIntArrayJ);
        if (abdrVar.d.size() == 0) {
            return ukfVarA;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < abdrVar.d.size(); i2++) {
            abdq abdqVar = (abdq) abdrVar.d.get(i2);
            if (abdqVar.c.size() != 0) {
                ukgVar.c(abdqVar.c.size());
                for (int i3 = 0; i3 < abdqVar.c.size(); i3++) {
                    abcf abcfVar2 = (abcf) abdqVar.c.get(i3);
                    a(abcfVar2, ukgVar);
                    ukgVar.b(abcfVar2.c);
                }
                ukf ukfVarA2 = ukgVar.a(abdrVar.b, sparseIntArrayJ);
                for (int i4 = 0; i4 < abdqVar.b.size(); i4++) {
                    abgx abgxVarB = abgx.b(abdqVar.b.e(i4));
                    if (abgxVarB == null) {
                        abgxVarB = abgx.UNKNOWN;
                    }
                    map.put(abgxVarB, ukfVarA2);
                }
            }
        }
        ukfVarA.f = map;
        return ukfVarA;
    }

    public static void n(abdf abdfVar, uke[] ukeVarArr) {
        int i = abdfVar.b;
        if ((i & 16) == 0 && (i & 64) == 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= ukeVarArr.length) {
                for (uke ukeVar : ukeVarArr) {
                    if ((abdfVar.b & 16) != 0) {
                        String str = abdfVar.i;
                        usg usgVar = usg.NO_WRAP;
                        usf usfVar = usf.a;
                        ukeVar.j = new usf(str, usgVar);
                    }
                    if ((abdfVar.b & 64) != 0) {
                        String str2 = abdfVar.j;
                        usg usgVar2 = usg.NO_WRAP;
                        usf usfVar2 = usf.a;
                        ukeVar.k = new usf(str2, usgVar2);
                    }
                }
                return;
            }
            if (!ukeVarArr[i2].j.a() || !ukeVarArr[i2].k.a()) {
                return;
            } else {
                i2++;
            }
        }
    }

    public abstract ukf b(int i);

    @ResultIgnorabilityUnspecified
    public abstract ukf c(long j);

    public abstract ukf d(int i, aekf aekfVar, ukj ukjVar);

    public abstract List e();

    public abstract byte[] f();

    public abstract byte[] g();

    public abstract void h();

    public abstract ukf i();
}
