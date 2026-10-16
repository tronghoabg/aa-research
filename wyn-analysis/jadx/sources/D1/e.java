package D1;

import android.view.ViewGroup;
import androidx.fragment.app.F;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2277b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(F fragment, ViewGroup viewGroup, int i5) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        switch (i5) {
            case 1:
                AbstractC3340k.e(fragment, "fragment");
                super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f2277b = viewGroup;
                break;
            default:
                this.f2277b = viewGroup;
                break;
        }
    }
}
