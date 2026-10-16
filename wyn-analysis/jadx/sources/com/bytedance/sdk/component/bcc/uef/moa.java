package com.bytedance.sdk.component.bcc.uef;

import com.bytedance.sdk.component.bcc.uef.yo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class moa<T extends yo> {

    /* renamed from: oa, reason: collision with root package name */
    private BlockingQueue<T> f24966oa = new LinkedBlockingQueue();
    private int uef;

    private moa(int i5) {
        this.uef = i5;
    }

    public static moa uef(int i5) {
        return new moa(i5);
    }

    public T uef() {
        return this.f24966oa.poll();
    }

    public boolean uef(T t10) {
        if (t10 == null) {
            return false;
        }
        t10.uef();
        if (this.f24966oa.size() >= this.uef) {
            return false;
        }
        return this.f24966oa.offer(t10);
    }
}
