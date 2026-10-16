package androidx.fragment.app.strictmode;

import android.support.v4.app.ar;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WrongFragmentContainerViolation extends Violation {
    private final ViewGroup container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(ar arVar, ViewGroup viewGroup) {
        super(arVar, "Attempting to add fragment " + arVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        x.f(arVar, "fragment");
        x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        this.container = viewGroup;
    }

    public final ViewGroup getContainer() {
        return this.container;
    }
}
