package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vmo extends defpackage.lw {
    private static final java.lang.ThreadLocal a = new defpackage.vmn();
    private final android.content.Context e;
    private android.database.Cursor f;

    public vmo(android.content.Context context) {
        this.e = context;
    }

    @Override // defpackage.lw
    public final int a() {
        android.database.Cursor cursor = this.f;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public final void b(android.database.Cursor cursor) {
        android.database.Cursor cursor2 = this.f;
        if (cursor2 != cursor) {
            if (cursor2 != null) {
                cursor2.close();
            }
            this.f = cursor;
            g();
        }
    }

    @Override // defpackage.lw
    public final int d(int i) {
        return 0;
    }

    @Override // defpackage.lw
    public final /* bridge */ /* synthetic */ defpackage.mr f(android.view.ViewGroup viewGroup, int i) {
        return new defpackage.xff(android.view.LayoutInflater.from(this.e).inflate(com.google.android.projection.gearhead.R.layout.primes_item_view, viewGroup, false), null);
    }

    @Override // defpackage.lw
    public final /* bridge */ /* synthetic */ void n(defpackage.mr mrVar, int i) {
        defpackage.xff xffVar = (defpackage.xff) mrVar;
        android.database.Cursor cursor = this.f;
        cursor.getClass();
        cursor.moveToPosition(i);
        xffVar.t.setText(cursor.getString(cursor.getColumnIndexOrThrow("name")));
        xffVar.s.setText(cursor.getString(cursor.getColumnIndexOrThrow("message")));
        ((android.widget.TextView) xffVar.u).setText(((java.text.SimpleDateFormat) a.get()).format(new java.util.Date(cursor.getLong(cursor.getColumnIndexOrThrow("created_at")))));
    }
}
