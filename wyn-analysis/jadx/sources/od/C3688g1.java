package od;

import md.AbstractC3537e;
import md.EnumC3545m;

/* renamed from: od.g1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3688g1 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3537e f41961a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC3545m f41962b;

    /* renamed from: c, reason: collision with root package name */
    public final C3679d1 f41963c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41964d;

    public C3688g1(AbstractC3537e abstractC3537e, C3679d1 c3679d1) {
        EnumC3545m enumC3545m = EnumC3545m.f40695d;
        this.f41964d = false;
        this.f41961a = abstractC3537e;
        this.f41962b = enumC3545m;
        this.f41963c = c3679d1;
    }

    public static void a(C3688g1 c3688g1, EnumC3545m enumC3545m) {
        c3688g1.f41962b = enumC3545m;
        if (enumC3545m == EnumC3545m.f40693b || enumC3545m == EnumC3545m.f40694c) {
            c3688g1.f41964d = true;
        } else if (enumC3545m == EnumC3545m.f40695d) {
            c3688g1.f41964d = false;
        }
    }
}
