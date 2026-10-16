package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList;

    public SurfaceCombination(SurfaceConfig... surfaceConfigArr) {
        ArrayList arrayList = new ArrayList();
        this.mSurfaceConfigList = arrayList;
        Collections.addAll(arrayList, surfaceConfigArr);
    }

    private static void generateArrangements(List<int[]> list, int i2, int[] iArr, int i3) {
        if (i3 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            while (true) {
                if (i5 >= i3) {
                    iArr[i3] = i4;
                    generateArrangements(list, i2, iArr, i3 + 1);
                    break;
                } else if (i4 == iArr[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
        }
    }

    private List<int[]> getElementsArrangements(int i2) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i2, new int[i2], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    public List<SurfaceConfig> getOrderedSupportedSurfaceConfigList(List<SurfaceConfig> list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        for (int[] iArr : elementsArrangements) {
            boolean zIsSupported = true;
            for (int i2 = 0; i2 < this.mSurfaceConfigList.size(); i2++) {
                if (iArr[i2] < list.size()) {
                    zIsSupported &= this.mSurfaceConfigList.get(i2).isSupported(list.get(iArr[i2]));
                    if (!zIsSupported) {
                        break;
                    }
                    surfaceConfigArr[iArr[i2]] = this.mSurfaceConfigList.get(i2);
                }
            }
            if (zIsSupported) {
                return Arrays.asList(surfaceConfigArr);
            }
        }
        return null;
    }

    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean removeSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }

    public SurfaceCombination() {
        this.mSurfaceConfigList = new ArrayList();
    }
}
