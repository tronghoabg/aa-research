package G9;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import df.InterfaceC2432a;
import za.C4658a;

/* loaded from: classes4.dex */
public final class d implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final C4658a f4682a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2432a f4683b;

    public d(C4658a c4658a, InterfaceC2432a interfaceC2432a) {
        this.f4682a = c4658a;
        this.f4683b = interfaceC2432a;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        Application application = (Application) this.f4683b.get();
        this.f4682a.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }
}
