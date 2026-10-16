package com.bytedance.sdk.component.lw.oa.yo;

import com.bytedance.sdk.component.lw.dj;
import java.util.Map;

/* loaded from: classes.dex */
public class moa<T> implements dj {
    private boolean bcc;
    private boolean cz;
    private int dj;
    private int ivm;
    private int lw;
    private T moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25027oa;
    private String uef;
    private Map<String, String> xs;
    private T yo;
    private com.bytedance.sdk.component.lw.xs zjm;

    @Override // com.bytedance.sdk.component.lw.dj
    public boolean ivm() {
        return this.cz;
    }

    @Override // com.bytedance.sdk.component.lw.dj
    public boolean lw() {
        return this.bcc;
    }

    @Override // com.bytedance.sdk.component.lw.dj
    public Map<String, String> moa() {
        return this.xs;
    }

    @Override // com.bytedance.sdk.component.lw.dj
    public T oa() {
        return this.yo;
    }

    public moa uef(yo yoVar, T t10) {
        this.yo = t10;
        this.uef = yoVar.bcc();
        this.f25027oa = yoVar.uef();
        this.lw = yoVar.oa();
        this.ivm = yoVar.yo();
        this.cz = yoVar.wrv();
        this.zjm = yoVar.dz();
        this.dj = yoVar.wk();
        return this;
    }

    @Override // com.bytedance.sdk.component.lw.dj
    public int xs() {
        return this.dj;
    }

    @Override // com.bytedance.sdk.component.lw.dj
    public T yo() {
        return this.moa;
    }

    public moa uef(yo yoVar, T t10, Map<String, String> map, boolean z2) {
        this.xs = map;
        this.bcc = z2;
        return uef(yoVar, t10);
    }

    @Override // com.bytedance.sdk.component.lw.dj
    public String uef() {
        return this.f25027oa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.lw.dj
    public void uef(Object obj) {
        this.moa = this.yo;
        this.yo = obj;
    }
}
