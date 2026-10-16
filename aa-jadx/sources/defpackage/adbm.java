package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adbm implements defpackage.adbl {
    private static final defpackage.wbn a;
    private static final defpackage.wbn b;
    private static final defpackage.wbn c;
    private static final defpackage.wbn d;

    static {
        defpackage.wbl wblVarA = new defpackage.wbl(defpackage.way.a("com.google.android.gms.car"), "", "", false, false).b().a();
        a = wblVarA.c("CakewalkFeature__dont_show_again_dismiss_count", 3L);
        b = wblVarA.e("CakewalkFeature__dont_show_again_enabled", false);
        wblVarA.e("CakewalkFeature__phase_1_75_block_on_unlock_patch_enabled", false);
        c = wblVarA.e("CakewalkFeature__usb_reset_enabled", false);
        d = wblVarA.c("CakewalkFeature__usb_reset_timeout_ms", 3000L);
    }

    @Override // defpackage.adbl
    public final long a() {
        return ((java.lang.Long) a.b()).longValue();
    }

    @Override // defpackage.adbl
    public final long b() {
        return ((java.lang.Long) d.b()).longValue();
    }

    @Override // defpackage.adbl
    public final boolean c() {
        return ((java.lang.Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.adbl
    public final boolean d() {
        return ((java.lang.Boolean) c.b()).booleanValue();
    }
}
