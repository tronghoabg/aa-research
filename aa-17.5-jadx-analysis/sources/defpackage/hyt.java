package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hyt implements huv {
    private Object a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public hyt(Uri uri, kzt kztVar, int i) {
        this.b = i;
        this.d = uri;
        this.c = kztVar;
    }

    public static hyt f(Context context, Uri uri, hvn hvnVar) {
        return new hyt(uri, new kzt(hrt.b(context).b.a().b(), hvnVar, hrt.b(context).d, context.getContentResolver()), 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hyu, java.lang.Object] */
    @Override // defpackage.huv
    public final Class a() {
        return this.b != 0 ? InputStream.class : this.d.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hyu, java.lang.Object] */
    @Override // defpackage.huv
    public final void c() throws IOException {
        int i = this.b;
        Object obj = this.a;
        try {
            if (i != 0) {
                if (obj != null) {
                    ((InputStream) obj).close();
                }
            } else if (obj != null) {
                this.d.c(obj);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00e5: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:230), block:B:66:0x00e5 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: FileNotFoundException -> 0x00ec, PHI: r4
  0x002d: PHI (r4v12 android.database.Cursor) = (r4v3 android.database.Cursor), (r4v16 android.database.Cursor) binds: [B:24:0x0047, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #11 {FileNotFoundException -> 0x00ec, blocks: (B:4:0x0007, B:11:0x0025, B:26:0x004a, B:41:0x008e, B:62:0x00d8, B:63:0x00de, B:59:0x00d4, B:29:0x0052, B:31:0x005d, B:33:0x0067, B:34:0x006b, B:37:0x0077, B:38:0x008a, B:15:0x002d, B:68:0x00e8, B:69:0x00eb, B:42:0x0092, B:51:0x00ba, B:53:0x00c0), top: B:101:0x0007, inners: #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052 A[Catch: FileNotFoundException -> 0x00ec, TryCatch #11 {FileNotFoundException -> 0x00ec, blocks: (B:4:0x0007, B:11:0x0025, B:26:0x004a, B:41:0x008e, B:62:0x00d8, B:63:0x00de, B:59:0x00d4, B:29:0x0052, B:31:0x005d, B:33:0x0067, B:34:0x006b, B:37:0x0077, B:38:0x008a, B:15:0x002d, B:68:0x00e8, B:69:0x00eb, B:42:0x0092, B:51:0x00ba, B:53:0x00c0), top: B:101:0x0007, inners: #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[Catch: FileNotFoundException -> 0x00ec, TRY_LEAVE, TryCatch #11 {FileNotFoundException -> 0x00ec, blocks: (B:4:0x0007, B:11:0x0025, B:26:0x004a, B:41:0x008e, B:62:0x00d8, B:63:0x00de, B:59:0x00d4, B:29:0x0052, B:31:0x005d, B:33:0x0067, B:34:0x006b, B:37:0x0077, B:38:0x008a, B:15:0x002d, B:68:0x00e8, B:69:0x00eb, B:42:0x0092, B:51:0x00ba, B:53:0x00c0), top: B:101:0x0007, inners: #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8 A[Catch: FileNotFoundException -> 0x00ec, TryCatch #11 {FileNotFoundException -> 0x00ec, blocks: (B:4:0x0007, B:11:0x0025, B:26:0x004a, B:41:0x008e, B:62:0x00d8, B:63:0x00de, B:59:0x00d4, B:29:0x0052, B:31:0x005d, B:33:0x0067, B:34:0x006b, B:37:0x0077, B:38:0x008a, B:15:0x002d, B:68:0x00e8, B:69:0x00eb, B:42:0x0092, B:51:0x00ba, B:53:0x00c0), top: B:101:0x0007, inners: #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8 A[Catch: FileNotFoundException -> 0x00ec, TryCatch #11 {FileNotFoundException -> 0x00ec, blocks: (B:4:0x0007, B:11:0x0025, B:26:0x004a, B:41:0x008e, B:62:0x00d8, B:63:0x00de, B:59:0x00d4, B:29:0x0052, B:31:0x005d, B:33:0x0067, B:34:0x006b, B:37:0x0077, B:38:0x008a, B:15:0x002d, B:68:0x00e8, B:69:0x00eb, B:42:0x0092, B:51:0x00ba, B:53:0x00c0), top: B:101:0x0007, inners: #7, #9 }] */
    /* JADX WARN: Type inference failed for: r10v9, types: [hyu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [huu] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v15, types: [hvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.huv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.hsh r10, defpackage.huu r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyt.d(hsh, huu):void");
    }

    @Override // defpackage.huv
    public final int e() {
        return 1;
    }

    public hyt(File file, hyu hyuVar, int i) {
        this.b = i;
        this.c = file;
        this.d = hyuVar;
    }

    @Override // defpackage.huv
    public final void b() {
    }
}
