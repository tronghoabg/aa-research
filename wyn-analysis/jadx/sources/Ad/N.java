package ad;

import android.view.View;

/* loaded from: classes5.dex */
public final class N implements io.flutter.plugin.platform.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17522a;

    /* renamed from: b, reason: collision with root package name */
    public View f17523b;

    public /* synthetic */ N(View view, int i5) {
        this.f17522a = i5;
        this.f17523b = view;
    }

    private final /* synthetic */ void b(View view) {
    }

    private final /* synthetic */ void c(View view) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    private final /* synthetic */ void h() {
    }

    private final /* synthetic */ void i() {
    }

    @Override // io.flutter.plugin.platform.e
    public final void dispose() {
        switch (this.f17522a) {
            case 0:
                this.f17523b = null;
                break;
        }
    }

    @Override // io.flutter.plugin.platform.e
    public final View getView() {
        switch (this.f17522a) {
        }
        return this.f17523b;
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onFlutterViewAttached(View view) {
        int i5 = this.f17522a;
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onFlutterViewDetached() {
        int i5 = this.f17522a;
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onInputConnectionLocked() {
        int i5 = this.f17522a;
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onInputConnectionUnlocked() {
        int i5 = this.f17522a;
    }

    private final void a() {
    }
}
