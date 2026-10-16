package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mlq extends defpackage.eqp {
    public final java.lang.String a;
    public final defpackage.afer h;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener i = new defpackage.ilq(this, 3);

    public mlq(java.lang.String str, defpackage.afer aferVar) {
        this.a = str;
        this.h = aferVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.eqp
    protected final void c() {
        m(this.h.invoke());
        defpackage.acyc acycVar = defpackage.acyc.a;
        if (acycVar.fF().aX() && acycVar.fF().K().b.contains(this.a)) {
            ((defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class)).a().c.registerOnSharedPreferenceChangeListener(this.i);
        } else {
            ((defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class)).a().b.registerOnSharedPreferenceChangeListener(this.i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.eqp
    protected final void d() {
        if (defpackage.acyc.aZ() && defpackage.acyc.L().b.contains(this.a)) {
            defpackage.mpr.f().a().c.unregisterOnSharedPreferenceChangeListener(this.i);
        } else {
            defpackage.mpr.f().a().b.unregisterOnSharedPreferenceChangeListener(this.i);
        }
    }
}
