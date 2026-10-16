package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class el extends android.widget.ArrayAdapter {
    public el(android.content.Context context, int i, java.lang.CharSequence[] charSequenceArr) {
        super(context, i, android.R.id.text1, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
