package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ext implements android.view.View.OnCreateContextMenuListener, android.view.MenuItem.OnMenuItemClickListener {
    private final androidx.preference.Preference a;

    public ext(androidx.preference.Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        androidx.preference.Preference preference = this.a;
        java.lang.CharSequence charSequenceM = preference.m();
        if (!preference.D || android.text.TextUtils.isEmpty(charSequenceM)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceM);
        contextMenu.add(0, 0, 0, com.google.android.projection.gearhead.R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        androidx.preference.Preference preference = this.a;
        android.content.Context context = preference.j;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) context.getSystemService("clipboard");
        java.lang.CharSequence charSequenceM = preference.m();
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("Preference", charSequenceM));
        if (android.os.Build.VERSION.SDK_INT <= 32) {
            android.widget.Toast.makeText(context, context.getString(com.google.android.projection.gearhead.R.string.preference_copied, charSequenceM), 0).show();
        }
        return true;
    }
}
