package f0;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2547c {

    /* renamed from: a, reason: collision with root package name */
    public final String f34738a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34739b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34740c;

    public AbstractC2547c(String str, long j8, int i5) {
        this.f34738a = str;
        this.f34739b = j8;
        this.f34740c = i5;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i5 < -1 || i5 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i5);

    public abstract float c(int i5);

    public boolean d() {
        return false;
    }

    public abstract float[] e(float[] fArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Class<?> cls = getClass();
        I i5 = H.f39741a;
        if (!AbstractC3340k.a(i5.getOrCreateKotlinClass(cls), i5.getOrCreateKotlinClass(obj.getClass()))) {
            return false;
        }
        AbstractC2547c abstractC2547c = (AbstractC2547c) obj;
        if (this.f34740c == abstractC2547c.f34740c && this.f34738a.equals(abstractC2547c.f34738a)) {
            return AbstractC2546b.a(this.f34739b, abstractC2547c.f34739b);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f34738a.hashCode() * 31;
        int i5 = AbstractC2546b.f34737e;
        long j8 = this.f34739b;
        return ((iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f34740c;
    }

    public final String toString() {
        return this.f34738a + " (id=" + this.f34740c + ", model=" + ((Object) AbstractC2546b.b(this.f34739b)) + ')';
    }
}
