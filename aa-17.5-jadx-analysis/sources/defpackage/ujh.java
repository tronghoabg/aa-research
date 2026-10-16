package defpackage;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class ujh extends AbstractList implements RandomAccess {
    private final /* synthetic */ int a;
    private final abfp b;

    public ujh(abfk abfkVar, int i, byte[] bArr) {
        this.a = i;
        this.b = abfkVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            try {
                return Integer.valueOf(((abfk) this.b).e(i).b);
            } catch (abon unused) {
                return -1;
            }
        }
        if (i2 == 1) {
            return Long.valueOf(((abfk) this.b).d(i));
        }
        abfp abfpVar = this.b;
        if (i2 == 2) {
            return Long.valueOf(((abfl) abfpVar).d(i));
        }
        try {
            return Integer.valueOf(((abfl) abfpVar).e(i).b);
        } catch (abon unused2) {
            return -1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.a;
        if (i == 0) {
            return ((abfk) this.b).a();
        }
        if (i == 1) {
            return ((abfk) this.b).c.b;
        }
        abfp abfpVar = this.b;
        return i != 2 ? ((abfl) abfpVar).a() : ((abfl) abfpVar).c.b;
    }

    public ujh(abfk abfkVar, int i) {
        this.a = i;
        this.b = abfkVar;
    }

    public ujh(abfl abflVar, int i) {
        this.a = i;
        this.b = abflVar;
    }

    public ujh(abfl abflVar, int i, byte[] bArr) {
        this.a = i;
        this.b = abflVar;
    }
}
