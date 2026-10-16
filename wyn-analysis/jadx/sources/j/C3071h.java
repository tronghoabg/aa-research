package j;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import f.InterfaceC2544b;

/* renamed from: j.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3071h implements InterfaceC2544b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f38463a;

    public C3071h(AppCompatActivity appCompatActivity) {
        this.f38463a = appCompatActivity;
    }

    @Override // f.InterfaceC2544b
    public final void a(ComponentActivity componentActivity) {
        AppCompatActivity appCompatActivity = this.f38463a;
        l lVarC = appCompatActivity.C();
        lVarC.a();
        appCompatActivity.getSavedStateRegistry().a("androidx:appcompat");
        lVarC.d();
    }
}
