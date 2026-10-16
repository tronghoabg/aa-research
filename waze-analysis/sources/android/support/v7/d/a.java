package android.support.v7.d;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class a implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    private final Locale f640a;

    public a(Context context) {
        this.f640a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString().toUpperCase(this.f640a);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i2, Rect rect) {
    }
}
