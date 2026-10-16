package defpackage;

import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class iks {
    public volatile jbw a;
    public volatile rwp b;
    public int[] c;
    public boolean d;
    final /* synthetic */ ikt e;
    private boolean f;

    public iks(ikt iktVar) {
        this.e = iktVar;
    }

    private final void f() throws InterruptedException {
        while (this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final abow a(xny xnyVar) {
        try {
            jbw jbwVar = this.a;
            if (jbwVar != null) {
                return jbwVar.h(xnyVar.A);
            }
            if (this.b == null) {
                return null;
            }
            synchronized (this) {
                f();
                if (this.b != null) {
                    return jbw.i(xnyVar, this.b.n(xnyVar.A));
                }
                return a(xnyVar);
            }
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void b(int[] iArr) {
        this.f = true;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                break;
            }
            if (iArr[i] == 13) {
                this.f = false;
                break;
            }
            i++;
        }
        if (this.f) {
            ((ype) ((ype) ikt.a.f()).ai((char) 199)).u("No driving status, always restricted");
        }
        this.c = new int[iArr.length + (this.f ? 1 : 0)];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.c[i2] = jep.a(iArr[i2]);
        }
        if (this.f) {
            this.c[r5.length - 1] = 11;
        }
        Arrays.sort(this.c);
    }

    public final boolean c() {
        try {
            jbw jbwVar = this.a;
            if (jbwVar != null) {
                return jbwVar.a;
            }
            if (this.b == null) {
                return false;
            }
            synchronized (this) {
                f();
                if (this.b != null) {
                    return this.b.h();
                }
                return c();
            }
        } catch (RemoteException unused) {
            return false;
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(xny xnyVar, long j) {
        if (this.f && xnyVar == xny.SENSOR_DRIVING_STATUS_DATA) {
            return true;
        }
        try {
            jbw jbwVar = this.a;
            if (jbwVar != null) {
                return jbwVar.s(xnyVar, j);
            }
            if (this.b == null) {
                return false;
            }
            synchronized (this) {
                f();
                if (this.b != null) {
                    return this.b.gm(xnyVar.A, j);
                }
                return d(xnyVar, j);
            }
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int[] e() {
        int[] iArr = this.c;
        return iArr != null ? iArr : new int[]{11};
    }
}
