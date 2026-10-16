package com.bumptech.glide.load.b;

import android.net.Uri;
import com.google.android.gms.common.api.internal.be;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ax implements ad {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f3242a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: b, reason: collision with root package name */
    private final av f3243b;

    public ax(av avVar) {
        this.f3243b = avVar;
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return f3242a.contains(((Uri) obj).getScheme());
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ be b(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        Uri uri = (Uri) obj;
        return new be(new com.bumptech.glide.f.d(uri), this.f3243b.a(uri));
    }
}
