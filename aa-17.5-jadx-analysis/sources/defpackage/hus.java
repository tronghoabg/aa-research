package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class hus implements huv {
    private final String a;
    private final AssetManager b;
    private Object c;

    public hus(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.huv
    public final void c() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            g(obj);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.huv
    public final void d(hsh hshVar, huu huuVar) {
        try {
            Object objF = f(this.b, this.a);
            this.c = objF;
            huuVar.f(objF);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            huuVar.g(e);
        }
    }

    @Override // defpackage.huv
    public final int e() {
        return 1;
    }

    protected abstract Object f(AssetManager assetManager, String str) throws IOException;

    protected abstract void g(Object obj) throws IOException;

    @Override // defpackage.huv
    public final void b() {
    }
}
