package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class zsn extends zu {
    @Override // defpackage.zu
    protected final /* bridge */ /* synthetic */ int a(Object obj, Object obj2) {
        Object obj3 = ((scz) obj2).d;
        if (obj3 instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) obj3;
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (obj3 instanceof String) {
            return ((String) obj3).getBytes().length;
        }
        if (obj3 instanceof byte[]) {
            return ((byte[]) obj3).length;
        }
        throw new IllegalStateException("LruCache does not have a sizeOf implementation for: ".concat(String.valueOf(String.valueOf(obj3))));
    }
}
