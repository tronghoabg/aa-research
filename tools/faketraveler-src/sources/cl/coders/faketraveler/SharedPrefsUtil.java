package cl.coders.faketraveler;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* loaded from: classes.dex */
public final class SharedPrefsUtil {
    private SharedPrefsUtil() {
        throw new UnsupportedOperationException();
    }

    public static SharedPreferences.Editor putDouble(SharedPreferences.Editor editor, String str, double d) {
        return editor.putLong(str, Double.doubleToRawLongBits(d));
    }

    public static double getDouble(SharedPreferences sharedPreferences, String str, double d) {
        return Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToLongBits(d)));
    }

    static void migrateOldPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cl.coders.mockposition.sharedpreferences", 0);
        if (sharedPreferences.contains("version")) {
            Log.i(SharedPrefsUtil.class.toString(), "Migrating old config to new format...");
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(MainActivity.sharedPrefKey, 0).edit();
            editorEdit.putInt("version", sharedPreferences.getInt("version", 0));
            try {
                putDouble(editorEdit, "lat", Double.parseDouble(sharedPreferences.getString("lat", "12")));
            } catch (Throwable unused) {
            }
            try {
                putDouble(editorEdit, "lng", Double.parseDouble(sharedPreferences.getString("lng", "15")));
            } catch (Throwable unused2) {
            }
            try {
                editorEdit.putInt("mockCount", Integer.parseInt(sharedPreferences.getString("howManyTimes", "0")));
            } catch (Throwable unused3) {
            }
            try {
                editorEdit.putInt("mockFrequency", Integer.parseInt(sharedPreferences.getString("timeInterval", "10")));
            } catch (Throwable unused4) {
            }
            editorEdit.putLong("endTime", sharedPreferences.getLong("endTime", 0L));
            editorEdit.apply();
            sharedPreferences.edit().clear().apply();
            Log.i(SharedPrefsUtil.class.toString(), "Migration done - deleted old config!");
        }
    }
}
