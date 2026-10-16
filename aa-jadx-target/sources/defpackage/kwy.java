package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kwy extends defpackage.eqr {
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener a;
    private final defpackage.qdo h;

    static {
        defpackage.yqm.c("GH.ShouldShowWorkData");
    }

    public kwy() {
        super(java.lang.Boolean.valueOf(a()));
        this.a = new defpackage.kww(this, 0);
        this.h = new defpackage.qdo() { // from class: kwx
            @Override // defpackage.qdo
            public final void a() {
                this.a.j(java.lang.Boolean.valueOf(defpackage.kwy.a()));
            }
        };
    }

    public static boolean a() {
        return defpackage.kwu.b().d.d() && defpackage.mpr.f().a().o();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.eqr, defpackage.eqp
    protected final void c() {
        super.c();
        defpackage.mpr.f().a().b.registerOnSharedPreferenceChangeListener(this.a);
        defpackage.kwu.b().d.a.add(this.h);
        j(java.lang.Boolean.valueOf(a()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.eqr, defpackage.eqp
    protected final void d() {
        super.d();
        defpackage.mpr.f().a().b.unregisterOnSharedPreferenceChangeListener(this.a);
        defpackage.kwu.b().d.a.remove(this.h);
    }
}
