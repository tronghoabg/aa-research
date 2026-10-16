package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hyu implements defpackage.huj {
    @Override // defpackage.huj
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.io.File file, defpackage.huw huwVar) throws java.lang.Throwable {
        try {
            defpackage.ift.c((java.nio.ByteBuffer) obj, file);
            return true;
        } catch (java.io.IOException e) {
            if (!android.util.Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            android.util.Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }
}
