package net.zetetic.database.sqlcipher;

import A7.AbstractC0279p0;
import N0.a;
import android.database.DatabaseUtils;
import android.os.CancellationSignal;
import java.util.Arrays;
import o3.e;

/* loaded from: classes5.dex */
public abstract class SQLiteProgram extends SQLiteClosable implements e {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f41151h = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f41152b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41153c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41154d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f41155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41156f;

    /* renamed from: g, reason: collision with root package name */
    public final Object[] f41157g;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        this.f41152b = sQLiteDatabase;
        String strTrim = str.trim();
        this.f41153c = strTrim;
        int sqlStatementType = DatabaseUtils.getSqlStatementType(strTrim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.f41154d = false;
            this.f41155e = f41151h;
            this.f41156f = 0;
        } else {
            boolean z2 = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            SQLiteSession sQLiteSessionQ = sQLiteDatabase.Q();
            int iP = SQLiteDatabase.P(z2);
            sQLiteSessionQ.getClass();
            if (strTrim == null) {
                throw new IllegalArgumentException("sql must not be null.");
            }
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            sQLiteSessionQ.a(strTrim, iP, cancellationSignal);
            try {
                sQLiteSessionQ.f41160b.q(strTrim, sQLiteStatementInfo);
                sQLiteSessionQ.i();
                this.f41154d = sQLiteStatementInfo.f41169c;
                this.f41155e = sQLiteStatementInfo.f41168b;
                this.f41156f = sQLiteStatementInfo.f41167a;
            } catch (Throwable th) {
                sQLiteSessionQ.i();
                throw th;
            }
        }
        if (objArr != null && objArr.length > this.f41156f) {
            StringBuilder sb2 = new StringBuilder("Too many bind arguments.  ");
            sb2.append(objArr.length);
            sb2.append(" arguments were provided but the statement needs ");
            throw new IllegalArgumentException(AbstractC0279p0.j(this.f41156f, " arguments.", sb2));
        }
        int i5 = this.f41156f;
        if (i5 == 0) {
            this.f41157g = null;
            return;
        }
        Object[] objArr2 = new Object[i5];
        this.f41157g = objArr2;
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    @Override // o3.e
    public final void G(int i5, long j8) {
        h(i5, Long.valueOf(j8));
    }

    @Override // o3.e
    public final void H(int i5, byte[] bArr) {
        h(i5, bArr);
    }

    @Override // o3.e
    public final void M(double d3, int i5) {
        h(i5, Double.valueOf(d3));
    }

    @Override // o3.e
    public final void N(int i5) {
        h(i5, null);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public final void b() {
        Object[] objArr = this.f41157g;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public final void h(int i5, Object obj) {
        int i10 = this.f41156f;
        if (i5 < 1 || i5 > i10) {
            throw new IllegalArgumentException(a.e("Cannot bind argument at index ", i5, " because the index is out of range.  The statement has ", i10, " parameters."));
        }
        this.f41157g[i5 - 1] = obj;
    }

    @Override // o3.e
    public final void x(int i5, String str) {
        if (str == null) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "the bind value at index ", " is null"));
        }
        h(i5, str);
    }
}
