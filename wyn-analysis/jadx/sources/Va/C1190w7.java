package Va;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: Va.w7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1190w7 extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14730c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Lb f14731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f14732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f14733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f14734g;

    public /* synthetic */ C1190w7(Lb lb2, JSONObject jSONObject, View view, KeyEvent.Callback callback, int i5) {
        this.f14730c = i5;
        this.f14731d = lb2;
        this.f14732e = jSONObject;
        this.f14733f = view;
        this.f14734g = callback;
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f14730c) {
            case 0:
                this.f14731d.k(this.f14732e, this.f14733f, this.f14734g);
                break;
            case 1:
                this.f14731d.v(this.f14732e, this.f14733f, this.f14734g);
                break;
            case 2:
                this.f14731d.r(this.f14732e, this.f14733f, this.f14734g);
                break;
            case 3:
                this.f14731d.m(this.f14732e, this.f14733f, this.f14734g);
                break;
            default:
                this.f14731d.h(this.f14732e, this.f14733f, this.f14734g);
                break;
        }
    }
}
