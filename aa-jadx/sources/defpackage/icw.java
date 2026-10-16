package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class icw implements defpackage.huz {
    @Override // defpackage.huj
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.io.File file, defpackage.huw huwVar) throws java.lang.Throwable {
        try {
            defpackage.ift.c(((defpackage.icv) ((defpackage.hxg) obj).c()).b(), file);
            return true;
        } catch (java.io.IOException e) {
            if (!android.util.Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            android.util.Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.huz
    public final int b() {
        return 1;
    }
}
