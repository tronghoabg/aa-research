package android.support.v4.a.a;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.fp;
import com.waze.map.b.fg;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f75a;

    public a() {
        fp fpVar = new fp(null);
        x.f(fpVar, "resolver");
        this.f75a = fpVar;
    }

    public final e a(b bVar) {
        x.f(bVar, "ki");
        return ((Boolean) bVar.c().invoke()).booleanValue() ? bVar.b().contains(Build.FINGERPRINT) ? e.f83b : ((fp) this.f75a).b(bVar) : e.f84c;
    }

    public final String b() {
        return ((Bundle) this.f75a).getString("install_referrer");
    }

    public final fg c() {
        return (fg) this.f75a;
    }

    public final void d() {
        ((ArrayList) this.f75a).clear();
    }

    public a(fg fgVar) {
        x.f(fgVar, "polygonData");
        this.f75a = fgVar;
    }

    public a(Bundle bundle) {
        this.f75a = bundle;
    }

    public a(byte[] bArr) {
        this.f75a = new ArrayList();
    }
}
