package com.google.android.gms.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends IllegalStateException {
    private f(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(t tVar) {
        if (!tVar.j()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excF = tVar.f();
        return new f("Complete with: ".concat(excF != null ? "failure" : tVar.k() ? "result ".concat(String.valueOf(String.valueOf(tVar.g()))) : tVar.i() ? "cancellation" : "unknown issue"), excF);
    }
}
