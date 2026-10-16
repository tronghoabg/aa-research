package r9;

import android.database.sqlite.SQLiteTransactionListener;

/* loaded from: classes4.dex */
public final class I implements SQLiteTransactionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f44573a;

    public I(K k) {
        this.f44573a = k;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
        this.f44573a.f44581j.j();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
        this.f44573a.f44581j.i();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
    }
}
