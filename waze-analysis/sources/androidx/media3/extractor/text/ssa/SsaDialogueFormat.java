package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int layerIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.layerIndex = i2;
        this.startTimeIndex = i3;
        this.endTimeIndex = i4;
        this.styleIndex = i5;
        this.textIndex = i6;
        this.length = i7;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static SsaDialogueFormat fromFormatLine(String str) {
        an.l(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                if (i4 == -1 || i5 == -1 || i7 == -1) {
                    return null;
                }
                return new SsaDialogueFormat(i3, i4, i5, i6, i7, length);
            }
            String strK = an.K(strArrSplit[i2].trim());
            switch (strK.hashCode()) {
                case 100571:
                    if (!strK.equals(TtmlNode.END)) {
                        break;
                    } else {
                        i5 = i2;
                        break;
                    }
                case 3556653:
                    if (!strK.equals("text")) {
                        break;
                    } else {
                        i7 = i2;
                        break;
                    }
                case 102749521:
                    if (!strK.equals("layer")) {
                        break;
                    } else {
                        i3 = i2;
                        break;
                    }
                case 109757538:
                    if (!strK.equals(TtmlNode.START)) {
                        break;
                    } else {
                        i4 = i2;
                        break;
                    }
                case 109780401:
                    if (!strK.equals("style")) {
                        break;
                    } else {
                        i6 = i2;
                        break;
                    }
            }
            i2++;
        }
    }
}
