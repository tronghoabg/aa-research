package com.bumptech.glide.e.a;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f2828a;

    h(i iVar) {
        this.f2828a = new WeakReference(iVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        i iVar = (i) this.f2828a.get();
        if (iVar == null) {
            return true;
        }
        iVar.a();
        return true;
    }
}
