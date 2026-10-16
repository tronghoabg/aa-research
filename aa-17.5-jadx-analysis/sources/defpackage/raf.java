package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class raf extends ContextWrapper {
    public final rag a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raf(Context context) {
        super(context);
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        this.a = new rag(resources);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.a;
    }
}
