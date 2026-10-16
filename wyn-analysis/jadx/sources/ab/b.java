package ab;

import A7.RunnableC0307z;
import Bf.r;
import G5.C0522c;
import Hf.x0;
import L8.e;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import cg.AbstractC1612a;
import cg.AbstractC1613b;
import cg.C1621j;
import ff.m;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.InterfaceC3107g;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONArray;
import org.json.JSONObject;
import r7.InterfaceC3932b;
import r7.InterfaceC3933c;
import s2.C;
import s2.l;
import s2.o;
import s2.w;
import ya.C4570a;

/* loaded from: classes4.dex */
public class b implements InterfaceC3107g, InterfaceC3933c, o, e {
    public static C1621j a(String str) {
        char c10;
        int i5;
        char cCharAt;
        char c11 = 'A';
        AbstractC3340k.e(str, "<this>");
        byte[] bArr = AbstractC1612a.f19887a;
        int length = str.length();
        while (true) {
            c10 = '\t';
            if (length <= 0 || !((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                break;
            }
            length--;
        }
        int i10 = (int) ((length * 6) / 8);
        byte[] bArrCopyOf = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i11 < length) {
                char cCharAt2 = str.charAt(i11);
                char c12 = c11;
                if (c11 <= cCharAt2 && cCharAt2 < '[') {
                    i5 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i5 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i5 = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != c10) {
                            break;
                        }
                        i11++;
                        c11 = c12;
                        c10 = '\t';
                    } else {
                        i5 = 63;
                    }
                } else {
                    i5 = 62;
                }
                int i15 = i5 | (i13 << 6);
                i12++;
                if (i12 % 4 == 0) {
                    bArrCopyOf[i14] = (byte) (i15 >> 16);
                    int i16 = i14 + 2;
                    bArrCopyOf[i14 + 1] = (byte) (i15 >> 8);
                    i14 += 3;
                    bArrCopyOf[i16] = (byte) i15;
                }
                i13 = i15;
                i11++;
                c11 = c12;
                c10 = '\t';
            } else {
                int i17 = i12 % 4;
                if (i17 != 1) {
                    if (i17 == 2) {
                        bArrCopyOf[i14] = (byte) ((i13 << 12) >> 16);
                        i14 = 1 + i14;
                    } else if (i17 == 3) {
                        int i18 = i13 << 6;
                        int i19 = 1 + i14;
                        bArrCopyOf[i14] = (byte) (i18 >> 16);
                        i14 += 2;
                        bArrCopyOf[i19] = (byte) (i18 >> 8);
                    }
                    if (i14 != i10) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                        AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new C1621j(bArrCopyOf);
        }
        return null;
    }

    public static C1621j b(String str) {
        AbstractC3340k.e(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i10 = i5 * 2;
            bArr[i5] = (byte) (dg.b.a(str.charAt(i10 + 1)) + (dg.b.a(str.charAt(i10)) << 4));
        }
        return new C1621j(bArr);
    }

    public static C1621j c(String str) {
        AbstractC3340k.e(str, "<this>");
        byte[] bytes = str.getBytes(Bf.a.f1670a);
        AbstractC3340k.d(bytes, "getBytes(...)");
        C1621j c1621j = new C1621j(bytes);
        c1621j.f19906c = str;
        return c1621j;
    }

    public static boolean f() {
        return ((Boolean) ((x0) AbstractServiceC1345a.f17485a.f5122a).getValue()).booleanValue();
    }

    public static C1621j g(byte[] bArr) {
        C1621j c1621j = C1621j.f19903d;
        int length = bArr.length;
        AbstractC1613b.f(bArr.length, 0, length);
        return new C1621j(m.k0(0, length, bArr));
    }

