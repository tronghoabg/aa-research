package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import com.google.android.projection.gearhead.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class kif implements esl {
    public static final yph a = yph.c("GH.CallHistoryManager");
    public final esm b;
    public final Set c = new CopyOnWriteArraySet();
    public boolean d;
    public Cursor e;
    private final Context f;
    private final kie g;

    public kif(Context context, esm esmVar) {
        this.f = context;
        this.b = esmVar;
        String str = kie.a;
        this.g = new kie(kie.a, new String[]{""});
    }

    private static String e(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? cursor.getString(columnIndex) : "";
    }

    private static int f(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getInt(columnIndex);
        }
        return -1;
    }

    @Override // defpackage.esl
    public final void a(esv esvVar) {
        woy.N(esvVar.c == R.id.call_history_manager_loader_id);
        this.e = null;
    }

    @Override // defpackage.esl
    public final esv b(int i) {
        woy.N(i == R.id.call_history_manager_loader_id);
        Uri uriBuild = CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("limit", Integer.toString(25)).build();
        String[] strArr = kie.b;
        if (mcd.A().u()) {
            strArr = kie.c;
        }
        Context context = this.f;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2.getClass();
        strArr2[strArr2.length - 1] = "photo_uri";
        kie kieVar = this.g;
        return new est(context, uriBuild, strArr2, kieVar.d, kieVar.e, "date DESC");
    }

    @Override // defpackage.esl
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.getClass();
        this.e = cursor;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ajmd) it.next()).s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yfq d(android.database.Cursor r20) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kif.d(android.database.Cursor):yfq");
    }
}
