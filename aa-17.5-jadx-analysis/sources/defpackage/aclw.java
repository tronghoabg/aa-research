package defpackage;

/* loaded from: classes.dex */
public final class aclw implements aclv {
    private static final wcv a = new wcv(aclg.b, 11);

    @Override // defpackage.aclv
    public final boolean a() {
        return ((Boolean) a.d(0, "ApolloFeature__apollo", false).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean b() {
        return ((Boolean) a.d(1, "ApolloFeature__bitmap_live_data_use_copy_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean c() {
        return ((Boolean) a.d(2, "ApolloFeature__decrease_pager_snap_threshold_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean d() {
        return ((Boolean) a.d(3, "ApolloFeature__expressive_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean e() {
        return ((Boolean) a.d(4, "ApolloFeature__filter_media_sessions_outside_of_fragment_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean f() {
        return ((Boolean) a.d(5, "ApolloFeature__ignore_invalid_active_sessions_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean g() {
        return ((Boolean) a.d(6, "ApolloFeature__ignore_unplayed_buffering_sessions_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean h() {
        return ((Boolean) a.d(7, "ApolloFeature__limit_one_playback_only_app_per_package_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean i() {
        return ((Boolean) a.d(8, "ApolloFeature__no_auto_swipe_to_suggestions_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean j() {
        return ((Boolean) a.d(9, "ApolloFeature__recycled_bitmap_check_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aclv
    public final boolean k() {
        return ((Boolean) a.d(10, "ApolloFeature__safe_shapeable_image_view_kill_switch", true).gu()).booleanValue();
    }
}
