package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public final class vls extends lt {
    private static final ThreadLocal a = new vlr();
    private final Context e;
    private Cursor f;

    public vls(Context context) {
        this.e = context;
    }

    @Override // defpackage.lt
    public final int a() {
        Cursor cursor = this.f;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public final void b(Cursor cursor) {
        Cursor cursor2 = this.f;
        if (cursor2 != cursor) {
            if (cursor2 != null) {
                cursor2.close();
            }
            this.f = cursor;
            g();
        }
    }

    @Override // defpackage.lt
    public final int d(int i) {
        return 0;
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        return new xeg(LayoutInflater.from(this.e).inflate(R.layout.primes_item_view, viewGroup, false), null);
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        xeg xegVar = (xeg) moVar;
        Cursor cursor = this.f;
        cursor.getClass();
        cursor.moveToPosition(i);
        xegVar.t.setText(cursor.getString(cursor.getColumnIndexOrThrow("name")));
        xegVar.s.setText(cursor.getString(cursor.getColumnIndexOrThrow("message")));
        ((TextView) xegVar.u).setText(((SimpleDateFormat) a.get()).format(new Date(cursor.getLong(cursor.getColumnIndexOrThrow("created_at")))));
    }
}
