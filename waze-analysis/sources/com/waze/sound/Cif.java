package com.waze.sound;

import android.os.Looper;
import j$.util.Objects;

/* compiled from: WazeSource */
/* renamed from: com.waze.sound.if, reason: invalid class name */
/* loaded from: classes7.dex */
final class Cif extends com.waze.google_assistant.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ih f40228a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Cif(ih ihVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(ihVar);
        this.f40228a = ihVar;
    }

    @Override // com.waze.google_assistant.a
    protected final void a() {
        this.f40228a.f();
    }

    @Override // com.waze.google_assistant.a
    protected final void b() {
        this.f40228a.f();
    }
}
