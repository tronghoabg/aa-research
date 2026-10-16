package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class p implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33696a;

    /* renamed from: b, reason: collision with root package name */
    public final PathProvider f33697b;

    public p(Context context, PathProvider pathProvider) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(pathProvider, "pathProvider");
        this.f33696a = context;
        this.f33697b = pathProvider;
    }

    public final d a(String tag) throws o {
        AbstractC3340k.e(tag, "tag");
        if (tag.length() == 0) {
            throw new o("Job tag is null");
        }
        if (tag.equals("CleanupJob")) {
            return new c(this.f33696a, this.f33697b);
        }
        if (tag.equals("ResendTpatJob")) {
            return new m(this.f33696a, this.f33697b);
        }
        throw new o(com.iab.omid.library.vungle.d.a("Unknown Job Type ", tag));
    }
}
