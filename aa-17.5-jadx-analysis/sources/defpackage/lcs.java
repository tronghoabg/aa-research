package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
final class lcs extends ArrayAdapter {
    public lcs(Context context, List list) {
        super(context, 0, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object tag = view != null ? view.getTag() : null;
        lcr lcrVar = tag instanceof lcr ? (lcr) tag : null;
        if (lcrVar == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.legacy_csat_dialog_choice, viewGroup, false);
            viewInflate.getClass();
            lcrVar = new lcr(viewInflate);
            viewInflate.setTag(lcrVar);
        }
        lcc lccVar = (lcc) getItem(i);
        if (lccVar == null) {
            throw new IllegalStateException(a.bp(i, "Unknown adapter position "));
        }
        int i2 = lccVar.b;
        if (i2 != 0) {
            ImageView imageView = lcrVar.b;
            imageView.setImageResource(i2);
            imageView.setVisibility(0);
            lcrVar.c.setVisibility(0);
        } else {
            lcrVar.b.setVisibility(8);
            lcrVar.c.setVisibility(8);
        }
        TextView textView = lcrVar.d;
        Context context = getContext();
        context.getClass();
        textView.setText(lccVar.a(context));
        return lcrVar.a;
    }
}
