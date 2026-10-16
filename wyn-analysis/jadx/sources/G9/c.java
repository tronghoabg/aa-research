package G9;

import D9.k;
import android.util.DisplayMetrics;
import df.InterfaceC2432a;
import za.C4658a;

/* loaded from: classes4.dex */
public final class c implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4680a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4681b;

    public /* synthetic */ c(C4658a c4658a, d dVar, int i5) {
        this.f4680a = i5;
        this.f4681b = dVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f4680a) {
            case 0:
                DisplayMetrics displayMetrics = (DisplayMetrics) this.f4681b.get();
                k kVar = new k();
                kVar.f2580a = Float.valueOf(0.3f);
                kVar.f2581b = Float.valueOf(0.3f);
                kVar.f2582c = Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f));
                kVar.f2583d = Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f));
                kVar.f2585f = 48;
                kVar.f2584e = 65824;
                kVar.f2586g = -1;
                kVar.f2587h = -2;
                Boolean bool = Boolean.TRUE;
                kVar.f2588i = bool;
                kVar.f2589j = bool;
                kVar.k = bool;
                return kVar;
            case 1:
                DisplayMetrics displayMetrics2 = (DisplayMetrics) this.f4681b.get();
                k kVar2 = new k();
                kVar2.f2580a = Float.valueOf(0.3f);
                kVar2.f2581b = Float.valueOf(0.3f);
                kVar2.f2582c = Integer.valueOf((int) (displayMetrics2.heightPixels * 0.5f));
                kVar2.f2583d = Integer.valueOf((int) (displayMetrics2.widthPixels * 0.9f));
                kVar2.f2585f = 48;
                kVar2.f2584e = 65824;
                kVar2.f2586g = -1;
                kVar2.f2587h = -2;
                Boolean bool2 = Boolean.TRUE;
                kVar2.f2588i = bool2;
                kVar2.f2589j = bool2;
                kVar2.k = bool2;
                return kVar2;
            case 2:
                DisplayMetrics displayMetrics3 = (DisplayMetrics) this.f4681b.get();
                k kVar3 = new k();
                kVar3.f2582c = Integer.valueOf((int) (displayMetrics3.heightPixels * 0.8d));
                kVar3.f2583d = Integer.valueOf(displayMetrics3.widthPixels);
                kVar3.f2580a = Float.valueOf(1.0f);
                kVar3.f2581b = Float.valueOf(0.5f);
                kVar3.f2585f = 17;
                kVar3.f2584e = 327970;
                kVar3.f2586g = -2;
                kVar3.f2587h = -2;
                Boolean bool3 = Boolean.FALSE;
                kVar3.f2588i = bool3;
                kVar3.f2589j = bool3;
                kVar3.k = bool3;
                return kVar3;
            case 3:
                DisplayMetrics displayMetrics4 = (DisplayMetrics) this.f4681b.get();
                k kVar4 = new k();
                kVar4.f2582c = Integer.valueOf((int) (displayMetrics4.heightPixels * 0.8d));
                kVar4.f2583d = Integer.valueOf((int) (displayMetrics4.widthPixels * 0.7f));
                kVar4.f2580a = Float.valueOf(0.6f);
                kVar4.f2581b = Float.valueOf(1.0f);
                kVar4.f2585f = 17;
                kVar4.f2584e = 327970;
                kVar4.f2586g = -2;
                kVar4.f2587h = -2;
                Boolean bool4 = Boolean.FALSE;
                kVar4.f2588i = bool4;
                kVar4.f2589j = bool4;
                kVar4.k = bool4;
                return kVar4;
            case 4:
                DisplayMetrics displayMetrics5 = (DisplayMetrics) this.f4681b.get();
                k kVar5 = new k();
                kVar5.f2582c = Integer.valueOf((int) (displayMetrics5.heightPixels * 0.9f));
                kVar5.f2583d = Integer.valueOf((int) (displayMetrics5.widthPixels * 0.9f));
                kVar5.f2581b = Float.valueOf(0.8f);
                kVar5.f2580a = Float.valueOf(0.8f);
                kVar5.f2585f = 17;
                kVar5.f2584e = 327938;
                kVar5.f2586g = -2;
                kVar5.f2587h = -2;
                Boolean bool5 = Boolean.FALSE;
                kVar5.f2588i = bool5;
                kVar5.f2589j = bool5;
                kVar5.k = bool5;
                return kVar5;
            case 5:
                DisplayMetrics displayMetrics6 = (DisplayMetrics) this.f4681b.get();
                k kVar6 = new k();
                kVar6.f2582c = Integer.valueOf((int) (displayMetrics6.heightPixels * 0.8d));
                kVar6.f2583d = Integer.valueOf(displayMetrics6.widthPixels);
                kVar6.f2580a = Float.valueOf(1.0f);
                kVar6.f2581b = Float.valueOf(0.4f);
                kVar6.f2585f = 17;
                kVar6.f2584e = 327938;
                kVar6.f2586g = -1;
                kVar6.f2587h = -1;
                Boolean bool6 = Boolean.FALSE;
                kVar6.f2588i = bool6;
                kVar6.f2589j = bool6;
                kVar6.k = bool6;
                return kVar6;
            case 6:
                DisplayMetrics displayMetrics7 = (DisplayMetrics) this.f4681b.get();
                k kVar7 = new k();
                kVar7.f2582c = Integer.valueOf((int) (displayMetrics7.heightPixels * 0.8d));
                kVar7.f2583d = Integer.valueOf((int) (displayMetrics7.widthPixels * 0.7f));
                kVar7.f2580a = Float.valueOf(0.6f);
                kVar7.f2581b = Float.valueOf(0.9f);
                kVar7.f2585f = 17;
                kVar7.f2584e = 327938;
                kVar7.f2586g = -1;
                kVar7.f2587h = -2;
                Boolean bool7 = Boolean.FALSE;
                kVar7.f2588i = bool7;
                kVar7.f2589j = bool7;
                kVar7.k = bool7;
                return kVar7;
            default:
                DisplayMetrics displayMetrics8 = (DisplayMetrics) this.f4681b.get();
                k kVar8 = new k();
                kVar8.f2582c = Integer.valueOf((int) (displayMetrics8.heightPixels * 0.9f));
                kVar8.f2583d = Integer.valueOf((int) (displayMetrics8.widthPixels * 0.9f));
                kVar8.f2581b = Float.valueOf(0.8f);
                kVar8.f2580a = Float.valueOf(0.8f);
                kVar8.f2585f = 17;
                kVar8.f2584e = 327938;
                kVar8.f2586g = -2;
                kVar8.f2587h = -2;
                Boolean bool8 = Boolean.FALSE;
                kVar8.f2588i = bool8;
                kVar8.f2589j = bool8;
                kVar8.k = bool8;
                return kVar8;
        }
    }
}
