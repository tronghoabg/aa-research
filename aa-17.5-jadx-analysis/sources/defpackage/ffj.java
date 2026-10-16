package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
final class ffj extends ffp {
    @Override // defpackage.ffo
    public final float a(ViewGroup viewGroup, View view) {
        return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
    }
}
