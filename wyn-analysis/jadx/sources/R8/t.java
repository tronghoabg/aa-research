package R8;

import U8.U;
import U8.V;
import U8.W;
import U8.Y;
import Va.X7;
import Y2.B;
import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f10525f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f10526g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10527a;

    /* renamed from: b, reason: collision with root package name */
    public final z f10528b;

    /* renamed from: c, reason: collision with root package name */
    public final C0805a f10529c;

    /* renamed from: d, reason: collision with root package name */
    public final B f10530d;

    /* renamed from: e, reason: collision with root package name */
    public final K3.r f10531e;

    static {
        HashMap map = new HashMap();
        f10525f = map;
        N0.a.p(5, map, "armeabi", 6, "armeabi-v7a");
        N0.a.p(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f10526g = "Crashlytics Android SDK/19.3.0";
    }

    public t(Context context, z zVar, C0805a c0805a, B b5, K3.r rVar) {
        this.f10527a = context;
        this.f10528b = zVar;
        this.f10529c = c0805a;
        this.f10530d = b5;
        this.f10531e = rVar;
    }

    public static V c(X7 x72, int i5) {
        String str = (String) x72.f13842b;
        int i10 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) x72.f13843c;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        X7 x73 = (X7) x72.f13844d;
        if (i5 >= 8) {
            for (X7 x74 = x73; x74 != null; x74 = (X7) x74.f13844d) {
                i10++;
            }
        }
        int i11 = i10;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b5 = (byte) (0 | 1);
        V vC = null;
        if (x73 != null && i11 == 0) {
            vC = c(x73, i5 + 1);
        }
        if (b5 == 1) {
            return new V(str, (String) x72.f13841a, listD, vC, i11);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b5 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i5) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            Y y10 = new Y();
            y10.f12498e = i5;
            y10.f12499f = (byte) (y10.f12499f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            y10.f12494a = jMax;
            byte b5 = (byte) (y10.f12499f | 1);
            y10.f12499f = b5;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            y10.f12495b = str;
            y10.f12496c = fileName;
            y10.f12497d = lineNumber;
            y10.f12499f = (byte) (b5 | 2);
            arrayList.add(y10.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static W e() {
        byte b5 = (byte) 1;
        if (b5 == 1) {
            return new W("0", "0", 0L);
        }
        StringBuilder sb2 = new StringBuilder();
        if (b5 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }

    public final List a() {
        byte b5 = (byte) (((byte) (0 | 1)) | 2);
        C0805a c0805a = this.f10529c;
        String str = (String) c0805a.f10439d;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b5 == 3) {
            return Collections.singletonList(new U(str, (String) c0805a.f10437b, 0L, 0L));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b5 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b5 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final U8.C0863d0 b(int r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.t.b(int):U8.d0");
    }
}
