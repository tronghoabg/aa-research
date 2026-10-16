package com.waze.sound;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cv implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f39717a;

    cv(cw cwVar, int i2, byte[] bArr) {
        this.f39717a = i2;
        Objects.requireNonNull(cwVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f39717a != 0) {
            bg.c().q(false);
        }
    }

    cv(cw cwVar, int i2) {
        this.f39717a = i2;
        Objects.requireNonNull(cwVar);
    }
}
