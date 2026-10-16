package com.pgl.ssdk;

import com.pgl.ssdk.a1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public class a2<T extends a1> {

    /* renamed from: a, reason: collision with root package name */
    private int f32473a;

    /* renamed from: b, reason: collision with root package name */
    private BlockingQueue<T> f32474b = new LinkedBlockingQueue();

    private a2(int i5) {
        this.f32473a = i5;
    }

    public T a() {
        return this.f32474b.poll();
    }

    public static a2 a(int i5) {
        return new a2(i5);
    }
}
