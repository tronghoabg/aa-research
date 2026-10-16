package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import java.text.MessageFormat;

/* loaded from: classes3.dex */
final class zvq extends ArrayAdapter {
    final /* synthetic */ zvs a;
    private final gjt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zvq(zvs zvsVar, gjt gjtVar, sm smVar) {
        super((Context) gjtVar.a, -1);
        this.a = zvsVar;
        this.b = gjtVar;
        if (smVar.G()) {
            add(new zvr(null));
        }
        yfq yfqVarE = smVar.E();
        int size = yfqVarE.size();
        for (int i = 0; i < size; i++) {
            add(new zvr((erb) yfqVarE.get(i)));
        }
    }

    private final int a(int i) {
        return Math.round(TypedValue.applyDimension(1, i, ((Context) this.b.a).getResources().getDisplayMetrics()));
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        if (view == null) {
            relativeLayout = new RelativeLayout((Context) this.b.a);
            relativeLayout.setLayoutParams(new AbsListView.LayoutParams(-1, a(44)));
        }
        TextView textView = (TextView) relativeLayout.getTag();
        if (textView == null) {
            gjt gjtVar = this.b;
            TextView textView2 = new TextView(gjtVar.A());
            textView2.setPadding(0, 0, 0, 0);
            textView2.setClickable(false);
            textView2.setTextSize(0, gjtVar.u() * 18.0f);
            textView2.setTextColor(gjtVar.v(R.color.maps_floorpicker_text));
            textView2.setGravity(17);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, a(36));
            layoutParams.addRule(10);
            relativeLayout.addView(textView2, layoutParams);
            relativeLayout.setTag(textView2);
            textView = textView2;
        }
        String strValueOf = String.valueOf(getItem(i));
        textView.setText(strValueOf);
        gjt gjtVar2 = this.b;
        textView.setContentDescription(MessageFormat.format(gjtVar2.F(R.string.maps_LEVEL_ALT_TEXT), strValueOf));
        if (i == this.a.a) {
            textView.setTextColor(gjtVar2.v(R.color.maps_floorpicker_black));
            relativeLayout.setBackgroundDrawable(gjtVar2.D(R.drawable.maps_floorpicker_bg_selected));
            relativeLayout.destroyDrawingCache();
            return relativeLayout;
        }
        textView.setTextColor(gjtVar2.v(R.color.maps_floorpicker_text));
        if (relativeLayout.getBackground() != null) {
            relativeLayout.setBackgroundDrawable(null);
            relativeLayout.destroyDrawingCache();
        }
        return relativeLayout;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
