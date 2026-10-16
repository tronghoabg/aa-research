package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
final class ffi extends ffp {
    @Override // defpackage.ffo
    public final float a(ViewGroup viewGroup, View view) {
        return view.getTranslationX() - viewGroup.getWidth();
    }
}
