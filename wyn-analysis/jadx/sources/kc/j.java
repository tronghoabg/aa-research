package kc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import ka.AbstractC3256n;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public String f39473a;

    /* renamed from: b, reason: collision with root package name */
    public String f39474b;

    /* renamed from: c, reason: collision with root package name */
    public List f39475c;

    /* renamed from: d, reason: collision with root package name */
    public String f39476d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39477e;

    /* renamed from: f, reason: collision with root package name */
    public String f39478f;

    /* renamed from: g, reason: collision with root package name */
    public a2.v f39479g;

    /* renamed from: h, reason: collision with root package name */
    public int f39480h;

    /* renamed from: i, reason: collision with root package name */
    public int f39481i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39482j;
    public boolean k;

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("initial_route", this.f39476d);
        bundle.putBoolean("handle_deeplinking", this.f39477e);
        bundle.putString("app_bundle_path", this.f39478f);
        bundle.putString("dart_entrypoint", this.f39473a);
        bundle.putString("dart_entrypoint_uri", this.f39474b);
        bundle.putStringArrayList("dart_entrypoint_args", this.f39475c != null ? new ArrayList<>(this.f39475c) : null);
        a2.v vVar = this.f39479g;
        if (vVar != null) {
            bundle.putStringArray("initialization_args", vVar.z());
        }
        int i5 = this.f39480h;
        bundle.putString("flutterview_render_mode", i5 != 0 ? AbstractC3256n.r(i5) : "surface");
        int i10 = this.f39481i;
        bundle.putString("flutterview_transparency_mode", i10 != 0 ? AbstractC3256n.s(i10) : "transparent");
        bundle.putBoolean("should_attach_engine_to_activity", true);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f39482j);
        bundle.putBoolean("should_delay_first_android_view_draw", this.k);
        return bundle;
    }
}
