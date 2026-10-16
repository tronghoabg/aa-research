package org.apache.tika.renderer;

/* loaded from: classes5.dex */
public class RenderingTracker {

    /* renamed from: id, reason: collision with root package name */
    private int f42948id = 0;

    public synchronized int getNextId() {
        int i5;
        i5 = this.f42948id + 1;
        this.f42948id = i5;
        return i5;
    }
}
