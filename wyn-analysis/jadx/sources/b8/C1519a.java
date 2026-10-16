package b8;

import android.graphics.Paint;
import android.graphics.Path;
import b1.AbstractC1492a;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: b8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1519a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f19400i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f19401j = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    public static final int[] k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f19402l = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f19403a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f19404b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f19405c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19406d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19407e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19408f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f19409g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19410h;

    public C1519a() {
        Paint paint = new Paint();
        this.f19410h = paint;
        Paint paint2 = new Paint();
        this.f19403a = paint2;
        this.f19406d = AbstractC1492a.d(-16777216, 68);
        this.f19407e = AbstractC1492a.d(-16777216, 20);
        this.f19408f = AbstractC1492a.d(-16777216, 0);
        paint2.setColor(this.f19406d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f19404b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f19405c = new Paint(paint3);
    }
}
