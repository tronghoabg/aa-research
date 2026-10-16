package com.bytedance.sdk.component.oa.uef;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lw extends cq {

    /* renamed from: oa, reason: collision with root package name */
    List<String> f25059oa;
    List<String> uef;

    public lw(List<String> list, List<String> list2) {
        this.uef = list;
        this.f25059oa = list2;
    }

    public static final class uef {
        private final List<String> uef = new ArrayList();

        /* renamed from: oa, reason: collision with root package name */
        private final List<String> f25060oa = new ArrayList();

        public uef uef(String str, String str2) {
            this.uef.add(str);
            this.f25060oa.add(str2);
            return this;
        }

        public lw uef() {
            return new lw(this.uef, this.f25060oa);
        }
    }
}
