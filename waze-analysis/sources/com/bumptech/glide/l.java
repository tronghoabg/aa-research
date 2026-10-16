package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.a.af;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private af f2923b;

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.a.a.c f2924c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.a.b.i f2925d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.a.c.f f2926e;

    /* renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.a.c.f f2927f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.a.b.l f2928g;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.a.c.f f2930i;

    /* renamed from: j, reason: collision with root package name */
    private List f2931j;

    /* renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.load.a.a.j f2932k;

    /* renamed from: l, reason: collision with root package name */
    private com.bumptech.glide.manager.e f2933l;
    private com.bumptech.glide.load.a.b.k n;

    /* renamed from: a, reason: collision with root package name */
    private final Map f2922a = new ArrayMap();
    private final o m = new o();

    /* renamed from: h, reason: collision with root package name */
    private final b f2929h = new d(this);

    final c a(Context context, List list, com.bumptech.glide.c.a aVar) {
        if (this.f2926e == null) {
            this.f2926e = com.bumptech.glide.load.a.c.f.d().a();
        }
        if (this.f2927f == null) {
            this.f2927f = com.bumptech.glide.load.a.c.f.c().a();
        }
        if (this.f2930i == null) {
            this.f2930i = com.bumptech.glide.load.a.c.f.b().a();
        }
        if (this.f2928g == null) {
            this.f2928g = new com.bumptech.glide.load.a.b.j(context).a();
        }
        if (this.f2933l == null) {
            this.f2933l = new com.bumptech.glide.manager.e();
        }
        if (this.f2924c == null) {
            int iB = this.f2928g.b();
            if (iB > 0) {
                this.f2924c = new com.bumptech.glide.load.a.a.k(iB);
            } else {
                this.f2924c = new com.bumptech.glide.load.a.a.d();
            }
        }
        if (this.f2932k == null) {
            this.f2932k = new com.bumptech.glide.load.a.a.j(this.f2928g.a());
        }
        if (this.f2925d == null) {
            this.f2925d = new com.bumptech.glide.load.a.b.g(this.f2928g.c());
        }
        if (this.n == null) {
            this.n = new com.bumptech.glide.load.a.b.k(context);
        }
        if (this.f2923b == null) {
            com.bumptech.glide.load.a.b.i iVar = this.f2925d;
            com.bumptech.glide.load.a.b.k kVar = this.n;
            com.bumptech.glide.load.a.c.f fVar = this.f2927f;
            com.bumptech.glide.load.a.c.f fVar2 = this.f2926e;
            com.bumptech.glide.load.a.c.f.e();
            this.f2923b = new af(iVar, kVar, fVar, fVar2, this.f2930i);
        }
        List list2 = this.f2931j;
        if (list2 == null) {
            this.f2931j = Collections.EMPTY_LIST;
        } else {
            this.f2931j = DesugarCollections.unmodifiableList(list2);
        }
        return new c(context, this.f2923b, this.f2925d, this.f2924c, this.f2932k, new com.bumptech.glide.manager.n(), this.f2922a, this.f2931j, list, aVar, new o(this.m));
    }
}
