package defpackage;

/* loaded from: classes2.dex */
public final class doi {
    public static final /* synthetic */ afia[] a = {new affh(doi.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0), new affh(doi.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0), new affh(doi.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0), new affh(doi.class, "scaleX", "getScaleX()F", 0), new affh(doi.class, "scaleY", "getScaleY()F", 0), new affh(doi.class, "rotationX", "getRotationX()F", 0), new affh(doi.class, "rotationY", "getRotationY()F", 0), new affh(doi.class, "rotationZ", "getRotationZ()F", 0), new affh(doi.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), new affh(doi.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), new affh(doi.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), new affh(doi.class, "pivotX", "getPivotX()F", 0), new affh(doi.class, "pivotY", "getPivotY()F", 0), new affh(doi.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0), new affh(doi.class, "verticalChainWeight", "getVerticalChainWeight()F", 0)};
    public final dpl b;
    public final sx e;
    public final sx f;
    public final sx g;
    public final sx h;
    public final sx i;
    public final sx j;
    public final doj c = new doj("parent");
    private final dog k = new dog(this, new ncp("wrap"));
    private final dog l = new dog(this, new ncp("wrap"));
    public final doh d = new doh(this, dov.a);

    public doi(dpl dplVar) {
        this.b = dplVar;
        this.e = new sx(dplVar, -2);
        this.f = new sx(dplVar, 0);
        this.i = new sx(dplVar, 0, (byte[]) null);
        this.g = new sx(dplVar, -1);
        this.h = new sx(dplVar, 1);
        this.j = new sx(dplVar, 1, (byte[]) null);
    }

    public final void a(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        this.b.s("vBias", f);
    }

    public final void b(ncp ncpVar) {
        this.l.setValue(this, a[1], ncpVar);
    }

    public final void c(ncp ncpVar) {
        this.k.setValue(this, a[0], ncpVar);
    }
}
