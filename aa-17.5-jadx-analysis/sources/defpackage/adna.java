package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class adna implements adnb {
    private final Object a;
    private final Object b;
    private final /* synthetic */ int c;

    public adna(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.adnb
    public final int a() {
        if (this.c != 0) {
            return ((Object[]) this.b).length;
        }
        return 1;
    }

    @Override // defpackage.adnb
    public final adnb c(Object obj, Object obj2, int i, int i2) {
        int length;
        int i3 = this.c;
        Object obj3 = this.a;
        int i4 = 0;
        if (i3 == 0) {
            int iHashCode = obj3.hashCode();
            return iHashCode != i ? admz.b(new adna(obj, obj2, 0), i, this, iHashCode, i2) : obj3 == obj ? new adna(obj, obj2, 0) : new adna(new Object[]{obj3, obj}, new Object[]{this.b, obj2}, 1);
        }
        Object[] objArr = (Object[]) obj3;
        int iHashCode2 = objArr[0].hashCode();
        if (iHashCode2 != i) {
            return admz.b(new adna(obj, obj2, 0), i, this, iHashCode2, i2);
        }
        while (true) {
            length = objArr.length;
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (objArr[i4] == obj) {
                break;
            }
            i4++;
        }
        if (i4 != -1) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            Object[] objArrCopyOf2 = Arrays.copyOf((Object[]) this.b, length);
            objArrCopyOf[i4] = obj;
            objArrCopyOf2[i4] = obj2;
            return new adna(objArrCopyOf, objArrCopyOf2, 1);
        }
        int i5 = length + 1;
        Object obj4 = this.b;
        Object[] objArrCopyOf3 = Arrays.copyOf(objArr, i5);
        Object[] objArrCopyOf4 = Arrays.copyOf((Object[]) obj4, i5);
        objArrCopyOf3[length] = obj;
        objArrCopyOf4[length] = obj2;
        return new adna(objArrCopyOf3, objArrCopyOf4, 1);
    }

    @Override // defpackage.adnb
    public final Object d(Object obj, int i, int i2) {
        if (this.c == 0) {
            if (this.a == obj) {
                return this.b;
            }
            return null;
        }
        int i3 = 0;
        while (true) {
            Object[] objArr = (Object[]) this.a;
            if (i3 >= objArr.length) {
                return null;
            }
            if (objArr[i3] == obj) {
                return ((Object[]) this.b)[i3];
            }
            i3++;
        }
    }

    public final String toString() {
        int i = 0;
        if (this.c == 0) {
            return String.format("Leaf(key=%s value=%s)", this.a, this.b);
        }
        StringBuilder sb = new StringBuilder("CollisionLeaf(");
        while (true) {
            Object[] objArr = (Object[]) this.b;
            if (i >= objArr.length) {
                sb.append(")");
                return sb.toString();
            }
            sb.append("(key=");
            sb.append(((Object[]) this.a)[i]);
            sb.append(" value=");
            sb.append(objArr[i]);
            sb.append(") ");
            i++;
        }
    }
}
