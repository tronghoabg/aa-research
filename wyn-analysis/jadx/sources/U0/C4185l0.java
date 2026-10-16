package u0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import t0.InterfaceC4045J;

/* renamed from: u0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4185l0 implements InterfaceC4045J {

    /* renamed from: a, reason: collision with root package name */
    public final int f46253a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f46254b;

    public C4185l0(ArrayList allScopes, int i5) {
        AbstractC3340k.e(allScopes, "allScopes");
        this.f46253a = i5;
        this.f46254b = allScopes;
    }

    @Override // t0.InterfaceC4045J
    public final boolean n() {
        return this.f46254b.contains(this);
    }
}
