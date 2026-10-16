package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab extends ac {

    /* renamed from: d, reason: collision with root package name */
    private final Callable f4666d;

    @Override // com.google.android.gms.common.ac
    final String a() {
        try {
            return (String) this.f4666d.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
