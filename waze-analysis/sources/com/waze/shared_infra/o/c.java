package com.waze.shared_infra.o;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.d.b.an;
import com.waze.shared_infra.i.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class c implements a {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f37917g = Pattern.compile("(?<!%)%(?:\\d+\\$)?(?:[-#+ 0,(\\<]*)?(?:\\d+)?(?:\\.\\d+)?(?:[tT])?([dsfx])");

    /* renamed from: c, reason: collision with root package name */
    protected final Context f37920c;

    /* renamed from: e, reason: collision with root package name */
    protected String f37922e;

    /* renamed from: f, reason: collision with root package name */
    protected HashSet f37923f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f37918a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37919b = false;

    /* renamed from: d, reason: collision with root package name */
    protected final ConcurrentHashMap f37921d = new ConcurrentHashMap();

    public c(Context context) {
        this.f37920c = context;
    }

    private final InputStreamReader l(String str) {
        return new InputStreamReader(this.f37920c.getAssets().open(g().concat(str)), StandardCharsets.UTF_8);
    }

    private final String m(int i2) throws Resources.NotFoundException {
        String string;
        if (i2 == 0) {
            h.d("StringsUtils", "no resourceId was given");
            return "";
        }
        try {
            String resourceEntryName = this.f37920c.getResources().getResourceEntryName(i2);
            try {
                string = this.f37920c.getResources().getString(i2);
            } catch (Resources.NotFoundException e2) {
                h.k("StringsUtils", "display string not found, resId = " + i2 + ": " + e2.getMessage());
                string = null;
            }
            return n(resourceEntryName, string, true);
        } catch (Resources.NotFoundException e3) {
            h.k("StringsUtils", "resource entry name not found. resId = " + i2 + ": " + e3.getMessage());
            return "";
        }
    }

    private final String n(String str, String str2, boolean z) {
        boolean zStartsWith;
        if (str != null) {
            if (this.f37918a) {
                return str;
            }
            if (!this.f37919b) {
                try {
                    String[] strArrSplit = null;
                    if (str.startsWith("@@") || str.startsWith("$$")) {
                        zStartsWith = str.startsWith("$$");
                        int iIndexOf = str.indexOf(124);
                        if (iIndexOf >= 0) {
                            strArrSplit = str.substring(iIndexOf + 1).split("\\|");
                            str = str.substring(2, iIndexOf);
                        } else {
                            str = str.substring(2);
                        }
                    } else {
                        zStartsWith = false;
                    }
                    String strH = h(str, z);
                    if (strH == null) {
                        h.k("StringsUtils", "String missing translation: " + str);
                        if (str2 == null) {
                            str2 = str;
                        }
                    } else {
                        str2 = strH;
                    }
                    if (strArrSplit != null) {
                        if (zStartsWith) {
                            return String.format(str2, strArrSplit);
                        }
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            str2 = str2.replace("{" + i2 + "}", strArrSplit[i2]);
                        }
                    }
                    return str2;
                } catch (Exception e2) {
                    h.d("StringsUtils", e2.getMessage());
                    return "";
                }
            }
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    @Override // com.waze.shared_infra.o.a
    public /* synthetic */ String a() {
        throw null;
    }

    @Override // com.waze.shared_infra.o.a
    public final String b(String str) {
        return d(str, false);
    }

    @Override // com.waze.shared_infra.o.a
    public final String c(int i2, Object... objArr) throws Resources.NotFoundException {
        if (objArr == null || objArr.length == 0) {
            return m(i2);
        }
        String strM = m(i2);
        return an.f(strM) ? "" : String.format(strM, objArr);
    }

    @Override // com.waze.shared_infra.o.a
    public final String d(String str, boolean z) throws Resources.NotFoundException {
        String string;
        if (str == null) {
            return "";
        }
        try {
            Context context = this.f37920c;
            string = context.getResources().getString(context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName()));
        } catch (Resources.NotFoundException e2) {
            h.b("StringsUtils", "display string not found, resName = " + str + ": " + e2.getMessage());
            string = null;
        }
        return n(str, string, z);
    }

    @Override // com.waze.shared_infra.o.a
    public /* synthetic */ void e() {
        throw null;
    }

    @Override // com.waze.shared_infra.o.a
    public void f(String str, HashSet hashSet) {
        throw null;
    }

    protected abstract String g();

    protected String h(String str, boolean z) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.util.HashMap i(java.io.InputStreamReader r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "@@"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r9)
        Lc:
            java.lang.String r9 = r2.readLine()     // Catch: java.lang.Throwable -> L70
            if (r9 == 0) goto L6c
            boolean r3 = r9.startsWith(r0)     // Catch: java.lang.Throwable -> L70
            r4 = 0
            if (r3 == 0) goto L44
            r3 = 2
            java.lang.String r9 = r9.substring(r3)     // Catch: java.lang.Throwable -> L70
            boolean r5 = r9.contains(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = ""
            if (r5 != 0) goto L28
        L26:
            r9 = r6
            goto L44
        L28:
            int r5 = r9.indexOf(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = r9.substring(r4, r5)     // Catch: java.lang.Throwable -> L70
            java.util.HashSet r7 = r8.f37923f     // Catch: java.lang.Throwable -> L70
            if (r7 == 0) goto L26
            boolean r5 = r7.contains(r5)     // Catch: java.lang.Throwable -> L70
            if (r5 != 0) goto L3b
            goto L26
        L3b:
            int r5 = r9.indexOf(r0)     // Catch: java.lang.Throwable -> L70
            int r5 = r5 + r3
            java.lang.String r9 = r9.substring(r5)     // Catch: java.lang.Throwable -> L70
        L44:
            java.lang.String r3 = "="
            boolean r3 = r9.contains(r3)     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto Lc
            java.lang.String r3 = "%n"
            java.lang.String r5 = "\n"
            java.lang.String r9 = r9.replaceAll(r3, r5)     // Catch: java.lang.Throwable -> L70
            r3 = 61
            int r5 = r9.indexOf(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = r9.substring(r4, r5)     // Catch: java.lang.Throwable -> L70
            int r3 = r9.indexOf(r3)     // Catch: java.lang.Throwable -> L70
            int r3 = r3 + 1
            java.lang.String r9 = r9.substring(r3)     // Catch: java.lang.Throwable -> L70
            r1.put(r4, r9)     // Catch: java.lang.Throwable -> L70
            goto Lc
        L6c:
            r2.close()
            return r1
        L70:
            r8 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r9 = move-exception
            r8.addSuppressed(r9)
        L79:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.shared_infra.o.c.i(java.io.InputStreamReader):java.util.HashMap");
    }

    protected final void j() {
        try {
            k(i(l("lang.eng")), "default strings");
            String strConcat = "lang.".concat(String.valueOf(this.f37922e));
            try {
                k(i(l(strConcat)), "default for " + this.f37922e);
            } catch (FileNotFoundException e2) {
                h.k("StringsUtils", "Cached strings file not found, filename: " + strConcat + ", defaulting to English. " + e2.getMessage());
            } catch (IOException e3) {
                h.k("StringsUtils", "Failed to override with default strings for " + this.f37922e + ", defaulting to English. " + e3.getMessage());
            }
        } catch (FileNotFoundException e4) {
            h.d("StringsUtils", "Default strings file not found, can't start app: ".concat(String.valueOf(e4.getMessage())));
            throw new RuntimeException(e4);
        } catch (IOException e5) {
            h.d("StringsUtils", "Failed to read the default strings file, can't start app: ".concat(String.valueOf(e5.getMessage())));
            throw new RuntimeException(e5);
        }
    }

    protected final void k(HashMap map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            ConcurrentHashMap concurrentHashMap = this.f37921d;
            String str4 = (String) concurrentHashMap.get(str2);
            if (str4 != null) {
                Pattern pattern = f37917g;
                Matcher matcher = pattern.matcher(str4);
                Matcher matcher2 = pattern.matcher(str3);
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                while (true) {
                    int iIntValue = 0;
                    if (!matcher2.find()) {
                        break;
                    }
                    String strGroup = matcher2.group(1);
                    if (map2.containsKey(strGroup)) {
                        iIntValue = ((Integer) map2.get(strGroup)).intValue();
                    }
                    map2.put(strGroup, Integer.valueOf(iIntValue + 1));
                }
                while (matcher.find()) {
                    String strGroup2 = matcher.group(1);
                    map3.put(strGroup2, Integer.valueOf((map3.containsKey(strGroup2) ? ((Integer) map3.get(strGroup2)).intValue() : 0) + 1));
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (!map3.containsKey(entry2.getKey()) || ((Integer) map3.get(entry2.getKey())).intValue() < ((Integer) entry2.getValue()).intValue()) {
                        h.k("StringsUtils", "Wrong arguments format found for key '" + str2 + "' in override value '" + str3 + "' from '" + str + "' (original copy: '" + str4 + "')");
                        break;
                    }
                }
            }
            concurrentHashMap.put(str2, str3);
        }
    }
}
