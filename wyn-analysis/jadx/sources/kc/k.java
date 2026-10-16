package kc;

import android.os.Bundle;
import ka.AbstractC3256n;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f39483a;

    /* renamed from: b, reason: collision with root package name */
    public String f39484b = "main";

    /* renamed from: c, reason: collision with root package name */
    public String f39485c = "/";

    /* renamed from: d, reason: collision with root package name */
    public boolean f39486d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f39487e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f39488f = 2;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39489g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39490h = false;

    public k(String str) {
        this.f39483a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("cached_engine_group_id", this.f39483a);
        bundle.putString("dart_entrypoint", this.f39484b);
        bundle.putString("initial_route", this.f39485c);
        bundle.putBoolean("handle_deeplinking", this.f39486d);
        int i5 = this.f39487e;
        bundle.putString("flutterview_render_mode", i5 != 0 ? AbstractC3256n.r(i5) : "surface");
        int i10 = this.f39488f;
        bundle.putString("flutterview_transparency_mode", i10 != 0 ? AbstractC3256n.s(i10) : "transparent");
        bundle.putBoolean("should_attach_engine_to_activity", true);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f39489g);
        bundle.putBoolean("should_delay_first_android_view_draw", this.f39490h);
        return bundle;
    }
}
