package com.google.d.d;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class bq<K, V> {

    /* renamed from: a, reason: collision with root package name */
    Object[] f7461a;

    /* renamed from: b, reason: collision with root package name */
    int f7462b;

    /* renamed from: c, reason: collision with root package name */
    bp f7463c;

    bq(int i2) {
        this.f7461a = new Object[i2 + i2];
        this.f7462b = 0;
    }

    private final bs f(boolean z) {
        bp bpVar;
        bp bpVar2;
        if (z && (bpVar2 = this.f7463c) != null) {
            throw bpVar2.a();
        }
        ex exVarM = ex.m(this.f7462b, this.f7461a, this);
        if (!z || (bpVar = this.f7463c) == null) {
            return exVarM;
        }
        throw bpVar.a();
    }

    private final void g(int i2) {
        Object[] objArr = this.f7461a;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            this.f7461a = Arrays.copyOf(objArr, bg.e(length, i3));
        }
    }

    public final bs a() {
        return f(false);
    }

    public bs b() {
        return f(true);
    }

    public final void c(Map.Entry entry) {
        d(entry.getKey(), entry.getValue());
    }

    public void d(Object obj, Object obj2) {
        g(this.f7462b + 1);
        fo.af(obj, obj2);
        Object[] objArr = this.f7461a;
        int i2 = this.f7462b;
        int i3 = i2 + i2;
        objArr[i3] = obj;
        objArr[i3 + 1] = obj2;
        this.f7462b = i2 + 1;
    }

    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            g(this.f7462b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c((Map.Entry) it.next());
        }
    }

    public bq() {
        this(4);
    }
}
