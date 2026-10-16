package com.waze.destination_cell.b;

import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements com.waze.resources.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23494a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23495b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f23495b = i2;
        this.f23494a = obj;
    }

    /* JADX WARN: Failed to inline method: a.a.A(kotlinx.coroutines.CompletableDeferred, android.graphics.drawable.Drawable):void */
    /* JADX WARN: Not passed register '(r3v0 android.graphics.drawable.Drawable)' in method call: a.a.A(kotlinx.coroutines.CompletableDeferred, android.graphics.drawable.Drawable):void */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // com.waze.resources.b
    public final void a(Drawable drawable) {
        int i2 = this.f23495b;
        if (i2 == 0) {
            c.e((c) this.f23494a, drawable);
            return;
        }
        if (i2 == 1) {
            a.a.A(this.f23494a, drawable);
            return;
        }
        if (i2 == 2) {
            ((com.waze.destination_cell.view.c) this.f23494a).i(drawable);
            return;
        }
        ?? r2 = this.f23494a;
        if (i2 != 3) {
            r2.a(drawable != null ? DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null) : null);
        } else {
            a.a.A(r2, drawable);
        }
    }
}
