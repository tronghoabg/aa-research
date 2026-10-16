package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class kws extends eql {
    private final SharedPreferences.OnSharedPreferenceChangeListener a;
    private final qcp h;

    static {
        yph.c("GH.ShouldShowWorkData");
    }

    public kws() {
        super(Boolean.valueOf(a()));
        this.a = new kwq(this, 0);
        this.h = new qcp() { // from class: kwr
            @Override // defpackage.qcp
            public final void a() {
                this.a.j(Boolean.valueOf(kws.a()));
            }
        };
    }

    public static boolean a() {
        return kwo.b().d.d() && mpl.f().a().o();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        mpl.f().a().b.registerOnSharedPreferenceChangeListener(this.a);
        kwo.b().d.a.add(this.h);
        j(Boolean.valueOf(a()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        super.d();
        mpl.f().a().b.unregisterOnSharedPreferenceChangeListener(this.a);
        kwo.b().d.a.remove(this.h);
    }
}
