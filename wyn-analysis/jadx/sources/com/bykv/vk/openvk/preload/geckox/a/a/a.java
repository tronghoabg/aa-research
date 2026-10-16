package com.bykv.vk.openvk.preload.geckox.a.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f24314a;

    /* renamed from: b, reason: collision with root package name */
    final c f24315b;

    /* renamed from: c, reason: collision with root package name */
    private final b f24316c;

    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0029a {

        /* renamed from: a, reason: collision with root package name */
        private int f24317a;

        /* renamed from: b, reason: collision with root package name */
        private b f24318b = b.f24320a;

        /* renamed from: c, reason: collision with root package name */
        private c f24319c;

        public final C0029a a() {
            this.f24317a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0029a a(b bVar) {
            if (bVar == null) {
                bVar = b.f24320a;
            }
            this.f24318b = bVar;
            return this;
        }
    }

    public /* synthetic */ a(C0029a c0029a, byte b5) {
        this(c0029a);
    }

    public final b a() {
        return this.f24316c;
    }

    private a(C0029a c0029a) {
        this.f24314a = c0029a.f24317a;
        this.f24316c = c0029a.f24318b;
        this.f24315b = c0029a.f24319c;
    }
}
