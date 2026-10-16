package yc;

import android.app.Activity;
import o1.C3641c;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import s8.C4026b;
import uc.C4273j;
import uc.InterfaceC4269f;

/* renamed from: yc.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4586i implements InterfaceC3885b, InterfaceC3964a {

    /* renamed from: a, reason: collision with root package name */
    public C3884a f48143a;

    /* renamed from: b, reason: collision with root package name */
    public s1 f48144b;

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        Activity activity = (Activity) ((s1) interfaceC3965b).f43896a;
        C3884a c3884a = this.f48143a;
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        C3641c c3641c = new C3641c(interfaceC3965b, 21);
        C4026b c4026b = new C4026b(8);
        c4026b.f45322b = false;
        io.flutter.embedding.engine.renderer.k kVar = c3884a.f44189d;
        s1 s1Var = new s1();
        s1Var.f43896a = activity;
        s1Var.f43897b = interfaceC4269f;
        s1Var.f43898c = c4026b;
        s1Var.f43899d = c3641c;
        s1Var.f43900e = kVar;
        s1Var.f43901f = new C4273j(interfaceC4269f, "plugins.flutter.io/camera_android/imageStream");
        wg.b.f(interfaceC4269f, s1Var);
        this.f48144b = s1Var;
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        this.f48143a = c3884a;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        s1 s1Var = this.f48144b;
        if (s1Var != null) {
            wg.b.f((InterfaceC4269f) s1Var.f43897b, null);
            this.f48144b = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f48143a = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        onAttachedToActivity(interfaceC3965b);
    }
}
