package com.bykv.vk.openvk.preload.a;

import Va.M6;
import com.bykv.vk.openvk.preload.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private Map<String, a> f24286d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        List<h> f24287a = new ArrayList();

        public final a a(h hVar) {
            this.f24287a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f24287a.addAll(list);
            return this;
        }
    }

    public final Map<String, a> a() {
        return this.f24286d;
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && ((h) M6.k(1, list)).f24274a == f.class;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, a> f24288a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f24289b;

        public final a a(String str) {
            if (this.f24288a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f24288a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f24288a).a(this.f24289b).b();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f24286d = (Map) obj;
                return;
            } catch (ClassCastException e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        throw new IllegalStateException("args error");
    }
}
