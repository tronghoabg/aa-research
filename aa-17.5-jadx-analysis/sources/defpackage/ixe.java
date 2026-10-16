package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ixe {
    final Map a = new HashMap();
    final /* synthetic */ ixf b;

    public ixe(ixf ixfVar) {
        this.b = ixfVar;
    }

    public final byte[] a(String str, boolean z) {
        String strConcat = str.concat(true != z ? "_normal" : "_flipped");
        Map map = this.a;
        if (map.containsKey(strConcat)) {
            return (byte[]) map.get(strConcat);
        }
        ixf ixfVar = this.b;
        Drawable drawableA = jfk.a(ixfVar.b, str);
        if (drawableA == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ixfVar.d, ixfVar.e, ixfVar.f);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableA.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        if (z) {
            Rect bounds = drawableA.getBounds();
            canvas.save();
            canvas.scale(-1.0f, 1.0f, bounds.exactCenterX(), bounds.exactCenterY());
            drawableA.draw(canvas);
            canvas.restore();
        } else {
            drawableA.draw(canvas);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        map.put(strConcat, byteArray);
        return byteArray;
    }
}
