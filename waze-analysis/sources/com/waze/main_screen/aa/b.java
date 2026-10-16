package com.waze.main_screen.aa;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f25613a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f25614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(View view, boolean z, e eVar) {
        super(2, eVar);
        this.f25613a = view;
        this.f25614b = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new b(this.f25613a, this.f25614b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Window window;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        View view = this.f25613a;
        Context context = view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            WindowCompat.getInsetsController(window, view).setAppearanceLightNavigationBars(!this.f25614b);
        }
        return ab.f48028a;
    }
}
