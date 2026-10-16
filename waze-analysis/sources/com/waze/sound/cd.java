package com.waze.sound;

import android.database.ContentObserver;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cd extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f39647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cd(cf cfVar) {
        super(null);
        this.f39647a = cfVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f39647a.j();
    }
}
