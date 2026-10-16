package e.a;

import java.util.Arrays;

/* compiled from: WazeSource */
/* renamed from: e.a.do, reason: invalid class name */
/* loaded from: classes7.dex */
final class Cdo implements dp {

    /* renamed from: a, reason: collision with root package name */
    private final Object f47342a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f47343b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f47344c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    Cdo(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this(new Object[]{obj, obj3}, new Object[]{obj2, obj4}, 1);
        this.f47344c = i2;
    }

    @Override // e.a.dp
    public final int a() {
        if (this.f47344c != 0) {
            return ((Object[]) this.f47343b).length;
        }
        return 1;
    }

    @Override // e.a.dp
    public final dp c(Object obj, Object obj2, int i2, int i3) {
        int length;
        int i4 = this.f47344c;
        Object obj3 = this.f47342a;
        int i5 = 0;
        if (i4 == 0) {
            int iHashCode = obj3.hashCode();
            return iHashCode != i2 ? dn.b(new Cdo(obj, obj2, 0), i2, this, iHashCode, i3) : obj3 == obj ? new Cdo(obj, obj2, 0) : new Cdo(obj3, this.f47343b, obj, obj2, 1);
        }
        Object[] objArr = (Object[]) obj3;
        int iHashCode2 = objArr[0].hashCode();
        if (iHashCode2 != i2) {
            return dn.b(new Cdo(obj, obj2, 0), i2, this, iHashCode2, i3);
        }
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (objArr[i5] == obj) {
                break;
            }
            i5++;
        }
        if (i5 != -1) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            Object[] objArrCopyOf2 = Arrays.copyOf((Object[]) this.f47343b, length);
            objArrCopyOf[i5] = obj;
            objArrCopyOf2[i5] = obj2;
            return new Cdo(objArrCopyOf, objArrCopyOf2, 1);
        }
        int i6 = length + 1;
        Object obj4 = this.f47343b;
        Object[] objArrCopyOf3 = Arrays.copyOf(objArr, i6);
        Object[] objArrCopyOf4 = Arrays.copyOf((Object[]) obj4, i6);
        objArrCopyOf3[length] = obj;
        objArrCopyOf4[length] = obj2;
        return new Cdo(objArrCopyOf3, objArrCopyOf4, 1);
    }

    public final String toString() {
        int i2 = 0;
        if (this.f47344c == 0) {
            return String.format("Leaf(key=%s value=%s)", this.f47342a, this.f47343b);
        }
        StringBuilder sb = new StringBuilder("CollisionLeaf(");
        while (true) {
            Object[] objArr = (Object[]) this.f47343b;
            if (i2 >= objArr.length) {
                sb.append(")");
                return sb.toString();
            }
            sb.append("(key=");
            sb.append(((Object[]) this.f47342a)[i2]);
            sb.append(" value=");
            sb.append(objArr[i2]);
            sb.append(") ");
            i2++;
        }
    }

    private Cdo(Object[] objArr, Object[] objArr2, int i2) {
        this.f47344c = i2;
        this.f47342a = objArr;
        this.f47343b = objArr2;
    }

    public Cdo(Object obj, Object obj2, int i2) {
        this.f47344c = i2;
        this.f47342a = obj;
        this.f47343b = obj2;
    }
}
