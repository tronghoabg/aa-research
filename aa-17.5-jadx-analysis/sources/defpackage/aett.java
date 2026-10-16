package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class aett {
    public static final Object[] a = new Object[0];
    public static final Object[] b = new Object[0];

    public static void a(Object[] objArr, int i, int i2) {
        adqs.s(objArr.length, i, i2);
    }

    public static void b(Object[] objArr) {
        Arrays.sort(objArr, 0, objArr.length);
    }

    public static void c(Object[] objArr, Comparator comparator) {
        Arrays.sort(objArr, 0, objArr.length, comparator);
    }
}
