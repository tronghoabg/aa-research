package com.waze.log;

import android.util.Log;
import h.g.b.x;
import h.l;
import h.m;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LogNativeManager extends c implements d {
    private static volatile boolean nativeReady;
    public static final LogNativeManager INSTANCE = new LogNativeManager();
    private static final ConcurrentLinkedDeque<b> backlogEntries = new ConcurrentLinkedDeque<>();
    private static final AtomicInteger droppedMessagesCounter = new AtomicInteger(0);
    public static final int $stable = 8;

    private LogNativeManager() {
    }

    private final void flushBacklog() {
        Object objA;
        int i2 = 0;
        while (true) {
            try {
                LogNativeManager logNativeManager = this;
                objA = (b) backlogEntries.removeFirst();
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            if (true == (objA instanceof l)) {
                objA = null;
            }
            b bVar = (b) objA;
            if (bVar == null) {
                break;
            }
            logToWazeNTV(bVar.a(), bVar.e(), bVar.c(), bVar.b(), bVar.d());
            i2++;
        }
        if (i2 > 0) {
            warn("backlog logger printed " + i2 + " messages");
        }
    }

    private final native void initNativeLayerNTV();

    private final native void logToWazeNTV(int i2, String str, String str2, int i3, String str3);

    public static final void onNativeReady() {
        LogNativeManager logNativeManager = INSTANCE;
        logNativeManager.initNativeLayerNTV();
        logNativeManager.flushBacklog();
        nativeReady = true;
        logNativeManager.flushBacklog();
        int i2 = droppedMessagesCounter.get();
        if (i2 > 0) {
            logNativeManager.warn("backlog logger dropped " + i2 + " messages");
        }
    }

    private final void warn(String str) {
        logToWazeNTV(3, str, "", 0, "");
    }

    @Override // com.waze.log.d
    public void log(int i2, String str, String str2, int i3, String str3) {
        x.f(str, "message");
        x.f(str2, "filename");
        x.f(str3, "function");
        if (nativeReady) {
            logToWazeNTV(i2, str, str2, i3, str3);
            return;
        }
        ConcurrentLinkedDeque<b> concurrentLinkedDeque = backlogEntries;
        if (concurrentLinkedDeque.size() < 128) {
            concurrentLinkedDeque.add(new b(i2, str, str2, i3, str3));
        } else {
            droppedMessagesCounter.incrementAndGet();
        }
    }

    @Override // com.waze.log.c
    public void logStackTrace() {
        try {
            LogNativeManager logNativeManager = this;
            throw new RuntimeException("StackTraceLogger");
        } catch (Throwable th) {
            String stackTraceString = Log.getStackTraceString(m.c(e.b.c.a(th)));
            x.e(stackTraceString, "getStackTraceString(...)");
            warn(stackTraceString);
        }
    }
}
