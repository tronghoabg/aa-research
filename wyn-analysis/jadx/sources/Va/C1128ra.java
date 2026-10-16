package Va;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* renamed from: Va.ra, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1128ra {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f14559b = {d((char) (54913 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "ᅘ胲脪賖", "\uf117欀噾", KeyEvent.getDeadChar(0, 0) + 713093649).intern(), d((char) (View.resolveSize(0, 0) + 10845), "짯\ue0a0巯砪", "ꗍ\uf08aﮁ", Drawable.resolveOpacity(0, 0) - 270491447).intern()};

    /* renamed from: c, reason: collision with root package name */
    public static int f14560c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14561d = 1;

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f14562a;

    static {
        int i5 = f14561d + 109;
        f14560c = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public C1128ra(Context context, String str) {
        this.f14562a = new C1116qa(context, str, null, 1).getWritableDatabase();
    }

    public static String d(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 15369);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    public final synchronized HashMap a(int i5, String str) {
        String string;
        HashMap map;
        Cursor cursor = null;
        try {
            String strReplace = str.replace('*', '%');
            String strIntern = d((char) (MotionEvent.axisFromString("") + 1), "湊一⎩벟", "郹異\uedab竾튑繫춝ە\ue429๘", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
            String[] strArr = {strReplace};
            if (i5 <= 0) {
                try {
                    int i10 = f14560c + 83;
                    f14561d = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                    string = null;
                } finally {
                }
            } else {
                string = Integer.toString(i5);
            }
            Cursor cursorQuery = this.f14562a.query(d((char) (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern(), f14559b, strIntern, strArr, null, null, null, string);
            try {
                map = new HashMap();
                while (cursorQuery != null) {
                    f14560c = (f14561d + 17) % 128;
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    try {
                        map.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(d((char) (54913 - View.resolveSize(0, 0)), "ᅘ胲脪賖", "\uf117欀噾", (ViewConfiguration.getTouchSlop() >> 8) + 713093649).intern())), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(d((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10846), "짯\ue0a0巯砪", "ꗍ\uf08aﮁ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 270491448).intern())));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                int i11 = f14560c + 15;
                f14561d = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return map;
    }

    public final synchronized void b(String str) {
        f14560c = (f14561d + 1) % 128;
        this.f14562a.delete(d((char) (Process.myPid() >> 22), "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", View.combineMeasuredStates(0, 0)).intern(), d((char) (48896 - (ViewConfiguration.getWindowTouchSlop() >> 8)), "색ܬÉ䖿", "쬫莢꒝軲헟", View.MeasureSpec.makeMeasureSpec(0, 0) - 922276672).intern(), new String[]{str});
        int i5 = f14560c + 17;
        f14561d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final synchronized int c(String str) {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f14562a.query(d((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern(), new String[]{d((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), "⠘⥬鎑䍉", "̞⍫㜂\ue9a4︯탏ࡽ倓꛰溆", View.getDefaultSize(0, 0)).intern()}, d((char) TextUtils.getTrimmedLength(""), "湊一⎩벟", "郹異\uedab竾튑繫춝ە\ue429๘", ViewConfiguration.getScrollBarSize() >> 8).intern(), new String[]{str.replace('*', '%')}, null, null, null);
            if (cursorQuery != null) {
                f14560c = (f14561d + 99) % 128;
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i5 = cursorQuery.getInt(0);
                        cursorQuery.close();
                        return i5;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                int i10 = f14561d + 85;
                f14560c = i10 % 128;
                if (i10 % 2 != 0) {
                    cursorQuery.close();
                    throw null;
                }
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized String e(String str) {
        f14560c = (f14561d + 9) % 128;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f14562a.query(d((char) (ViewConfiguration.getScrollBarSize() >> 8), "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", View.getDefaultSize(0, 0)).intern(), f14559b, d((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "쥜懋䣆缸", "\ue03a\ueadc湀ꦊ鴗떀쀺", Color.argb(0, 0, 0, 0) - 966669367).intern(), new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (!(!cursorQuery.moveToNext())) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(d((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 10845), "짯\ue0a0巯砪", "ꗍ\uf08aﮁ", (-270491447) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                f14560c = (f14561d + 107) % 128;
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void f(String str, String str2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(d((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 10845), "짯\ue0a0巯砪", "ꗍ\uf08aﮁ", (-270491447) - ExpandableListView.getPackedPositionType(0L)).intern(), str2);
            if (this.f14562a.update(d((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), contentValues, d((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "쥜懋䣆缸", "\ue03a\ueadc湀ꦊ鴗떀쀺", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 966669368).intern(), new String[]{str}) == 0) {
                f14561d = (f14560c + 29) % 128;
                contentValues.put(d((char) (54914 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "ᅘ胲脪賖", "\uf117欀噾", 713093649 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), str);
                this.f14562a.replace(d((char) TextUtils.indexOf("", "", 0), "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", ViewConfiguration.getScrollDefaultDelay() >> 16).intern(), null, contentValues);
            }
            int i5 = f14561d + 47;
            f14560c = i5 % 128;
            if (i5 % 2 != 0) {
                int i10 = 96 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
