package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.projection.gearhead.input.ProjectionKeyboardLayout;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class xdf extends xds {
    private final xee i;

    public xdf(Context context, InputConnection inputConnection, EditorInfo editorInfo, ProjectionKeyboardLayout projectionKeyboardLayout, ykd ykdVar, Locale locale, boolean z, boolean z2, boolean z3, Bundle bundle, String str) {
        super(context, inputConnection, editorInfo, projectionKeyboardLayout, ykdVar, locale, z, z2, z3, false, 1, bundle, str);
        this.i = new xee();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    @Override // defpackage.xds
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean c(int r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = -5
            if (r6 != r2) goto L18
            xee r6 = r5.i
            boolean r3 = r6.h()
            if (r3 != 0) goto L17
            java.lang.String r6 = r6.d()
            android.view.inputmethod.InputConnection r5 = r5.b
            r5.setComposingText(r6, r0)
            return r1
        L17:
            r6 = r2
        L18:
            boolean r2 = defpackage.wpq.D(r6)
            if (r2 == 0) goto L31
            android.view.inputmethod.InputConnection r2 = r5.b
            xee r3 = r5.i
            com.google.android.projection.gearhead.input.ProjectionKeyboardLayout r5 = r5.d
            android.view.View r5 = r5.e
            if (r5 != 0) goto L29
            goto L2d
        L29:
            boolean r0 = r5.isSelected()
        L2d:
            defpackage.wpq.C(r2, r3, r6, r1, r0)
            return r1
        L31:
            r2 = -1
            if (r6 == r2) goto L4e
            xee r2 = r5.i
            boolean r3 = r2.h()
            if (r3 != 0) goto L4e
            java.lang.String r3 = r2.e()
            if (r3 == 0) goto L49
            android.view.inputmethod.InputConnection r4 = r5.b
            r4.commitText(r3, r1)
            r3 = r1
            goto L4a
        L49:
            r3 = r0
        L4a:
            r2.f()
            goto L4f
        L4e:
            r3 = r0
        L4f:
            boolean r5 = super.c(r6)
            if (r5 != 0) goto L59
            if (r3 == 0) goto L58
            return r1
        L58:
            return r0
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xdf.c(int):boolean");
    }
}
