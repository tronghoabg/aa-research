package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.RemoteException;
import android.view.View;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class ztb implements zyc {
    public final View a;
    public final Executor b;
    private final View c;
    private final View d;

    protected ztb(View view, View view2, View view3, Executor executor) {
        this.a = view;
        this.c = view2;
        this.d = view3;
        this.b = executor;
    }

    public static final void d(vip vipVar, Bitmap bitmap) {
        try {
            vipVar.b(new sqi(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void a(Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            zrn.b("Snapshot could not be taken. Ensure that the snapshot method was invoked on the main thread while the map was visible.");
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        this.c.draw(canvas);
        if (z) {
            this.d.draw(canvas);
        }
    }

    @Override // defpackage.zyc
    public final synchronized void b(Bitmap bitmap, vip vipVar, boolean z) {
        View view = this.a;
        int width = view.getWidth();
        int height = view.getHeight();
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        } else if (bitmap.getWidth() != width || bitmap.getHeight() != height) {
            zrn.a(5, "The Bitmap provided in the snapshot() method does not match the map's dimensions, hence another Bitmap is allocated with the right dimensions. If you think this is due to the fact that the map was resized, you can ignore this message. Otherwise, you should check the dimensions of the Bitmap passed to the method.", new Object[0]);
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        c(bitmap, vipVar, z);
    }

    protected abstract void c(Bitmap bitmap, vip vipVar, boolean z);
}
