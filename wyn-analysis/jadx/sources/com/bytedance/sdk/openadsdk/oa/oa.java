package com.bytedance.sdk.openadsdk.oa;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class oa extends uef {
    private volatile boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f26045oa;
    private int yo;

    public oa(int i5, int i10) {
        this.f26045oa = 15;
        this.yo = 3;
        if (i5 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.f26045oa = i5;
        this.yo = i10;
    }

    private void moa(List<File> list) {
        long jOa;
        int size;
        boolean zUef;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zUef = uef((jOa = oa(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zUef) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jOa -= length;
                            }
                            if (uef(file2, jOa, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void yo(List<File> list) {
        long jOa = oa(list);
        int size = list.size();
        if (uef(jOa, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jOa -= length;
            }
            if (uef(file, jOa, size)) {
                return;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oa.uef
    public boolean uef(long j8, int i5) {
        return i5 <= this.f26045oa;
    }

    @Override // com.bytedance.sdk.openadsdk.oa.uef
    public boolean uef(File file, long j8, int i5) {
        return i5 <= this.yo;
    }

    @Override // com.bytedance.sdk.openadsdk.oa.uef
    public void uef(List<File> list) {
        if (this.moa) {
            moa(list);
            this.moa = false;
        } else {
            yo(list);
        }
    }

    public oa(int i5, int i10, boolean z2) {
        this.f26045oa = 15;
        this.yo = 3;
        if (i5 > 0) {
            this.f26045oa = i5;
            this.yo = i10;
            this.moa = z2;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
