package dd;

import a9.C1341a;
import android.app.Activity;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.InterfaceC4269f;

/* renamed from: dd.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2427f implements InterfaceC3885b, InterfaceC3964a {

    /* renamed from: a, reason: collision with root package name */
    public C2426e f34266a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4269f f34267b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3965b f34268c;

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        this.f34268c = interfaceC3965b;
        s1 s1Var = (s1) interfaceC3965b;
        s1Var.b(this.f34266a);
        this.f34266a.f34260b = (Activity) s1Var.f43896a;
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        C1341a c1341a = new C1341a();
        this.f34267b = interfaceC4269f;
        C2426e c2426e = new C2426e(c3884a.f44186a, c1341a);
        this.f34266a = c2426e;
        com.google.android.gms.internal.consent_sdk.a.F(interfaceC4269f, c2426e);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        ((s1) this.f34268c).m(this.f34266a);
        this.f34266a.f34260b = null;
        this.f34268c = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        ((s1) this.f34268c).m(this.f34266a);
        this.f34266a.f34260b = null;
        this.f34268c = null;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f34266a = null;
        InterfaceC4269f interfaceC4269f = this.f34267b;
        if (interfaceC4269f != null) {
            com.google.android.gms.internal.consent_sdk.a.F(interfaceC4269f, null);
            this.f34267b = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        this.f34268c = interfaceC3965b;
        s1 s1Var = (s1) interfaceC3965b;
        s1Var.b(this.f34266a);
        this.f34266a.f34260b = (Activity) s1Var.f43896a;
    }
}
