package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class hvh implements huv {
    protected final boolean a;
    private final Uri b;
    private final ContentResolver c;
    private Object d;

    public hvh(ContentResolver contentResolver, Uri uri, boolean z) {
        this.c = contentResolver;
        this.b = uri;
        this.a = z;
    }

    @Override // defpackage.huv
    public final void c() {
        Object obj = this.d;
        if (obj != null) {
            try {
                g(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.huv
    public final void d(hsh hshVar, huu huuVar) {
        try {
            Object objF = f(this.b, this.c);
            this.d = objF;
            huuVar.f(objF);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            huuVar.g(e);
        }
    }

    @Override // defpackage.huv
    public final int e() {
        return 1;
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    protected abstract void g(Object obj) throws IOException;

    protected final AssetFileDescriptor h(Uri uri) throws FileNotFoundException {
        return (this.a && hdv.g(uri) && hdv.f()) ? hdv.e(uri, this.c) : this.c.openAssetFileDescriptor(uri, "r");
    }

    @Override // defpackage.huv
    public final void b() {
    }
}
