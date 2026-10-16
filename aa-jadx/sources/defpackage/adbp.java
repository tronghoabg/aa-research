package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adbp implements defpackage.adbo {
    private static final defpackage.wbn a;
    private static final defpackage.wbn b;
    private static final defpackage.wbn c;
    private static final defpackage.wbn d;

    static {
        defpackage.wbl wblVarA = new defpackage.wbl(defpackage.way.a("com.google.android.gms.car"), "", "", false, false).b().a();
        wblVarA.e("CarConnectionHandoffFeature__bypass_first_activity", false);
        a = wblVarA.c("CarConnectionHandoffFeature__check_frx_timeout_ms", 2000L);
        wblVarA.f("CarConnectionHandoffFeature__handoff_handlers", new defpackage.adcf(1), "Cn5jb20uZ29vZ2xlLmFuZHJvaWQucHJvamVjdGlvbi5nZWFyaGVhZC9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5hdXRvLmNhcnNlcnZpY2Uuc2VydmljZS5pbXBsLkdlYXJoZWFkQ2FyU3RhcnR1cFNlcnZpY2U6NDkwOTQ3MzA");
        b = wblVarA.e("CarConnectionHandoffFeature__never_fall_back_to_gms_core", true);
        c = wblVarA.e("CarConnectionHandoffFeature__should_fall_back_to_gms_core", true);
        d = wblVarA.e("CarConnectionHandoffFeature__validate_start_connection_intents_via_handshake", true);
    }

    @Override // defpackage.adbo
    public final long a() {
        return ((java.lang.Long) a.b()).longValue();
    }

    @Override // defpackage.adbo
    public final boolean b() {
        return ((java.lang.Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.adbo
    public final boolean c() {
        return ((java.lang.Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.adbo
    public final boolean d() {
        return ((java.lang.Boolean) d.b()).booleanValue();
    }
}
