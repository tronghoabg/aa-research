package defpackage;

import android.content.Context;
import android.os.Debug;
import android.os.StrictMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class vvp {
    public static final /* synthetic */ int f = 0;
    public final aezk a;
    public final Context b;
    public final aezk c;
    public final aezk d;
    public final rju e;

    static {
        wub.L(new rhy(11));
    }

    public vvp(aezk aezkVar, Context context, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4, rju rjuVar) {
        this.e = rjuVar;
        this.a = new vvm(aezkVar3, wub.L(new vks(aezkVar, 8)), aezkVar, 0);
        this.b = context;
        this.c = aezkVar2;
        this.d = aezkVar4;
    }

    public static /* synthetic */ xxh a() {
        try {
            try {
                try {
                    return xxh.h(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
                } catch (Error | Exception e) {
                    e = e;
                    ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai((char) 9838)).u("MemoryInfo.getOtherPss(which) failure");
                    return xvy.a;
                }
            } catch (Error e2) {
                e = e2;
                ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai((char) 9838)).u("MemoryInfo.getOtherPss(which) failure");
                return xvy.a;
            }
        } catch (NoSuchMethodException e3) {
            ((ynz) ((ynz) ((ynz) vlj.a.e()).p(e3)).ai((char) 9837)).u("MemoryInfo.getOtherPss(which) not found");
            return xvy.a;
        }
    }

    public static Long b(String str) {
        if (woy.am(str)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(str.trim()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Long c(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                wub.K(strGroup, new Object[0]);
                return Long.valueOf(Long.parseLong(strGroup));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final String d(String str, String str2, boolean z) {
        String str3;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                File file = new File(String.format("/proc/%s/%s", str, str2));
                Charset charsetDefaultCharset = Charset.defaultCharset();
                charsetDefaultCharset.getClass();
                str3 = new String(ytv.a(file), charsetDefaultCharset);
            } catch (IOException e) {
                str3 = null;
                if (!z) {
                    ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai(9840)).y("Error reading proc %s", new vpw(str2));
                } else if (!(e instanceof FileNotFoundException)) {
                    ((ynz) ((ynz) ((ynz) ((ynz) vlj.a.h()).l(1, TimeUnit.MINUTES)).p(e)).ai(9841)).y("Error reading dmabuf proc %s", new vpw(str2));
                }
            }
            return str3;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
