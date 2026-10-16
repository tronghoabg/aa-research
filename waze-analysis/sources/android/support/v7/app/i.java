package android.support.v7.app;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class i extends ArrayAdapter {
    public i(Context context, int i2, CharSequence[] charSequenceArr) {
        super(context, i2, R.id.text1, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
