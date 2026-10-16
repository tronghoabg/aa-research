package androidx.compose.material3;

import androidx.camera.video.AudioStats;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ButtonGroupScopeImpl implements ButtonGroupScope, ButtonGroupItemProvider {
    private final AnimationSpec<Float> animationSpec;
    private final List<ButtonGroupItem> items = new ArrayList();

    public ButtonGroupScopeImpl(AnimationSpec<Float> animationSpec) {
        this.animationSpec = animationSpec;
    }

    @Override // androidx.compose.material3.ButtonGroupScope
    public Modifier align(Modifier modifier, Alignment.Vertical vertical) {
        return modifier.then(new VerticalAlignElement(vertical));
    }

    @Override // androidx.compose.material3.ButtonGroupScope
    public Modifier animateWidth(Modifier modifier, InteractionSource interactionSource) {
        return modifier.then(new EnlargeOnPressElement(interactionSource, this.animationSpec));
    }

    @Override // androidx.compose.material3.ButtonGroupScope
    public void clickableItem(a<ab> aVar, String str, p<? super Composer, ? super Integer, ab> pVar, float f2, boolean z) {
        if (f2 > AudioStats.AUDIO_AMPLITUDE_NONE || Float.isNaN(f2)) {
            getItems().add(new ClickableButtonGroupItem(aVar, pVar, f2, this.animationSpec, z, str));
            return;
        }
        throw new IllegalArgumentException("invalid weight " + f2 + "; must be greater than zero or Float.NaN");
    }

    @Override // androidx.compose.material3.ButtonGroupScope
    public void customItem(p<? super Composer, ? super Integer, ab> pVar, q<? super ButtonGroupMenuState, ? super Composer, ? super Integer, ab> qVar) {
        getItems().add(new CustomButtonGroupItem(pVar, qVar));
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    @Override // androidx.compose.material3.ButtonGroupItemProvider
    public List<ButtonGroupItem> getItems() {
        return this.items;
    }

    @Override // androidx.compose.material3.ButtonGroupItemProvider
    public int getItemsCount() {
        return getItems().size();
    }

    @Override // androidx.compose.material3.ButtonGroupScope
    public void toggleableItem(boolean z, String str, l<? super Boolean, ab> lVar, p<? super Composer, ? super Integer, ab> pVar, float f2, boolean z2) {
        if (f2 > AudioStats.AUDIO_AMPLITUDE_NONE || Float.isNaN(f2)) {
            getItems().add(new ToggleableButtonGroupItem(z, lVar, f2, this.animationSpec, pVar, z2, str));
            return;
        }
        throw new IllegalArgumentException("invalid weight " + f2 + "; must be greater than zero or Float.NaN");
    }

    @Override // androidx.compose.material3.ButtonGroupScope
    public Modifier weight(Modifier modifier, float f2) {
        if (f2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
            return modifier.then(new ButtonGroupElement(n.f(f2, Float.MAX_VALUE)));
        }
        throw new IllegalArgumentException("invalid weight " + f2 + "; must be greater than zero");
    }

    @Override // androidx.compose.material3.ButtonGroupScope
    public /* synthetic */ Modifier weight(Modifier modifier, float f2, boolean z) {
        return weight(modifier, f2);
    }
}
