package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ixm {
    final java.util.Map a = new java.util.HashMap();
    final /* synthetic */ defpackage.ixn b;

    public ixm(defpackage.ixn ixnVar) {
        this.b = ixnVar;
    }

    public final byte[] a(java.lang.String str, boolean z) {
        java.lang.String strConcat = str.concat(true != z ? "_normal" : "_flipped");
        java.util.Map map = this.a;
        if (map.containsKey(strConcat)) {
            return (byte[]) map.get(strConcat);
        }
        defpackage.ixn ixnVar = this.b;
        android.graphics.drawable.Drawable drawableA = jfs.a(ixnVar.b, str);
        if (drawableA == null) {
            return null;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(ixnVar.d, ixnVar.e, ixnVar.f);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        drawableA.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        if (z) {
            android.graphics.Rect bounds = drawableA.getBounds();
            canvas.save();
            canvas.scale(-1.0f, 1.0f, bounds.exactCenterX(), bounds.exactCenterY());
            drawableA.draw(canvas);
            canvas.restore();
        } else {
            drawableA.draw(canvas);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmapCreateBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        map.put(strConcat, byteArray);
        return byteArray;
    }
}
