package com.waze.ui;

import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableState f41709a;

    aa(MutableState mutableState) {
        this.f41709a = mutableState;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (((Boolean) obj).booleanValue()) {
            this.f41709a.setValue(true);
        }
        return h.ab.f48028a;
    }
}
