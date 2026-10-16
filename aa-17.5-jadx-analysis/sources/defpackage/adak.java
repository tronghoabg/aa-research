package defpackage;

/* loaded from: classes3.dex */
public final class adak implements adaj {
    private static final war a;
    private static final war b;
    private static final war c;
    private static final war d;

    static {
        wap wapVarA = new wap(wac.a("com.google.android.gms.car"), "", "", false, false).b().a();
        a = wapVarA.c("CakewalkFeature__dont_show_again_dismiss_count", 3L);
        b = wapVarA.e("CakewalkFeature__dont_show_again_enabled", false);
        wapVarA.e("CakewalkFeature__phase_1_75_block_on_unlock_patch_enabled", false);
        c = wapVarA.e("CakewalkFeature__usb_reset_enabled", false);
        d = wapVarA.c("CakewalkFeature__usb_reset_timeout_ms", 3000L);
    }

    @Override // defpackage.adaj
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.adaj
    public final long b() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.adaj
    public final boolean c() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.adaj
    public final boolean d() {
        return ((Boolean) c.b()).booleanValue();
    }
}
