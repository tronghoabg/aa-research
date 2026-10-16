package defpackage;

import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class krd {
    public static final String[] a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String[] e;
    private static final Uri i;
    private static final Uri j;
    public final int f;
    public final String g;
    public final String[] h;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("display_name");
        arrayList.add("lookup");
        arrayList.add("starred");
        arrayList.add("photo_uri");
        arrayList.add("data1");
        arrayList.add("data4");
        arrayList.add("data2");
        arrayList.add("data3");
        arrayList.add("mimetype");
        arrayList.add("_id");
        arrayList.add("data5");
        if (!acqd.u() || Build.VERSION.SDK_INT < 37) {
            arrayList.add("account_type");
        }
        arrayList.add("raw_contact_id");
        a = (String[]) arrayList.toArray(new String[0]);
        i = ContactsContract.CommonDataKinds.Phone.CONTENT_URI.buildUpon().appendQueryParameter("remove_duplicate_entries", "true").build();
        j = ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("remove_duplicate_entries", "true").build();
        String str = String.format("%s NOT NULL", "data1");
        b = str;
        c = String.format("(%s) AND (%s=?)", str, "starred");
        d = String.format("(%s) AND (%s=?)", str, "lookup");
        e = new String[]{CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE};
    }

    public krd(int i2, String str, String[] strArr) {
        this.f = i2;
        this.g = str;
        this.h = strArr;
    }

    public static String a() {
        return String.format("%s AND (%s LIKE \"%s\" OR %s = \"%s\")", b, "mimetype", true != acqd.n() ? "vnd.android.cursor.item/%%.%%" : "vnd.android.cursor.item/vnd.com.whatsapp.voip.call", "mimetype", "vnd.android.cursor.item/phone_v2");
    }

    public static String b(String str) {
        return String.format("%s AND %s = \"%s\"", b, "mimetype", str);
    }

    public static final Uri c() {
        Uri uri = mcd.A().u() ? j : i;
        return acqd.o() ? uri.buildUpon().appendQueryParameter("account_query_type", "all").build() : uri;
    }
}
