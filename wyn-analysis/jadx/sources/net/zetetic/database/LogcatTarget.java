package net.zetetic.database;

import android.util.Log;

/* loaded from: classes5.dex */
public class LogcatTarget implements LogTarget {
    @Override // net.zetetic.database.LogTarget
    public final void a(int i5, Exception exc, String str, String str2) {
        switch (i5) {
            case 2:
                Log.v(str, str2, exc);
                break;
            case 3:
                Log.d(str, str2, exc);
                break;
            case 4:
                Log.i(str, str2, exc);
                break;
            case 5:
                Log.w(str, str2, exc);
                break;
            case 6:
                Log.e(str, str2, exc);
                break;
            case 7:
                Log.wtf(str, str2, exc);
                break;
        }
    }

    @Override // net.zetetic.database.LogTarget
    public final boolean b(int i5, String str) {
        return Log.isLoggable(str, i5);
    }
}
