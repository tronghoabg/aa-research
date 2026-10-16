package com.google.android.apps.auto.components.config.preferences.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import defpackage.a;
import defpackage.skn;
import defpackage.ycc;
import defpackage.yey;
import defpackage.yph;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class SharedPreferencesProvider extends ContentProvider implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Uri a;
    private final ycc b = new yey();

    static {
        yph.c("GH.SharedPrefProvider");
    }

    private final SharedPreferences a(String str) {
        SharedPreferences sharedPreferences;
        ycc yccVar = this.b;
        synchronized (yccVar) {
            sharedPreferences = (SharedPreferences) yccVar.get(str);
            if (sharedPreferences == null) {
                sharedPreferences = getContext().getSharedPreferences(str, 0);
                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                ((yey) yccVar).j(str, sharedPreferences);
            }
        }
        return sharedPreferences;
    }

    private final void b(int i) {
        if (i == Process.myUid()) {
            return;
        }
        String[] packagesForUid = getContext().getPackageManager().getPackagesForUid(i);
        skn sknVarA = skn.a(getContext());
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (sknVarA.b(str)) {
                    return;
                }
            }
        }
        throw new SecurityException(a.bp(i, "Access denied to non-Google uid: "));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final void c(SharedPreferences.Editor editor, Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("EXTRA_EDITS");
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Parcelable parcelable = (Parcelable) parcelableArrayList.get(i);
            if (parcelable instanceof Bundle) {
                Bundle bundle2 = (Bundle) parcelable;
                String string = bundle2.getString("EDIT_TYPE");
                String string2 = bundle2.getString("EDIT_KEY");
                switch (string.hashCode()) {
                    case -1881281404:
                        if (string.equals("REMOVE")) {
                            editor.remove(string2);
                            break;
                        } else {
                            break;
                        }
                    case -1685766708:
                        if (string.equals("PUT_LONG")) {
                            editor.putLong(string2, bundle2.getLong("EDIT_VALUE"));
                            break;
                        } else {
                            break;
                        }
                    case -724790036:
                        if (string.equals("PUT_FLOAT")) {
                            editor.putFloat(string2, bundle2.getFloat("EDIT_VALUE"));
                            break;
                        } else {
                            break;
                        }
                    case -613990559:
                        if (string.equals("PUT_STRING")) {
                            editor.putString(string2, bundle2.getString("EDIT_VALUE"));
                            break;
                        } else {
                            break;
                        }
                    case 64208429:
                        if (string.equals("CLEAR")) {
                            editor.clear();
                            break;
                        } else {
                            break;
                        }
                    case 92632760:
                        if (string.equals("PUT_BOOLEAN")) {
                            editor.putBoolean(string2, bundle2.getBoolean("EDIT_VALUE"));
                            break;
                        } else {
                            break;
                        }
                    case 499806847:
                        if (string.equals("PUT_INT")) {
                            editor.putInt(string2, bundle2.getInt("EDIT_VALUE"));
                            break;
                        } else {
                            break;
                        }
                    case 1295193700:
                        if (string.equals("PUT_STRING_SET")) {
                            editor.putStringSet(string2, new HashSet(bundle2.getStringArrayList("EDIT_VALUE")));
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        b(Binder.getCallingUid());
        switch (str.hashCode()) {
            case 70454:
                if (str.equals("GET")) {
                    Bundle bundle2 = new Bundle();
                    int i = bundle.getInt("EXTRA_TYPE");
                    SharedPreferences sharedPreferencesA = a(str2);
                    String string = bundle.getString("EXTRA_KEY");
                    switch (i) {
                        case 1:
                            bundle2.putString("RETURN_VALUE", sharedPreferencesA.getString(string, bundle.getString("DEFAULT_VALUE")));
                            return bundle2;
                        case 2:
                            bundle2.putStringArrayList("RETURN_VALUE", new ArrayList<>(sharedPreferencesA.getStringSet(string, new HashSet(bundle.getStringArrayList("DEFAULT_VALUE")))));
                            return bundle2;
                        case 3:
                            bundle2.putInt("RETURN_VALUE", sharedPreferencesA.getInt(string, bundle.getInt("DEFAULT_VALUE")));
                            return bundle2;
                        case 4:
                            bundle2.putLong("RETURN_VALUE", sharedPreferencesA.getLong(string, bundle.getLong("DEFAULT_VALUE")));
                            return bundle2;
                        case 5:
                            bundle2.putFloat("RETURN_VALUE", sharedPreferencesA.getFloat(string, bundle.getFloat("DEFAULT_VALUE")));
                            return bundle2;
                        case 6:
                            bundle2.putBoolean("RETURN_VALUE", sharedPreferencesA.getBoolean(string, bundle.getBoolean("DEFAULT_VALUE")));
                            return bundle2;
                        default:
                            return bundle2;
                    }
                }
                break;
            case 62491470:
                if (str.equals("APPLY")) {
                    SharedPreferences.Editor editorEdit = a(str2).edit();
                    c(editorEdit, bundle);
                    editorEdit.apply();
                    return Bundle.EMPTY;
                }
                break;
            case 215180831:
                if (str.equals("CONTAINS")) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("RETURN_VALUE", a(str2).contains(bundle.getString("EXTRA_KEY")));
                    return bundle3;
                }
                break;
            case 644134136:
                if (str.equals("GET_ALL")) {
                    Bundle bundle4 = new Bundle();
                    Map<String, ?> all = a(str2).getAll();
                    for (String str3 : all.keySet()) {
                        Object obj = all.get(str3);
                        if (obj instanceof String) {
                            bundle4.putString(str3, (String) all.get(str3));
                        } else if (obj instanceof Set) {
                            bundle4.putStringArrayList(str3, new ArrayList<>((Set) all.get(str3)));
                        } else if (obj instanceof Integer) {
                            bundle4.putInt(str3, ((Integer) all.get(str3)).intValue());
                        } else if (obj instanceof Long) {
                            bundle4.putLong(str3, ((Long) all.get(str3)).longValue());
                        } else if (obj instanceof Float) {
                            bundle4.putFloat(str3, ((Float) all.get(str3)).floatValue());
                        } else {
                            if (!(obj instanceof Boolean)) {
                                throw new AssertionError("Unknown preference type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
                            }
                            bundle4.putBoolean(str3, ((Boolean) all.get(str3)).booleanValue());
                        }
                    }
                    return bundle4;
                }
                break;
            case 1993481527:
                if (str.equals("COMMIT")) {
                    SharedPreferences.Editor editorEdit2 = a(str2).edit();
                    c(editorEdit2, bundle);
                    editorEdit2.commit();
                    return Bundle.EMPTY;
                }
                break;
        }
        return Bundle.EMPTY;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        b(Binder.getCallingUid());
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        b(Binder.getCallingUid());
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        b(Binder.getCallingUid());
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.a = new Uri.Builder().scheme("content").authority("com.google.android.gearhead.shared_preferences_provider").build();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2;
        ycc yccVar = this.b;
        synchronized (yccVar) {
            str2 = (String) yccVar.a().get(sharedPreferences);
            if (str2 == null) {
                throw new AssertionError("Cannot find name for SharedPreferences");
            }
        }
        getContext().getContentResolver().notifyChange(this.a.buildUpon().appendPath(str2).appendPath(str).build(), null);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        b(Binder.getCallingUid());
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        b(Binder.getCallingUid());
        throw new UnsupportedOperationException();
    }
}
