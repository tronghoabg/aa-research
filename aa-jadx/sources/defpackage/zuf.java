package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zuf implements defpackage.zzg {
    public final android.view.View a;
    public final java.util.concurrent.Executor b;
    private final android.view.View c;
    private final android.view.View d;

    protected zuf(android.view.View view, android.view.View view2, android.view.View view3, java.util.concurrent.Executor executor) {
        this.a = view;
        this.c = view2;
        this.d = view3;
        this.b = executor;
    }

    public static final void d(defpackage.vjm vjmVar, android.graphics.Bitmap bitmap) {
        try {
            vjmVar.b(new defpackage.srg(bitmap));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void a(android.graphics.Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            defpackage.zsr.b("Snapshot could not be taken. Ensure that the snapshot method was invoked on the main thread while the map was visible.");
            return;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
        this.c.draw(canvas);
        if (z) {
            this.d.draw(canvas);
        }
    }

    @Override // defpackage.zzg
    public final synchronized void b(android.graphics.Bitmap bitmap, defpackage.vjm vjmVar, boolean z) {
        android.view.View view = this.a;
        int width = view.getWidth();
        int height = view.getHeight();
        if (bitmap == null) {
            bitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        } else if (bitmap.getWidth() != width || bitmap.getHeight() != height) {
            defpackage.zsr.a(5, "The Bitmap provided in the snapshot() method does not match the map's dimensions, hence another Bitmap is allocated with the right dimensions. If you think this is due to the fact that the map was resized, you can ignore this message. Otherwise, you should check the dimensions of the Bitmap passed to the method.", new java.lang.Object[0]);
            bitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        }
        c(bitmap, vjmVar, z);
    }

    protected abstract void c(android.graphics.Bitmap bitmap, defpackage.vjm vjmVar, boolean z);
}
