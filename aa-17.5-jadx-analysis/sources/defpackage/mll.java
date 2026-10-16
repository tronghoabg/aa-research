package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class mll extends eqj {
    public final String a;
    public final afdr h;
    private final SharedPreferences.OnSharedPreferenceChangeListener i = new ilg(this, 3);

    public mll(String str, afdr afdrVar) {
        this.a = str;
        this.h = afdrVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.eqj
    protected final void c() {
        m(this.h.invoke());
        acxa acxaVar = acxa.a;
        if (acxaVar.gu().aU() && acxaVar.gu().J().b.contains(this.a)) {
            ((mkq) mki.a.i(mkq.class)).a().c.registerOnSharedPreferenceChangeListener(this.i);
        } else {
            ((mkq) mki.a.i(mkq.class)).a().b.registerOnSharedPreferenceChangeListener(this.i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.eqj
    protected final void d() {
        if (acxa.aW() && acxa.K().b.contains(this.a)) {
            mpl.f().a().c.unregisterOnSharedPreferenceChangeListener(this.i);
        } else {
            mpl.f().a().b.unregisterOnSharedPreferenceChangeListener(this.i);
        }
    }
}
