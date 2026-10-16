package com.bytedance.sdk.component.oa.uef.uef.uef;

import com.bytedance.sdk.component.oa.uef.bcc;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.wrv;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class yo implements bcc.uef {

    /* renamed from: oa, reason: collision with root package name */
    wrv f25072oa;
    List<com.bytedance.sdk.component.oa.uef.bcc> uef;
    int yo = 0;

    public yo(List<com.bytedance.sdk.component.oa.uef.bcc> list, wrv wrvVar) {
        this.uef = list;
        this.f25072oa = wrvVar;
    }

    @Override // com.bytedance.sdk.component.oa.uef.bcc.uef
    public wrv uef() {
        return this.f25072oa;
    }

    @Override // com.bytedance.sdk.component.oa.uef.bcc.uef
    public dz uef(wrv wrvVar) throws IOException {
        this.f25072oa = wrvVar;
        int i5 = this.yo + 1;
        this.yo = i5;
        if (i5 >= this.uef.size()) {
            return null;
        }
        return this.uef.get(this.yo).uef(this);
    }
}
