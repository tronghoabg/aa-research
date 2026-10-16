package android.support.v7.widget;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class be extends ResourcesCompat.FontCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1122a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1123b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ WeakReference f1124c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bj f1125d;

    be(bj bjVar, int i2, int i3, WeakReference weakReference) {
        this.f1125d = bjVar;
        this.f1122a = i2;
        this.f1123b = i3;
        this.f1124c = weakReference;
    }

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    /* renamed from: onFontRetrieved */
    public final void m11722x46c88379(Typeface typeface) {
        int i2 = this.f1122a;
        if (i2 != -1) {
            typeface = Typeface.create(typeface, i2, (this.f1123b & 2) != 0);
        }
        this.f1125d.f(this.f1124c, typeface);
    }

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    /* renamed from: onFontRetrievalFailed */
    public final void m11721xb24343b7(int i2) {
    }
}