    public static void h(Context context) throws Ya.a {
        AbstractC3340k.e(context, "context");
        if (!f()) {
            throw new Ya.a(11);
        }
        Intent intent = new Intent(context, (Class<?>) AbstractServiceC1345a.class);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
        editorEdit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.api_restart");
        editorEdit.commit();
        Y0.e.startForegroundService(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ba A[PHI: r9
  0x01ba: PHI (r9v26 java.lang.Integer) = (r9v4 java.lang.Integer), (r9v8 java.lang.Integer) binds: [B:100:0x01b8, B:109:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(android.content.Context r30, java.lang.Object r31) throws Ya.a {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.b.i(android.content.Context, java.lang.Object):void");
    }

    public static void j(Context context) throws Ya.a {
        AbstractC3340k.e(context, "context");
        if (!f()) {
            throw new Ya.a(11);
        }
        Intent intent = new Intent(context, (Class<?>) AbstractServiceC1345a.class);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
        editorEdit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.api_stop");
        editorEdit.commit();
        SharedPreferences.Editor editorEdit2 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_TYPES", 0).edit();
        editorEdit2.clear();
        editorEdit2.commit();
        SharedPreferences.Editor editorEdit3 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS", 0).edit();
        editorEdit3.clear();
        editorEdit3.commit();
        SharedPreferences.Editor editorEdit4 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0).edit();
        editorEdit4.clear();
        editorEdit4.commit();
        SharedPreferences.Editor editorEdit5 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0).edit();
        editorEdit5.clear();
        editorEdit5.commit();
        SharedPreferences.Editor editorEdit6 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS", 0).edit();
        editorEdit6.clear();
        editorEdit6.commit();
        Y0.e.startForegroundService(context, intent);
    }

    public static void k(Context context, Object obj) throws Ya.a {
        AbstractC3340k.e(context, "context");
        if (!f()) {
            throw new Ya.a(11);
        }
        Intent intent = new Intent(context, (Class<?>) AbstractServiceC1345a.class);
        Map map = obj instanceof Map ? (Map) obj : null;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
        editorEdit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.api_update");
        editorEdit.commit();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0);
        Object obj2 = map != null ? map.get("taskEventAction") : null;
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        String string = map2 != null ? new JSONObject(map2).toString() : null;
        Object obj3 = map != null ? map.get("autoRunOnBoot") : null;
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Object obj4 = map != null ? map.get("autoRunOnMyPackageReplaced") : null;
        Boolean bool2 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        Object obj5 = map != null ? map.get("allowWakeLock") : null;
        Boolean bool3 = obj5 instanceof Boolean ? (Boolean) obj5 : null;
        Object obj6 = map != null ? map.get("allowWifiLock") : null;
        Boolean bool4 = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        if (string != null) {
            editorEdit2.putString("taskEventAction", string);
        }
        if (bool != null) {
            editorEdit2.putBoolean("autoRunOnBoot", bool.booleanValue());
        }
        if (bool2 != null) {
            editorEdit2.putBoolean("autoRunOnMyPackageReplaced", bool2.booleanValue());
        }
        if (bool3 != null) {
            editorEdit2.putBoolean("allowWakeLock", bool3.booleanValue());
        }
        if (bool4 != null) {
            editorEdit2.putBoolean("allowWifiLock", bool4.booleanValue());
        }
        editorEdit2.commit();
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0);
        Long lM0 = r.m0(String.valueOf(map != null ? map.get("callbackHandle") : null));
        SharedPreferences.Editor editorEdit3 = sharedPreferences2.edit();
        if (lM0 != null) {
            editorEdit3.putLong("callbackHandle", lM0.longValue());
        }
        editorEdit3.commit();
        SharedPreferences sharedPreferences3 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS", 0);
        Object obj7 = map != null ? map.get("notificationContentTitle") : null;
        String str = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = map != null ? map.get("notificationContentText") : null;
        String str2 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = map != null ? map.get("icon") : null;
        Map map3 = obj9 instanceof Map ? (Map) obj9 : null;
        String string2 = map3 != null ? new JSONObject(map3).toString() : null;
        Object obj10 = map != null ? map.get("buttons") : null;
        List list = obj10 instanceof List ? (List) obj10 : null;
        String string3 = list != null ? new JSONArray((Collection) list).toString() : null;
        Object obj11 = map != null ? map.get("initialRoute") : null;
        String str3 = obj11 instanceof String ? (String) obj11 : null;
        SharedPreferences.Editor editorEdit4 = sharedPreferences3.edit();
        if (str != null) {
            editorEdit4.putString("notificationContentTitle", str);
        }
        if (str2 != null) {
            editorEdit4.putString("notificationContentText", str2);
        }
        if (string2 != null) {
            editorEdit4.putString("icon", string2);
        }
        if (string3 != null) {
            editorEdit4.putString("buttons", string3);
        }
        if (str3 != null) {
            editorEdit4.putString("initialRoute", str3);
        }
        editorEdit4.commit();
        Y0.e.startForegroundService(context, intent);
    }

    public Signature[] d(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // r7.InterfaceC3933c
    public C0522c e(Context context, String str, InterfaceC3932b interfaceC3932b) {
        C0522c c0522c = new C0522c();
        int iA = interfaceC3932b.a(context, str, true);
        c0522c.f4406b = iA;
        if (iA != 0) {
            c0522c.f4407c = 1;
            return c0522c;
        }
        int iD = interfaceC3932b.d(context, str);
        c0522c.f4405a = iD;
        if (iD != 0) {
            c0522c.f4407c = -1;
        }
        return c0522c;
    }

    @Override // s2.o
    /* renamed from: m */
    public C mo0m(int i5, int i10) {
        return new l();
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        C4570a c4570a = new C4570a();
        RunnableC0307z runnableC0307z = new RunnableC0307z(6);
        ReferenceQueue referenceQueue = c4570a.f48039a;
        Set set = c4570a.f48040b;
        set.add(new ya.l(c4570a, referenceQueue, set, runnableC0307z));
        Thread thread = new Thread(new L7.b(29, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c4570a;
    }

    @Override // s2.o, J5.m
    public void l() {
    }

    @Override // s2.o
    public void s(w wVar) {
    }
}
