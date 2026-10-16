package O0;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f8780a;

    /* renamed from: b, reason: collision with root package name */
    public int f8781b;

    public d(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f8780a = new Object[i5];
    }

    public Object a() {
        int i5 = this.f8781b;
        if (i5 <= 0) {
            return null;
        }
        int i10 = i5 - 1;
        Object[] objArr = this.f8780a;
        Object obj = objArr[i10];
        AbstractC3340k.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f8781b--;
        return obj;
    }

    public void b(b bVar) {
        int i5 = this.f8781b;
        Object[] objArr = this.f8780a;
        if (i5 < objArr.length) {
            objArr[i5] = bVar;
            this.f8781b = i5 + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z2;
        AbstractC3340k.e(instance, "instance");
        int i5 = this.f8781b;
        int i10 = 0;
        while (true) {
            objArr = this.f8780a;
            if (i10 >= i5) {
                z2 = false;
                break;
            }
            if (objArr[i10] == instance) {
                z2 = true;
                break;
            }
            i10++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f8781b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.f8781b = i11 + 1;
        return true;
    }

    public d() {
        this.f8780a = new Object[256];
    }
}
