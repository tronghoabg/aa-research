package q;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;
import t3.AbstractC4104x;
import t3.C4085e;

/* loaded from: classes.dex */
public final class c1 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43758a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i5, String str, Class cls) {
        super(cls, str);
        this.f43758a = i5;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f43758a) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).f17960z);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Float.valueOf(AbstractC4104x.f45735a.v((View) obj));
            default:
                WeakHashMap weakHashMap = k1.S.f38779a;
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f43758a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 1:
                C4085e c4085e = (C4085e) obj;
                PointF pointF = (PointF) obj2;
                c4085e.getClass();
                c4085e.f45665a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c4085e.f45666b = iRound;
                int i5 = c4085e.f45670f + 1;
                c4085e.f45670f = i5;
                if (i5 == c4085e.f45671g) {
                    AbstractC4104x.a(c4085e.f45669e, c4085e.f45665a, iRound, c4085e.f45667c, c4085e.f45668d);
                    c4085e.f45670f = 0;
                    c4085e.f45671g = 0;
                    break;
                }
                break;
            case 2:
                C4085e c4085e2 = (C4085e) obj;
                PointF pointF2 = (PointF) obj2;
                c4085e2.getClass();
                c4085e2.f45667c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c4085e2.f45668d = iRound2;
                int i10 = c4085e2.f45671g + 1;
                c4085e2.f45671g = i10;
                if (c4085e2.f45670f == i10) {
                    AbstractC4104x.a(c4085e2.f45669e, c4085e2.f45665a, c4085e2.f45666b, c4085e2.f45667c, iRound2);
                    c4085e2.f45670f = 0;
                    c4085e2.f45671g = 0;
                    break;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC4104x.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 4:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC4104x.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 5:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC4104x.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC4104x.f45735a.J((View) obj, fFloatValue);
                break;
            default:
                WeakHashMap weakHashMap = k1.S.f38779a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
