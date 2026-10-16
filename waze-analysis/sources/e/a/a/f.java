package e.a.a;

import android.content.Context;
import android.util.Log;
import e.a.al;
import e.a.bx;
import e.a.bz;
import e.a.ca;
import e.a.d.dh;
import e.a.dt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends al {

    /* renamed from: a, reason: collision with root package name */
    private static final ca f46230a;

    /* renamed from: b, reason: collision with root package name */
    private final bz f46231b;

    /* renamed from: c, reason: collision with root package name */
    private Context f46232c;

    static {
        ca caVar = null;
        try {
            try {
                try {
                    ca caVar2 = (ca) Class.forName("e.a.f.q").asSubclass(ca.class).getConstructor(null).newInstance(null);
                    dt.i(caVar2);
                    caVar = caVar2;
                } catch (Exception e2) {
                    Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e2);
                }
            } catch (ClassCastException e3) {
                Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e3);
            }
        } catch (ClassNotFoundException e4) {
            Log.w("AndroidChannelBuilder", "Failed to find OkHttpChannelProvider", e4);
        }
        f46230a = caVar;
    }

    private f(String str) {
        ca caVar = f46230a;
        if (caVar == null) {
            throw new UnsupportedOperationException("Unable to load OkHttpChannelProvider");
        }
        this.f46231b = dt.h(caVar, str);
    }

    public static f r(String str, int i2) {
        return new f(dh.d(str, i2));
    }

    @Override // e.a.ak, e.a.bz
    public final bx a() {
        return new e(this.f46231b.a(), this.f46232c);
    }

    @Override // e.a.al, e.a.ak
    protected final bz b() {
        return this.f46231b;
    }

    public final void s(Context context) {
        this.f46232c = context;
    }
}
