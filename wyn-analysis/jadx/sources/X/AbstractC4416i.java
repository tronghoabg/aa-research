package x;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC3340k;
import y.AbstractC4517a;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4416i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f47512a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f47513b = new Object();

    public static final void a(C4413f c4413f, int i5) {
        AbstractC3340k.e(c4413f, "<this>");
        c4413f.f47504a = new int[i5];
        c4413f.f47505b = new Object[i5];
    }

    public static final int b(C4413f c4413f, Object obj, int i5) {
        AbstractC3340k.e(c4413f, "<this>");
        int i10 = c4413f.f47506c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC4517a.a(c4413f.f47506c, i5, c4413f.f47504a);
            if (iA < 0 || AbstractC3340k.a(obj, c4413f.f47505b[iA])) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && c4413f.f47504a[i11] == i5) {
                if (AbstractC3340k.a(obj, c4413f.f47505b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && c4413f.f47504a[i12] == i5; i12--) {
                if (AbstractC3340k.a(obj, c4413f.f47505b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
