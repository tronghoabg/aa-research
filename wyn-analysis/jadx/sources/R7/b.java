package R7;

import W7.h;
import W7.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes4.dex */
public final class b extends Fe.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10373c;

    public /* synthetic */ b(Object obj, int i5) {
        this.f10372b = i5;
        this.f10373c = obj;
    }

    @Override // Fe.b
    public final void K(int i5) {
        switch (this.f10372b) {
            case 0:
                break;
            default:
                i iVar = (i) this.f10373c;
                iVar.f15273d = true;
                h hVar = (h) iVar.f15274e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // Fe.b
    public final void L(Typeface typeface, boolean z2) {
        switch (this.f10372b) {
            case 0:
                Chip chip = (Chip) this.f10373c;
                f fVar = chip.f26872e;
                chip.setText(fVar.f10382C0 ? fVar.f10385E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    i iVar = (i) this.f10373c;
                    iVar.f15273d = true;
                    h hVar = (h) iVar.f15274e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void W(int i5) {
    }
}
