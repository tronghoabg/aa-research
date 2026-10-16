package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.StreetViewPanoramaOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zyd extends vit {
    private static final String a = "zyd";
    private zyg b;
    private StreetViewPanoramaOptions c;
    private final int e;
    private final aaau g;
    private final gjt h;
    private final List d = new ArrayList();
    private boolean f = false;

    public zyd(aaau aaauVar, gjt gjtVar, int i) {
        this.g = aaauVar;
        this.h = gjtVar;
        this.e = i;
    }

    @Override // defpackage.viu
    @Deprecated
    public final vis a() {
        try {
            return this.b;
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.viu
    public final void b(vij vijVar) {
        try {
            zyg zygVar = this.b;
            if (zygVar != null) {
                zygVar.b(vijVar);
            } else {
                this.d.add(vijVar);
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.viu
    public final void c(Bundle bundle) {
        try {
            StreetViewPanoramaOptions streetViewPanoramaOptions = this.c;
            if (streetViewPanoramaOptions == null) {
                streetViewPanoramaOptions = (StreetViewPanoramaOptions) vja.c(bundle, "StreetViewPanoramaOptions");
                this.c = streetViewPanoramaOptions;
            }
            if (streetViewPanoramaOptions == null) {
                this.c = new StreetViewPanoramaOptions();
            }
            String str = a;
            if (zrn.e(str, 3)) {
                Log.d(str, String.format("onCreate(%s):%s", bundle, this.c));
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.viu
    public final void d() {
        try {
            zyg zygVar = this.b;
            if (zygVar != null) {
                zygVar.A();
                this.b = null;
            }
            this.c = null;
            this.h.G();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.viu
    public final void f() {
        try {
            zyg zygVar = this.b;
            try {
                if (zygVar.f) {
                    zygVar.A();
                    this.b = null;
                    this.h.G();
                }
            } catch (Throwable th) {
                zus.a(th);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (!(th instanceof Error)) {
                    throw new RuntimeException(th);
                }
                throw ((Error) th);
            }
        } catch (Throwable th2) {
            zus.a(th2);
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            if (!(th2 instanceof Error)) {
                throw new RuntimeException(th2);
            }
            throw ((Error) th2);
        }
    }

    @Override // defpackage.viu
    public final void g() {
        try {
            if (this.f) {
                return;
            }
            this.b.B();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.viu
    public final void h() {
        try {
            if (this.f) {
                return;
            }
            this.b.C();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.viu
    public final void i(Bundle bundle) {
        try {
            StreetViewPanoramaOptions streetViewPanoramaOptions = this.c;
            if (streetViewPanoramaOptions != null) {
                vja.e(bundle, "StreetViewPanoramaOptions", streetViewPanoramaOptions);
            }
            zyg zygVar = this.b;
            if (zygVar != null) {
                zygVar.D(bundle);
            }
            String str = a;
            if (zrn.e(str, 3)) {
                Log.d(str, String.format("onSaveInstanceState(%s):%s", bundle, this.c));
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.viu
    public final void j() {
        try {
            if (this.e > 23) {
                this.f = true;
                this.b.C();
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.viu
    public final void k() {
        try {
            if (this.f) {
                this.f = false;
                this.b.B();
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.viu
    public final boolean l() {
        try {
            return this.b != null;
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.viu
    public final sqj m(sqj sqjVar, Bundle bundle) {
        View viewA;
        try {
            zyg zygVar = this.b;
            if (zygVar == null) {
                aaau aaauVar = this.g;
                zyg zygVarG = zyg.G(this.c, (gjt) aaauVar.b, (aabc) aaauVar.a);
                this.b = zygVarG;
                zygVarG.d(bundle);
                viewA = this.b.a();
                List list = this.d;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.b.b((vij) it.next());
                }
                list.clear();
            } else {
                viewA = zygVar.a();
                ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewA);
                }
            }
            return new sqi(viewA);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.viu
    public final void n(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        try {
            this.c = streetViewPanoramaOptions;
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }
}
