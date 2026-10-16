package com.google.android.libraries.phenotype.client.b;

import com.google.d.b.an;
import com.google.v.v;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    final long f5973a;

    /* renamed from: b, reason: collision with root package name */
    final String f5974b;

    /* renamed from: c, reason: collision with root package name */
    final int f5975c;

    /* renamed from: d, reason: collision with root package name */
    final long f5976d;

    /* renamed from: e, reason: collision with root package name */
    final Object f5977e;

    /* renamed from: f, reason: collision with root package name */
    private final RuntimeException f5978f;

    g(long j2, String str, int i2, long j3, Object obj) {
        an.l(((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) == 0) == (str != null));
        this.f5973a = j2;
        this.f5974b = str;
        this.f5975c = i2;
        this.f5976d = j3;
        this.f5977e = obj;
        if (i2 != 5) {
            this.f5978f = null;
            return;
        }
        if (obj == null) {
            this.f5978f = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof v)) {
            this.f5978f = null;
        } else {
            this.f5978f = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
        }
    }

    public final Object a() {
        int i2 = this.f5975c;
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return Long.valueOf(this.f5976d);
        }
        if (i2 == 3) {
            return Double.valueOf(Double.longBitsToDouble(this.f5976d));
        }
        if (i2 == 4) {
            Object obj = this.f5977e;
            an.B(obj);
            return obj;
        }
        if (i2 != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        Object obj2 = this.f5977e;
        an.B(obj2);
        try {
            return obj2 instanceof byte[] ? (byte[]) obj2 : ((v) obj2).x();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f5978f;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    public final String b() {
        String str = this.f5974b;
        return str != null ? str : Long.toString(this.f5973a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        g gVar = (g) obj;
        long j2 = gVar.f5973a;
        long j3 = this.f5973a;
        int iCompare = Long.compare(j3, j2);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j3 != 0) {
            return 0;
        }
        String str = this.f5974b;
        an.B(str);
        String str2 = gVar.f5974b;
        an.B(str2);
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5973a == gVar.f5973a && Objects.equals(this.f5974b, gVar.f5974b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5973a), this.f5974b);
    }

    public final String toString() {
        return b() + ":" + String.valueOf(a());
    }
}
