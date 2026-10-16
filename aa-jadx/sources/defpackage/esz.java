package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class esz extends defpackage.esy {
    private final defpackage.eta k;
    private android.net.Uri l;
    private java.lang.String[] m;
    private java.lang.String n;
    private java.lang.String[] o;
    private java.lang.String p;
    private android.database.Cursor q;
    private android.os.CancellationSignal r;

    public esz(android.content.Context context, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        super(context);
        this.k = new defpackage.eta(this);
        this.l = uri;
        this.m = strArr;
        this.n = str;
        this.o = strArr2;
        this.p = str2;
    }

    @Override // defpackage.esy
    public final void b() {
        synchronized (this) {
            android.os.CancellationSignal cancellationSignal = this.r;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }
    }

    @Override // defpackage.esy, defpackage.etb
    @java.lang.Deprecated
    public final void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.d(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(java.util.Arrays.toString(this.m));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(java.util.Arrays.toString(this.o));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.q);
    }

    @Override // defpackage.esy
    public final /* bridge */ /* synthetic */ void f(java.lang.Object obj) {
        android.database.Cursor cursor = (android.database.Cursor) obj;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // defpackage.esy
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public android.database.Cursor a() {
        synchronized (this) {
            if (this.b != null) {
                throw new defpackage.dwj();
            }
            this.r = new android.os.CancellationSignal();
        }
        try {
            try {
                android.database.Cursor cursorQuery = this.d.getContentResolver().query(this.l, this.m, this.n, this.o, this.p, this.r);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.getCount();
                        cursorQuery.registerContentObserver(this.k);
                    } catch (java.lang.RuntimeException e) {
                        cursorQuery.close();
                        throw e;
                    }
                }
                synchronized (this) {
                    this.r = null;
                }
                return cursorQuery;
            } catch (java.lang.Exception e2) {
                if (e2 instanceof android.os.OperationCanceledException) {
                    throw new defpackage.dwj();
                }
                throw e2;
            }
        } catch (java.lang.Throwable th) {
            synchronized (this) {
                this.r = null;
                throw th;
            }
        }
    }

    @Override // defpackage.etb
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void k(android.database.Cursor cursor) {
        if (this.g) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        android.database.Cursor cursor2 = this.q;
        this.q = cursor;
        if (this.e) {
            super.k(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // defpackage.etb
    protected final void l() {
        h();
        android.database.Cursor cursor = this.q;
        if (cursor != null && !cursor.isClosed()) {
            this.q.close();
        }
        this.q = null;
    }

    @Override // defpackage.etb
    public final void m() {
        android.database.Cursor cursor = this.q;
        if (cursor != null) {
            k(cursor);
        }
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        if (z || this.q == null) {
            g();
        }
    }

    @Override // defpackage.etb
    public final void n() {
        h();
    }

    public esz(android.content.Context context) {
        super(context);
        this.k = new defpackage.eta(this);
    }
}
