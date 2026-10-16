package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ViewAnimator;
import com.google.android.apps.auto.components.system.dashboard.media.MediaSuggestionFragment;

/* loaded from: classes2.dex */
public final class nal implements View.OnLayoutChangeListener {
    final /* synthetic */ MediaSuggestionFragment a;
    final /* synthetic */ Context b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ ViewAnimator e;

    public nal(MediaSuggestionFragment mediaSuggestionFragment, Context context, int i, int i2, ViewAnimator viewAnimator) {
        this.a = mediaSuggestionFragment;
        this.b = context;
        this.c = i;
        this.d = i2;
        this.e = viewAnimator;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        Context context = this.b;
        int i9 = this.c;
        int i10 = this.d;
        MediaSuggestionFragment mediaSuggestionFragment = this.a;
        mediaSuggestionFragment.b().a(MediaSuggestionFragment.a(context, i9, i10, this.e));
        mediaSuggestionFragment.b().f();
    }
}
