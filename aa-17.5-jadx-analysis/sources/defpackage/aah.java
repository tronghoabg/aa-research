package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class aah {
    public static final Object[] a = new Object[0];
    public static final aag b = new aag(0);

    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            ca.aa(a.bB(size, i, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            ca.Y(a.bB(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
        }
        if (i < 0) {
            ca.aa(a.bn(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 > size) {
            ca.aa(a.bB(size, i2, "toIndex (", ") is more than than the list size (", ")"));
        }
    }

    public static final aag c(Object obj, Object obj2) {
        aag aagVar = new aag(2);
        aagVar.p(obj);
        aagVar.p(obj2);
        return aagVar;
    }
}
