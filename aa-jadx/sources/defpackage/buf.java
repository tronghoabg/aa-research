package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class buf extends android.graphics.drawable.RippleDrawable {
    public defpackage.ckd a;
    private final boolean b;
    private boolean c;

    public buf(boolean z) {
        super(android.content.res.ColorStateList.valueOf(-16777216), null, z ? new android.graphics.drawable.ColorDrawable(-1) : null);
        this.b = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final android.graphics.Rect getDirtyBounds() {
        if (!this.b) {
            this.c = true;
        }
        android.graphics.Rect dirtyBounds = super.getDirtyBounds();
        this.c = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.c;
    }
}
