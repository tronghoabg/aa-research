package androidx.constraintlayout.helper.widget;

import Q0.d;
import Q0.g;
import R0.b;
import T0.q;
import T0.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Flow extends s {

    /* renamed from: j, reason: collision with root package name */
    public g f18017j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // T0.s, T0.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        g gVar = new g();
        gVar.f9644s0 = 0;
        gVar.f9645t0 = 0;
        gVar.f9646u0 = 0;
        gVar.v0 = 0;
        gVar.f9647w0 = 0;
        gVar.f9648x0 = 0;
        gVar.f9649y0 = false;
        gVar.f9650z0 = 0;
        gVar.f9618A0 = 0;
        gVar.B0 = new b();
        gVar.f9619C0 = null;
        gVar.f9620D0 = -1;
        gVar.f9621E0 = -1;
        gVar.f9622F0 = -1;
        gVar.f9623G0 = -1;
        gVar.f9624H0 = -1;
        gVar.f9625I0 = -1;
        gVar.f9626J0 = 0.5f;
        gVar.f9627K0 = 0.5f;
        gVar.f9628L0 = 0.5f;
        gVar.f9629M0 = 0.5f;
        gVar.f9630N0 = 0.5f;
        gVar.f9631O0 = 0.5f;
        gVar.f9632P0 = 0;
        gVar.f9633Q0 = 0;
        gVar.f9634R0 = 2;
        gVar.f9635S0 = 2;
        gVar.f9636T0 = 0;
        gVar.f9637U0 = -1;
        gVar.f9638V0 = 0;
        gVar.f9639W0 = new ArrayList();
        gVar.f9640X0 = null;
        gVar.f9641Y0 = null;
        gVar.Z0 = null;
        gVar.f9643b1 = 0;
        this.f18017j = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f11345b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == 0) {
                    this.f18017j.f9638V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f18017j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f9644s0 = dimensionPixelSize;
                    gVar2.f9645t0 = dimensionPixelSize;
                    gVar2.f9646u0 = dimensionPixelSize;
                    gVar2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f18017j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f9646u0 = dimensionPixelSize2;
                    gVar3.f9647w0 = dimensionPixelSize2;
                    gVar3.f9648x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f18017j.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f18017j.f9647w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f18017j.f9644s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f18017j.f9648x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f18017j.f9645t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f18017j.f9636T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f18017j.f9620D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f18017j.f9621E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f18017j.f9622F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f18017j.f9624H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f18017j.f9623G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f18017j.f9625I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f18017j.f9626J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f18017j.f9628L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f18017j.f9630N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f18017j.f9629M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f18017j.f9631O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f18017j.f9627K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f18017j.f9634R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f18017j.f9635S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f18017j.f9632P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f18017j.f9633Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f18017j.f9637U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f11143d = this.f18017j;
        i();
    }

    @Override // T0.b
    public final void h(d dVar, boolean z2) {
        g gVar = this.f18017j;
        int i5 = gVar.f9646u0;
        if (i5 > 0 || gVar.v0 > 0) {
            if (z2) {
                gVar.f9647w0 = gVar.v0;
                gVar.f9648x0 = i5;
            } else {
                gVar.f9647w0 = i5;
                gVar.f9648x0 = gVar.v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x00ce A[EDGE_INSN: B:426:0x00ce->B:59:0x00ce BREAK  A[LOOP:1: B:53:0x00ba->B:58:0x00ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    @Override // T0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(Q0.g r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(Q0.g, int, int):void");
    }

    @Override // T0.b, android.view.View
    public final void onMeasure(int i5, int i10) {
        j(this.f18017j, i5, i10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f18017j.f9628L0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i5) {
        this.f18017j.f9622F0 = i5;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f18017j.f9629M0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i5) {
        this.f18017j.f9623G0 = i5;
        requestLayout();
    }

    public void setHorizontalAlign(int i5) {
        this.f18017j.f9634R0 = i5;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f18017j.f9626J0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i5) {
        this.f18017j.f9632P0 = i5;
        requestLayout();
    }

    public void setHorizontalStyle(int i5) {
        this.f18017j.f9620D0 = i5;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f18017j.f9630N0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i5) {
        this.f18017j.f9624H0 = i5;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f18017j.f9631O0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i5) {
        this.f18017j.f9625I0 = i5;
        requestLayout();
    }

    public void setMaxElementsWrap(int i5) {
        this.f18017j.f9637U0 = i5;
        requestLayout();
    }

    public void setOrientation(int i5) {
        this.f18017j.f9638V0 = i5;
        requestLayout();
    }

    public void setPadding(int i5) {
        g gVar = this.f18017j;
        gVar.f9644s0 = i5;
        gVar.f9645t0 = i5;
        gVar.f9646u0 = i5;
        gVar.v0 = i5;
        requestLayout();
    }

    public void setPaddingBottom(int i5) {
        this.f18017j.f9645t0 = i5;
        requestLayout();
    }

    public void setPaddingLeft(int i5) {
        this.f18017j.f9647w0 = i5;
        requestLayout();
    }

    public void setPaddingRight(int i5) {
        this.f18017j.f9648x0 = i5;
        requestLayout();
    }

    public void setPaddingTop(int i5) {
        this.f18017j.f9644s0 = i5;
        requestLayout();
    }

    public void setVerticalAlign(int i5) {
        this.f18017j.f9635S0 = i5;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f18017j.f9627K0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i5) {
        this.f18017j.f9633Q0 = i5;
        requestLayout();
    }

    public void setVerticalStyle(int i5) {
        this.f18017j.f9621E0 = i5;
        requestLayout();
    }

    public void setWrapMode(int i5) {
        this.f18017j.f9636T0 = i5;
        requestLayout();
    }
}
