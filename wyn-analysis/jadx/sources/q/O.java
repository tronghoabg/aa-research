package q;

import a1.AbstractC1312b;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O extends AbstractC1312b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f43682h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f43683i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f43684j;
    public final /* synthetic */ V k;

    public O(V v2, int i5, int i10, WeakReference weakReference) {
        this.k = v2;
        this.f43682h = i5;
        this.f43683i = i10;
        this.f43684j = weakReference;
    }

    @Override // a1.AbstractC1312b
    public final void k(Typeface typeface) {
        int i5;
        if (Build.VERSION.SDK_INT >= 28 && (i5 = this.f43682h) != -1) {
            typeface = U.a(typeface, i5, (this.f43683i & 2) != 0);
        }
        V v2 = this.k;
        if (v2.f43718m) {
            v2.f43717l = typeface;
            TextView textView = (TextView) this.f43684j.get();
            if (textView != null) {
                WeakHashMap weakHashMap = k1.S.f38779a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new M3.i(textView, typeface, v2.f43716j, 5));
                } else {
                    textView.setTypeface(typeface, v2.f43716j);
                }
            }
        }
    }

    @Override // a1.AbstractC1312b
    public final void j(int i5) {
    }
}
