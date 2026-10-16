package com.google.android.gms.a.a;

import android.net.Uri;
import com.bumptech.glide.g.p;
import j$.util.Objects;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f4373a;

    a(d dVar, Map map) {
        this.f4373a = map;
        Objects.requireNonNull(dVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Map map = this.f4373a;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        p.i(builderBuildUpon.build().toString());
    }
}
