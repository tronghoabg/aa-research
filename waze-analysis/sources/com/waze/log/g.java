package com.waze.log;

import com.waze.crash.k;
import com.waze.jni.protos.JniProtoConstants;
import com.waze.shared_infra.i.h;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements com.waze.shared_infra.i.e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25446a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f25447b = false;

    /* renamed from: c, reason: collision with root package name */
    private final String f25448c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25449d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25450e;

    /* renamed from: f, reason: collision with root package name */
    private final d f25451f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f25452g;

    static {
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(g.class.getName(), h.class.getName(), k.class.getName())));
    }

    g(com.waze.shared_infra.i.c cVar, d dVar, com.waze.shared_infra.i.b bVar) {
        this.f25448c = cVar.b();
        this.f25449d = m(cVar.a());
        this.f25450e = cVar.c();
        this.f25451f = dVar;
        this.f25452g = bVar;
    }

    public static void j(long j2) {
        f25447b = j2 == ((long) JniProtoConstants.LogLevel.DEBUG.getNumber());
    }

    public static boolean k() {
        return f25447b;
    }

    private final void l(com.waze.shared_infra.i.d dVar, CharSequence charSequence) {
        String string = charSequence.toString();
        int iM = m(dVar);
        if (f25447b || iM >= this.f25449d) {
            if (this.f25450e) {
                h.m(dVar, this.f25448c, string);
            }
            d dVar2 = this.f25451f;
            String str = this.f25448c;
            f fVar = f.f25443c;
            if (!h.p(str)) {
                string = String.format("%s: %s", str, string);
            }
            dVar2.log(iM, string, fVar.f25444a, 0, fVar.f25445b);
        }
    }

    private static final int m(com.waze.shared_infra.i.d dVar) {
        int iOrdinal = dVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? JniProtoConstants.LogLevel.FATAL.getNumber() : JniProtoConstants.LogLevel.FATAL.getNumber() : JniProtoConstants.LogLevel.ERROR.getNumber() : JniProtoConstants.LogLevel.WARNING.getNumber() : JniProtoConstants.LogLevel.INFO.getNumber() : JniProtoConstants.LogLevel.DEBUG.getNumber();
    }

    @Override // com.waze.shared_infra.i.e
    public final void a(CharSequence charSequence) {
        l(com.waze.shared_infra.i.d.f37886a, charSequence.toString());
    }

    @Override // com.waze.shared_infra.i.e
    public final void b(CharSequence charSequence) {
        l(com.waze.shared_infra.i.d.f37889d, charSequence.toString());
    }

    @Override // com.waze.shared_infra.i.e
    public final /* synthetic */ void c(String str, Throwable th) {
        com.waze.settings.tree.c.f.e(this, str, th);
    }

    @Override // com.waze.shared_infra.i.e
    public final void d(CharSequence charSequence) {
        l(com.waze.shared_infra.i.d.f37890e, charSequence.toString());
    }

    @Override // com.waze.shared_infra.i.e
    public final void e(CharSequence charSequence) {
        l(com.waze.shared_infra.i.d.f37887b, charSequence.toString());
    }

    @Override // com.waze.shared_infra.i.e
    public final void f(CharSequence charSequence) {
        l(com.waze.shared_infra.i.d.f37889d, charSequence);
        com.waze.shared_infra.i.b bVar = this.f25452g;
        if (bVar != null) {
            try {
                bVar.a(new Throwable(charSequence.toString()), "UNEXPECTED");
            } catch (RuntimeException e2) {
                l(com.waze.shared_infra.i.d.f37889d, "Failed to report unexpected state: ".concat(String.valueOf(e2.getMessage())));
            }
        }
    }

    @Override // com.waze.shared_infra.i.e
    public final void g(CharSequence charSequence) {
        l(com.waze.shared_infra.i.d.f37888c, charSequence.toString());
    }

    @Override // com.waze.shared_infra.i.e
    public final /* synthetic */ void h(String str, Throwable th) {
        com.waze.settings.tree.c.f.f(this, str, th);
    }

    @Override // com.waze.shared_infra.i.e
    public final /* synthetic */ void i(Throwable th) {
        com.waze.shared_infra.i.f fVar = new com.waze.shared_infra.i.f("Could not register receiver");
        fVar.a(th);
        d(fVar);
    }
}
