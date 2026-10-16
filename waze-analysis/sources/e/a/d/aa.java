package e.a.d;

import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa extends au {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jv f46584a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f46585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ad adVar, jv jvVar) {
        super(adVar.f46590a.f46599g);
        this.f46584a = jvVar;
        Objects.requireNonNull(adVar);
        this.f46585b = adVar;
    }

    @Override // e.a.d.au
    public final void a() throws IOException {
        int i2 = e.b.b.f47862a;
        ad adVar = this.f46585b;
        ae aeVar = adVar.f46590a;
        if (adVar.f46591b != null) {
            dh.f(this.f46584a);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamF = this.f46584a.f();
                if (inputStreamF == null) {
                    return;
                }
                try {
                    adVar.f46592c.h(aeVar.f46595c.d(inputStreamF));
                    inputStreamF.close();
                } catch (Throwable th) {
                    dh.g(inputStreamF);
                    throw th;
                }
            } catch (Throwable th2) {
                dh.f(this.f46584a);
                ad.b(this.f46585b, e.a.ee.f47402b.f(th2).g("Failed to read message."));
                return;
            }
        }
    }
}
