package l8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: l8.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3403E {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f40044a;

    /* renamed from: b, reason: collision with root package name */
    public int f40045b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40046c;

    public AbstractC3403E(int i5) {
        AbstractC3437s.d(i5, "initialCapacity");
        this.f40044a = new Object[i5];
        this.f40045b = 0;
    }

    public static int f(int i5, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i10 <= i5) {
            return i5;
        }
        int iHighestOneBit = i5 + (i5 >> 1) + 1;
        if (iHighestOneBit < i10) {
            iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        }
        return iHighestOneBit < 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f40044a;
        int i5 = this.f40045b;
        this.f40045b = i5 + 1;
        objArr[i5] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        AbstractC3437s.b(length, objArr);
        e(length);
        System.arraycopy(objArr, 0, this.f40044a, this.f40045b, length);
        this.f40045b += length;
    }

    public abstract AbstractC3403E c(Object obj);

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof AbstractC3404F) {
                this.f40045b = ((AbstractC3404F) collection).b(this.f40045b, this.f40044a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void e(int i5) {
        Object[] objArr = this.f40044a;
        int iF = f(objArr.length, this.f40045b + i5);
        if (iF > objArr.length || this.f40046c) {
            this.f40044a = Arrays.copyOf(this.f40044a, iF);
            this.f40046c = false;
        }
    }
}
