package defpackage;

/* loaded from: classes.dex */
public final class adan implements adam {
    private static final war a;
    private static final war b;
    private static final war c;
    private static final war d;

    static {
        wap wapVarA = new wap(wac.a("com.google.android.gms.car"), "", "", false, false).b().a();
        wapVarA.e("CarConnectionHandoffFeature__bypass_first_activity", false);
        a = wapVarA.c("CarConnectionHandoffFeature__check_frx_timeout_ms", 2000L);
        wapVarA.f("CarConnectionHandoffFeature__handoff_handlers", new adbg(1), "Cn5jb20uZ29vZ2xlLmFuZHJvaWQucHJvamVjdGlvbi5nZWFyaGVhZC9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5hdXRvLmNhcnNlcnZpY2Uuc2VydmljZS5pbXBsLkdlYXJoZWFkQ2FyU3RhcnR1cFNlcnZpY2U6NDkwOTQ3MzA");
        b = wapVarA.e("CarConnectionHandoffFeature__never_fall_back_to_gms_core", true);
        c = wapVarA.e("CarConnectionHandoffFeature__should_fall_back_to_gms_core", true);
        d = wapVarA.e("CarConnectionHandoffFeature__validate_start_connection_intents_via_handshake", true);
    }

    @Override // defpackage.adam
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.adam
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.adam
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.adam
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }
}
