package D4;

import C4.e;
import I4.z;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2326a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f2327b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2328c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2329d;

    public /* synthetic */ b(int i5, Comparable comparable, Object obj) {
        this.f2326a = i5;
        this.f2327b = comparable;
        this.f2328c = obj;
    }

    @Override // C4.e
    public final void a() throws IOException {
        switch (this.f2326a) {
            case 0:
                InputStream inputStream = (InputStream) this.f2329d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case 1:
                try {
                    ((ByteArrayInputStream) this.f2329d).close();
                    break;
                } catch (IOException unused2) {
                    return;
                }
            default:
                Object obj = this.f2329d;
                if (obj != null) {
                    try {
                        switch (((z) this.f2328c).f5380a) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        break;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // C4.e
    public final Class b() {
        switch (this.f2326a) {
            case 0:
                return InputStream.class;
            case 1:
                ((z) this.f2328c).getClass();
                return InputStream.class;
            default:
                return ((z) this.f2328c).b();
        }
    }

    @Override // C4.e
    public final void cancel() {
        int i5 = this.f2326a;
    }

    @Override // C4.e
    public final int d() {
        switch (this.f2326a) {
        }
        return 1;
    }

    @Override // C4.e
    public final void e(com.bumptech.glide.d dVar, C4.d dVar2) throws Throwable {
        Object objOpen;
        switch (this.f2326a) {
            case 0:
                try {
                    InputStream inputStreamH = h();
                    this.f2329d = inputStreamH;
                    dVar2.i(inputStreamH);
                    break;
                } catch (FileNotFoundException e7) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e7);
                    }
                    dVar2.c(e7);
                    return;
                }
            case 1:
                try {
                    ByteArrayInputStream byteArrayInputStreamA = z.a((String) this.f2327b);
                    this.f2329d = byteArrayInputStreamA;
                    dVar2.i(byteArrayInputStreamA);
                    break;
                } catch (IllegalArgumentException e10) {
                    dVar2.c(e10);
                }
            default:
                try {
                    z zVar = (z) this.f2328c;
                    File file = (File) this.f2327b;
                    switch (zVar.f5380a) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f2329d = objOpen;
                    dVar2.i(objOpen);
                    break;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e11);
                    }
                    dVar2.c(e11);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0026: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:39), block:B:10:0x0026 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r6
  0x002d: PHI (r6v6 android.database.Cursor) = (r6v2 android.database.Cursor), (r6v8 android.database.Cursor) binds: [B:23:0x004c, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream h() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.b.h():java.io.InputStream");
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }
}
