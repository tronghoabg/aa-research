package D1;

import androidx.fragment.app.F;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final F f2278a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(F fragment, String str) {
        super(str);
        AbstractC3340k.e(fragment, "fragment");
        this.f2278a = fragment;
    }
}
