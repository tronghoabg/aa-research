package K2;

import J5.h;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import org.apache.tika.fork.ForkServer;
import s2.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6334a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f6335b;

    /* renamed from: c, reason: collision with root package name */
    public int f6336c;

    /* renamed from: d, reason: collision with root package name */
    public int f6337d;

    /* renamed from: e, reason: collision with root package name */
    public long f6338e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6339f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6340g;

    public b(int i5) {
        switch (i5) {
            case 1:
                this.f6334a = new byte[8];
                this.f6335b = new ArrayDeque();
                this.f6339f = new P5.d();
                break;
            default:
                this.f6334a = new byte[8];
                this.f6335b = new ArrayDeque();
                this.f6339f = new e();
                break;
        }
    }

    public long a(h hVar, int i5) throws EOFException, InterruptedIOException {
        hVar.f(this.f6334a, 0, i5, false);
        long j8 = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            j8 = (j8 << 8) | (r0[i10] & ForkServer.ERROR);
        }
        return j8;
    }

    public long b(j jVar, int i5) throws EOFException, InterruptedIOException {
        jVar.f(this.f6334a, 0, i5, false);
        long j8 = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            j8 = (j8 << 8) | (r0[i10] & ForkServer.ERROR);
        }
        return j8;
    }
}
