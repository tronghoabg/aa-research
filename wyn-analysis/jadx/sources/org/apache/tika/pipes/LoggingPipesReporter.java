package org.apache.tika.pipes;

import vg.b;
import vg.d;

/* loaded from: classes5.dex */
public class LoggingPipesReporter extends PipesReporter {
    b LOGGER = d.b(LoggingPipesReporter.class);

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        this.LOGGER.error("pipes error", th);
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j8) {
        this.LOGGER.g("{} {} {}", fetchEmitTuple, pipesResult, Long.valueOf(j8));
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        this.LOGGER.o("error {}", str);
    }
}
