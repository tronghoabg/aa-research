package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.SessionProcessor;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SessionProcessorUtil {
    private SessionProcessorUtil() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r4 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.camera.core.FocusMeteringAction getModifiedFocusMeteringAction(androidx.camera.core.impl.SessionProcessor r5, androidx.camera.core.FocusMeteringAction r6) {
        /*
            if (r5 != 0) goto L3
            goto L58
        L3:
            androidx.camera.core.FocusMeteringAction$Builder r0 = new androidx.camera.core.FocusMeteringAction$Builder
            r0.<init>(r6)
            java.util.List r1 = r6.getMeteringPointsAf()
            boolean r1 = r1.isEmpty()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L23
            int[] r1 = new int[]{r4, r2}
            boolean r1 = isOperationSupported(r5, r1)
            if (r1 != 0) goto L23
            r0.removePoints(r4)
            r3 = r4
        L23:
            java.util.List r1 = r6.getMeteringPointsAe()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3c
            r1 = 3
            int[] r1 = new int[]{r1}
            boolean r1 = isOperationSupported(r5, r1)
            if (r1 != 0) goto L3c
            r0.removePoints(r2)
            goto L3d
        L3c:
            r4 = r3
        L3d:
            java.util.List r1 = r6.getMeteringPointsAwb()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L56
            r1 = 4
            int[] r2 = new int[]{r1}
            boolean r5 = isOperationSupported(r5, r2)
            if (r5 != 0) goto L56
            r0.removePoints(r1)
            goto L59
        L56:
            if (r4 != 0) goto L59
        L58:
            return r6
        L59:
            androidx.camera.core.FocusMeteringAction r5 = r0.build()
            java.util.List r6 = r5.getMeteringPointsAf()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L7d
            java.util.List r6 = r5.getMeteringPointsAe()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L7d
            java.util.List r5 = r5.getMeteringPointsAwb()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L7d
            r5 = 0
            return r5
        L7d:
            androidx.camera.core.FocusMeteringAction r5 = r0.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.SessionProcessorUtil.getModifiedFocusMeteringAction(androidx.camera.core.impl.SessionProcessor, androidx.camera.core.FocusMeteringAction):androidx.camera.core.FocusMeteringAction");
    }

    public static boolean isOperationSupported(SessionProcessor sessionProcessor, int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return sessionProcessor.getSupportedCameraOperations().containsAll(arrayList);
    }
}
