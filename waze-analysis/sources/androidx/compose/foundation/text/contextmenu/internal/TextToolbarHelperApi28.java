package androidx.compose.foundation.text.contextmenu.internal;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextToolbarHelperApi28 {
    public static final TextToolbarHelperApi28 INSTANCE = new TextToolbarHelperApi28();

    private TextToolbarHelperApi28() {
    }

    public static /* synthetic */ void addLegacyMenuItem$default(TextToolbarHelperApi28 textToolbarHelperApi28, Menu menu, int i2, Context context, TextClassification textClassification, Drawable drawable, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            drawable = null;
        }
        textToolbarHelperApi28.addLegacyMenuItem(menu, i2, context, textClassification, drawable);
    }

    static final boolean addLegacyMenuItem$lambda$0(Context context, TextClassification textClassification, MenuItem menuItem) throws PendingIntent.CanceledException {
        TextClassificationHelperApi28.INSTANCE.sendLegacyIntent(context, textClassification);
        return true;
    }

    public static /* synthetic */ void addMenuItem$default(TextToolbarHelperApi28 textToolbarHelperApi28, Menu menu, int i2, Context context, TextClassification textClassification, int i3, Drawable drawable, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            drawable = null;
        }
        textToolbarHelperApi28.addMenuItem(menu, i2, context, textClassification, i3, drawable);
    }

    static final boolean addMenuItem$lambda$0(RemoteAction remoteAction, MenuItem menuItem) throws PendingIntent.CanceledException {
        TextClassificationHelperApi28.INSTANCE.sendPendingIntent(remoteAction.getActionIntent());
        return true;
    }

    public final void addLegacyMenuItem(Menu menu, int i2, final Context context, final TextClassification textClassification, Drawable drawable) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i2, textClassification.getLabel());
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(drawable);
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28$$ExternalSyntheticLambda0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                TextToolbarHelperApi28.addLegacyMenuItem$lambda$0(context, textClassification, menuItem);
                return true;
            }
        });
    }

    public final void addMenuItem(Menu menu, int i2, boolean z, final RemoteAction remoteAction, Drawable drawable) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, true != z ? 0 : 16908353, i2, remoteAction.getTitle());
        menuItemAdd.setShowAsAction(true == z ? 2 : 0);
        if (drawable != null) {
            menuItemAdd.setIcon(drawable);
        }
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28$$ExternalSyntheticLambda1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                TextToolbarHelperApi28.addMenuItem$lambda$0(remoteAction, menuItem);
                return true;
            }
        });
    }

    public static /* synthetic */ void addMenuItem$default(TextToolbarHelperApi28 textToolbarHelperApi28, Menu menu, int i2, boolean z, RemoteAction remoteAction, Drawable drawable, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            drawable = null;
        }
        textToolbarHelperApi28.addMenuItem(menu, i2, z, remoteAction, drawable);
    }

    public final void addMenuItem(Menu menu, int i2, Context context, TextClassification textClassification, int i3, Drawable drawable) {
        if (i3 < 0) {
            addLegacyMenuItem(menu, i2, context, textClassification, drawable);
        } else {
            addMenuItem(menu, i2, i3 == 0, j$$ExternalSyntheticApiModelOutline1.m(textClassification.getActions().get(i3)), drawable);
        }
    }
}
