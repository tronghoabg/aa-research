package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
final class hzd implements huv {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public hzd(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.huv
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.huv
    public final void d(hsh hshVar, huu huuVar) {
        Cursor cursorQuery = this.b.getContentResolver().query(this.c, a, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
            } finally {
                cursorQuery.close();
            }
        }
        if (TextUtils.isEmpty(string)) {
            huuVar.g(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            huuVar.f(new File(string));
        }
    }

    @Override // defpackage.huv
    public final int e() {
        return 1;
    }

    @Override // defpackage.huv
    public final void b() {
    }

    @Override // defpackage.huv
    public final void c() {
    }
}
