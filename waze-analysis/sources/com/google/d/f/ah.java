package com.google.d.f;

import java.util.Random;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
