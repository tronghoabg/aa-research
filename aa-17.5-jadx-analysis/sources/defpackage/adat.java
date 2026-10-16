package defpackage;

/* loaded from: classes3.dex */
public final class adat implements adas {
    private static final war a;
    private static final war b;

    static {
        wap wapVarA = new wap(wac.a("com.google.android.gms.car"), "", "", false, false).b().a();
        a = wapVarA.c("FrameworkGalFeature__fragment_size_for_wifi", 16128L);
        b = wapVarA.c("FrameworkGalFeature__framer_send_buffer_size_for_wifi", 16384L);
        wapVarA.e("FrameworkGalFeature__is_gal_snoop_available", false);
        wapVarA.e("FrameworkGalFeature__is_gal_snoop_enabled_in_starship", false);
    }

    @Override // defpackage.adas
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.adas
    public final long b() {
        return ((Long) b.b()).longValue();
    }
}
