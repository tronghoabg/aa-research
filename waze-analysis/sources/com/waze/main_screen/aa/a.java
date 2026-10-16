package com.waze.main_screen.aa;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.focus.d;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f25610a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Color f25611b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f25612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(View view, Color color, boolean z, e eVar) {
        super(2, eVar);
        this.f25610a = view;
        this.f25611b = color;
        this.f25612c = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new a(this.f25610a, this.f25611b, this.f25612c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Window window;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        View view = this.f25610a;
        Context context = view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            Color color = this.f25611b;
            boolean z = this.f25612c;
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, view);
            boolean z2 = false;
            if ((color == null || d.f(ColorKt.m8282toArgb8_81llA(color.m8238unboximpl()))) && !z) {
                z2 = true;
            }
            insetsController.setAppearanceLightStatusBars(z2);
            insetsController.setAppearanceLightNavigationBars(!z);
        }
        return ab.f48028a;
    }
}
