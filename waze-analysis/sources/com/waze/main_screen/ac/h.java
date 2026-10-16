package com.waze.main_screen.ac;

import androidx.compose.ui.geometry.Offset;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private final bm f25679a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f25680b;

    public h() {
        bm bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.f25679a = bmVarC;
        this.f25680b = ai.S(bmVarC);
    }

    @Override // com.waze.main_screen.ac.i
    public final kotlinx.coroutines.b.k a() {
        return this.f25680b;
    }

    public final void b(long j2) {
        this.f25679a.c(Offset.m7969boximpl(j2));
    }
}
