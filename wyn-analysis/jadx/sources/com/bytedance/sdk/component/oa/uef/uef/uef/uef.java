package com.bytedance.sdk.component.oa.uef.uef.uef;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class uef extends com.bytedance.sdk.component.oa.uef.moa {
    public static volatile zjm uef;
    private ExecutorService moa;

    /* renamed from: oa, reason: collision with root package name */
    private List<com.bytedance.sdk.component.oa.uef.oa> f25070oa = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.oa.uef.oa> yo = new CopyOnWriteArrayList();

    public uef(ExecutorService executorService) {
        this.moa = executorService;
    }

    public boolean lw() {
        return (uef == null || uef.uef() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public List<com.bytedance.sdk.component.oa.uef.oa> moa() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public ExecutorService oa() {
        ExecutorService executorServiceUef = uef != null ? uef.uef() : null;
        return executorServiceUef != null ? executorServiceUef : this.moa;
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public int uef() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public List<com.bytedance.sdk.component.oa.uef.oa> yo() {
        return this.f25070oa;
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public void uef(int i5) {
    }

    public static void uef(zjm zjmVar) {
        uef = zjmVar;
    }
}
