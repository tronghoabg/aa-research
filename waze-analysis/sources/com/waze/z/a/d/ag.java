package com.waze.z.a.d;

import android.view.KeyEvent;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ag implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f45918a;

    ag(h.g.a.l lVar) {
        this.f45918a = lVar;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        KeyEvent keyEventM9424unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m9424unboximpl();
        h.g.b.x.f(keyEventM9424unboximpl, "it");
        if (keyEventM9424unboximpl.getKeyCode() == 66) {
            this.f45918a.invoke(m.f45967a);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
