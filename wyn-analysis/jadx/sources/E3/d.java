package e3;

import Ef.H;
import Ef.S;
import android.net.Uri;
import android.view.InputEvent;
import g3.AbstractC2696a;
import g3.AbstractC2698c;
import g3.AbstractC2699d;
import g3.C2697b;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.p;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final C2697b f34423a;

    public d(C2697b c2697b) {
        this.f34423a = c2697b;
    }

    @Override // e3.e
    @NotNull
    public p b(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
        AbstractC3340k.e(attributionSource, "attributionSource");
        return AbstractC3230e0.g(H.h(H.c(S.f3698a), null, new b(this, attributionSource, inputEvent, null), 3));
    }

    @NotNull
    public p c(@NotNull AbstractC2696a deletionRequest) {
        AbstractC3340k.e(deletionRequest, "deletionRequest");
        throw null;
    }

    @NotNull
    public p d() {
        return AbstractC3230e0.g(H.h(H.c(S.f3698a), null, new C2470a(this, null), 3));
    }

    @NotNull
    public p e(@NotNull Uri trigger) {
        AbstractC3340k.e(trigger, "trigger");
        return AbstractC3230e0.g(H.h(H.c(S.f3698a), null, new c(this, trigger, null), 3));
    }

    @NotNull
    public p f(@NotNull AbstractC2698c request) {
        AbstractC3340k.e(request, "request");
        throw null;
    }

    @NotNull
    public p g(@NotNull AbstractC2699d request) {
        AbstractC3340k.e(request, "request");
        throw null;
    }
}
