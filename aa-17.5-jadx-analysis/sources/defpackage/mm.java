package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class mm extends ca {
    public mm() {
        super(null);
    }

    @Override // defpackage.ca
    public final EdgeEffect r(RecyclerView recyclerView) {
        return new EdgeEffect(recyclerView.getContext());
    }
}
