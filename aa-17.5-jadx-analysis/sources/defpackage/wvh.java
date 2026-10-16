package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class wvh {
    public int a;
    public boolean b;
    public final /* synthetic */ SideSheetBehavior c;
    private final Runnable d = new wil(this, 16);

    public wvh(SideSheetBehavior sideSheetBehavior) {
        this.c = sideSheetBehavior;
    }

    public final void a(int i) {
        SideSheetBehavior sideSheetBehavior = this.c;
        WeakReference weakReference = sideSheetBehavior.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((View) sideSheetBehavior.j.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
