package C4;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1782a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1783b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f1784c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1785d;

    public /* synthetic */ b(int i5, Comparable comparable, Object obj) {
        this.f1782a = i5;
        this.f1785d = obj;
        this.f1784c = comparable;
    }

    @Override // C4.e
    public final void a() {
        switch (this.f1782a) {
            case 0:
                Object obj = this.f1783b;
                if (obj != null) {
                    try {
                        g(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.f1783b;
                if (obj2 != null) {
                    try {
                        g(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // C4.e
    public final void cancel() {
        int i5 = this.f1782a;
    }

    @Override // C4.e
    public final int d() {
        switch (this.f1782a) {
        }
        return 1;
    }

    @Override // C4.e
    public final void e(com.bumptech.glide.d dVar, d dVar2) {
        switch (this.f1782a) {
            case 0:
                try {
                    Object objI = i((AssetManager) this.f1785d, (String) this.f1784c);
                    this.f1783b = objI;
                    dVar2.i(objI);
                    break;
                } catch (IOException e7) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e7);
                    }
                    dVar2.c(e7);
                    return;
                }
            default:
                try {
                    Object objH = h((ContentResolver) this.f1785d, (Uri) this.f1784c);
                    this.f1783b = objH;
                    dVar2.i(objH);
                    break;
                } catch (FileNotFoundException e10) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e10);
                    }
                    dVar2.c(e10);
                }
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(ContentResolver contentResolver, Uri uri);

    public abstract Object i(AssetManager assetManager, String str);

    private final void c() {
    }

    private final void f() {
    }
}
