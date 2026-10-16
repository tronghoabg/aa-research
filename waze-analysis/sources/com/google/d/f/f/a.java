package com.google.d.f.f;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.d.d.fo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f7842a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* renamed from: b, reason: collision with root package name */
    private static final d f7843b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.d.f.f.d] */
    static {
        e eVar;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                eVar = new e();
                break;
            }
            eVar = null;
            try {
                eVar = (d) Class.forName(f7842a[i2]).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (eVar != null) {
                break;
            } else {
                i2++;
            }
        }
        f7843b = eVar;
    }

    public static StackTraceElement a(Class cls) {
        fo.o(cls, TypedValues.AttributesType.S_TARGET);
        return f7843b.a(cls);
    }

    public static StackTraceElement[] b(Class cls, int i2) {
        if (i2 > 0 || i2 == -1) {
            return f7843b.b(cls, i2);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}
