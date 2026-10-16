package androidx.camera.camera2.pipe.core;

import android.content.Context;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Permissions_Factory implements c<Permissions> {
    private final e<Context> cameraPipeContextProvider;

    private Permissions_Factory(e<Context> eVar) {
        this.cameraPipeContextProvider = eVar;
    }

    public static Permissions_Factory create(e<Context> eVar) {
        return new Permissions_Factory(eVar);
    }

    public static Permissions newInstance(Context context) {
        return new Permissions(context);
    }

    @Override // g.a.a, f.a.a
    public Permissions get() {
        return newInstance(this.cameraPipeContextProvider.get());
    }
}
