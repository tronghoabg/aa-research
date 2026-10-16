package androidx.window.area;

import android.os.IBinder;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowAreaToken {
    public static final Companion Companion = new Companion(null);
    private final IBinder binder;

    public WindowAreaToken(IBinder iBinder) {
        x.f(iBinder, "binder");
        this.binder = iBinder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.window.area.WindowAreaToken");
        return x.n(this.binder.getInterfaceDescriptor(), ((WindowAreaToken) obj).binder.getInterfaceDescriptor());
    }

    public final IBinder getBinder$window() {
        return this.binder;
    }

    public int hashCode() {
        return this.binder.hashCode();
    }

    public String toString() {
        return "WindowAreaInfoToken: Descriptor: ".concat(String.valueOf(this.binder.getInterfaceDescriptor()));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final WindowAreaToken fromBinder(IBinder iBinder) {
            x.f(iBinder, "binder");
            return new WindowAreaToken(iBinder);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
