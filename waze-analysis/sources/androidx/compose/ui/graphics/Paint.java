package androidx.compose.ui.graphics;

import android.graphics.Shader;
import h.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Paint {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.Paint$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static android.graphics.Paint $default$asFrameworkPaint(Paint paint) {
            throw new j();
        }
    }

    android.graphics.Paint asFrameworkPaint();

    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo8097getBlendMode0nO6VwU();

    /* renamed from: getColor-0d7_KjU */
    long mo8098getColor0d7_KjU();

    ColorFilter getColorFilter();

    /* renamed from: getFilterQuality-f-v9h1I */
    int mo8099getFilterQualityfv9h1I();

    PathEffect getPathEffect();

    Shader getShader();

    /* renamed from: getStrokeCap-KaPHkGw */
    int mo8100getStrokeCapKaPHkGw();

    /* renamed from: getStrokeJoin-LxFBmk8 */
    int mo8101getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* renamed from: getStyle-TiuSbCo */
    int mo8102getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f2);

    void setAntiAlias(boolean z);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo8103setBlendModes9anfk8(int i2);

    /* renamed from: setColor-8_81llA */
    void mo8104setColor8_81llA(long j2);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setFilterQuality-vDHp3xo */
    void mo8105setFilterQualityvDHp3xo(int i2);

    void setPathEffect(PathEffect pathEffect);

    void setShader(Shader shader);

    /* renamed from: setStrokeCap-BeK7IIE */
    void mo8106setStrokeCapBeK7IIE(int i2);

    /* renamed from: setStrokeJoin-Ww9F2mQ */
    void mo8107setStrokeJoinWw9F2mQ(int i2);

    void setStrokeMiterLimit(float f2);

    void setStrokeWidth(float f2);

    /* renamed from: setStyle-k9PVt8s */
    void mo8108setStylek9PVt8s(int i2);
}
