package com.bytedance.sdk.component.ivm.uef.uef.oa;

import com.bytedance.sdk.component.ivm.uef.moa.uef;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public abstract class moa<T extends com.bytedance.sdk.component.ivm.uef.moa.uef> {
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private Queue<T> f25010oa = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef uef;
    private Queue<String> yo;

    public moa(com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar, Queue<String> queue, String str) {
        this.uef = uefVar;
        this.yo = queue;
        this.moa = str;
    }

    public synchronized boolean oa(int i5, int i10) {
        int size = this.f25010oa.size();
        int iUef = this.uef.uef();
        return (i5 == 2 || i5 == 1) ? com.bytedance.sdk.component.ivm.uef.yo.uef.yo() ? size > 0 : size >= iUef : size >= iUef;
    }

    public void uef(T t10) {
        Queue<T> queue = this.f25010oa;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public synchronized List<com.bytedance.sdk.component.ivm.uef.moa.uef> uef(int i5, int i10) {
        if (!oa(i5, i10)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.uef.uef());
        do {
            T tPoll = this.f25010oa.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.uef.oa());
        return arrayList;
    }

    public synchronized void uef(int i5, List<T> list) {
        if (i5 != -1 && i5 != 200 && i5 != 509) {
            this.f25010oa.addAll(list);
        } else {
            this.f25010oa.size();
        }
    }
}
