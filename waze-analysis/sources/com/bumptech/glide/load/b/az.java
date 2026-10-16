package com.bumptech.glide.load.b;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.api.internal.be;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class az implements ad {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f3246a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(ProxyConfig.MATCH_HTTP, ProxyConfig.MATCH_HTTPS)));

    /* renamed from: b, reason: collision with root package name */
    private final ad f3247b;

    public az(ad adVar) {
        this.f3247b = adVar;
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return f3246a.contains(((Uri) obj).getScheme());
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ be b(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        return this.f3247b.b(new t(((Uri) obj).toString()), i2, i3, sVar);
    }
}
