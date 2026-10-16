package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
final class kmv implements SharedPreferences.Editor {
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();
    private final Context c;
    private final Uri d;
    private final String e;

    public kmv(Context context, Uri uri, String str) {
        this.c = context;
        this.d = uri;
        this.e = str;
    }

    private final Bundle a() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.addAll(this.b);
        arrayList.addAll(this.a);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("EXTRA_EDITS", arrayList);
        return bundle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final Bundle b(String str, String str2, Object obj) {
        Bundle bundle = new Bundle();
        bundle.putString("EDIT_TYPE", str);
        bundle.putString("EDIT_KEY", str2);
        switch (str.hashCode()) {
            case -1685766708:
                if (str.equals("PUT_LONG")) {
                    bundle.putLong("EDIT_VALUE", ((Long) obj).longValue());
                }
                return bundle;
            case -724790036:
                if (str.equals("PUT_FLOAT")) {
                    bundle.putFloat("EDIT_VALUE", ((Float) obj).floatValue());
                    return bundle;
                }
                return bundle;
            case -613990559:
                if (str.equals("PUT_STRING")) {
                    bundle.putString("EDIT_VALUE", (String) obj);
                    return bundle;
                }
                return bundle;
            case 92632760:
                if (str.equals("PUT_BOOLEAN")) {
                    bundle.putBoolean("EDIT_VALUE", ((Boolean) obj).booleanValue());
                    return bundle;
                }
                return bundle;
            case 499806847:
                if (str.equals("PUT_INT")) {
                    bundle.putInt("EDIT_VALUE", ((Integer) obj).intValue());
                    return bundle;
                }
                return bundle;
            case 1295193700:
                if (str.equals("PUT_STRING_SET")) {
                    bundle.putStringArrayList("EDIT_VALUE", new ArrayList<>((Set) obj));
                    return bundle;
                }
                return bundle;
            default:
                return bundle;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.c.getContentResolver().call(this.d, "APPLY", this.e, a());
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.b.add(b("CLEAR", "", null));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        this.c.getContentResolver().call(this.d, "COMMIT", this.e, a());
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        kmy.a(str);
        this.a.add(b("PUT_BOOLEAN", str, Boolean.valueOf(z)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        kmy.a(str);
        this.a.add(b("PUT_FLOAT", str, Float.valueOf(f)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        kmy.a(str);
        this.a.add(b("PUT_INT", str, Integer.valueOf(i)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        kmy.a(str);
        this.a.add(b("PUT_LONG", str, Long.valueOf(j)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        kmy.a(str);
        this.a.add(b("PUT_STRING", str, str2));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        kmy.a(str);
        this.a.add(b("PUT_STRING_SET", str, set));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        kmy.a(str);
        this.b.add(b("REMOVE", str, null));
        return this;
    }
}
