package com.bytedance.sdk.component.adexpress.oa;

import com.bytedance.sdk.component.adexpress.oa.zjm;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class wrv implements zjm.uef {
    private AtomicBoolean moa = new AtomicBoolean(false);

    /* renamed from: oa, reason: collision with root package name */
    private List<zjm> f24941oa;
    wk uef;
    private cz yo;

    public wrv(List<zjm> list, cz czVar) {
        this.f24941oa = list;
        this.yo = czVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm.uef
    public boolean oa(zjm zjmVar) {
        int iIndexOf = this.f24941oa.indexOf(zjmVar);
        return iIndexOf < this.f24941oa.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm.uef
    public void uef() {
        this.yo.moa();
        Iterator<zjm> it = this.f24941oa.iterator();
        while (it.hasNext() && !it.next().uef(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm.uef
    public boolean yo() {
        return this.moa.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm.uef
    public wk oa() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm.uef
    public void uef(zjm zjmVar) {
        int iIndexOf = this.f24941oa.indexOf(zjmVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.f24941oa.size()) {
                return;
            }
        } while (!this.f24941oa.get(iIndexOf).uef(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm.uef
    public void uef(wk wkVar) {
        this.uef = wkVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm.uef
    public void uef(boolean z2) {
        this.moa.getAndSet(z2);
    }
}
