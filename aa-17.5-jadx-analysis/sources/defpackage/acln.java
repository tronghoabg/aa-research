package defpackage;

/* loaded from: classes3.dex */
public final class acln implements aclm {
    private static final wcv a = new wcv(aclg.b, 5);

    @Override // defpackage.aclm
    public final long a() {
        return ((Long) a.b(3, "AceFeature__maximum_ace_wait_time", 10000L).gu()).longValue();
    }

    @Override // defpackage.aclm
    public final long b() {
        return ((Long) a.b(4, "AceFeature__mode", 0L).gu()).longValue();
    }

    @Override // defpackage.aclm
    public final boolean c() {
        return ((Boolean) a.d(0, "AceFeature__actionable_insight_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.aclm
    public final boolean d() {
        return ((Boolean) a.d(1, "AceFeature__add_entity_type_label", false).gu()).booleanValue();
    }

    @Override // defpackage.aclm
    public final boolean e() {
        return ((Boolean) a.d(2, "AceFeature__fake_insight_generation", false).gu()).booleanValue();
    }
}
