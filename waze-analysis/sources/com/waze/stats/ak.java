package com.waze.stats;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ak extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f40519a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(kotlinx.coroutines.ac acVar, e eVar, int i2) {
        super(acVar);
        this.f40520b = i2;
        this.f40519a = eVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        int i2 = this.f40520b;
        if (i2 == 0) {
            com.waze.settings.tree.c.f.e(((an) this.f40519a).f40532e, "Reporter coroutineExceptionHandler", th);
            return;
        }
        Object obj = this.f40519a;
        if (i2 != 1) {
            com.waze.settings.tree.c.f.e(((an) obj).f40532e, "Reporter coroutineExceptionHandler", th);
        } else {
            com.waze.settings.tree.c.f.e(((e) obj).f40587a, "Reporter coroutineExceptionHandler", th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(kotlinx.coroutines.ac acVar, an anVar, int i2) {
        super(acVar);
        this.f40520b = i2;
        this.f40519a = anVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(kotlinx.coroutines.ac acVar, an anVar, int i2, byte[] bArr) {
        super(acVar);
        this.f40520b = i2;
        this.f40519a = anVar;
    }
}
