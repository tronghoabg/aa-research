package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.google.android.libraries.maps.StreetViewPanoramaOptions;

/* loaded from: classes3.dex */
public final class zyk extends viv {
    private zyg a;
    private final StreetViewPanoramaOptions b;
    private final int c;
    private boolean d;
    private final aabc e;
    private final gjt f;

    public zyk(StreetViewPanoramaOptions streetViewPanoramaOptions, gjt gjtVar, aabc aabcVar) {
        int i = Build.VERSION.SDK_INT;
        this.b = streetViewPanoramaOptions == null ? new StreetViewPanoramaOptions() : streetViewPanoramaOptions;
        this.f = gjtVar;
        this.e = aabcVar;
        this.c = i;
        this.d = false;
    }

    @Override // defpackage.viw
    public final sqj a() {
        return new sqi(this.a.a());
    }

    @Override // defpackage.viw
    @Deprecated
    public final vis b() {
        return this.a;
    }

    @Override // defpackage.viw
    public final void c(vij vijVar) {
        zyg zygVar = this.a;
        if (zygVar != null) {
            zygVar.b(vijVar);
        }
    }

    @Override // defpackage.viw
    public final void d(Bundle bundle) {
        zyg zygVarG = zyg.G(this.b, this.f, this.e);
        this.a = zygVarG;
        zygVarG.d(bundle);
    }

    @Override // defpackage.viw
    public final void f() {
        this.a.A();
        this.f.G();
    }

    @Override // defpackage.viw
    public final void g() {
        if (this.d) {
            return;
        }
        this.a.B();
    }

    @Override // defpackage.viw
    public final void h() {
        if (this.d) {
            return;
        }
        this.a.C();
    }

    @Override // defpackage.viw
    public final void i(Bundle bundle) {
        this.a.D(bundle);
    }

    @Override // defpackage.viw
    public final void j() {
        if (this.c > 23) {
            this.d = true;
            this.a.C();
        }
    }

    @Override // defpackage.viw
    public final void k() {
        if (this.d) {
            this.d = false;
            this.a.B();
        }
    }
}
