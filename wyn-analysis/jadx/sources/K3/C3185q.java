package k3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: k3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3185q implements o3.f, o3.e {

    /* renamed from: i, reason: collision with root package name */
    public static final TreeMap f39245i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f39246a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f39247b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f39248c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f39249d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f39250e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f39251f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f39252g;

    /* renamed from: h, reason: collision with root package name */
    public int f39253h;

    public C3185q(int i5) {
        this.f39246a = i5;
        int i10 = i5 + 1;
        this.f39252g = new int[i10];
        this.f39248c = new long[i10];
        this.f39249d = new double[i10];
        this.f39250e = new String[i10];
        this.f39251f = new byte[i10][];
    }

    public static final C3185q d(int i5, String str) {
        TreeMap treeMap = f39245i;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i5));
            if (entryCeilingEntry == null) {
                C3185q c3185q = new C3185q(i5);
                c3185q.f39247b = str;
                c3185q.f39253h = i5;
                return c3185q;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C3185q c3185q2 = (C3185q) entryCeilingEntry.getValue();
            c3185q2.f39247b = str;
            c3185q2.f39253h = i5;
            return c3185q2;
        }
    }

    @Override // o3.e
    public final void G(int i5, long j8) {
        this.f39252g[i5] = 2;
        this.f39248c[i5] = j8;
    }

    @Override // o3.e
    public final void H(int i5, byte[] bArr) {
        this.f39252g[i5] = 5;
        this.f39251f[i5] = bArr;
    }

    @Override // o3.e
    public final void M(double d3, int i5) {
        this.f39252g[i5] = 3;
        this.f39249d[i5] = d3;
    }

    @Override // o3.e
    public final void N(int i5) {
        this.f39252g[i5] = 1;
    }

    @Override // o3.f
    public final String a() {
        String str = this.f39247b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // o3.f
    public final void b(o3.e eVar) {
        int i5 = this.f39253h;
        if (1 > i5) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f39252g[i10];
            if (i11 == 1) {
                eVar.N(i10);
            } else if (i11 == 2) {
                eVar.G(i10, this.f39248c[i10]);
            } else if (i11 == 3) {
                eVar.M(this.f39249d[i10], i10);
            } else if (i11 == 4) {
                String str = this.f39250e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.x(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f39251f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.H(i10, bArr);
            }
            if (i10 == i5) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h() {
        TreeMap treeMap = f39245i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f39246a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                AbstractC3340k.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i5 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i5;
                }
            }
        }
    }

    @Override // o3.e
    public final void x(int i5, String value) {
        AbstractC3340k.e(value, "value");
        this.f39252g[i5] = 4;
        this.f39250e[i5] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
