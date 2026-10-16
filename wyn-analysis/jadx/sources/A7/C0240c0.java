package A7;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import ka.AbstractC3230e0;
import r9.C3960q;
import z4.C4613c;

/* renamed from: A7.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0240c0 implements G4.a, r9.z {

    /* renamed from: a, reason: collision with root package name */
    public long f826a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f827b;

    /* renamed from: c, reason: collision with root package name */
    public Object f828c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f829d;

    /* renamed from: e, reason: collision with root package name */
    public Object f830e;

    public C0240c0(Z z2, long j8) {
        this.f830e = z2;
        AbstractC1732v.f("health_monitor");
        AbstractC1732v.b(j8 > 0);
        this.f827b = "health_monitor:start";
        this.f828c = "health_monitor:count";
        this.f829d = "health_monitor:value";
        this.f826a = j8;
    }

    @Override // r9.z
    public void a(s9.h hVar) {
        m(hVar);
    }

    @Override // r9.z
    public void b(s9.h hVar) {
        m(hVar);
    }

    @Override // r9.z
    public void c(s9.h hVar) {
        m(hVar);
    }

    @Override // r9.z
    public long d() {
        A6.c.z(this.f826a != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f826a;
    }

    public synchronized C4613c e() {
        try {
            if (((C4613c) this.f830e) == null) {
                this.f830e = C4613c.y((File) this.f828c, this.f826a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C4613c) this.f830e;
    }

    @Override // G4.a
    public void f(B4.d dVar, G9.e eVar) {
        G4.b bVarY;
        C4613c c4613cE;
        boolean z2;
        String strO = ((S3.c) this.f827b).o(dVar);
        S3.s sVar = (S3.s) this.f829d;
        synchronized (sVar) {
            try {
                bVarY = (G4.b) ((HashMap) sVar.f11009b).get(strO);
                if (bVarY == null) {
                    bVarY = ((xa.d) sVar.f11010c).y();
                    ((HashMap) sVar.f11009b).put(strO, bVarY);
                }
                bVarY.f4225b++;
            } finally {
            }
        }
        bVarY.f4224a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strO + " for for Key: " + dVar);
            }
            try {
                c4613cE = e();
            } catch (IOException e7) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e7);
                }
            }
            if (c4613cE.o(strO) != null) {
                return;
            }
            C0237b0 c0237b0H = c4613cE.h(strO);
            if (c0237b0H == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(strO));
            }
            try {
                if (((B4.b) eVar.f4685b).g(eVar.f4686c, c0237b0H.o(), (B4.g) eVar.f4687d)) {
                    C4613c.a((C4613c) c0237b0H.f815e, c0237b0H, true);
                    c0237b0H.f812b = true;
                }
                if (!z2) {
                    try {
                        c0237b0H.d();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!c0237b0H.f812b) {
                    try {
                        c0237b0H.d();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((S3.s) this.f829d).v(strO);
        }
    }

    @Override // r9.z
    public void g(s9.h hVar) {
        m(hVar);
    }

    @Override // G4.a
    public File h(B4.d dVar) {
        String strO = ((S3.c) this.f827b).o(dVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strO + " for for Key: " + dVar);
        }
        try {
            vb.e eVarO = e().o(strO);
            if (eVarO != null) {
                return ((File[]) eVarO.f47151a)[0];
            }
            return null;
        } catch (IOException e7) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e7);
            return null;
        }
    }

    @Override // r9.z
    public void i() {
        A6.c.z(this.f826a != -1, "Committing a transaction without having started one", new Object[0]);
        this.f826a = -1L;
    }

    @Override // r9.z
    public void j() {
        A6.c.z(this.f826a == -1, "Starting a transaction without committing the previous one", new Object[0]);
        J5.n nVar = (J5.n) this.f828c;
        long j8 = nVar.f5655a + 1;
        nVar.f5655a = j8;
        this.f826a = j8;
    }

    @Override // r9.z
    public void k(Y2.B b5) {
        this.f830e = b5;
    }

    @Override // r9.z
    public void l(r9.S s10) {
        ((r9.K) this.f827b).f44578g.b(s10.b(d()));
    }

    public void m(s9.h hVar) {
        ((r9.K) this.f827b).f0("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", AbstractC3230e0.n(hVar.f45375a), Long.valueOf(d()));
    }

    public void n() {
        Z z2 = (Z) this.f830e;
        z2.c0();
        ((C0273n0) z2.f421a).f985n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = z2.l0().edit();
        editorEdit.remove((String) this.f828c);
        editorEdit.remove((String) this.f829d);
        editorEdit.putLong((String) this.f827b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public C0240c0(r9.K k, J5.n nVar) {
        this.f826a = -1L;
        this.f827b = k;
        this.f829d = new C3960q(this, nVar);
    }

    public C0240c0(File file) {
        this.f829d = new S3.s((byte) 0, 5);
        this.f828c = file;
        this.f826a = 262144000L;
        this.f827b = new S3.c(6);
    }
}
