package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class tys implements upw {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/TypedTextureStorage$TextureNode");
    private final usf e;
    private final gjv h;
    public final List b = new ArrayList();
    private uwc f = null;
    private int g = 1;
    public final AtomicInteger c = new AtomicInteger(1);
    public boolean d = false;

    public tys(usf usfVar, gjv gjvVar) {
        this.e = usfVar;
        this.h = gjvVar;
    }

    @Override // defpackage.upw
    public final void a(upy upyVar) {
        Bitmap bitmapC;
        gjv gjvVar;
        if (!upyVar.l() || (bitmapC = upyVar.c()) == null || (gjvVar = this.h) == null) {
            ((ynz) ((ynz) a.d()).ai((char) 9212)).u("Could not load image data for texture.");
        } else {
            gjvVar.m(new txo(this, bitmapC, 4));
            gjvVar.l();
        }
    }

    final synchronized uwc b() {
        return this.f;
    }

    final void c(upr uprVar, tyr tyrVar) {
        boolean z;
        synchronized (this) {
            int i = this.g;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            z = true;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.b.add(tyrVar);
                } else if (i2 != 2) {
                }
                z = false;
            } else {
                upy upyVarC = uprVar.c(this.e.b, "TypedTextureStorage#addOnReadyListener", this);
                if (upyVarC.l()) {
                    Bitmap bitmapC = upyVarC.c();
                    if (bitmapC != null) {
                        f(new usr(bitmapC));
                    } else {
                        ((ynz) ((ynz) a.d()).ai(9210)).u("Could not load image data for texture.");
                    }
                } else {
                    this.g = 2;
                    this.b.add(tyrVar);
                }
                z = false;
            }
        }
        if (z) {
            tyrVar.a();
        }
    }

    public final void d() {
        if (this.d) {
            ((ynz) a.a(uys.a).ai((char) 9211)).u("Attempted to add a reference to a destroyed TextureNode");
        }
        this.c.incrementAndGet();
    }

    final synchronized void e(upr uprVar, String str) {
        upy upyVarC = uprVar.c(str, "TypedTextureStorage#checkResourceIsStillAvailable", null);
        if (!upyVarC.l() || upyVarC.c() == null) {
            this.f = null;
            this.g = 1;
        }
    }

    final synchronized void f(usq usqVar) {
        this.g = 3;
        usf usfVar = this.e;
        String str = usfVar.b;
        boolean z = usfVar.c.c;
        int i = 1;
        if (true == z) {
            i = 4;
        }
        uwc uwcVar = new uwc(str, 2, i);
        this.f = uwcVar;
        uvy uvyVar = ((usr) usqVar).a;
        int i2 = uvyVar.b;
        int i3 = uvyVar.a;
        uwcVar.d(new uuz(usqVar, i3, i2, i3, i2, z));
    }
}
