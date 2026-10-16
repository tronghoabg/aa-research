package androidx.compose.foundation.content;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import h.a.i;
import h.g.a.l;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransferableContent_androidKt {
    public static final TransferableContent consume(TransferableContent transferableContent, l<? super ClipData.Item, Boolean> lVar) {
        ClipData clipData = transferableContent.getClipEntry().getClipData();
        if (clipData.getItemCount() != 1) {
            int itemCount = clipData.getItemCount();
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < itemCount; i2++) {
                ClipData.Item itemAt = clipData.getItemAt(i2);
                if (!lVar.invoke(itemAt).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                return null;
            }
            if (arrayList.size() != clipData.getItemCount()) {
                ClipDescription clipDescription = new ClipDescription(transferableContent.getClipMetadata().getClipDescription());
                ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) i.P(arrayList));
                int size = arrayList.size();
                for (int i3 = 1; i3 < size; i3++) {
                    clipData2.addItem((ClipData.Item) arrayList.get(i3));
                }
                return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(clipData2), AndroidClipboardManager_androidKt.toClipMetadata(clipDescription), transferableContent.m2076getSourcekB6V9T0(), transferableContent.getPlatformTransferableContent(), null);
            }
        } else if (lVar.invoke(clipData.getItemAt(0)).booleanValue()) {
            return null;
        }
        return transferableContent;
    }

    public static final boolean hasMediaType(TransferableContent transferableContent, MediaType mediaType) {
        return transferableContent.getClipMetadata().getClipDescription().hasMimeType(mediaType.getRepresentation());
    }

    public static final String readPlainText(ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        boolean z = false;
        for (int i2 = 0; i2 < itemCount; i2++) {
            z = z || clipEntry.getClipData().getItemAt(i2).getText() != null;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipEntry.getClipData().getItemCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < itemCount2; i3++) {
            CharSequence text = clipEntry.getClipData().getItemAt(i3).getText();
            if (text != null) {
                if (z2) {
                    sb.append("\n");
                }
                sb.append(text);
                z2 = true;
            }
        }
        return sb.toString();
    }
}
