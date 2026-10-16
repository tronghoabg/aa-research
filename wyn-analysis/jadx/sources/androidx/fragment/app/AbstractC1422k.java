package androidx.fragment.app;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1422k {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f18473a;

    public AbstractC1422k(A0 operation) {
        AbstractC3340k.e(operation, "operation");
        this.f18473a = operation;
    }

    public final boolean a() {
        int i5;
        A0 a02 = this.f18473a;
        View view = a02.f18280c.mView;
        if (view != null) {
            i5 = 4;
            if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i5 = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(AbstractC3256n.g(visibility, "Unknown visibility "));
                    }
                    i5 = 3;
                }
            }
        } else {
            i5 = 0;
        }
        int i10 = a02.f18278a;
        if (i5 != i10) {
            return (i5 == 2 || i10 == 2) ? false : true;
        }
        return true;
    }
}
