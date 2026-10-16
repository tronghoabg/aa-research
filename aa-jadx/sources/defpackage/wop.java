package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wop extends android.widget.BaseAdapter {
    private final java.util.Calendar a;
    private final int b;
    private final int c;

    public wop() {
        java.util.Calendar calendarE = defpackage.wpn.e(null);
        this.a = calendarE;
        this.b = calendarE.getMaximum(7);
        this.c = calendarE.getFirstDayOfWeek();
    }

    private final int a(int i) {
        int i2 = i + this.c;
        int i3 = this.b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int i) {
        if (i >= this.b) {
            return null;
        }
        return java.lang.Integer.valueOf(a(i));
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.TextView textView = (android.widget.TextView) view;
        if (view == null) {
            textView = (android.widget.TextView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.projection.gearhead.R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        java.util.Calendar calendar = this.a;
        calendar.set(7, a(i));
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(java.lang.String.format(viewGroup.getContext().getString(com.google.android.projection.gearhead.R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, java.util.Locale.getDefault())));
        return textView;
    }

    public wop(int i) {
        java.util.Calendar calendarE = defpackage.wpn.e(null);
        this.a = calendarE;
        this.b = calendarE.getMaximum(7);
        this.c = i;
    }
}
