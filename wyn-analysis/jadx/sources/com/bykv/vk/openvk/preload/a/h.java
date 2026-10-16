package com.bykv.vk.openvk.preload.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    Class<? extends d> f24274a;

    /* renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f24275b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f24276c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Class<? extends d> f24277a;

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f24278b;

        /* renamed from: c, reason: collision with root package name */
        private Object[] f24279c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f24277a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f24278b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f24279c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b5) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f24275b;
    }

    public final Object[] b() {
        return this.f24276c;
    }

    private h(a aVar) {
        this.f24274a = aVar.f24277a;
        this.f24275b = aVar.f24278b;
        this.f24276c = aVar.f24279c;
        if (this.f24274a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
