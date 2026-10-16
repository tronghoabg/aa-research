package defpackage;

import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class wzd extends mo {
    final /* synthetic */ wze s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzd(wze wzeVar, View view) {
        super(view);
        this.s = wzeVar;
        View viewFindViewById = view.findViewById(R.id.play_button);
        viewFindViewById.setOnClickListener(new wzc(this, viewFindViewById, view.findViewById(R.id.spinner)));
    }
}
