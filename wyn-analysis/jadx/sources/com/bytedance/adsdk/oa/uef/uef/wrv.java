package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Path;
import com.bytedance.adsdk.oa.yo.oa.cz;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class wrv implements cq, zjm {
    private final com.bytedance.adsdk.oa.yo.oa.cz ivm;
    private final String moa;
    private final Path uef = new Path();

    /* renamed from: oa, reason: collision with root package name */
    private final Path f24595oa = new Path();
    private final Path yo = new Path();
    private final List<cq> lw = new ArrayList();

    /* renamed from: com.bytedance.adsdk.oa.uef.uef.wrv$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[cz.uef.values().length];
            uef = iArr;
            try {
                iArr[cz.uef.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[cz.uef.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[cz.uef.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                uef[cz.uef.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                uef[cz.uef.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public wrv(com.bytedance.adsdk.oa.yo.oa.cz czVar) {
        this.moa = czVar.uef();
        this.ivm = czVar;
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.cq
    public Path moa() {
        this.yo.reset();
        if (this.ivm.yo()) {
            return this.yo;
        }
        int i5 = AnonymousClass1.uef[this.ivm.oa().ordinal()];
        if (i5 == 1) {
            uef();
        } else if (i5 == 2) {
            uef(Path.Op.UNION);
        } else if (i5 == 3) {
            uef(Path.Op.REVERSE_DIFFERENCE);
        } else if (i5 == 4) {
            uef(Path.Op.INTERSECT);
        } else if (i5 == 5) {
            uef(Path.Op.XOR);
        }
        return this.yo;
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.zjm
    public void uef(ListIterator<yo> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            yo yoVarPrevious = listIterator.previous();
            if (yoVarPrevious instanceof cq) {
                this.lw.add((cq) yoVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<yo> list, List<yo> list2) {
        for (int i5 = 0; i5 < this.lw.size(); i5++) {
            this.lw.get(i5).uef(list, list2);
        }
    }

    private void uef() {
        for (int i5 = 0; i5 < this.lw.size(); i5++) {
            this.yo.addPath(this.lw.get(i5).moa());
        }
    }

    private void uef(Path.Op op) {
        this.f24595oa.reset();
        this.uef.reset();
        for (int size = this.lw.size() - 1; size > 0; size--) {
            cq cqVar = this.lw.get(size);
            if (cqVar instanceof moa) {
                moa moaVar = (moa) cqVar;
                List<cq> listOa = moaVar.oa();
                for (int size2 = listOa.size() - 1; size2 >= 0; size2--) {
                    Path pathMoa = listOa.get(size2).moa();
                    pathMoa.transform(moaVar.yo());
                    this.f24595oa.addPath(pathMoa);
                }
            } else {
                this.f24595oa.addPath(cqVar.moa());
            }
        }
        cq cqVar2 = this.lw.get(0);
        if (cqVar2 instanceof moa) {
            moa moaVar2 = (moa) cqVar2;
            List<cq> listOa2 = moaVar2.oa();
            for (int i5 = 0; i5 < listOa2.size(); i5++) {
                Path pathMoa2 = listOa2.get(i5).moa();
                pathMoa2.transform(moaVar2.yo());
                this.uef.addPath(pathMoa2);
            }
        } else {
            this.uef.set(cqVar2.moa());
        }
        this.yo.op(this.uef, this.f24595oa, op);
    }
}
