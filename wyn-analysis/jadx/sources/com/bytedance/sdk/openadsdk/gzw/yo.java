package com.bytedance.sdk.openadsdk.gzw;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.gzw.oa;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {

    /* renamed from: oa, reason: collision with root package name */
    private final Context f25924oa;
    private SharedPreferences uef;
    private final String yo;

    public yo(Context context, String str) {
        this.f25924oa = context;
        this.yo = str;
    }

    private SharedPreferences oa() {
        Context context;
        SharedPreferences sharedPreferences = this.uef;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.yo) || (context = this.f25924oa) == null) {
            return null;
        }
        try {
            this.uef = context.getSharedPreferences(this.yo, 0);
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
        return this.uef;
    }

    public void uef(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesOa = oa();
            if (sharedPreferencesOa != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesOa.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                Double d3 = (Double) obj;
                                d3.doubleValue();
                                editorEdit.putFloat(next, d3.floatValue());
                            } else {
                                editorEdit.putString(next, String.valueOf(obj));
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public long oa(String str, long j8) {
        try {
            SharedPreferences sharedPreferencesOa = oa();
            if (sharedPreferencesOa != null && sharedPreferencesOa.contains(str)) {
                return sharedPreferencesOa.getLong(str, j8);
            }
            return j8;
        } catch (Throwable th) {
            Log.i("SPUnit", this.yo + th.getMessage());
            return j8;
        }
    }

    public void uef(String str, long j8) {
        try {
            SharedPreferences sharedPreferencesOa = oa();
            if (sharedPreferencesOa != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesOa.edit();
                editorEdit.putLong(str, j8);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int uef(String str, int i5) {
        try {
            SharedPreferences sharedPreferencesOa = oa();
            if (sharedPreferencesOa != null && sharedPreferencesOa.contains(str)) {
                return sharedPreferencesOa.getInt(str, i5);
            }
            return i5;
        } catch (Throwable th) {
            Log.i("SPUnit", this.yo + th.getMessage());
            return i5;
        }
    }

    public String uef(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesOa = oa();
            if (sharedPreferencesOa != null && sharedPreferencesOa.contains(str)) {
                return sharedPreferencesOa.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.yo + th.getMessage());
            return str2;
        }
    }

    public boolean uef(String str, boolean z2) {
        try {
            SharedPreferences sharedPreferencesOa = oa();
            if (sharedPreferencesOa != null && sharedPreferencesOa.contains(str)) {
                return sharedPreferencesOa.getBoolean(str, z2);
            }
            return z2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.yo + th.getMessage());
            return z2;
        }
    }

    public <T> T uef(String str, T t10, oa.uef<T> uefVar) {
        String string;
        if (str != null && !str.isEmpty()) {
            try {
                SharedPreferences sharedPreferencesOa = oa();
                if (sharedPreferencesOa != null && sharedPreferencesOa.contains(str) && (string = sharedPreferencesOa.getString(str, null)) != null && uefVar != null) {
                    T tOa = uefVar.oa(string);
                    if (tOa != null) {
                        return tOa;
                    }
                }
            } catch (Throwable th) {
                Log.i("SPUnit", this.yo + th.getMessage());
            }
        }
        return t10;
    }

    public void uef() {
        SharedPreferences sharedPreferencesOa = oa();
        if (sharedPreferencesOa != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesOa.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
