package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.util.PathProvider;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a {
    public final synchronized FilePreferences a(j ioExecutor, PathProvider pathProvider, String filename) {
        Object filePreferences;
        Object objPutIfAbsent;
        try {
            AbstractC3340k.e(ioExecutor, "ioExecutor");
            AbstractC3340k.e(pathProvider, "pathProvider");
            AbstractC3340k.e(filename, "filename");
            ConcurrentHashMap concurrentHashMap = FilePreferences.f33486e;
            filePreferences = concurrentHashMap.get(filename);
            if (filePreferences == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (filePreferences = new FilePreferences(ioExecutor, pathProvider, filename, 0)))) != null) {
                filePreferences = objPutIfAbsent;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (FilePreferences) filePreferences;
    }
}
