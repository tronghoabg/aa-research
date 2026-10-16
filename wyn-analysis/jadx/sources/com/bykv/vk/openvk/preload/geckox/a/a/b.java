package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24320a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final b f24321b;

    /* renamed from: c, reason: collision with root package name */
    protected a f24322c;

    /* renamed from: d, reason: collision with root package name */
    protected File f24323d;

    /* renamed from: e, reason: collision with root package name */
    protected List<String> f24324e;

    static {
        new f();
        f24321b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f24322c = aVar;
        this.f24323d = file;
        this.f24324e = list;
    }
}
