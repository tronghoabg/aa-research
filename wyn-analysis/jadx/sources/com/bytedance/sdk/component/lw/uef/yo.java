package com.bytedance.sdk.component.lw.uef;

import com.bytedance.sdk.component.lw.ivm;
import com.bytedance.sdk.component.lw.xs;
import java.util.Map;

/* loaded from: classes.dex */
public class yo<T> implements ivm {
    private xs lw;
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25051oa;
    Map<String, String> uef;
    private T yo;

    public yo(int i5, T t10, String str) {
        this.f25051oa = i5;
        this.yo = t10;
        this.moa = str;
    }

    @Override // com.bytedance.sdk.component.lw.ivm
    public T oa() {
        return this.yo;
    }

    public void uef(xs xsVar) {
        this.lw = xsVar;
    }

    @Override // com.bytedance.sdk.component.lw.ivm
    public String yo() {
        return this.moa;
    }

    @Override // com.bytedance.sdk.component.lw.ivm
    public int uef() {
        return this.f25051oa;
    }

    public yo(int i5, T t10, String str, Map<String, String> map) {
        this(i5, t10, str);
        this.uef = map;
    }
}
