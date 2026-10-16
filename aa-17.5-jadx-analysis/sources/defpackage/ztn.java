package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.libraries.maps.model.PinConfig;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ztn extends ztq {
    public final PinConfig a;
    private Canvas b;
    private Bitmap c;
    private Paint d;
    private float e;
    private gjt f;

    public ztn(PinConfig pinConfig) {
        this.a = pinConfig;
    }

    @Override // defpackage.ztq
    public final Bitmap a(gjt gjtVar) {
        this.f = gjtVar;
        float fMax = Math.max(20, Math.min(640, gjtVar.E().densityDpi)) / 160.0f;
        this.e = fMax;
        this.c = Bitmap.createBitmap(Math.round(fMax * 26.0f), Math.round(this.e * 37.0f), Bitmap.Config.ARGB_8888);
        this.d = new Paint(1);
        this.b = new Canvas(this.c);
        PinConfig pinConfig = this.a;
        this.d.setColor(pinConfig.getBorderColor());
        this.b.drawPath(ysi.D("M13 0C5.8175 0 0 5.77328 0 12.9181C0 20.5733 5.59 23.444 9.55499 30.0784C12.09 34.3207 11.3425 37 13 37C14.7225 37 13.975 34.2569 16.445 30.1422C20.085 23.8586 26 20.6052 26 12.9181C26 5.77328 20.1825 0 13 0Z", this.e), this.d);
        this.d.setColor(pinConfig.getBackgroundColor());
        this.b.drawPath(ysi.D("M13.0167 35C12.7836 35 12.7171 34.9346 12.3176 33.725C11.9848 32.6789 11.4854 31.0769 10.1873 29.1154C8.92233 27.1866 7.59085 25.6173 6.32594 24.1135C3.36339 20.5174 1 17.7057 1 12.6385C1.03329 6.19808 6.39251 1 13.0167 1C19.6408 1 25 6.23078 25 12.6385C25 17.7057 22.6699 20.55 19.6741 24.1462C18.4425 25.65 17.1443 27.2193 15.8793 29.1154C14.6144 31.0442 14.0818 32.6135 13.749 33.6596C13.3495 34.9346 13.2497 35 13.0167 35Z", this.e), this.d);
        PinConfig.Glyph glyph = pinConfig.getGlyph();
        if (glyph.getBitmapDescriptor() != null) {
            aacq aacqVar = new aacq(this.f);
            ztq ztqVar = (ztq) sqi.a(glyph.getBitmapDescriptor().getRemoteObject());
            aacqVar.i(ztqVar);
            this.b.drawBitmap(aacqVar.h(ztqVar), (Rect) null, new RectF((this.e * 13.0f) - (r11.getWidth() / 2.0f), (this.e * 13.0f) - (r11.getHeight() / 2.0f), (this.e * 13.0f) + (r11.getWidth() / 2.0f), (this.e * 13.0f) + (r11.getHeight() / 2.0f)), (Paint) null);
        } else if (glyph.getText() != null) {
            String text = glyph.getText();
            this.d.setColor(glyph.getTextColor());
            this.d.setTextSize(this.e * 12.0f);
            this.b.drawText(text, Math.round((this.e * 13.0f) - (this.d.measureText(text) / 2.0f)), Math.round((this.e * 13.0f) - ((this.d.descent() + this.d.ascent()) / 2.0f)), this.d);
        } else {
            this.d.setColor(pinConfig.getGlyph().getGlyphColor());
            Canvas canvas = this.b;
            float f = this.e;
            float f2 = 13.0f * f;
            canvas.drawCircle(f2, f2, f * 5.0f, this.d);
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztn)) {
            return false;
        }
        PinConfig pinConfig = ((ztn) obj).a;
        PinConfig pinConfig2 = this.a;
        return pinConfig2.getBackgroundColor() == pinConfig.getBackgroundColor() && pinConfig2.getBorderColor() == pinConfig.getBorderColor() && pinConfig2.getGlyph().equals(pinConfig.getGlyph());
    }

    public final int hashCode() {
        PinConfig pinConfig = this.a;
        PinConfig.Glyph glyph = pinConfig.getGlyph();
        return Arrays.hashCode(new Object[]{Integer.valueOf(pinConfig.getBackgroundColor()), Integer.valueOf(pinConfig.getBorderColor()), glyph.getBitmapDescriptor(), glyph.getText(), Integer.valueOf(glyph.getGlyphColor())});
    }

    public final String toString() {
        PinConfig pinConfig = this.a;
        PinConfig.Glyph glyph = pinConfig.getGlyph();
        zsa zsaVarA = zsa.a(this);
        zsaVarA.e("backgroundColor", pinConfig.getBackgroundColor());
        zsaVarA.e("borderColor", pinConfig.getBorderColor());
        zsaVarA.b("glyphBitmapDescriptor", glyph.getBitmapDescriptor());
        zsaVarA.b("glyphText", glyph.getText());
        zsaVarA.e("glyphColor", glyph.getGlyphColor());
        return zsaVarA.toString();
    }
}
