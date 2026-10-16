package org.chromium.net.impl;

import org.chromium.net.impl.CronetLogger;

/* loaded from: classes2.dex */
public final class NoOpLogger extends CronetLogger {
    @Override // org.chromium.net.impl.CronetLogger
    public final long a() {
        return 0L;
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final void b(CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo) {
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final void d(long j, CronetLogger.CronetTrafficInfo cronetTrafficInfo) {
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final void c(long j, CronetLogger.CronetEngineBuilderInfo cronetEngineBuilderInfo, CronetLogger.CronetVersion cronetVersion, CronetLogger.CronetSource cronetSource) {
    }
}
