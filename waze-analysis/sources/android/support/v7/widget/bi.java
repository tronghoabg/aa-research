package android.support.v7.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import androidx.core.util.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bi {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1135a;

    /* renamed from: b, reason: collision with root package name */
    private final Consumer f1136b;

    /* renamed from: c, reason: collision with root package name */
    private Typeface f1137c;

    /* renamed from: d, reason: collision with root package name */
    private Typeface f1138d;

    /* renamed from: e, reason: collision with root package name */
    private String f1139e;

    bi(TextView textView, Consumer consumer) {
        this.f1135a = textView;
        this.f1136b = consumer;
    }

    private final void e(Typeface typeface) {
        this.f1138d = typeface;
        this.f1136b.accept(typeface);
    }

    public final Typeface a() {
        return this.f1137c;
    }

    public final String b() {
        return this.f1139e;
    }

    public final void c(Typeface typeface) {
        this.f1137c = typeface;
        e(typeface);
    }

    public final boolean d(String str) {
        int i2;
        TextView textView = this.f1135a;
        Typeface typeface = this.f1137c;
        TextPaint paint = textView.getPaint();
        if (this.f1138d != paint.getTypeface()) {
            Log.w("FontVarSettings", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = paint.getTypeface();
        }
        if (Build.VERSION.SDK_INT < 31 || (i2 = textView.getContext().getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            i2 = 0;
        }
        Typeface typefaceA = bh.a(typeface, str, i2);
        if (typefaceA == null) {
            return false;
        }
        e(typefaceA);
        this.f1139e = str;
        return true;
    }
}
