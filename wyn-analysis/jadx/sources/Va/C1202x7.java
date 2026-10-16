package Va;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: Va.x7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1202x7 extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Lb f14764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f14765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f14766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0950e0 f14767g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f14768h;

    public /* synthetic */ C1202x7(Lb lb2, JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, KeyEvent.Callback callback, int i5) {
        this.f14763c = i5;
        this.f14764d = lb2;
        this.f14765e = jSONObject;
        this.f14766f = view;
        this.f14767g = interfaceC0950e0;
        this.f14768h = callback;
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f14763c) {
            case 0:
                this.f14764d.s(this.f14765e, this.f14766f, this.f14767g, this.f14768h);
                break;
            default:
                this.f14764d.n(this.f14765e, this.f14766f, this.f14767g, this.f14768h);
                break;
        }
    }
}
