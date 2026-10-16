package defpackage;

import java.util.Collections;

/* loaded from: classes3.dex */
final class uji {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/model/LazyStyleEntryTable$LazyMultiZoomStyleTable");
    public final abfl b;
    public final abfk c;
    public final byte[] d;
    public final byte[] e;

    public uji(byte[] bArr, abft abftVar) throws IndexOutOfBoundsException {
        abfk abfkVar;
        abfn abfnVar;
        abfn abfnVar2;
        vaq.d();
        this.e = bArr;
        int iOrdinal = abftVar.ordinal();
        abfl abflVar = null;
        if (iOrdinal == 0) {
            abfl abflVar2 = new abfl(abnj.a());
            abflVar2.i(bArr, bArr.length);
            abflVar = abflVar2;
            abfkVar = null;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            abfkVar = new abfk(abnj.a());
            abfkVar.i(bArr, bArr.length);
        } else {
            abfkVar = null;
        }
        if (abflVar == null) {
            abfkVar.getClass();
        }
        this.b = abflVar;
        this.c = abfkVar;
        if (abflVar != null) {
            if (abflVar.d == null) {
                abflVar.d = new abfn();
            }
            if (abflVar.b.e(0)) {
                abflVar.d.b(abflVar.s, abflVar.b.b(0), abflVar.b.a(0));
                abfnVar2 = abflVar.d;
            } else {
                abflVar.d.b(abflVar.s, 0, 0);
                abfnVar2 = abflVar.d;
            }
            this.d = abfnVar2.toString().getBytes();
            return;
        }
        abfkVar.getClass();
        if (abfkVar.o == null) {
            abfkVar.o = new abfn();
        }
        if (abfkVar.b.e(2)) {
            abfkVar.o.b(abfkVar.s, abfkVar.b.b(2), abfkVar.b.a(2));
            abfnVar = abfkVar.o;
        } else {
            abfkVar.o.b(abfkVar.s, 0, 0);
            abfnVar = abfkVar.o;
        }
        this.d = abfnVar.toString().getBytes();
    }

    public final synchronized int a(long j) {
        int iBinarySearch;
        vaq.d();
        abfk abfkVar = this.c;
        if (abfkVar != null) {
            int iBinarySearch2 = Collections.binarySearch(new ujh(abfkVar, 0), Integer.valueOf((int) j));
            if (iBinarySearch2 >= 0) {
                try {
                    return abfkVar.e(iBinarySearch2).c;
                } catch (abon unused) {
                    return -1;
                }
            }
        } else {
            abfl abflVar = this.b;
            if (abflVar != null && (iBinarySearch = Collections.binarySearch(new ujh(abflVar, 3, (byte[]) null), Integer.valueOf((int) j))) >= 0) {
                try {
                    return abflVar.e(iBinarySearch).c;
                } catch (abon unused2) {
                    return -1;
                }
            }
        }
        return -1;
    }

    public final int b(long j) {
        int iBinarySearch;
        abfk abfkVar = this.c;
        if (abfkVar != null) {
            int iBinarySearch2 = Collections.binarySearch(new ujh(abfkVar, 1, (byte[]) null), Long.valueOf(j));
            if (iBinarySearch2 < 0 || abfkVar.d(iBinarySearch2) != j) {
                return -1;
            }
            return iBinarySearch2;
        }
        abfl abflVar = this.b;
        if (abflVar == null || (iBinarySearch = Collections.binarySearch(new ujh(abflVar, 2), Long.valueOf(j))) < 0 || abflVar.d(iBinarySearch) != j) {
            return -1;
        }
        return iBinarySearch;
    }
}
