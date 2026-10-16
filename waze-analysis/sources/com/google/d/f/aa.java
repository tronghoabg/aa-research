package com.google.d.f;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.d.d.fo;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class aa<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f7669a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f7670b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7671c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7672d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7673e;

    private aa(String str, Class cls, boolean z, boolean z2) {
        fo.n(str);
        this.f7669a = str;
        this.f7670b = cls;
        this.f7671c = z;
        this.f7672d = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j2 = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j2 |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f7673e = j2;
    }

    public static aa d(String str, Class cls) {
        return new aa(str, cls, false, false);
    }

    protected void a(Iterator it, z zVar) {
        while (it.hasNext()) {
            b(it.next(), zVar);
        }
    }

    protected void b(Object obj, z zVar) {
        zVar.a(this.f7669a, obj);
    }

    public final long c() {
        return this.f7673e;
    }

    public final Object e(Object obj) {
        return this.f7670b.cast(obj);
    }

    public final String f() {
        return this.f7669a;
    }

    public final void g(Object obj, z zVar) {
        if (!this.f7672d || com.google.d.f.b.ae.a() <= 20) {
            b(obj, zVar);
        } else {
            zVar.a(this.f7669a, obj);
        }
    }

    public final void h(Iterator it, z zVar) {
        fo.m(this.f7671c, "non repeating key");
        if (!this.f7672d || com.google.d.f.b.ae.a() <= 20) {
            a(it, zVar);
        } else {
            while (it.hasNext()) {
                zVar.a(this.f7669a, it.next());
            }
        }
    }

    public final boolean i() {
        return this.f7671c;
    }

    public final String toString() {
        Class cls = this.f7670b;
        return getClass().getName() + DomExceptionUtils.SEPARATOR + this.f7669a + "[" + cls.getName() + "]";
    }

    protected aa(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }
}
