package androidx.constraintlayout.widget;

import Q0.a;
import Q0.d;
import T0.b;
import T0.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: h, reason: collision with root package name */
    public int f18018h;

    /* renamed from: i, reason: collision with root package name */
    public int f18019i;

    /* renamed from: j, reason: collision with root package name */
    public a f18020j;

    public Barrier(Context context) {
        super(context);
        this.f11140a = new int[32];
        this.f11146g = new HashMap();
        this.f11142c = context;
        g(null);
        super.setVisibility(8);
    }

    @Override // T0.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        a aVar = new a();
        aVar.f9487s0 = 0;
        aVar.f9488t0 = true;
        aVar.f9489u0 = 0;
        aVar.v0 = false;
        this.f18020j = aVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f11345b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f18020j.f9488t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f18020j.f9489u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f11143d = this.f18020j;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f18020j.f9488t0;
    }

    public int getMargin() {
        return this.f18020j.f9489u0;
    }

    public int getType() {
        return this.f18018h;
    }

    @Override // T0.b
    public final void h(d dVar, boolean z2) {
        int i5 = this.f18018h;
        this.f18019i = i5;
        if (z2) {
            if (i5 == 5) {
                this.f18019i = 1;
            } else if (i5 == 6) {
                this.f18019i = 0;
            }
        } else if (i5 == 5) {
            this.f18019i = 0;
        } else if (i5 == 6) {
            this.f18019i = 1;
        }
        if (dVar instanceof a) {
            ((a) dVar).f9487s0 = this.f18019i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f18020j.f9488t0 = z2;
    }

    public void setDpMargin(int i5) {
        this.f18020j.f9489u0 = (int) ((i5 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i5) {
        this.f18020j.f9489u0 = i5;
    }

    public void setType(int i5) {
        this.f18018h = i5;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
