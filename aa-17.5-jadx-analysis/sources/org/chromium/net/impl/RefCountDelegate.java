package org.chromium.net.impl;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class RefCountDelegate {
    public RefCountDelegate(Runnable runnable) {
        new AtomicInteger(1);
    }
}
