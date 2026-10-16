package com.waze.app_nav.hub.b;

import android.app.Dialog;
import androidx.navigation.compose.DialogNavigator;
import com.waze.iw;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f15270a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f15271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Dialog dialog, h.g.a.a aVar) {
        super(null);
        x.f(dialog, DialogNavigator.NAME);
        x.f(aVar, "onPostDismiss");
        this.f15270a = dialog;
        this.f15271b = aVar;
    }

    static final void c(h.g.a.a aVar, h hVar) {
        aVar.invoke();
        hVar.f15271b.invoke();
    }

    public final void a(h.g.a.a aVar) {
        x.f(aVar, "onDismiss");
        this.f15270a.setOnDismissListener(new g(aVar, this, 0));
    }

    @Override // com.waze.app_nav.hub.b.i
    public final void b(boolean z) {
        if (z) {
            this.f15270a.setOnDismissListener(new com.waze.sharedui.d.a.a(1));
        }
        this.f15270a.dismiss();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Dialog dialog) {
        this(dialog, (byte[]) null);
        x.f(dialog, DialogNavigator.NAME);
    }

    public /* synthetic */ h(Dialog dialog, byte[] bArr) {
        this(dialog, new iw(3));
    }
}
