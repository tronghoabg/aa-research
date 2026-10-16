package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.load.a.af;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    static final ad f3517a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.g.j f3518b;

    /* renamed from: c, reason: collision with root package name */
    private final List f3519c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f3520d;

    /* renamed from: e, reason: collision with root package name */
    private final af f3521e;

    /* renamed from: f, reason: collision with root package name */
    private final o f3522f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3523g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.e.i f3524h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3525i;

    public m(Context context, com.bumptech.glide.load.a.a.j jVar, com.bumptech.glide.g.j jVar2, Map map, List list, af afVar, o oVar) {
        super(context.getApplicationContext());
        this.f3525i = jVar;
        this.f3519c = list;
        this.f3520d = map;
        this.f3521e = afVar;
        this.f3522f = oVar;
        this.f3523g = 4;
        this.f3518b = com.bumptech.glide.g.p.g(jVar2);
    }

    public final int a() {
        return this.f3523g;
    }

    public final o b() {
        return this.f3522f;
    }

    public final v c() {
        return (v) this.f3518b.a();
    }

    public final ad d(Class cls) {
        Map map = this.f3520d;
        ad adVar = (ad) map.get(cls);
        if (adVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    adVar = (ad) entry.getValue();
                }
            }
        }
        return adVar == null ? f3517a : adVar;
    }

    public final af e() {
        return this.f3521e;
    }

    public final synchronized com.bumptech.glide.e.i f() {
        com.bumptech.glide.e.i iVar;
        iVar = this.f3524h;
        if (iVar == null) {
            iVar = new com.bumptech.glide.e.i();
            iVar.ab();
            this.f3524h = iVar;
        }
        return iVar;
    }

    public final List g() {
        return this.f3519c;
    }

    public final com.bumptech.glide.load.a.a.j h() {
        return this.f3525i;
    }
}
