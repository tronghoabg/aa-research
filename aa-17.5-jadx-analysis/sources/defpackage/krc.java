package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class krc implements kqu {
    private static final yph a = yph.c("GH.Cp2ContactLookup");
    private final Context b;
    private final String c;

    public krc(Context context) {
        this.b = context;
        this.c = context.getString(R.string.unknown);
    }

    @Override // defpackage.kqu
    public final Uri a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = this.c;
        }
        if (true == TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        return gkq.a(str2, str);
    }

    @Override // defpackage.kqu
    public final Uri b(String str, String str2) {
        Uri uriC;
        return (TextUtils.isEmpty(str) || (uriC = c(str)) == null) ? a(str, str2) : uriC;
    }

    @Override // defpackage.kqu
    public final Uri c(String str) {
        Cursor cursorQuery;
        if (lgv.c().i()) {
            try {
                cursorQuery = this.b.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), krb.a, null, null, null);
            } catch (RuntimeException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 3414)).u("Exception when trying to load contact photo");
                cursorQuery = null;
            }
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                return kre.d(cursorQuery);
            }
        }
        return null;
    }

    @Override // defpackage.kqu
    public final kqt d(Uri uri, kra kraVar) {
        String string;
        if (uri != null && uri.toString().startsWith(ContactsContract.Contacts.CONTENT_LOOKUP_URI.toString())) {
            Context context = this.b;
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"lookup"}, null, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("lookup")) : null;
                cursorQuery.close();
            } else {
                string = null;
            }
            if (string != null) {
                String[] strArr = krd.a;
                String[] strArr2 = {string};
                String str = krd.d;
                if (mcd.A().u()) {
                    str = kraVar.equals(kra.a) ? String.format("(%s) AND (%s=?)", krd.a(), "lookup") : String.format("(%s) AND (%s=?)", krd.b(kraVar.b), "lookup");
                }
                krd krdVar = new krd(R.id.contacts_manager_single_loader_id, str, strArr2);
                Cursor cursorQuery2 = context.getContentResolver().query(krd.c(), krd.a, krdVar.g, krdVar.h, "display_name ASC");
                if (cursorQuery2 != null) {
                    kqtVarE = cursorQuery2.moveToFirst() ? kre.e(context, cursorQuery2) : null;
                    cursorQuery2.close();
                }
            }
        }
        return kqtVarE;
    }

    @Override // defpackage.kqu
    public final boolean e(Uri uri) {
        return "lettertile".equals(uri.getAuthority());
    }
}
