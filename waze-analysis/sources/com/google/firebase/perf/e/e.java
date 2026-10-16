package com.google.firebase.perf.e;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10394a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f10395b;

    public e(Bundle bundle) {
        this.f10395b = (Bundle) bundle.clone();
    }

    public final f a(String str) {
        if (!d(str)) {
            return f.a();
        }
        try {
            return f.b((Boolean) this.f10395b.get(str));
        } catch (ClassCastException e2) {
            f10394a.c("Metadata key %s contains type other than boolean: %s", str, e2.getMessage());
            return f.a();
        }
    }

    public final f b(String str) {
        Object obj;
        if (!d(str) || (obj = this.f10395b.get(str)) == null) {
            return f.a();
        }
        if (obj instanceof Float) {
            return f.c(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return f.c((Double) obj);
        }
        f10394a.c("Metadata key %s contains type other than double: %s", str);
        return f.a();
    }

    public final f c(String str) {
        f fVarA;
        if (d(str)) {
            try {
                fVarA = f.b((Integer) this.f10395b.get(str));
            } catch (ClassCastException e2) {
                f10394a.c("Metadata key %s contains type other than int: %s", str, e2.getMessage());
                fVarA = f.a();
            }
        } else {
            fVarA = f.a();
        }
        return fVarA.e() ? f.c(Long.valueOf(((Integer) fVarA.d()).intValue())) : f.a();
    }

    public final boolean d(String str) {
        return str != null && this.f10395b.containsKey(str);
    }

    public e() {
        this(new Bundle());
    }
}
