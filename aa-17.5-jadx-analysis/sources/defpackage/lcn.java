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
final class lcn extends ArrayAdapter {
    public lcn(Context context, List list) {
        super(context, 0, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object tag = view != null ? view.getTag() : null;
        lcm lcmVar = tag instanceof lcm ? (lcm) tag : null;
        if (lcmVar == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.csat_dialog_choice, viewGroup, false);
            viewInflate.getClass();
            lcmVar = new lcm(viewInflate);
            viewInflate.setTag(lcmVar);
        }
        lcc lccVar = (lcc) getItem(i);
        if (lccVar == null) {
            throw new IllegalStateException(a.bp(i, "Unknown adapter position "));
        }
        int i2 = lccVar.b;
        if (i2 != 0) {
            ImageView imageView = lcmVar.c;
            imageView.setImageResource(i2);
            imageView.setVisibility(0);
            lcmVar.b.setVisibility(0);
        } else {
            lcmVar.c.setVisibility(8);
            lcmVar.b.setVisibility(8);
        }
        TextView textView = lcmVar.d;
        Context context = getContext();
        context.getClass();
        textView.setText(lccVar.a(context));
        return lcmVar.a;
    }
}
