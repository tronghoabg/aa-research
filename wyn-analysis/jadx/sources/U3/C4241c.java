package u3;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import x.C4412e;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4241c extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public p f46574a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f46575b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f46576c;

    /* renamed from: d, reason: collision with root package name */
    public C4412e f46577d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
