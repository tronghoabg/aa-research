package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.internal.util.PathProvider;
import ef.EnumC2526j;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33695a;

    public m(Context context, PathProvider pathProvider) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(pathProvider, "pathProvider");
        this.f33695a = context;
    }

    @Override // com.vungle.ads.internal.task.d
    public final int a(Bundle bundle, h jobRunner) {
        AbstractC3340k.e(bundle, "bundle");
        AbstractC3340k.e(jobRunner, "jobRunner");
        ((com.vungle.ads.internal.network.r) Fe.c.y(EnumC2526j.f34667a, new l(this.f33695a)).getValue()).b();
        return 0;
    }
}
