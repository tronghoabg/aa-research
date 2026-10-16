package com.google.d.b;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final String f7254a;

    /* renamed from: b, reason: collision with root package name */
    private final y f7255b;

    /* renamed from: c, reason: collision with root package name */
    private y f7256c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7257d;

    /* synthetic */ z(String str) {
        y yVar = new y();
        this.f7255b = yVar;
        this.f7256c = yVar;
        this.f7257d = false;
        an.B(str);
        this.f7254a = str;
    }

    private final y h() {
        y yVar = new y();
        this.f7256c.f7253c = yVar;
        this.f7256c = yVar;
        return yVar;
    }

    private final void i(String str, Object obj) {
        x xVar = new x(null);
        this.f7256c.f7253c = xVar;
        this.f7256c = xVar;
        xVar.f7252b = obj;
        xVar.f7251a = str;
    }

    public final void a() {
        this.f7257d = true;
    }

    public final void b(String str, int i2) {
        i(str, String.valueOf(i2));
    }

    public final void c(String str, long j2) {
        i(str, String.valueOf(j2));
    }

    public final void d(String str, Object obj) {
        y yVarH = h();
        yVarH.f7252b = obj;
        yVarH.f7251a = str;
    }

    public final void e(String str, boolean z) {
        i(str, String.valueOf(z));
    }

    public final void f(double d2) {
        i("backoffMultiplier", String.valueOf(d2));
    }

    public final void g(Object obj) {
        h().f7252b = obj;
    }

    public final String toString() {
        boolean z = this.f7257d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f7254a);
        sb.append('{');
        String str = "";
        for (y yVar = this.f7255b.f7253c; yVar != null; yVar = yVar.f7253c) {
            boolean z2 = yVar instanceof x;
            Object obj = yVar.f7252b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = yVar.f7251a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
