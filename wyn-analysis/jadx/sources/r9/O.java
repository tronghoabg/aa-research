package r9;

import A7.C0295v;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Iterator;
import ka.AbstractC3230e0;
import ka.C3249k1;
import ka.C3252l1;
import ne.C3618a;
import p9.C3776A;

/* loaded from: classes4.dex */
public final class O implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final K f44590a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.v f44591b;

    /* renamed from: c, reason: collision with root package name */
    public int f44592c;

    /* renamed from: d, reason: collision with root package name */
    public long f44593d;

    /* renamed from: e, reason: collision with root package name */
    public s9.o f44594e = s9.o.f45389b;

    /* renamed from: f, reason: collision with root package name */
    public long f44595f;

    public O(K k, a2.v vVar) {
        this.f44590a = k;
        this.f44591b = vVar;
    }

    @Override // r9.Q
    public final void a(c9.d dVar, int i5) throws SQLException {
        K k = this.f44590a;
        SQLiteStatement sQLiteStatementCompileStatement = k.f44582l.compileStatement("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        Iterator it = dVar.iterator();
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                return;
            }
            s9.h hVar = (s9.h) c0295v.next();
            Object[] objArr = {Integer.valueOf(i5), AbstractC3230e0.n(hVar.f45375a)};
            sQLiteStatementCompileStatement.clearBindings();
            K.c0(sQLiteStatementCompileStatement, objArr);
            sQLiteStatementCompileStatement.executeUpdateDelete();
            k.f44581j.m(hVar);
        }
    }

    @Override // r9.Q
    public final void b(S s10) {
        boolean z2;
        l(s10);
        int i5 = this.f44592c;
        int i10 = s10.f44597b;
        boolean z10 = true;
        if (i10 > i5) {
            this.f44592c = i10;
            z2 = true;
        } else {
            z2 = false;
        }
        long j8 = this.f44593d;
        long j10 = s10.f44598c;
        if (j10 > j8) {
            this.f44593d = j10;
        } else {
            z10 = z2;
        }
        if (z10) {
            m();
        }
    }

    @Override // r9.Q
    public final void c(c9.d dVar, int i5) throws SQLException {
        K k = this.f44590a;
        SQLiteStatement sQLiteStatementCompileStatement = k.f44582l.compileStatement("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        Iterator it = dVar.iterator();
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                return;
            }
            s9.h hVar = (s9.h) c0295v.next();
            Object[] objArr = {Integer.valueOf(i5), AbstractC3230e0.n(hVar.f45375a)};
            sQLiteStatementCompileStatement.clearBindings();
            K.c0(sQLiteStatementCompileStatement, objArr);
            sQLiteStatementCompileStatement.executeUpdateDelete();
            k.f44581j.m(hVar);
        }
    }

    @Override // r9.Q
    public final S d(C3776A c3776a) {
        String strB = c3776a.b();
        C3618a c3618aG0 = this.f44590a.g0("SELECT target_proto FROM targets WHERE canonical_id = ?");
        c3618aG0.b(strB);
        Cursor cursorI = c3618aG0.i();
        S s10 = null;
        while (cursorI.moveToNext()) {
            try {
                S sK = k(cursorI.getBlob(0));
                if (c3776a.equals(sK.f44596a)) {
                    s10 = sK;
                }
            } catch (Throwable th) {
                if (cursorI != null) {
                    try {
                        cursorI.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorI.close();
        return s10;
    }

    @Override // r9.Q
    public final void e(s9.o oVar) {
        this.f44594e = oVar;
        m();
    }

    @Override // r9.Q
    public final void f(S s10) {
        l(s10);
        int i5 = this.f44592c;
        int i10 = s10.f44597b;
        if (i10 > i5) {
            this.f44592c = i10;
        }
        long j8 = this.f44593d;
        long j10 = s10.f44598c;
        if (j10 > j8) {
            this.f44593d = j10;
        }
        this.f44595f++;
        m();
    }

    @Override // r9.Q
    public final int g() {
        return this.f44592c;
    }

    @Override // r9.Q
    public final c9.d h(int i5) {
        c9.d dVarA = s9.h.f45374c;
        C3618a c3618aG0 = this.f44590a.g0("SELECT path FROM target_documents WHERE target_id = ?");
        c3618aG0.b(Integer.valueOf(i5));
        Cursor cursorI = c3618aG0.i();
        while (cursorI.moveToNext()) {
            try {
                dVarA = dVarA.a(new s9.h(AbstractC3230e0.l(cursorI.getString(0))));
            } catch (Throwable th) {
                if (cursorI != null) {
                    try {
                        cursorI.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorI.close();
        return dVarA;
    }

    @Override // r9.Q
    public final s9.o i() {
        return this.f44594e;
    }

    @Override // r9.Q
    public final void j(int i5) {
        this.f44590a.f0("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i5));
    }

    public final S k(byte[] bArr) {
        try {
            return this.f44591b.u(u9.j.s(bArr));
        } catch (InvalidProtocolBufferException e7) {
            A6.c.s("TargetData failed to parse: %s", e7);
            throw null;
        }
    }

    public final void l(S s10) {
        C3776A c3776a = s10.f44596a;
        String strB = c3776a.b();
        s9.o oVar = s10.f44600e;
        s8.q qVar = oVar.f45390a;
        a2.v vVar = this.f44591b;
        vVar.getClass();
        y yVar = y.f44679a;
        y yVar2 = s10.f44599d;
        A6.c.z(yVar.equals(yVar2), "Only queries with purpose %s may be stored, got %s", yVar, yVar2);
        u9.h hVarR = u9.j.r();
        int i5 = s10.f44597b;
        hVarR.h(i5);
        long j8 = s10.f44598c;
        hVarR.d(j8);
        v9.o oVar2 = (v9.o) vVar.f17322b;
        hVarR.c(v9.o.l(s10.f44601f.f45390a));
        hVarR.g(v9.o.l(oVar.f45390a));
        ByteString byteString = s10.f44602g;
        hVarR.f(byteString);
        if (c3776a.e()) {
            C3249k1 c3249k1F = C3252l1.f();
            c3249k1F.a(v9.o.k(oVar2.f47101a, c3776a.f43310d));
            hVarR.b((C3252l1) c3249k1F.build());
        } else {
            hVarR.e(oVar2.j(c3776a));
        }
        this.f44590a.f0("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(i5), strB, Long.valueOf(qVar.f45352a), Integer.valueOf(qVar.f45353b), byteString.toByteArray(), Long.valueOf(j8), ((u9.j) hVarR.build()).toByteArray());
    }

    public final void m() {
        this.f44590a.f0("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f44592c), Long.valueOf(this.f44593d), Long.valueOf(this.f44594e.f45390a.f45352a), Integer.valueOf(this.f44594e.f45390a.f45353b), Long.valueOf(this.f44595f));
    }
}
