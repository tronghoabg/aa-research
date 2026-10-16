package q;

import ac.C1346a;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import k1.C3117d;
import k1.InterfaceC3116c;

/* renamed from: q.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3849z {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC3116c c1346a;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c1346a = new C1346a(clipData, 3);
            } else {
                C3117d c3117d = new C3117d();
                c3117d.f38807b = clipData;
                c3117d.f38808c = 3;
                c1346a = c3117d;
            }
            k1.S.i(textView, c1346a.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC3116c c1346a;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c1346a = new C1346a(clipData, 3);
        } else {
            C3117d c3117d = new C3117d();
            c3117d.f38807b = clipData;
            c3117d.f38808c = 3;
            c1346a = c3117d;
        }
        k1.S.i(view, c1346a.build());
        return true;
    }
}
