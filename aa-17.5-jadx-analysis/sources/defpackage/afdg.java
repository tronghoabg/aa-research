package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class afdg extends afar implements RandomAccess, Serializable, List, afdf {
    private final Enum[] a;

    public afdg(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new afdh(this.a);
    }

    @Override // defpackage.afam
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.afam, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        return ((Enum) woy.cW(this.a, r3.ordinal())) == r3;
    }

    @Override // defpackage.afar, java.util.List
    public final /* synthetic */ Object get(int i) {
        Enum[] enumArr = this.a;
        a.aG(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.afar, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        Enum[] enumArr = this.a;
        int iOrdinal = r3.ordinal();
        if (((Enum) woy.cW(enumArr, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.afar, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
