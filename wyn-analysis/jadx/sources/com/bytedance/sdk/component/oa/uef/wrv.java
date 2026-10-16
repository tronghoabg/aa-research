package com.bytedance.sdk.component.oa.uef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class wrv {
    private long moa = 30000;

    /* renamed from: oa, reason: collision with root package name */
    public com.bytedance.sdk.component.yo.uef.uef f25073oa = new com.bytedance.sdk.component.yo.uef.uef();
    public dj uef;
    private List<String> yo;

    public static class uef {
        String bcc;
        private List<String> cz;
        cq ivm;
        Object lw;
        String moa;

        /* renamed from: oa, reason: collision with root package name */
        Map<String, List<String>> f25074oa;
        com.bytedance.sdk.component.oa.uef.uef uef;
        int xs;
        xs yo;
        private long zjm;

        public uef() {
            this.zjm = 30000L;
            this.f25074oa = new HashMap();
        }

        public uef oa(String str) {
            return uef(xs.yo(str));
        }

        public uef uef(com.bytedance.sdk.component.oa.uef.uef uefVar) {
            this.uef = uefVar;
            return this;
        }

        public uef oa(String str, String str2) {
            if (!this.f25074oa.containsKey(str)) {
                this.f25074oa.put(str, new ArrayList());
            }
            this.f25074oa.get(str).add(str2);
            return this;
        }

        public uef uef(String str) {
            this.bcc = str;
            return this;
        }

        public uef(wrv wrvVar) {
            this.zjm = 30000L;
            this.yo = wrvVar.moa();
            this.moa = wrvVar.lw();
            this.f25074oa = wrvVar.ivm();
            this.lw = wrvVar.yo();
            this.ivm = wrvVar.zjm();
            this.uef = wrvVar.xs();
            this.xs = wrvVar.cz();
            this.bcc = wrvVar.bcc();
            this.cz = wrvVar.uef();
            this.zjm = wrvVar.oa();
        }

        public uef uef(int i5) {
            this.xs = i5;
            return this;
        }

        public uef uef(Object obj) {
            this.lw = obj;
            return this;
        }

        public wrv oa() {
            return new wrv() { // from class: com.bytedance.sdk.component.oa.uef.wrv.uef.1
                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public String bcc() {
                    return uef.this.bcc;
                }

                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public int cz() {
                    return uef.this.xs;
                }

                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public Map ivm() {
                    return uef.this.f25074oa;
                }

                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public String lw() {
                    return uef.this.moa;
                }

                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public xs moa() {
                    return uef.this.yo;
                }

                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public long oa() {
                    return uef.this.zjm;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public List<String> uef() {
                    return uef.this.cz;
                }

                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public com.bytedance.sdk.component.oa.uef.uef xs() {
                    return uef.this.uef;
                }

                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public Object yo() {
                    return uef.this.lw;
                }

                @Override // com.bytedance.sdk.component.oa.uef.wrv
                public cq zjm() {
                    return uef.this.ivm;
                }
            };
        }

        public uef uef(xs xsVar) {
            this.yo = xsVar;
            return this;
        }

        public uef uef(String str, String str2) {
            return oa(str, str2);
        }

        public uef uef() {
            return uef("GET", (cq) null);
        }

        private uef uef(String str, cq cqVar) {
            this.moa = str;
            this.ivm = cqVar;
            return this;
        }

        public uef uef(cq cqVar) {
            return uef("POST", cqVar);
        }

        public uef uef(List<String> list) {
            this.cz = list;
            return this;
        }

        public uef uef(long j8) {
            this.zjm = j8;
            return this;
        }
    }

    public abstract String bcc();

    public abstract int cz();

    public uef dj() {
        return new uef(this);
    }

    public abstract Map<String, List<String>> ivm();

    public abstract String lw();

    public abstract xs moa();

    public long oa() {
        return this.moa;
    }

    public List<String> uef() {
        return this.yo;
    }

    public abstract com.bytedance.sdk.component.oa.uef.uef xs();

    public abstract Object yo();

    public cq zjm() {
        return null;
    }

    public void uef(dj djVar) {
        this.uef = djVar;
    }
}
