package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.projection.gearhead.R;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class lyu implements lyp {
    public static final /* synthetic */ int e = 0;
    public boolean a;
    private final liu f;
    private final SharedPreferences g;
    public final Set b = new CopyOnWriteArraySet();
    private final SharedPreferences.OnSharedPreferenceChangeListener i = new kwq(this, 3, null);
    private final lit j = new lyq(this, 0);
    final lyt c = new lyr(this);
    public final lyt d = new lys(this);
    private final xyc h = wub.L(new inl(this, 8));

    static {
        yph.c("GH.VpManagerImpl");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public lyu(mko mkoVar, liu liuVar) {
        this.g = mkoVar.b;
        this.f = liuVar;
    }

    @Override // defpackage.lyp
    public final eqj a() {
        return (eqj) this.h.gu();
    }

    @Override // defpackage.lyp
    public final void b(lyo lyoVar) {
        this.b.add(lyoVar);
    }

    @Override // defpackage.lhg
    public final void c() {
        this.g.registerOnSharedPreferenceChangeListener(this.i);
        this.f.k(this.j);
        this.a = true;
        this.c.c();
        this.d.c();
    }

    @Override // defpackage.lhg
    public final void d() {
        this.a = false;
        this.c.c();
        this.b.clear();
        this.f.p(this.j);
        this.g.unregisterOnSharedPreferenceChangeListener(this.i);
    }

    @Override // defpackage.lyp
    public final void e(boolean z) {
        this.g.edit().putBoolean("key_settings_messaging_visual_preview_enabled", z).apply();
        ((eqm) this.h.gu()).m(Boolean.valueOf(z));
    }

    @Override // defpackage.lyp
    public final void f(lyo lyoVar) {
        this.b.remove(lyoVar);
    }

    @Override // defpackage.lyp
    public final boolean g() {
        return l();
    }

    @Override // defpackage.lyp
    public final boolean h() throws Resources.NotFoundException {
        boolean z = mki.a.c.getResources().getBoolean(R.bool.settings_messaging_visual_preview_default);
        SharedPreferences sharedPreferences = this.g;
        return sharedPreferences == null ? z : sharedPreferences.getBoolean("key_settings_messaging_visual_preview_enabled", z);
    }

    @Override // defpackage.lyp
    public final boolean i() {
        return this.d.b;
    }

    @Override // defpackage.lyp
    public final boolean j(lue lueVar) {
        return l() && lueVar.l();
    }

    @Override // defpackage.lyp
    public final boolean k(lvg lvgVar) {
        return l() && lvgVar.b.getBoolean("visual_preview");
    }

    final boolean l() {
        return this.c.b;
    }
}
