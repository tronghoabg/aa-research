package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i2, int i3, l<? super Canvas, ab> lVar) {
        x.f(picture, "<this>");
        x.f(lVar, "block");
        Canvas canvasBeginRecording = picture.beginRecording(i2, i3);
        x.e(canvasBeginRecording, "beginRecording(...)");
        try {
            lVar.invoke(canvasBeginRecording);
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
