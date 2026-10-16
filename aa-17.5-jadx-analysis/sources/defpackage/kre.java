package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.StaleDataException;
import android.net.Uri;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class kre implements kqy, esl {
    public static final yph a = yph.c("GH.Cp2ContactsAdapter");
    public final Set b = new CopyOnWriteArraySet();
    public final esm c;
    public final krd d;
    public boolean e;
    public boolean f;
    public Cursor g;
    private final Context h;

    public kre(Context context, esm esmVar, krd krdVar) {
        this.c = esmVar;
        this.h = context;
        this.d = krdVar;
    }

    static Uri d(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("photo_uri"));
        Uri uri = string != null ? Uri.parse(string) : null;
        if (uri != null) {
            return uri;
        }
        String strH = h(cursor);
        return gkq.a(strH, strH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static defpackage.kqt e(android.content.Context r34, android.database.Cursor r35) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kre.e(android.content.Context, android.database.Cursor):kqt");
    }

    static String g(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex("lookup"));
    }

    static String h(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex("display_name"));
    }

    private static boolean i(Cursor cursor) {
        return cursor.getInt(cursor.getColumnIndex("starred")) > 0;
    }

    @Override // defpackage.esl
    public final void a(esv esvVar) {
        this.g = null;
    }

    @Override // defpackage.esl
    public final esv b(int i) {
        krd krdVar = this.d;
        woy.N(i == krdVar.f);
        vla.a().e(new vky("ContactLoad"));
        return new est(this.h, krd.c(), krd.a, krdVar.g, krdVar.h, "display_name ASC");
    }

    @Override // defpackage.esl
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.getClass();
        this.g = cursor;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajmd) it.next()).B();
        }
        vla.a().f(new vky("ContactLoad"));
    }

    public final yfq f(Cursor cursor) {
        vxb vxbVarA = vla.a().a.a();
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        try {
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                kqt kqtVarE = e(this.h, cursor);
                if (kqtVarE != null) {
                    yflVar.i(kqtVarE);
                }
            }
            vla vlaVarA = vla.a();
            vlaVarA.a.l(vxbVarA, new vky("Cp2ContactStore.getContacts"));
            return yflVar.g();
        } catch (StaleDataException unused) {
            ((ype) ((ype) a.g()).ai((char) 3417)).u("StaleDataException for a valid cursor - returning back now as subsequent cursor and callback will handle deliverying results.");
            return yls.a;
        }
    }
}
