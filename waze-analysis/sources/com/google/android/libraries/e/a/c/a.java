package com.google.android.libraries.e.a.c;

import com.google.android.libraries.e.a.d;
import com.google.android.libraries.e.a.e;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5838a = false;

    static {
        new AtomicInteger();
    }

    private a() {
    }

    public static a b() {
        return new a();
    }

    @Override // com.google.android.libraries.e.a.e
    public final /* bridge */ /* synthetic */ Object a(d dVar) throws IOException {
        if (this.f5838a) {
            if (dVar.e()) {
                throw new com.google.android.libraries.e.a.b.e("Short circuit would skip transforms.");
            }
            return dVar.b().d(dVar.a());
        }
        com.google.android.libraries.e.a.b.d dVarA = com.google.android.libraries.e.a.b.d.a(b.c(dVar));
        try {
            if (!(dVarA.b() instanceof com.google.android.libraries.e.a.b.a)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileA = ((com.google.android.libraries.e.a.b.a) dVarA.b()).a();
            dVarA.close();
            return fileA;
        } catch (Throwable th) {
            try {
                dVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        this.f5838a = true;
    }
}
