package defpackage;

import android.database.CursorWindow;
import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ CursorWindow c(String str, long j) {
        return new CursorWindow(str, j);
    }

    public static /* synthetic */ DisplayCutout h(Rect rect, ArrayList arrayList) {
        return new DisplayCutout(rect, arrayList);
    }

    public static /* synthetic */ DisplayCutout i(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout j(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* synthetic */ void p() {
    }
}
