package com.google.android.apps.auto.components.config.preferences.contentprovider;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class SharedPreferencesProvider extends android.content.ContentProvider implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private android.net.Uri a;
    private final defpackage.ydi b = new defpackage.yge();

    static {
        defpackage.yqm.c("GH.SharedPrefProvider");
    }

    private final android.content.SharedPreferences a(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences;
        defpackage.ydi ydiVar = this.b;
        synchronized (ydiVar) {
            sharedPreferences = (android.content.SharedPreferences) ydiVar.get(str);
            if (sharedPreferences == null) {
                sharedPreferences = getContext().getSharedPreferences(str, 0);
                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                ((defpackage.yge) ydiVar).j(str, sharedPreferences);
            }
        }
        return sharedPreferences;
    }

    private final void b(int i) {
        if (i == android.os.Process.myUid()) {
            return;
        }
        java.lang.String[] packagesForUid = getContext().getPackageManager().getPackagesForUid(i);
        defpackage.slj sljVarA = defpackage.slj.a(getContext());
        if (packagesForUid != null) {
            for (java.lang.String str : packagesForUid) {
                if (sljVarA.b(str)) {
                    return;
                }
            }
        }
        throw new java.lang.SecurityException(defpackage.a.bo(i, "Access denied to non-Google uid: "));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final void c(android.content.SharedPreferences.Editor editor, android.os.Bundle bundle) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("EXTRA_EDITS");
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            android.os.Parcelable parcelable = (android.os.Parcelable) parcelableArrayList.get(i);
            if (parcelable instanceof android.os.Bundle) {
                android.os.Bundle bundle2 = (android.os.Bundle) parcelable;
                java.lang.String string = bundle2.getString("EDIT_TYPE");
                java.lang.String string2 = bundle2.getString("EDIT_KEY");
                switch (string.hashCode()) {
                    case -1881281404:
                        if (string.equals("REMOVE")) {
                            editor.remove(string2);
                        }
                        break;
                    case -1685766708:
                        if (string.equals("PUT_LONG")) {
                            editor.putLong(string2, bundle2.getLong("EDIT_VALUE"));
                        }
                        break;
                    case -724790036:
                        if (string.equals("PUT_FLOAT")) {
                            editor.putFloat(string2, bundle2.getFloat("EDIT_VALUE"));
                        }
                        break;
                    case -613990559:
                        if (string.equals("PUT_STRING")) {
                            editor.putString(string2, bundle2.getString("EDIT_VALUE"));
                        }
                        break;
                    case 64208429:
                        if (string.equals("CLEAR")) {
                            editor.clear();
                        }
                        break;
                    case 92632760:
                        if (string.equals("PUT_BOOLEAN")) {
                            editor.putBoolean(string2, bundle2.getBoolean("EDIT_VALUE"));
                        }
                        break;
                    case 499806847:
                        if (string.equals("PUT_INT")) {
                            editor.putInt(string2, bundle2.getInt("EDIT_VALUE"));
                        }
                        break;
                    case 1295193700:
                        if (string.equals("PUT_STRING_SET")) {
                            editor.putStringSet(string2, new java.util.HashSet(bundle2.getStringArrayList("EDIT_VALUE")));
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.ContentProvider
    public final android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        b(android.os.Binder.getCallingUid());
        switch (str.hashCode()) {
            case 70454:
                if (str.equals("GET")) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    int i = bundle.getInt("EXTRA_TYPE");
                    android.content.SharedPreferences sharedPreferencesA = a(str2);
                    java.lang.String string = bundle.getString("EXTRA_KEY");
                    switch (i) {
                        case 1:
                            bundle2.putString("RETURN_VALUE", sharedPreferencesA.getString(string, bundle.getString("DEFAULT_VALUE")));
                            return bundle2;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            bundle2.putStringArrayList("RETURN_VALUE", new java.util.ArrayList<>(sharedPreferencesA.getStringSet(string, new java.util.HashSet(bundle.getStringArrayList("DEFAULT_VALUE")))));
                            return bundle2;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            bundle2.putInt("RETURN_VALUE", sharedPreferencesA.getInt(string, bundle.getInt("DEFAULT_VALUE")));
                            return bundle2;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            bundle2.putLong("RETURN_VALUE", sharedPreferencesA.getLong(string, bundle.getLong("DEFAULT_VALUE")));
                            return bundle2;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            bundle2.putFloat("RETURN_VALUE", sharedPreferencesA.getFloat(string, bundle.getFloat("DEFAULT_VALUE")));
                            return bundle2;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            bundle2.putBoolean("RETURN_VALUE", sharedPreferencesA.getBoolean(string, bundle.getBoolean("DEFAULT_VALUE")));
                            return bundle2;
                        default:
                            return bundle2;
                    }
                }
                break;
            case 62491470:
                if (str.equals("APPLY")) {
                    android.content.SharedPreferences.Editor editorEdit = a(str2).edit();
                    c(editorEdit, bundle);
                    editorEdit.apply();
                    return android.os.Bundle.EMPTY;
                }
                break;
            case 215180831:
                if (str.equals("CONTAINS")) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putBoolean("RETURN_VALUE", a(str2).contains(bundle.getString("EXTRA_KEY")));
                    return bundle3;
                }
                break;
            case 644134136:
                if (str.equals("GET_ALL")) {
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    java.util.Map<java.lang.String, ?> all = a(str2).getAll();
                    for (java.lang.String str3 : all.keySet()) {
                        java.lang.Object obj = all.get(str3);
                        if (obj instanceof java.lang.String) {
                            bundle4.putString(str3, (java.lang.String) all.get(str3));
                        } else if (obj instanceof java.util.Set) {
                            bundle4.putStringArrayList(str3, new java.util.ArrayList<>((java.util.Set) all.get(str3)));
                        } else if (obj instanceof java.lang.Integer) {
                            bundle4.putInt(str3, ((java.lang.Integer) all.get(str3)).intValue());
                        } else if (obj instanceof java.lang.Long) {
                            bundle4.putLong(str3, ((java.lang.Long) all.get(str3)).longValue());
                        } else if (obj instanceof java.lang.Float) {
                            bundle4.putFloat(str3, ((java.lang.Float) all.get(str3)).floatValue());
                        } else {
                            if (!(obj instanceof java.lang.Boolean)) {
                                throw new java.lang.AssertionError("Unknown preference type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))));
                            }
                            bundle4.putBoolean(str3, ((java.lang.Boolean) all.get(str3)).booleanValue());
                        }
                    }
                    return bundle4;
                }
                break;
            case 1993481527:
                if (str.equals("COMMIT")) {
                    android.content.SharedPreferences.Editor editorEdit2 = a(str2).edit();
                    c(editorEdit2, bundle);
                    editorEdit2.commit();
                    return android.os.Bundle.EMPTY;
                }
                break;
        }
        return android.os.Bundle.EMPTY;
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        b(android.os.Binder.getCallingUid());
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        b(android.os.Binder.getCallingUid());
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        b(android.os.Binder.getCallingUid());
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.a = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gearhead.shared_preferences_provider").build();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        java.lang.String str2;
        defpackage.ydi ydiVar = this.b;
        synchronized (ydiVar) {
            str2 = (java.lang.String) ydiVar.a().get(sharedPreferences);
            if (str2 == null) {
                throw new java.lang.AssertionError("Cannot find name for SharedPreferences");
            }
        }
        getContext().getContentResolver().notifyChange(this.a.buildUpon().appendPath(str2).appendPath(str).build(), null);
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        b(android.os.Binder.getCallingUid());
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        b(android.os.Binder.getCallingUid());
        throw new java.lang.UnsupportedOperationException();
    }
}
