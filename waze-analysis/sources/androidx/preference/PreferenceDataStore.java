package androidx.preference;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class PreferenceDataStore {
    public boolean getBoolean(String str, boolean z) {
        return z;
    }

    public float getFloat(String str, float f2) {
        return f2;
    }

    public int getInt(String str, int i2) {
        return i2;
    }

    public long getLong(String str, long j2) {
        return j2;
    }

    public String getString(String str, String str2) {
        return str2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return set;
    }

    public void putBoolean(String str, boolean z) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putFloat(String str, float f2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putInt(String str, int i2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putLong(String str, long j2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putString(String str, String str2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void putStringSet(String str, Set<String> set) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
}
