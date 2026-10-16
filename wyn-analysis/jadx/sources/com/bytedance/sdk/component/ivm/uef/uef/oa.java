package com.bytedance.sdk.component.ivm.uef.uef;

import com.bytedance.sdk.component.ivm.uef.xs;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class oa extends uef {

    /* renamed from: oa, reason: collision with root package name */
    private final yo f25009oa;
    private final moa uef;
    private final Queue<String> yo;

    public oa() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.yo = concurrentLinkedQueue;
        this.uef = new ivm(concurrentLinkedQueue);
        this.f25009oa = new yo();
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public synchronized void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar, int i5) {
        moa moaVar;
        if (i5 != 5) {
            try {
                if (xs.ivm().wk().uef(xs.ivm().lw()) && (moaVar = this.uef) != null && uefVar != null) {
                    moaVar.uef(uefVar, i5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yo yoVar = this.f25009oa;
        if (yoVar != null && uefVar != null) {
            yoVar.uef(uefVar, i5);
        }
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public synchronized void uef(int i5, List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        try {
            Iterator<com.bytedance.sdk.component.ivm.uef.moa.uef> it = list.iterator();
            while (it.hasNext()) {
                this.yo.remove(it.next().yo());
            }
            moa moaVar = this.uef;
            if (moaVar != null) {
                moaVar.uef(i5, list);
            }
            yo yoVar = this.f25009oa;
            if (yoVar != null) {
                yoVar.uef(i5, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:66:0x014b, B:69:0x0152, B:70:0x0156, B:72:0x015c, B:76:0x016e, B:11:0x0018, B:13:0x002b, B:15:0x0031, B:16:0x003d, B:18:0x0043, B:21:0x0054, B:22:0x005f, B:24:0x0065, B:25:0x006f, B:27:0x0075, B:29:0x0085, B:30:0x008d, B:31:0x0091, B:33:0x0097, B:34:0x00a5, B:35:0x00b0, B:37:0x00b6, B:38:0x00c4, B:39:0x00c9, B:41:0x00d2, B:43:0x00d8, B:44:0x00db, B:46:0x00e3, B:48:0x00e9, B:49:0x00f2, B:51:0x00f8, B:52:0x0106, B:54:0x010f, B:55:0x0113, B:57:0x0119, B:59:0x0125, B:60:0x0129, B:61:0x0134, B:63:0x013a), top: B:81:0x0001 }] */
    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.bytedance.sdk.component.ivm.uef.moa.uef> uef(int r7, int r8, java.util.List<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ivm.uef.uef.oa.uef(int, int, java.util.List):java.util.List");
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public synchronized boolean uef(int i5, boolean z2) {
        if (this.uef.uef(i5, z2)) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.fz(), 1);
            return true;
        }
        if ((i5 != 1 && i5 != 2) || !this.f25009oa.uef(i5, z2)) {
            return false;
        }
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.dxx(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public void uef(int i5, long j8) {
        this.f25009oa.uef(i5, j8);
        this.uef.uef(i5, j8);
    }
}
