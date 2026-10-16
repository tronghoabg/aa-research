package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f20643b = new e() { // from class: com.apm.insight.runtime.e.1

        /* renamed from: a, reason: collision with root package name */
        private Header f20645a = null;

        @Override // com.apm.insight.runtime.e
        public final Object b(String str) {
            if (this.f20645a == null) {
                this.f20645a = Header.b(com.apm.insight.e.g());
            }
            return this.f20645a.f().opt(str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private e f20644a;

    public e() {
        this(f20643b);
    }

    public Object a(String str) {
        e eVar = this.f20644a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        e eVar = this.f20644a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.f20644a = eVar;
    }
}
