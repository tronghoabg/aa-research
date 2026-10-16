package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class knc implements android.content.SharedPreferences.Editor {
    private final java.util.ArrayList a = new java.util.ArrayList();
    private final java.util.ArrayList b = new java.util.ArrayList();
    private final android.content.Context c;
    private final android.net.Uri d;
    private final java.lang.String e;

    public knc(android.content.Context context, android.net.Uri uri, java.lang.String str) {
        this.c = context;
        this.d = uri;
        this.e = str;
    }

    private final android.os.Bundle a() {
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(this.b);
        arrayList.addAll(this.a);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("EXTRA_EDITS", arrayList);
        return bundle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final android.os.Bundle b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("EDIT_TYPE", str);
        bundle.putString("EDIT_KEY", str2);
        switch (str) {
            case "PUT_LONG":
                bundle.putLong("EDIT_VALUE", ((java.lang.Long) obj).longValue());
            case "PUT_FLOAT":
                bundle.putFloat("EDIT_VALUE", ((java.lang.Float) obj).floatValue());
                return bundle;
            case "PUT_STRING":
                bundle.putString("EDIT_VALUE", (java.lang.String) obj);
                return bundle;
            case "PUT_BOOLEAN":
                bundle.putBoolean("EDIT_VALUE", ((java.lang.Boolean) obj).booleanValue());
                return bundle;
            case "PUT_INT":
                bundle.putInt("EDIT_VALUE", ((java.lang.Integer) obj).intValue());
                return bundle;
            case "PUT_STRING_SET":
                bundle.putStringArrayList("EDIT_VALUE", new java.util.ArrayList<>((java.util.Set) obj));
                return bundle;
            default:
                if (str.equals("PUT_LONG")) {
                    bundle.putLong("EDIT_VALUE", ((java.lang.Long) obj).longValue());
                }
                return bundle;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.c.getContentResolver().call(this.d, "APPLY", this.e, a());
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor clear() {
        this.b.add(b("CLEAR", "", null));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        this.c.getContentResolver().call(this.d, "COMMIT", this.e, a());
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z) {
        defpackage.knf.a(str);
        this.a.add(b("PUT_BOOLEAN", str, java.lang.Boolean.valueOf(z)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f) {
        defpackage.knf.a(str);
        this.a.add(b("PUT_FLOAT", str, java.lang.Float.valueOf(f)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putInt(java.lang.String str, int i) {
        defpackage.knf.a(str);
        this.a.add(b("PUT_INT", str, java.lang.Integer.valueOf(i)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putLong(java.lang.String str, long j) {
        defpackage.knf.a(str);
        this.a.add(b("PUT_LONG", str, java.lang.Long.valueOf(j)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        defpackage.knf.a(str);
        this.a.add(b("PUT_STRING", str, str2));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        defpackage.knf.a(str);
        this.a.add(b("PUT_STRING_SET", str, set));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor remove(java.lang.String str) {
        defpackage.knf.a(str);
        this.b.add(b("REMOVE", str, null));
        return this;
    }
}
