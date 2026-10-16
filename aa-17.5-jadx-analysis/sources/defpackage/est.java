package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class est extends ess {
    private final esu k;
    private Uri l;
    private String[] m;
    private String n;
    private String[] o;
    private String p;
    private Cursor q;
    private CancellationSignal r;

    public est(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.k = new esu(this);
        this.l = uri;
        this.m = strArr;
        this.n = str;
        this.o = strArr2;
        this.p = str2;
    }

    @Override // defpackage.ess
    public final void b() {
        synchronized (this) {
            CancellationSignal cancellationSignal = this.r;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }
    }

    @Override // defpackage.ess, defpackage.esv
    @Deprecated
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.d(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.m));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.o));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.q);
    }

    @Override // defpackage.ess
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // defpackage.ess
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Cursor a() {
        synchronized (this) {
            if (this.b != null) {
                throw new dwc();
            }
            this.r = new CancellationSignal();
        }
        try {
            try {
                Cursor cursorQuery = this.d.getContentResolver().query(this.l, this.m, this.n, this.o, this.p, this.r);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.getCount();
                        cursorQuery.registerContentObserver(this.k);
                    } catch (RuntimeException e) {
                        cursorQuery.close();
                        throw e;
                    }
                }
                synchronized (this) {
                    this.r = null;
                }
                return cursorQuery;
            } catch (Exception e2) {
                if (e2 instanceof OperationCanceledException) {
                    throw new dwc();
                }
                throw e2;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.r = null;
                throw th;
            }
        }
    }

    @Override // defpackage.esv
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void k(Cursor cursor) {
        if (this.g) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.q;
        this.q = cursor;
        if (this.e) {
            super.k(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // defpackage.esv
    protected final void l() {
        h();
        Cursor cursor = this.q;
        if (cursor != null && !cursor.isClosed()) {
            this.q.close();
        }
        this.q = null;
    }

    @Override // defpackage.esv
    public final void m() {
        Cursor cursor = this.q;
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

    @Override // defpackage.esv
    public final void n() {
        h();
    }

    public est(Context context) {
        super(context);
        this.k = new esu(this);
    }
}
