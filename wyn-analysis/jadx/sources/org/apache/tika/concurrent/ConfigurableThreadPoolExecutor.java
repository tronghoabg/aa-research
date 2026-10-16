package org.apache.tika.concurrent;

import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public interface ConfigurableThreadPoolExecutor extends ExecutorService {
    void setCorePoolSize(int i5);

    void setMaximumPoolSize(int i5);
}
