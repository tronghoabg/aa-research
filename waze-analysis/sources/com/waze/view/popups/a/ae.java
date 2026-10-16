package com.waze.view.popups.a;

import android.view.ViewGroup;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f45157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f45158b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f45159c;

    /* synthetic */ ae(h hVar, int i2) {
        this.f45159c = i2;
        Objects.requireNonNull(hVar);
        this.f45158b = hVar;
        this.f45157a = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f45159c;
        boolean z = this.f45157a;
        if (i2 != 0) {
            if (z) {
                return;
            }
            ((h) this.f45158b).h();
            return;
        }
        if (!z) {
            ViewGroup viewGroup = this.f45158b;
            af afVar = (af) viewGroup;
            if (afVar.f45164f != null) {
                afVar.f45163e = false;
                afVar.f45164f.removeView(viewGroup);
            }
            if (afVar.f45169k != null) {
                ((ViewGroup) afVar.f45169k.f10212a).removeView(viewGroup);
            }
        }
        ((af) this.f45158b).f45168j = null;
    }

    /* synthetic */ ae(af afVar, int i2) {
        this.f45159c = i2;
        Objects.requireNonNull(afVar);
        this.f45158b = afVar;
        this.f45157a = false;
    }
}
