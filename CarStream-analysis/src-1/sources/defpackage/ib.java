package defpackage;

import android.os.Handler;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.surf.a;
import com.carstream.tech.surf.b;
import com.carstream.tech.surf.c;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ib implements DefaultLifecycleObserver {
    public final /* synthetic */ c a;

    public ib(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        c cVar = this.a;
        lb lbVar = cVar.b;
        lbVar.b.removeCallbacks(lbVar.h);
        lbVar.b(false);
        lbVar.d();
        cVar.a.c();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        c cVar = this.a;
        a aVar = cVar.a;
        CarScreen carScreen = aVar.h;
        if (carScreen != null) {
            b bVar = aVar.g;
            if (bVar != null) {
                bVar.e = false;
            }
            try {
                carScreen.onStart();
                aVar.h.onResume();
                aVar.h.onWindowFocusChanged(true, true);
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
        lb lbVar = cVar.b;
        lbVar.b.removeCallbacks(lbVar.h);
        lbVar.b(true);
        lbVar.e = false;
        lbVar.f = "";
        lbVar.a();
        lbVar.c();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        c cVar = this.a;
        a aVar = cVar.a;
        CarScreen carScreen = aVar.h;
        if (carScreen != null) {
            b bVar = aVar.g;
            if (bVar != null) {
                bVar.e = true;
            }
            try {
                carScreen.onWindowFocusChanged(false, false);
                aVar.h.onPause();
                aVar.h.onStop();
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
        lb lbVar = cVar.b;
        Handler handler = lbVar.b;
        t7 t7Var = lbVar.h;
        handler.removeCallbacks(t7Var);
        handler.postDelayed(t7Var, 1500L);
    }
}
